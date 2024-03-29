Feature: Test Automation Rest API

  @web
  Scenario: Validate User can Sign up with valid username and password
    Given user go to home page
    And user click Sign up button in home page
    And user input random username
    And user input random password
    When user click Sign up button in Sign up page
    Then user can see pop up message "Sign up successful."
  @web
  Scenario: Validate User cannot Sign up without filing valid username and password
    Given user go to home page
    And user click Sign up button in home page
    When user click Sign up button in Sign up page
    Then user can see pop up message "Please fill out Username and Password."

  @web
  Scenario: Validate User can Log in with valid username and password
    Given user go to home page
    And user click Log in button in home page
    And user input username in log in "habibi"
    And user input password in log in "habibi"
    When user click Log in button in Log in page
    Then user can see Wellcome "habibi" at top right of the page
  @web
  Scenario: Validate User cannot Log in without fill username and password
    Given user go to home page
    And user click Log in button in home page
    When user click Log in button in Log in page
    Then user can see pop up message "Please fill out Username and Password."
  @web
  Scenario: Validate User cannot Log in with invalid username and password
    Given user go to home page
    And user click Log in button in home page
    And user input username in log in "5464868"
    And user input password in log in "habibi"
    When user click Log in button in Log in page
    Then user can see pop up message "User does not exist."
  @web
  Scenario: Validate User can Log out
    Given user go to home page
    And user click Log in button in home page
    And user input username in log in "habibi"
    And user input password in log in "habibi"
    When user click Log in button in Log in page
    And user click log out button
    Then User log out successfully

  @web
  Scenario: Validate User can go to product page
    Given user go to home page
    And user click Samsung galaxy s6 image
    Then user navigated to Samsung Galaxy s6 product page

  @web
  Scenario: Validate phone categories
    Given user go to home page
    And user click phones categories
    Then user can see Nokia lumia 1520

  @web
  Scenario: Validate Laptops categories
    Given user go to home page
    And user click laptops categories
    Then user can see Sony vaio i5

  @web
  Scenario: Validate phone categories
    Given user go to home page
    And user click moitors categories
    Then user can see Apple monitor 24

  @web
  Scenario: User can add product to cart
    Given user go to home page
    And user click Samsung galaxy s6 image
    And user navigated to Samsung Galaxy s6 product page
    When user click add to cart button
    Then user can see pop up message "Product added"

  @web
  Scenario: User can product in cart
    Given user go to home page
    And user click Samsung galaxy s6 image
    And user navigated to Samsung Galaxy s6 product page
    When user click add to cart button
    And user can see pop up message "Product added"
    And user click Cart button
    Then user can see Samsung galaxy s6 in cart

  @web
  Scenario: User can buy product with valid data
    Given user go to home page
    And user click Samsung galaxy s6 image
    And user navigated to Samsung Galaxy s6 product page
    When user click add to cart button
    And user can see pop up message "Product added"
    And user click Cart button
    And user click Place Order
    And user input "habibi" in Name
    And user input "Indonesia" in Country
    And user input "Jakarta" in City
    And user input "123456789" in Credit Card
    And user input "02" in Month
    And user input "2025" in Year
    And user click purchase
    Then user can see message Thank you for your purchase!

  @web
  Scenario: User cannot buy product without fill valid data
    Given user go to home page
    And user click Samsung galaxy s6 image
    And user navigated to Samsung Galaxy s6 product page
    When user click add to cart button
    And user can see pop up message "Product added"
    And user click Cart button
    And user click Place Order
    And user click purchase
    Then user can see pop up message "Please fill out Name and Creditcard."

  @web
  Scenario: User can buy product with minimum valid data
    Given user go to home page
    And user click Samsung galaxy s6 image
    And user navigated to Samsung Galaxy s6 product page
    When user click add to cart button
    And user can see pop up message "Product added"
    And user click Cart button
    And user click Place Order
    And user input "habibi" in Name
    And user input "123456789" in Credit Card
    And user click purchase
    Then user can see message Thank you for your purchase!

