# Employee Department Management System

A web-based application for managing employees and their departments, built using **Spring Boot** and following the **MVC** architectural pattern. This project demonstrates solid backend structure using relational database mapping and provides basic CRUD operations through both SQL and JPQL queries.

---

## 🔧 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MVC Architecture**
- **MySQL / PostgreSQL (or any relational DB)**
- **JPQL & Native SQL**
- **Lombok**
- **Hibernate**

---

## 📚 Project Overview

This system allows you to:

- Add, update, delete, and view employees.
- Assign employees to departments.
- Manage departments independently.
- Establish **many-to-one** and **one-to-many** relationships using **JPA annotations**.
- Query data using both **JPQL** and **native SQL** for flexibility and optimization.

---

## 📁 Project Structure (MVC)

- **Model**: Contains JPA entities for `Employee` and `Department`.
- **Repository**: Interfaces extending `JpaRepository` to handle database operations.
- **Service**: Business logic layer to handle interactions between controllers and repositories.
- **Controller**: REST endpoints for handling HTTP requests and responses.

---

## 🗃️ Database Schema

- **Employee Table**: Stores employee information with a foreign key to the department.
- **Department Table**: Stores department data.
- The relationship is defined as:
  - One Department → Many Employees
  - Many Employees → One Department

---

## 🧪 Sample Features

- `/employees` — View all employees.
- `/departments` — Manage departments.
- `/employees/by-department/{id}` — View employees under a specific department.
- Advanced queries using JPQL (e.g., fetch employees by department name, salary ranges, etc.).

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/employee_department_management.git
