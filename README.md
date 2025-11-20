# Student Task Manager — Backend (Spring Boot)

This is the **backend service** for the **Student Task Manager** application, built using **Java Spring Boot**.  
It provides RESTful APIs for creating, reading, updating, and deleting student tasks, and uses **MySQL** as the database.

---

## 📁 Project Structure

student-task-manager-backend/
│── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.example.taskmanager/
│ │ │ ├── controller/ # Handles API requests
│ │ │ ├── service/ # Business logic
│ │ │ ├── repository/ # Database operations using JPA
│ │ │ ├── model/ # Entity classes (Task)
│ │ │ └── TaskManagerApplication.java
│ │ └── resources/
│ │ ├── application.properties # Database configuration
│ │ └── schema.sql / data.sql # Optional DB initialization scripts
│── pom.xml # Dependencies
└── README.md

yaml
Copy code

---

## ✨ Features

- ➕ Add tasks  
- 📄 Retrieve tasks  
- ✔️ Update/mark tasks as completed  
- ❌ Delete tasks  
- 🗄️ MySQL support for persistent storage  
- 🌐 REST API ready for frontend integration  
- 🧱 Follows clean architecture: Controller → Service → Repository  

---

## 🛠️ Technologies Used

| Technology | Description |
|-----------|-------------|
| **Java 17+** | Programming language |
| **Spring Boot** | Framework for backend development |
| **Spring Web** | REST endpoints |
| **Spring Data JPA** | ORM and database operations |
| **MySQL** | Database |
| **Maven** | Dependency management |

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| **POST** | `/api/tasks` | Create a new task |
| **GET** | `/api/tasks` | Get all tasks |
| **PUT** | `/api/tasks/{id}` | Update / mark as completed |
| **DELETE** | `/api/tasks/{id}` | Delete a task |

---

## 🗄️ Database Schema (MySQL)

```sql
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    completed BOOLEAN DEFAULT FALSE
);
🚀 How to Run the Backend
1. Clone the Repository
bash
Copy code
git clone <your-backend-repo-link>
2. Create MySQL Database
Run:

sql
Copy code
CREATE DATABASE student_task_manager;
3. Configure the Database
Open src/main/resources/application.properties and update:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/student_task_manager
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4. Run the Spring Boot Application
Using Maven:

arduino
Copy code
mvn spring-boot:run
OR using your IDE (IntelliJ / Eclipse / VS Code):

Run the file:

Copy code
TaskManagerApplication.java
🧪 Testing the APIs
You can test using:

Postman

Thunder Client

Browser (for GET requests)

Example:

bash
Copy code
GET http://localhost:8080/api/tasks
🔗 Connect Frontend With Backend
Update your frontend app.js to call the backend API:

javascript
Copy code
fetch("http://localhost:8080/api/tasks")
If required, enable CORS in your Spring Boot controller:

java
Copy code
@CrossOrigin(origins = "*")
