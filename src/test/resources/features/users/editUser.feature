#Edit user
  Feature: Edit User
    Verify edit user in form

    Scenario: Home page is displayed once set credential in login page
      Given 'Login' page is loaded
      And set my credentials on 'Login' page

    Scenario: List users is displayed once login given access
      Given set my list page is loaded
      When select users menu

    Scenario: Edit user once selected a specific user from list users
      Given set my list page is loaded
      Given click on edit button
      And set my new user data