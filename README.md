# Spring Boot + Thymeleaf + AdminLTE v4 Integration (Air Gap Mode)

This project demonstrates the integration of **Spring Boot**, **Thymeleaf**, and **AdminLTE v4**. It is designed to work in **air gap mode**, meaning all required assets (CSS, JS, fonts, etc.) are hosted locally, _ensuring the application can run in environments without internet access._

---

## ✨ Features

- **Spring Boot**: A powerful backend framework for building Java-based web applications.
- **Thymeleaf**: A modern server-side template engine for rendering dynamic HTML content.
- **AdminLTE v4**: A sleek and responsive admin dashboard template built on Bootstrap 5.
- **Air Gap Mode**: All external dependencies are downloaded and served locally for offline compatibility.
- **Customizable**: Easily extend and modify templates, styles, and functionality.

---

## 📂 Project Structure

```
/src/main/resources/
├── static/
│   ├── vendor/          # Local copies of third-party libraries (Bootstrap, ApexCharts, etc.)
│   ├── css/             # Custom CSS files
│   ├── js/              # Custom JavaScript files
├── templates/           # Thymeleaf templates
│   ├── index.html       # Main dashboard page
```

---

## 🛠️ Prerequisites

Before running the project, ensure you have the following installed:

- **Java 17** or higher
- **Maven** or **Gradle**
- **Spring Boot** (pre-configured in the project)

---

## 🚀 Getting Started

Follow these steps to set up and run the project:

### 1. Clone the Repository

```bash
git clone https://github.com/your-repo/SpringBoot_Thymeleaf_AdminLTE.git
cd SpringBoot_Thymeleaf_AdminLTE
```

### 2. Build the Project

Use Maven or Gradle to build the project:

```bash
# Using Maven
mvn clean install

# Using Gradle
gradle build
```

### 3. Run the Application

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

### 4. Access the Dashboard

Open your browser and navigate to:

```
http://localhost:8080
```

---

## 🌐 Air Gap Mode Details

This project is configured to work in **air gap mode**, meaning it does not rely on external CDNs. All required assets are downloaded and stored locally in the `static/vendor/` directory.

### Key Dependencies

| Dependency                   | Local Path                                 |
| ---------------------------- | ------------------------------------------ |
| **Bootstrap 5**              | `/static/vendor/bootstrap/`                |
| **OverlayScrollbars**        | `/static/vendor/overlayscrollbars/`        |
| **ApexCharts**               | `/static/vendor/apexcharts/`               |
| **JSVectorMap**              | `/static/vendor/jsvectormap/`              |
| **Fontsource Source Sans 3** | `/static/vendor/fontsource/source-sans-3/` |

---

## 🖌️ Customization

### 1. Modify Thymeleaf Templates

All templates are located in the `src/main/resources/templates/` directory. You can edit these files to customize the UI.

### 2. Update Static Assets

Add or modify CSS/JS files in the `src/main/resources/static/` directory to change styles or add custom functionality.

### 3. Configure Spring Boot

Update application properties in `src/main/resources/application.properties` to adjust server settings, view resolver configurations, etc.

---

## 📸 Screenshots

### Dashboard

![Dashboard Screenshot](https://camo.githubusercontent.com/e9f53efb132911a8a11da2a9807291eb8414cdaf7b556448b321eaaf193ed7eb/68747470733a2f2f61646d696e6c74652e696f2f41646d696e4c5445332e706e67)

---

## 📝 License

This project is licensed under the [MIT License](LICENSE).

---

## 🤝 Contributing

Contributions are welcome! If you have suggestions or improvements, feel free to submit a pull request or open an issue.

---

## 📧 Support

For any questions or issues, please contact [aoe102198@gmail.com](aoe102198@gmail.com).
