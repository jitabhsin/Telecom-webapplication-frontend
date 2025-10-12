
# =========================================================
# OTBSClient (Bharat Telecom Services) — README
# =========================================================

A Spring Boot Thymeleaf-based client web application for the OTBS system. 
This repository contains the frontend/server-side UI that communicates 
with a backend REST API (configured via application properties).

---

## Quick Start

**Prerequisites:**
- Java 17+ (or project-specific JDK version)
- Maven (or use included wrapper: `mvnw`)
- Backend REST API running (see Configuration)

**Build & Run:**
```sh
# Using Maven wrapper (recommended)
./mvnw clean package
./mvnw spring-boot:run

# Or run the generated jar
./mvnw clean package
java -jar target/*.jar
Run Tests:

sh
Copy code
./mvnw test
Configuration
Main client configuration (API base URLs, server port, template/static settings) is located in:

target/classes/application.properties

Key properties (example values in repo):

server.port — default 8091

Backend endpoints:

backend.api.customer.base.url

backend.api.admin.base.url

backend.api.plan.base.url

backend.api.bill.base.url

backend.api.connection.base.url

backend.api.outlet.base.url

backend.api.connectionLog.base.url

backend.api.complaint.base.url

backend.api.helpdeskexecutive.base.url

Edit this file or create src/main/resources/application.properties to point to your backend instance (default: http://localhost:8090).

Project Structure (Important Files)
Build & Meta

pom.xml

mvnw, mvnw.cmd

HELP.md

Java Model Classes (data objects mapped to backend)

com.otbs.model.Customer

com.otbs.model.HelpDeskExecutive

com.otbs.model.Plan

com.otbs.model.Complaint

com.otbs.model.UsageInfo

Controllers

com.otbs.controller.CustomerClientController

Templates (Thymeleaf)

index.html, register.html, addPlan.html

managePlan.html, profiledetails.html

complaintmanagement.html, addComplaint.html

add-outlet.html, connection-management.html (packaged in target)

Static Assets

src/main/resources/static/css/bill.css

Notes:

Templates use Thymeleaf expressions (th:...) for forms, links, and placeholders.

UI calls backend REST endpoints using configured base URLs.

Client Flow (High-Level)
User-facing pages (registration, login, dashboards) are served by Spring Boot and rendered via Thymeleaf.

Controllers like CustomerClientController assemble models and forward to templates.

Data models mirror backend DTOs (com.otbs.model).

Common Tasks
Change backend host/port:
Edit application.properties and update backend.api.* entries.

Add/Modify Template:
Edit files in src/main/resources/templates and restart the app.

Update CSS:
Edit src/main/resources/static/css/bill.css.

Troubleshooting
Blank pages / template not found:

Verify spring.mvc.view.prefix and spring.mvc.view.suffix.

Ensure template exists in src/main/resources/templates/.

Backend connection errors:

Confirm backend is running at the URLs in application.properties.

Check CORS or firewall issues.

Static resources not loading:

Ensure files exist under src/main/resources/static.

Check spring.mvc.static-path-pattern if modified.

Contributing
Fork repository and create a feature branch

Implement changes (templates, controllers, models)

Run ./mvnw test and ./mvnw package

Open a PR with a clear description and references

