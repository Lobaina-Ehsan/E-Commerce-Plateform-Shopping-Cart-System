# E-Commerce-Plateform-Shopping-Cart-System
🛒 Simple E-Commerce Platform (Spring Boot + Bootstrap)

This is a basic e-commerce shopping cart web application built using **Spring Boot** for the backend and **Bootstrap + HTML** for the frontend.

It allows users to:
- Add products
- View all products
- Add products to a cart
- View and remove cart items

------------------------------------------------------------------------------------

## 🚀 Technologies Used

- **Java** (Spring Boot)
- **REST APIs** (`@RestController`)
- **HTML5 + Bootstrap 5**
- **In-memory storage** (`List<Product>`) – no database

------------------------------------------------------------------------------------

## 📁 Project Structure

src/
 └── main/
     ├── java/
     │    └── com.example.ecommerce/
     │         ├── ECommercePlatform.java
     │         ├── Product.java
     │         ├── ProductController.java
     │         ├── ShoppingCartController.java
     │
     └── resources/
          ├── static/
          │    └── index.html ✅
          └── application.properties


-------------------------------------------------------------------------------------

## ▶️ How to Run

If using Maven:

``bash
./mvnw spring-boot:run


This starts the server on:  
`http://localhost:8080`

-------------------------------------------------------------------------------------

## 🌐 Access the Frontend

Open this in your browser:

```
http://localhost:8080/index.html
```

Use the form at the top to add products, and manage your cart with buttons.

------------------------------------------------------------------------------------

## 📦 API Endpoints (Optional Testing)

You can also test the backend APIs using Postman or cURL.

### ➕ Add a Product

`POST /products`

```json
{
  "id": 1,
  "name": "Laptop",
  "price": 999.99
}
```

### 📄 View All Products

`GET /products`

------------------------------------------------------------------------------------

## 💡 Future Improvements

- Add database support (MySQL / PostgreSQL)
- User authentication (Spring Security)
- Quantity updates in cart
- Save cart per user
- Frontend in React or Angular


## 🧑‍💻 Author

Created by [Lobaina Ehsan]  
📬 Reach me at: [lobaina401@gmail.com]
