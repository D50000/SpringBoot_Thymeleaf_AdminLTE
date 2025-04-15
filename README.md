# Spring Boot + Thymeleaf + AdminLTE v4 Integration (Air Gap Mode)

This project demonstrates the integration of **Spring Boot**, **Thymeleaf**, and **AdminLTE v4**. It is configured to work in **air gap mode**, _meaning all required assets are hosted locally, avoiding reliance on external CDNs._

## Features

- **Spring Boot**: Backend framework for building Java-based web applications.
- **Thymeleaf**: Server-side template engine for rendering dynamic HTML content.
- **AdminLTE v4**: A modern admin dashboard template based on Bootstrap 5.
- **Air Gap Mode**: All external dependencies (CSS, JS, fonts, etc.) are downloaded and served locally.

## Project Structure

```
/src/main/resources/
├── static/
│   ├── vendor/          # Local copies of third-party libraries
│   ├── css/             # Custom CSS files
│   ├── js/              # Custom JavaScript files
├── templates/           # Thymeleaf templates
│   ├── index.html       # Main dashboard page
```

## Prerequisites

- **Java 17** or higher
- **Maven** or **Gradle**
- **Spring Boot** (pre-configured in the project)

## Setup Instructions

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/D50000/SpringBoot_Thymeleaf_AdminLTE.git
   cd SpringBoot_Thymeleaf_AdminLTE
   ```

2. **Build the Project**:
   Use Maven or Gradle to build the project:

   ```bash
   # Using Maven
   mvn clean install

   # Using Gradle
   gradle build
   ```

3. **Run the Application**:
   Start the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

4. **Access the Dashboard**:
   Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

## Air Gap Mode Details

All external dependencies (e.g., Bootstrap, OverlayScrollbars, ApexCharts) have been downloaded and placed in the `static/vendor/` directory. This ensures the application can run in environments without internet access.

### Key Dependencies

- **Bootstrap 5**: `/static/vendor/bootstrap/`
- **OverlayScrollbars**: `/static/vendor/overlayscrollbars/`
- **ApexCharts**: `/static/vendor/apexcharts/`
- **JSVectorMap**: `/static/vendor/jsvectormap/`
- **Fontsource Source Sans 3**: `/static/vendor/fontsource/source-sans-3/`

## Customization

1. **Thymeleaf Templates**:
   Modify the HTML files in the `src/main/resources/templates/` directory to customize the UI.

2. **Static Assets**:
   Add or update CSS/JS files in the `src/main/resources/static/` directory.

3. **Spring Boot Configuration**:
   Update application properties in `src/main/resources/application.properties`.

## Screenshots

### Dashboard

![Dashboard Screenshot](https://camo.githubusercontent.com/e9f53efb132911a8a11da2a9807291eb8414cdaf7b556448b321eaaf193ed7eb/68747470733a2f2f61646d696e6c74652e696f2f41646d696e4c5445332e706e67)

## License

This project is licensed under the [MIT License](LICENSE).

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any suggestions or improvements.

## Support

For any questions or issues, please contact [aoe102198@gmail.com](aoe102198@gmail.com).
