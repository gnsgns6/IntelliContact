# IntelliContact

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![Java](https://img.shields.io/badge/Java-11-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0-green)
![Bootstrap](https://img.shields.io/badge/Bootstrap-4.5-purple)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The Smart Contact Manager is a web application designed to help users manage their contacts efficiently. Built with Java, Spring Boot, and MySQL, this application offers a seamless and user-friendly interface powered by Thymeleaf and Bootstrap.

## Features

- User authentication and authorization
- Add, edit, delete, and view contacts
- Search contacts by name or email
- Responsive design with Bootstrap
- Secure password storage with ...
- User profile management

## Installation

Follow these steps to set up the project locally:

### Prerequisites

- Java 17 or later
- Maven
- MySQL

### Clone the Repository

git clone https://github.com/gnsgns6/intellicontact.git
cd intellicontact


### Configure MySQL

1. Create a database named `smartcontact`.
2. Update the `application.properties` file with your MySQL credentials.

###  properties

spring.datasource.url=jdbc:mysql://localhost:3306/smartcontact
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

### Build and Run the Project

## bash
mvn clean install
mvn spring-boot:run

Open your browser and navigate to `http://localhost:8080`.
## Usage

1. Register a new account or log in with an existing account.
2. Use the dashboard to add new contacts.
3. Edit or delete existing contacts.
4. Search for contacts by name or email.

## Screenshots

![Login Page](screenshots/login.png)
*Login Page*

![Dashboard](screenshots/dashboard.png)
*Dashboard*

![Add Contact](screenshots/add-contact.png)
*Add Contact*

## Technologies Used

- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, Bootstrap
- **Database:** MySQL
- **Security:** Spring Security

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or feedback, please contact:

- **Email:** gnsgns6@outlook.com
- **GitHub:** [gnsgns6](https://github.com/gnsgns6)


