# 👤 User Microservice

A simple Spring Boot microservice for managing user data, using MySQL (via Docker), validation, and RESTful APIs. Ideal for learning microservices and building production-ready applications.

---

## 🚀 Features

- CRUD operations for users
- MySQL integration via Docker
- Bean validation (`@NotBlank`, `@Email`, etc.)
- Global exception handling
- RESTful API design
- Postman tested

---

## 🏗️ Technologies

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL (Docker)
- Jakarta Validation
- Postman (for testing)

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git
cd YOUR_REPO_NAME
```

### 2. Run MySQL using Docker

```bash
docker-compose up -d
```

> See `docker-compose.yml` for configuration.

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Or run `FirstmicroserviceApplication.java` from your IDE.

---

## 🔌 API Endpoints

| Method | Endpoint        | Description          |
|--------|-----------------|----------------------|
| GET    | `/users`        | Get all users        |
| GET    | `/users/{id}`   | Get user by ID       |
| POST   | `/users`        | Create new user      |
| PUT    | `/users/{id}`   | Update existing user |
| DELETE | `/users/{id}`   | Delete user          |

---

## 🧪 Example POST Request

**POST `/users`**

```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "age": 25,
  "address": "123 Main St"
}
```

---

## 🐳 MySQL Docker Config

```yaml
# docker-compose.yml
version: '3.8'
services:
  mysql:
    image: mysql:8.0
    ports:
      - "3306:3306"
    environment:
      MYSQL_DATABASE: mydb
      MYSQL_USER: dj
      MYSQL_PASSWORD: password
      MYSQL_ROOT_PASSWORD: rootpass
    volumes:
      - mysql-data:/var/lib/mysql

volumes:
  mysql-data:
```

---

## 📂 Project Structure

```
src
├── main
│   ├── java/com/firstmicroservices
│   │   ├── controller
│   │   ├── service
│   │   ├── model
│   │   ├── repository
│   │   └── exception
│   └── resources
│       ├── application.properties
└── test
```

---

## 🛡️ License

This project is open source and available under the [MIT License](LICENSE).
