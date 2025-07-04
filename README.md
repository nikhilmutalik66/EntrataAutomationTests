# Entrata SDET Selenium Test Automation Framework

This is a complete Java-based Selenium automation framework for testing [https://www.entrata.com].
The framework follows the Page Object Model (POM) using PageFactory, TestNG, and ExtentReports.

---

## 🚀 Features

✅ Page Object Model (POM)
✅ Selenium WebDriver with TestNG  
✅ WebDriver setup and teardown using TestNG hooks  
✅ Extent Reports v5 (with screenshots on failure)  
✅ Explicit waits (`WebDriverWait`)  
✅ Screenshot capture and attachment to report  
✅ Clean Maven structure

## 🔧 Prerequisites

- Java 11+
- Maven 3.6+
- Chrome browser
- Internet connection (for WebDriverManager)


## ⚙️ Setup & Run Instructions

### 1. Clone the repository or extract the ZIP:

```bash
cd EntrataAutomationTests

mvn clean test
