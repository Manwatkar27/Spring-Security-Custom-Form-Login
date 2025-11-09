# 🔐 Spring Security - Custom Form Login Example

This is a simple Java web application that demonstrates how to configure Spring Security to use a custom, user-defined login page instead of the default one.
The project is built using Spring MVC, Spring Security (version 5.7.x), and JSP for the views, all configured with 100% Java-based configuration (no XML).

## ✨ Features

Java-Based Configuration: All Spring and Spring Security settings are in .java files (e.g., MyAppConfig.java, MySecurityAppConfig.java).

Custom Login Page: Serves a custom JSP page at /customLogin for user authentication.

Role-Based Security:

The /gfg/welcome URL is public and accessible to everyone.

The /gfg URL is protected and requires an authenticated user.

In-Memory User: A single demo user is configured for testing.

## 💻 Technologies Used

Java: 17

Spring Framework: 5.3.24

spring-webmvc

Spring Security: 5.7.3

spring-security-web

spring-security-config

Servlet & JSP:

javax.servlet-api (4.0.1)

javax.servlet.jsp-api (2.3.3)

jstl (1.2)

Build Tool: Apache Maven

Web Server: Apache Tomcat (or any other Servlet container)

## 🚀 How to Run the Project

### ✅ Prerequisites

Java Development Kit (JDK) 17

Apache Maven

Apache Tomcat 9 or 10 (or another Servlet container like Jetty)

### 📦 Build and Deploy

Clone or Download: Get the project files onto your local machine.

Build with Maven: Open a terminal in the project's root directory (where pom.xml is located) and run:

mvn clean install

This will compile the project and create a springsecurity.war file in the target/ directory.

Deploy to Tomcat:

Copy the target/springsecurity.war file.

Paste it into the webapps/ directory of your Apache Tomcat installation.

Start Tomcat: Run the startup.sh (or startup.bat) script in the bin/ directory of your Tomcat installation.

Tomcat will automatically deploy the application.

## 🎮 How to Use the Application

Once the server is running, you can test the application in your browser.

Base URL: http://localhost:8080/springsecurity

### 1. Test the Public Page 🌍

URL: http://localhost:8080/springsecurity/gfg/welcome

Expected Result: You will immediately see the "Welcome to GeeksforGeeks" message. No login is required.

### 2. Test the Secured Page 🔒

URL: http://localhost:8080/springsecurity/gfg

Expected Result: You will be automatically redirected to the custom login page at http://localhost:8080/springsecurity/customLogin.

### 3. Log In 🔑

On the custom login page, enter the following credentials:

Username: gfg

Password: gfg123

Expected Result: After logging in, you will be redirected to the secured /gfg page and will see the "Hello GeeksforGeeks!" message.

## Author: Aman Manwatkar 👋
