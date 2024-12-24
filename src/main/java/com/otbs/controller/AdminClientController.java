package com.otbs.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.otbs.model.Customer;

@Controller
public class AdminClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${backend.api.admin.base.url}")
    private String adminBaseUrl;

    @GetMapping("/adminlogin")
    public String loginPage() {
        return "adminlogin";
    }

    @PostMapping("/adminlogin")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {
        String loginUrl = adminBaseUrl + "/login";

        // Create a request body with username and password
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("username", username);
        requestBody.put("password", password);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                loginUrl,
                requestEntity,
                String.class
            );

            if (response.getStatusCode().is2xxSuccessful()) {
                return "redirect:/admindashboard";
            } else {
                model.addAttribute("error", "Invalid username or password");
                return "adminlogin";
            }
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            model.addAttribute("error", "An unexpected error occurred");
            return "adminlogin";
        }
    }



    @GetMapping("/admindashboard")
    public String dashboard() {
        return "admindashboard";
    }
    
    @GetMapping("/viewallcustomers")
    public String viewAllCustomers(Model model) {
        Customer[] customersArray = restTemplate.getForObject(adminBaseUrl + "/viewallcustomers", Customer[].class);
        List<Customer> customers = Arrays.asList(customersArray);
        model.addAttribute("customers", customers);
        return "viewallcustomers";
    }
}
