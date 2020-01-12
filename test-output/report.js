$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are common steps will get executed before all the scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_clicks_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_customers_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search customer by name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Enter customer first name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_customer_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer last name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.customer_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find name in search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_should_find_name_in_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});