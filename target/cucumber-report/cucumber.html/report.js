$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As user I want to go in to virgingames website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9049770000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I accept all cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I accept all on How we use cookies",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Online Bingo",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 452153900,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.iAcceptAllCookies()"
});
formatter.result({
  "duration": 239917100,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.iAcceptAllOnHowWeUseCookies()"
});
formatter.result({
  "duration": 214670700,
  "status": "passed"
});
formatter.match({
  "location": "loginsteps.iClickOnOnlineBingo()"
});
formatter.result({
  "duration": 308514000,
  "status": "passed"
});
formatter.after({
  "duration": 120900,
  "status": "passed"
});
});