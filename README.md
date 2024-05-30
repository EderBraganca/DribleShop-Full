DribleShop
DribleShop is an e-commerce application for selling sports goods. The project demonstrates the integration of Spring Boot for the backend and React for the frontend, organized using Clean Architecture principles. Additionally, the project is containerized using Docker for easy deployment and management.

Table of Contents
Features
Architecture
Getting Started
Prerequisites
Installation
Usage
Folder Structure
Docker Configuration
Contributing
License
Features
User authentication and authorization
Product listing and detail views
Shopping cart management
Order placement and order history
Responsive design for mobile and desktop
API documentation with Swagger
Architecture
The project follows Clean Architecture principles to ensure separation of concerns and maintainability.

Backend (Spring Boot)
Core: Domain entities, repositories, services, and use cases.
Adapter: Controllers and repository implementations.
Configuration: Application configuration such as security and database.
Frontend (React)
Components: Reusable UI components.
Pages: Components representing different routes.
Services: API calls and utility functions.
Store: Redux store configuration for state management.
Getting Started
Prerequisites
Java 17
Node.js (v16 or higher)
Docker
Docker Compose
Maven
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/dribleshop.git
cd dribleshop
Backend Setup:

Navigate to the backend directory:
bash
Copy code
cd dribleshop-backend
Build the project:
bash
Copy code
mvn clean package
Frontend Setup:

Navigate to the frontend directory:
bash
Copy code
cd ../dribleshop-frontend
Install dependencies:
bash
Copy code
npm install
Build the project:
bash
Copy code
npm run build
Usage
Running with Docker
Navigate to the root directory:

bash
Copy code
cd ..
Build and run the containers:

bash
Copy code
docker-compose up --build
Access the application:

Backend API: http://localhost:8080
Frontend: http://localhost:3000
Folder Structure
Backend (Spring Boot)
plaintext
Copy code
dribleshop-backend/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── dribleshop/
│   │   │           ├── DribleShopApplication.java
│   │   │           ├── config/
│   │   │           │   └── WebConfig.java
│   │   │           ├── core/
│   │   │           │   ├── domain/
│   │   │           │   │   ├── Product.java
│   │   │           │   │   ├── User.java
│   │   │           │   │   └── Order.java
│   │   │           │   ├── repository/
│   │   │           │   │   ├── ProductRepository.java
│   │   │           │   │   ├── UserRepository.java
│   │   │           │   │   └── OrderRepository.java
│   │   │           │   ├── service/
│   │   │           │   │   ├── ProductService.java
│   │   │           │   │   ├── UserService.java
│   │   │           │   │   └── OrderService.java
│   │   │           │   └── usecase/
│   │   │           │       ├── CreateProductUseCase.java
│   │   │           │       ├── GetUserUseCase.java
│   │   │           │       └── PlaceOrderUseCase.java
│   │   │           ├── adapter/
│   │   │           │   ├── controller/
│   │   │           │   │   ├── ProductController.java
│   │   │           │   │   ├── UserController.java
│   │   │           │   │   └── OrderController.java
│   │   │           │   └── repository/
│   │   │           │       ├── JpaProductRepository.java
│   │   │           │       ├── JpaUserRepository.java
│   │   │           │       └── JpaOrderRepository.java
│   │   │           └── config/
│   │   │               ├── SecurityConfig.java
│   │   │               └── DatabaseConfig.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── application-prod.properties
│   │   └── docker/
│   │       ├── Dockerfile
│   │       └── docker-compose.yml
│   └── test/
│       └── java/
│           └── com/
│               └── dribleshop/
│                   ├── ProductServiceTest.java
│                   ├── UserServiceTest.java
│                   └── OrderServiceTest.java
└── pom.xml
Frontend (React)
plaintext
Copy code
dribleshop-frontend/
│
├── public/
│   ├── index.html
│   └── ...
├── src/
│   ├── assets/
│   │   └── images/
│   │       └── logo.png
│   ├── components/
│   │   ├── common/
│   │   │   ├── Button.js
│   │   │   └── Header.js
│   │   ├── Product/
│   │   │   ├── ProductList.js
│   │   │   ├── ProductDetail.js
│   │   │   └── ProductCard.js
│   │   ├── Cart/
│   │   │   ├── Cart.js
│   │   │   └── CartItem.js
│   │   ├── User/
│   │   │   ├── Login.js
│   │   │   ├── Register.js
│   │   │   └── Profile.js
│   │   └── Order/
│   │       ├── OrderList.js
│   │       └── OrderDetail.js
│   ├── pages/
│   │   ├── HomePage.js
│   │   ├── ProductPage.js
│   │   ├── CartPage.js
│   │   ├── UserPage.js
│   │   └── OrderPage.js
│   ├── services/
│   │   ├── api/
│   │   │   ├── api.js
│   │   │   └── auth.js
│   │   └── util/
│   │       └── constants.js
│   ├── store/
│   │   ├── actions/
│   │   │   ├── productActions.js
│   │   │   ├── userActions.js
│   │   │   └── orderActions.js
│   │   ├── reducers/
│   │   │   ├── productReducer.js
│   │   │   ├── userReducer.js
│   │   │   └── orderReducer.js
│   │   ├── middlewares/
│   │   │   └── logger.js
│   │   └── store.js
│   ├── App.js
│   ├── index.js
│   ├── routes.js
│   └── styles/
│       └── main.css
├── Dockerfile
├── package.json
└── README.md
Docker Configuration
Backend Dockerfile
dockerfile
Copy code
# Use a Java 17 JDK image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
Frontend Dockerfile
dockerfile
Copy code
# Use a Node.js image to build the app
FROM node:16 as build

# Set the working directory
WORKDIR /app

# Copy package.json and install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the application
RUN npm run build

# Use an Nginx image to serve the frontend
FROM nginx:alpine

# Copy the built files from the previous stage
COPY --from=build /app/build /usr/share/ng