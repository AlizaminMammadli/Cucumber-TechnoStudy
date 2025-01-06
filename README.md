# Cucumber Projects

This document contains the user stories for the ParaBank and Magento platforms. Each story is detailed with acceptance criteria, preconditions, and scenarios.

## Technologies Used
- **Programming Language**: Java
- **Test Automation Tools**: Selenium WebDriver
- **Test Framework**: TestNG
- **BDD Framework**: Cucumber
- **Test Automation Pattern**: Page Object Model (POM)
- **Dependency Management and Build Tool**: Maven
- **Reporting Tools**: Extent Report (or a similar reporting tool)
- **Version Control System**: Git and GitHub
- **Test Management Tools**: JIRA & XRAY (or similar tools)
- **Logging Interface**: slf4j (Simple Logging Facade for Java)

## ParaBank User Stories

### US601: Create a New User Account (Register)
- **Description:** I want to open an account on the ParaBank website to access banking services. When I complete the registration process, I should confirm that I have registered successfully, enabling me to access my private banking services.
- **Acceptance Criteria:**
  - The user must visit the ParaBank website.
  - There must be a link such as "Register" or "Open Account" on the website.
  - The user must fill out the registration form with invalid information.
  - The user must click a button such as "Submit" or "Register."
  - The user must confirm a successful registration process and see the message "Your Account Has Been Successfully Created."
- **Preconditions:**
  - Internet access must be available in the test environment.
  - A browser (e.g., Chrome, Safari, or Firefox) must be installed and launched.
  - The user must access https://parabank.parasoft.com/.
- **Customer Data:**
  - First Name: {Required}
  - Last Name: {Required}
  - Address: {Required}
  - City: {Required}
  - State: {Required}
  - Zip Code: {Required}
  - Phone #: {OPTIONAL}
  - SSN: {Required}
  - Username: {Required}
  - Password: {Required}
  - Confirm Password: {Required}
- **Priority:** High
- **Group:** Accounts, Smoke, Regression
- **Scenario 1:** Creation of User Record
  - The user goes to the ParaBank website.
  - The user clicks on the "Register" link on the homepage.
  - The user fills in the fields specified in the customer data.
  - The user clicks the "Register" button.
  - The user verifies that they have registered successfully and received a confirmation message.

### US602: User Login (Login)
- **Description:** I want to log into the ParaBank website to access my account and perform banking transactions.
- **Acceptance Criteria:**
  - The user must log in with a valid username and password combination.
  - The user must attempt to log in with an invalid username or password combination.
- **Preconditions:**
  - The "US601" story must be successfully completed.
- **Priority:** High
- **Group:** Accounts, Smoke, Regression
- **Scenario 1:** Login with valid user information
  - The user goes to the ParaBank website.
  - The user clicks on the "Login" link on the homepage.
  - The user logs in with a valid username and password combination.
  - The user verifies that they have logged in successfully.

### US603: Paying Bills (Paying Bills)
- **Description:** I want to pay my bills through the ParaBank website.
- **Acceptance Criteria:**
  - The user must be logged in successfully.
  - The user must be redirected to the bill payment page.
- **Preconditions:**
  - The "US602" story must be successfully completed.
- **Priority:** High
- **Group:** Payment, Smoke, Regression

### US604: Open a New Bank Account (New Account)
- **Description:** As a ParaBank customer, I want to be able to open savings and checking accounts.
- **Acceptance Criteria:**
  - The user must be logged into the system.
  - The user must be able to access the menu to create a savings or checking account.
- **Priority:** Medium
- **Group:** Accounts, Smoke, Regression

### US605: Transfer Funds Between Accounts
- **Description:** I want to transfer money from one of my accounts to another.
- **Acceptance Criteria:**
  - The user must have logged in before initiating the fund transfer between accounts.
  - The user must enter the necessary information for the fund transfer correctly.
- **Priority:** Medium
- **Group:** Payment, Regression

### US606: Update Contact Information (Update Contact Info)
- **Description:** I want to update my contact information in my profile.
- **Acceptance Criteria:**
  - The user must be able to access the account management panel after logging in.
  - The user must be able to update their contact information.
- **Priority:** Low
- **Group:** Contact, Accounts

### US607: Loan Application (Loan Application)
- **Description:** I want to apply for a loan through the ParaBank website.
- **Acceptance Criteria:**
  - The user must be able to see the result of the loan application instantly.
  - The user must receive a message stating "Approved" if approved and "Rejected" if rejected.
- **Preconditions:**
  - The "US601" story must be successfully completed.
  - The user must be logged into the system.
- **Priority:** Low
- **Group:** Loan, Accounts, Regression

## Magento User Stories

### US701: Create a New User Account (Register)
- **Description:** I want to create a registration for new users on Magento so that I can access the platform.
- **Acceptance Criteria:**
  1. Personal Information Entry: New users must enter first and last name.
  2. Login Information Entry: A valid email address and a secure password must be set.
  3. Password Confirmation: Users must enter a confirmation password for the password they set.
  4. Account Creation Button: Users must complete the registration process by clicking the "Create an Account" button after filling out the form.
  5. Navigation Options: Users must be able to return to the login page using the "Back" option if they want to exit the registration form.
- **Preconditions:**
  - Internet access must be available in the test environment.
  - A browser (e.g., Chrome, Safari, or Firefox) must be installed and launched.
  - The user must access the [Magento Testing Board](https://magento.softwaretestingboard.com/).
- **Customer Data:**
  - First Name: John
  - Last Name: Doe
  - Email: john@example.com
  - Password: Passw0rd
  - Confirm Password: Passw0rd
- **Sample Scenarios:**
  - The user accesses the registration form and fills in their information.
  - The user completes the registration by clicking the "Create an Account" button.
  - The user receives confirmation that they have been registered successfully.

### US702: User Login (Login)
- **Description:** Only registered users should be able to log into the Magento e-commerce platform.
- **Acceptance Criteria:**
  1. Login Information Entry: Users must enter their registered email address and password.
  2. Login Button: Users must complete the login process by clicking the "Sign In" button after filling in their login information.
  3. Forgot Password Option: Users must be able to initiate the password reset process by selecting "Forgot Your Password?" when they forget their password.
- **Preconditions:**
  - The "US701" story must be successfully completed.
- **Sample Scenarios:**
  - The user logs in with the correct email address and password.
  - The user receives an error message if incorrect information is entered.

### US703: Adding an Address
- **Description:** We want to enable our customers to add multiple addresses to their accounts.
- **Acceptance Criteria:**
  1. Users must be able to add a new address to their accounts.
  2. Required fields must be filled (first name, last name, address, city, etc.).
  3. Users must be able to edit the addresses they have added.
  4. Users must be able to delete the addresses they have added.
  5. Each address must have the options for "Default Billing Address" and "Default Shipping Address."
- **Preconditions:**
  - Users must have an account.
  - Users must be logged into the Magento e-commerce platform.
- **Customer Data:**
  - First Name: {req}
  - Last Name: {req}
  - Address: {req}
  - City: {req}
  - Zip Code: {req}
  - Country: {req}
- **Sample Scenarios:**
  - The user adds a new address and saves the changes.

### US704: TAB Menu Control
- **Description:** We want to allow customers to access different categories using the TAB menu at the top of the homepage.
- **Acceptance Criteria:**
  1. Main categories must be present in the TAB menu.
  2. Clicking on any main category should display the relevant subcategories.
  3. The menu must work correctly, and all links must be active.
- **Preconditions:**
  - Preconditions valid for "US703."
- **Sample Scenarios:**
  - The user clicks on the "Women" category in the TAB menu and sees the subcategories.

### US705: Add/Remove Products from Cart
- **Description:** We want to allow our registered users to add and remove products from the cart while navigating the website.
- **Acceptance Criteria:**
  1. After logging in, users must be able to add products to the cart.
  2. Users must be able to select the quantity of the products they have added.
  3. Users must be able to remove a product from the cart.
- **Preconditions:**
  - Preconditions valid for "US703."
- **Sample Scenarios:**
  - The user adds a random product to the cart and changes the product quantity.

### US706: Product Ordering
- **Description:** We want to develop the functionality required for registered users to purchase products and make payments.
- **Acceptance Criteria:**
  1. Users must be able to select products and add them to the cart.
  2. Users must enter payment information to complete the order.
  3. When the order process is successful, the user must see an order confirmation.
- **Preconditions:**
  - Preconditions valid for "US703."
  - The "US705" story must be completed.
- **Sample Scenarios:**
  - The user adds products to their cart and clicks the "Proceed to checkout" button.

### US707: Search Functionality
- **Description:** Users should be able to enter a product ID in the search function to verify the existence of the product.
- **Acceptance Criteria:**
  1. When a valid SKU number is entered, the relevant product should appear in the search results.
  2. The user should receive a warning when an invalid SKU number is entered.
- **Preconditions:**
  - Preconditions valid for "US703."
- **Sample Scenarios:**
  - The user searches for the SKU number and finds the correct product.

### US708: Create a Wishlist
- **Description:** Users should have the ability to add and remove products from their favorites.
- **Acceptance Criteria:**
  1. Users must be able to add a product to their wishlist.
  2. Users must be able to update the quantity and content of the products in their wishlist.
- **Preconditions:**
  - Preconditions valid for "US703."
- **Sample Scenarios:**
  - The user adds a product to their favorites and sees it in the favorites list.

## Configuration/Setup
1. Ensure you have **Java 11** or higher installed.
2. Install the necessary plugins in **IntelliJ IDEA**:
   - **TestNG**: For test execution.
   - **Cucumber for Java**: For BDD-style tests.
   - **Gherkin**: For writing feature files in Cucumber.
3. Set up a **TestNG XML** to define and manage your test suite execution.

