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
    └── ControladorCargaMarcas.java.

