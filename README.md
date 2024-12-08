# AutoHub
(Conveying simplicity, connectivity, and focus on cars.)

# 🚗 AutoHub - Car Dealership Management App

AutoHub is a lightweight desktop application built in Java for managing car dealership data. It leverages the **Model-View-Controller (MVC)** design pattern to ensure scalability, maintainability, and separation of concerns.

## 📖 Features
- **Dynamic brand loading**: Fetches unique car brands from a MySQL database.
- **Search functionality**: Query and display car details by brand.
- **Interactive UI**: A simple interface built with Java Swing.

---

## 🛠️ Technologies & Tools
- **Java (JDK 8+)**: Core language.
- **Swing**: For building the graphical user interface.
- **JDBC**: Database connectivity.
- **MySQL**: Data storage.
- **MVC Design Pattern**: Implements separation of concerns for clean code and better scalability.

---

## 🚀 How It Works
### 1. **Architecture**
The app follows the **MVC** architecture:
- **Model**: Handles data logic and database connections (`modeloBD` package).
- **View**: Provides the user interface (`Interfaz_usuario` package).
- **Controller**: Bridges the Model and View, managing application logic (`conecciones` package).

### 2. **Workflow**
- On app launch, brands are fetched from the database and loaded into a dropdown menu.
- Users can select a brand and click the "Consultar" button to view all associated car models and prices.

---

## 📦 Project Structure
    ```plaintext
    src/
    ├── Interfaz_usuario/
    │   ├── InterfazUser.java
    │   └── init_app.java
    ├── modeloBD/
    │   ├── consultaMarcasBox.java
    │   ├── EjecutaDatosProductos.java
    │   ├── productos.java
    │   └── conexionBD.java
    └── conecciones/
    └── ControladorCargaMarcas.java

--------------------------------------------------
✨ Good Practices

Code Modularity: Separation of concerns with clear distinctions between UI, database logic, and controllers.
Reusable Components: Modular functions for database connections and queries.
Error Handling: Try-catch blocks to manage SQL exceptions gracefully.
Scalable Design: Built with future extensibility in mind, adhering to the MVC paradigm.
Resource Management: Proper closing of database connections to prevent leaks.

--------------------------------------------------
🔧 How to Run

Prerequisites:
Install Java JDK (version 8+).
Install MySQL Server and set up the following database schema:

    CREATE DATABASE concesionaria;
    USE concesionaria;

    CREATE TABLE cars (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(50),
    model VARCHAR(50),
    price DECIMAL(10, 2)
    );

--------------------------------------------------

Steps:
Clone the repository:

    git clone https://github.com/Lozada98/AutoHub.git
    cd AutoHub

--------------------------------------------------

Compile the project:

    javac -d bin src/**/*.java

--------------------------------------------------
Run the application:

    java -cp bin Interfaz_usuario.init_app

--------------------------------------------------


https://github.com/user-attachments/assets/47cc1206-43c9-4256-9c47-3b28663d23d3

