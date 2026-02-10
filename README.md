# Task Management System - Spring Boot REST API

## 📌 Project Overview
Task Management System is a Spring Boot REST API project used to manage tasks, users, task categories, priorities, and task status.

The project follows a layered architecture with Controller, Service, Repository, DTO, Exception Handling, and Model layers.

This project is designed for learning enterprise-level backend structure using Spring Boot and JPA.

---

## 🛠 Tech Stack
- Java 21
- Spring Boot 3.5.x
- Spring Data JPA
- Spring Web
- Hibernate
- MySQL Database
- Lombok
- Maven

---

## ⚙️ Features
✔ Create Task  
✔ Update Task  
✔ Delete Task  
✔ Get Task By ID  
✔ Get All Tasks  
✔ User Management  
✔ Category Management  
✔ Priority Management  
✔ Task Status Tracking  
✔ Exception Handling  
✔ Request Validation  
✔ DTO Based API Design  

---

## 🗄 Database Configuration

Update your application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/taskdb  
spring.datasource.username=root  
spring.datasource.password=yourpassword  

spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect  

---

## 📡 API Endpoints

### Task APIs
GET  
/api/tasks  

POST  
/api/tasks  

PUT  
/api/tasks/{id}/status  


---

### User APIs
GET  
/api/users  

POST  
/api/users  

---

## 🧾 Sample Task Request Body
{
  "title": "Complete Spring Boot Project",
  "description": "Finish Task Management API",
  "category": "WORK",
  "priority": "HIGH",
  "status": "PENDING"
}

---

## 🧾 Sample User Request Body
{
  "name": "Aryan",
  "email": "aryan@email.com"
}

---

## 🚀 How To Run

### 1️⃣ Clone Repository
git clone https://github.com/your-username/TaskManagement.git  

### 2️⃣ Navigate To Project
cd TaskManagement  

### 3️⃣ Build Project
mvn clean install  

### 4️⃣ Run Application
mvn spring-boot:run  

---

## 🧪 Testing
You can test APIs using:
- Postman
- Swagger (If configured)

---

## 📜 Exception Handling
Custom exceptions are handled using a Global Exception Handler to return proper error responses.

---

## 🔐 Validation
Uses Jakarta Validation annotations like:
- @NotNull  
- @NotBlank  
- @Valid  

---

## 🧑‍💻 Author
Aryan Sarthak  

---

## 📄 License
This project is for learning and development purposes.
