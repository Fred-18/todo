
# 📝 Todo List API – Spring Boot Project

This project is a **Todo List backend application** developed in **Java** using **Spring Boot**. It was designed as a personal learning project to strengthen my Java skills and get more comfortable with building backend systems using RESTful practices and service-layer separation.

---

## 📌 Project Goals

- Practice and improve Java and Spring Boot skills.
- Learn to structure a backend application following good design practices.
- Understand and apply **DTOs (Data Transfer Objects)**.
- Use **JPA** for database access and persistence.
- Build and expose a **RESTful API** for task management.

---

## ⚙️ Technologies & Tools

- **Java 17**
- **Spring Boot**
    - `spring-boot-starter-web`
    - `spring-boot-starter-data-jpa`
    - `spring-boot-starter-validation`
- **PostgreSQL** (or **H2** for local dev)
- **Maven** for dependency management
- **JUnit 5** and **Mockito** for testing
- **MapStruct** (optional, for DTO mapping)

---

## 🧱 Project Structure Overview

The application follows a **simple but clean architecture** inspired by Hexagonal principles, without fully implementing it. The project is organized with separation of concerns in mind:

```
com.example.todo
│
├── application       // DTOs, service classes
├── domain            // Core domain models (entities, enums)
├── infrastructure    // Repositories and configuration
└── web               // Controllers and exception handling
```

### 📌 Main Concepts

- **Entities**: Core domain objects like `TodoEntity`.
- **DTOs**: Used to transfer data in and out of the application cleanly.
- **Service Layer**: Contains the business logic.
- **Controllers**: Expose the REST endpoints and handle HTTP requests.
- **Repository Interfaces**: Abstract the persistence layer using Spring Data JPA.

---

## 📮 API Overview

| Method | Endpoint         | Description               |
|--------|------------------|---------------------------|
| GET    | /todos           | Get all todos             |
| GET    | /todos/{id}      | Get a todo by ID          |
| POST   | /todos           | Create a new todo         |
| PUT    | /todos/{id}      | Update an existing todo   |
| DELETE | /todos/{id}      | Delete a todo by ID       |

---

## 🚀 Project Status

The project is **functionally complete**, with full CRUD features. Final adjustments and testing are still in progress. No deployment is planned for now — the focus remains on learning and clean backend design.

---

## 📁 Run the Project

To run the project locally:

```bash
./mvnw spring-boot:run
```

Make sure to configure your database access in `application.properties`.

---

## ✅ Tests

Unit tests are written using **JUnit 5** and **Mockito**, covering both the service and controller layers.

---

## 📌 Author

Made with learning and passion by **Fred**, to grow and explore the world of Java and backend development.
