# Cucumber BDD Automation Framework

A comprehensive Behavior Driven Development (BDD) automation framework built with Cucumber, Selenium WebDriver, and Java for automated testing of web applications.

## 🎯 BDD Development Process

This framework follows the standard BDD development process where Product Owners, Developers, and Testers collaborate to define requirements as structured scenarios.

![BDD Development Process](https://github.com/user-attachments/assets/99ddbaa6-33a2-4dfc-bc6a-705dc6ec14ed)

*The BDD development process showing collaboration between stakeholders and automated test execution*

## 🚀 Key Features

- **Cucumber BDD Framework** with Gherkin syntax for readable test scenarios
- **Selenium WebDriver** integration for web automation
- **Page Object Model (POM)** design pattern implementation
- **TestNG** test runner for organized test execution
- **Cross-browser testing** support (Chrome, Firefox, Edge)
- **Comprehensive reporting** with HTML and JSON outputs
- **Maven** build management and dependency handling

## 📁 Project Structure

```
Cucumber-BDD-Automation-Framework/
├── .idea/                           # IntelliJ IDEA configuration
├── .mvn/                           # Maven wrapper files
├── build/                          # Build output directory
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.chiragrathava/   # Main package
│   └── test/
│       ├── java/
│       │   └── com.chiragrathava/
│       │       ├── runner/
│       │       │   └── TestRunner   # Cucumber test runner
│       │       └── step.definitions/
│       │           └── LoginSteps   # Login step definitions
│       └── resources/
│           ├── featureFiles/
│           │   └── Login.feature    # Login feature file
│           └── cucumber.properties  # Cucumber configuration
├── target/                         # Maven build target directory
└── pom.xml                         # Maven project configuration
```

## 🧪 Test Scenarios

The framework includes automated test scenarios for login functionality:

- **Successful login** with valid credentials
- **Failed login attempts** with invalid credentials

![Test Execution Results](https://github.com/user-attachments/assets/37e1cd7b-232a-4878-829d-3a63a1949750)

*Test execution showing 100% pass rate with detailed scenario results*

## 🛠️ Technologies Used

- **Java** - Programming language
- **Cucumber** - BDD framework
- **Selenium WebDriver** - Web automation
- **TestNG** - Test runner
- **Maven** - Build tool
- **IntelliJ IDEA** - IDE

## 🔧 Prerequisites

- Java JDK 8+
- Maven 3.6+
- Chrome/Firefox browser
- IntelliJ IDEA (recommended)

## ⚡ Quick Start

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ChiragRathava/Cucumber-BDD-Automation-Framework.git
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Run tests:**
   ```bash
    mvn test
   ```
   

## 📊 Test Reports

The framework generates detailed test reports including:
- HTML reports with step-by-step execution details
- JSON reports for integration with other tools
- Execution time and success rate metrics

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 👨‍💻 Author

**Chirag Rathava**
- GitHub: [@ChiragRathava](https://github.com/ChiragRathava)

---

⭐ **Star this repository if you find it helpful!**