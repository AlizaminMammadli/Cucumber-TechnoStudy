# Magento E-commerce Test Automation Project

This project aims to automate testing of core e-commerce functionalities on the Magento Open Source platform. The project includes automation of various user stories such as new user registration, user login, address addition, product search, cart, and order transactions.

## About the Project

Magento is a customizable solution for e-commerce sites of all scales, from small stores to large marketplaces. This test automation project is developed on the open-source and free Magento Open Source version and includes automation tests for the following functionalities:

- User Registration
- User Login
- Address Addition
- Menu Navigation
- Adding/Removing Items to/from Cart
- Product Ordering and Confirmation
- Product Search
- Wishlist Management

For more information on Magento, click [here](https://www.hosting.com.tr/blog/magento/).

## User Stories

The test scenarios in this project are designed according to the following user stories:

- **US701**: User Registration
- **US702**: User Login
- **US703**: Address Addition
- **US704**: Menu Navigation
- **US705**: Add/Remove Items in Cart
- **US706**: Product Ordering
- **US707**: Product Search
- **US708**: Wishlist Management

Each scenario is structured using `Scenario Outline` and `Data Table`.

## Project Technologies and Tools

The key technologies and tools used in this project are:

- **Programming Language**: Java
- **Test Automation Tools**: Selenium WebDriver
- **Test Framework**: TestNG
- **BDD Framework**: Cucumber
- **Test Automation Model**: Page Object Model (POM)
- **Dependency Management and Build**: Maven
- **File Read/Write**: Apache POI (Optional)
- **Reporting**: Extent Report or similar
- **Version Control System**: Git and GitHub
- **Test Management**: Jira, Zephyr/Xray
- **Logging**: SLF4J (Simple Logging Facade for Java)

## Project Setup

### Prerequisites

1. **Java Development Kit (JDK)** - Version 11 or higher
2. **Maven** - Version 3.6 or higher
3. **Git** - Version 2.0 or higher
4. **An IDE** (such as IntelliJ IDEA or Eclipse)

### Test Reports

- Test results will be generated in the `target/reports` directory via `Extent Report`.

## Project Structure

    ├── src/main/java        # Page classes and utility classes
    ├── src/test/java        # Test classes and BDD scenarios
    ├── src/test/resources   # Cucumber feature files
    ├── pom.xml              # Maven dependencies and project configuration file

## Contributing

To contribute to the project, please follow these steps:

1. Create a `fork` of the repository.
2. Branch your changes under `feature-branch`.
3. Test your changes and update documentation.
4. Submit a `pull request`.


