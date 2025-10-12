Online Telecom Bill System (OTBS) - Frontend
This repository holds the frontend source code for the Online Telecom Bill System (OTBS). This Angular application provides a responsive, modern, and user-friendly interface for both customers and administrators to interact with the telecom billing system.

It communicates with the OTBS Backend via RESTful APIs to deliver a seamless full-stack experience.

✨ Key Features
The user interface is tailored to the distinct roles of customers and administrators, providing a rich set of features for each.

Customer Dashboard
Secure Authentication: User-friendly registration and login forms.

Profile Management: Clean interface to view and edit personal details.

Plan Discovery: Interactive cards to display and compare available telecom plans.

Service Management: Simple forms to apply for new mobile/broadband connections and a dashboard to track their status.

Billing History: A clear, paginated view of monthly bills with their payment status.

Help & Support: A dedicated section to submit new complaints and track the status of existing ones.

Administrator Dashboard
Centralized Management: A comprehensive dashboard for overseeing all system activities.

Plan Management: Full CRUD (Create, Read, Update, Delete) functionality for managing telecom plans through intuitive forms and tables.

Connection Approvals: A queue to review, approve, or reject new service requests from customers.

Billing Operations: Functionality to trigger the generation of monthly bills for all customers.

Complaint Resolution: A ticketing system to view customer complaints and update their resolution status.

Reporting: Dynamic tables and charts to visualize customer data, billing cycles, and support tickets.

🛠️ Technologies Used
Framework: Angular 16

Language: TypeScript

Styling: Bootstrap 5, CSS3

State Management: Angular Services & RxJS

HTTP Client: Angular HttpClient for API communication

📂 Project Structure
The project follows the standard Angular CLI structure, organizing code by feature modules for scalability and maintainability.

src/
├── app/
│   ├── components/       // Shared UI components (header, footer, etc.)
│   ├── pages/            // Main pages for different routes
│   │   ├── admin/        // Components for the admin dashboard
│   │   └── customer/     // Components for the customer dashboard
│   ├── services/         // Services for API calls and state management
│   ├── guards/           // Route guards for authentication
│   └── models/           // TypeScript interfaces for data structures
├── assets/               // Static assets like images and styles
└── environments/         // Environment-specific configurations

🚀 Getting Started
Follow these instructions to get the frontend application running on your local machine.

Prerequisites
Node.js v18.10 or later

Angular CLI v16.0 or later

A running instance of the OTBS Backend

Installation
Clone the repository

git clone [https://github.com/jitabhsin/Telecom-webapplication-frontend.git](https://github.com/jitabhsin/Telecom-webapplication-frontend.git)
cd Telecom-webapplication-frontend

Install NPM packages

npm install

Configure API Endpoint

Open the src/environments/environment.ts file.

Ensure the apiUrl property points to your running backend server (by default, it should be http://localhost:8080).

Run the application
Execute the following command to start the development server:

ng serve

Navigate to http://localhost:4200/. The app will automatically reload if you change any of the source files.

🤝 How to Contribute
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

Fork the Project

Create your Feature Branch (git checkout -b feature/AmazingFeature)

Commit your Changes (git commit -m 'Add some AmazingFeature')

Push to the Branch (git push origin feature/AmazingFeature)

Open a Pull Request

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

📞 Contact
Abhishek Singh J

Email: jitabhsin@gmail.com

LinkedIn: linkedin.com/in/jitabhsin

GitHub: github.com/jitabhsin
