# NutrientDiet 🍎
A **role-based web application** built using **Spring Boot, JSP, and MySQL** for personalized diet planning. This project enables **dietitians** to design custom nutrition plans, **users** to view them based on their profiles, and an **admin** to manage both users and dietitians.  

## 🚀 Features
- 👨‍💼 **Admin Panel** – Admin can view and manage all users and dietitians.  
- 👩‍⚕️ **Role-based Access Control** – Separate modules for admin, dietitians, and users.  
- 🥗 **Personalized Diet Plans** – Tailored meal plans assigned by dietitians.  
- 🔐 **Secure Authentication** – Login/logout with Spring Security & session management.  
- 🎨 **Frontend with JSP** – User-friendly interface for navigation and plan viewing.  
- 🛠 **Spring Boot + MVC Architecture** – Modular backend with clean separation of concerns.  
- 💾 **MySQL Integration** – Stores user profiles, diet plans, and authentication details.  

## 🏗 Tech Stack
- **Backend:** Spring Boot (Java)  
- **Frontend:** JSP  
- **Database:** MySQL  
- **Architecture:** MVC  
- **Build Tool:** Maven (via Spring Boot)  

## 📂 Project Structure
NutrientDiet/ → src/main/java (controllers, services, repositories, models), src/main/resources (application.properties, templates, static files), target (compiled classes), pom.xml (Spring Boot configuration), other IDE configs.  

## ⚙️ Setup & Installation
1. Clone the repository:  
   `git clone https://github.com/chaitanyasivathmika/NutrientDiet.git`  
2. Open the project in **Eclipse/IntelliJ** as a **Spring Boot Project**.  
3. Configure **MySQL database** and update DB credentials in `application.properties`.  
4. Run the project using:  
   `mvn spring-boot:run`  or run the main class from your IDE.  
5. Access the app at: `http://localhost:8080/NutrientDiet`  

## 🔑 Login Roles
- **Admin**: View and manage all users and dietitians.  
- **Dietitian**: Create and manage diet plans.  
- **User**: View assigned personalized nutrition plans.  

## 📌 Future Enhancements
- Add **REST APIs** for mobile app integration.  
- Implement **diet progress tracking** with analytics.  
- Enable **real-time chat** between users and dietitians.

## 👩‍💻 Author
- **Chaitanya Sivathmika**  
