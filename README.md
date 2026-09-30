# AMC_BANK 🏦

## About the Project

AMC_BANK is a Java Spring Boot-based banking application developed to manage customer information through REST APIs.

The application allows users to retrieve customer details, update customer information, delete customer records, and search customers based on their city.

## Technologies Used

* Java 17
* Spring Boot
* Spring MVC
* Maven
* REST API

## Features

* Retrieve all customers
* Retrieve customer details using Customer ID
* Search customers by city
* Update customer information
* Delete customer records
* RESTful API implementation

## Project Structure

```text
AMC_BANK/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── in/amcbank/amc_bank/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── service/
│   │   │       └── AmcBankApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## API Endpoints

| Method | Endpoint               | Description              |
| ------ | ---------------------- | ------------------------ |
| GET    | /customers             | Get all customers        |
| GET    | /customers/{id}        | Get customer by ID       |
| GET    | /customers/city/{city} | Search customers by city |
| PUT    | /customers/{id}        | Update customer          |
| DELETE | /customers/{id}        | Delete customer          |

## How to Run the Project

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Make sure Java 17 is installed.
4. Run `AmcBankApplication.java`.
5. The application runs on port 8081.

## Developer

Keertana H Kondajji

**Note:** This project currently uses in-memory customer data for demonstration purposes.
<img width="1691" height="960" alt="Project1" src="https://github.com/user-attachments/assets/31918da7-39cc-4d47-8209-c835c5b28bfd" />
