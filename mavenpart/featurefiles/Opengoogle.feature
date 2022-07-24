Feature: Login page functionality
Scenario: Verify whether the login page working fine
Given load google page and launch google
When Enter the username and password "vsuresh@innospire.com" "Password@123"
Then click sign button
And user home page should display