# 🎯 s3-01-patterns — Java Design Patterns

---

### 📝 Description
This repository contains structured **Java exercises** focused on learning and applying classic **software design patterns**.  
Through hands-on examples, you’ll practice building reusable, extensible, and well-structured Java programs.

---

## 🚀 Objectives
- Understand and implement the **Singleton**, **Abstract Factory**, and **Command** design patterns.
- Learn how design patterns improve **reusability**, **extensibility**, and **maintainability**.
- Practice structuring projects with clear separation of concerns.

---

## 📚 Exercise Overview

### Level 1 — *Singleton*
- **Undo Command Manager**:
    - Create a class `Undo` that replicates the functionality of the Linux `history` command.
    - It must:
        - Store the latest commands entered.
        - Allow adding, removing, and listing commands.
    - The `Undo` class **must implement the Singleton pattern**.
    - A `Main` class demonstrates its use with console input.

---

### Level 2 — *Abstract Factory*
- **Agenda application**:
    - Store **addresses** and **international phone numbers**.
    - Since formats differ across countries, use the **Abstract Factory pattern** to create:
        - `Address`
        - `PhoneNumber`

---

### Level 3 — *Command*
- **Parking area simulation**:
    - Vehicles: `Car`, `Bike`, `Plane`, `Boat`.
    - Each could support :
        - `start()`
        - `accelerate()`
        - `brake()`
    

---

## ⚙️ Technologies Used
- **Java 17**
- **IntelliJ IDEA**
- **GitHub**

---

## 📋 Requirements
- Java JDK **17+**
- Git for version control
- IDE (IntelliJ IDEA / Eclipse)

---

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s3-01-patterns-1.git

cd s3-01-patterns
```

- Open the project in **IntelliJ IDEA** or **Eclipse**.
- Ensure the project is set to **Java 17+**.

---

## ▶️ Execution
Navigate to the `Main.java` class inside each exercise level.

Run the program either from the IDE or via terminal:

💡 Each `Main` class is designed to demonstrate the corresponding **design pattern**.

---

## 🤝 Contributions
**1.** Fork the repository.

**2.** Create a new branch:
   ```bash
   git checkout -b feature/MyFeature
   ```
**3.** Commit your changes:
   ```bash
   git commit -m "Add MyFeature"
   ```
**4.** Push to your fork and open a **Pull Request**.

---

## ✅ Author Notes
These exercises provide a foundation in **object-oriented design** and **software patterns**, which are essential for building professional-grade software.

Happy coding! 🚀
