# 🎬 Movie Management REST API

A simple Java Spring Boot backend application that implements a RESTful API for managing a collection of movies (Netflix-style example).  
This project is built as a **sample task** to demonstrate REST API design, in-memory data handling, validation, and deployment.

---

## 📌 Overview

This application allows you to:
- Add a new movie
- Fetch a movie by its ID

The application uses **in-memory storage (ArrayList)** instead of a database, as required.  
It is intentionally kept minimal, clean, and easy to understand.

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Jakarta Validation**
- **Maven**
- **Docker (for deployment)**
- **Render (hosting platform)**

---

## 📂 Project Structure

src/main/java  
└── com.example.movie_api  
&nbsp;&nbsp;&nbsp;&nbsp;├── controller  
&nbsp;&nbsp;&nbsp;&nbsp;│   └── MovieController.java  
&nbsp;&nbsp;&nbsp;&nbsp;├── service  
&nbsp;&nbsp;&nbsp;&nbsp;│   └── MovieService.java  
&nbsp;&nbsp;&nbsp;&nbsp;├── model  
&nbsp;&nbsp;&nbsp;&nbsp;│   └── Movie.java  
&nbsp;&nbsp;&nbsp;&nbsp;└── MovieApiApplication.java  

---

## 🎥 Movie Model

Each movie contains the following fields:
- `id` (Long) – Auto-generated on the server
- `name` (String) – Required
- `description` (String) – Required
- `genre` (String) – Optional

Input validation is applied using Jakarta Validation annotations.

---

## 🔗 API Endpoints

### 1️⃣ Add a New Movie

**Endpoint**
---
**POST /api/movies**
```
{
"name": "Inception",
"description": "Sci-fi movie",
"genre": "Thriller"
}
```

**Request Body (JSON)**
```
{
"id": 1,
"name": "Inception",
"description": "Sci-fi movie",
"genre": "Thriller"
}
```

- The `id` is generated automatically.
- If required fields are missing, the API returns **400 Bad Request**.

---

### 2️⃣ Get Movie by ID

**Endpoint**
---
**GET /api/movies/{id}**


**Response (JSON)**
```
{
"id": 1,
"name": "Inception",
"description": "Sci-fi movie",
"genre": "Thriller"
}
```

- Returns **404 Not Found** if the movie does not exist.

---

## ▶️ How to Run the Application Locally

### Prerequisites
- Java 17+
- Maven

### Steps

```
git clone https://github.com/sumitsargam1510/movie-api.git

cd movie-api
mvn spring-boot:run
```

**The application will start at:**
http://localhost:8080


---

## ☁️ Running the Deployed Application

The application is deployed on **Render** and is accessible via the live URL provided.

> Note: Since this application uses **in-memory storage**, all data is lost when the application restarts (which is expected behavior).

APIs should be tested using tools like:
- Postman
- Hoppscotch
- curl

---

## ⚙️ Important Implementation Details

- Uses **ArrayList** as an in-memory data store (no database).
- IDs are managed server-side to maintain integrity.
- Follows layered architecture:
  - Controller → Service → In-memory storage
- Designed intentionally minimal to match task requirements.
- No authentication, database, or extra features added to avoid overengineering.

---

## 👨‍💻 Author

**Sumit Sargam**  
Java & Spring Boot Developer  

GitHub: https://github.com/sumitsargam1510  
LinkedIn: https://www.linkedin.com/in/sumit-sargam-6209a9334  

---
