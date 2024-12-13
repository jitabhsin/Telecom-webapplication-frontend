package com.otbs.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties(prefix = "backend.api")
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    
        private String customerBaseUrl;
        private String adminBaseUrl;

        // Getters and Setters
        public String getCustomerBaseUrl() {
            return customerBaseUrl;
        }

        public void setCustomerBaseUrl(String customerBaseUrl) {
            this.customerBaseUrl = customerBaseUrl;
        }

        public String getAdminBaseUrl() {
            return adminBaseUrl;
        }

        public void setAdminBaseUrl(String adminBaseUrl) {
            this.adminBaseUrl = adminBaseUrl;
        }
}
