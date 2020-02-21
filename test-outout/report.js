$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/SPS/eclipse-workspace/cucumberBDDWithPom/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Tours application feature",
  "description": "",
  "id": "tours-application-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mercury tours login feature",
  "description": "",
  "id": "tours-application-feature;mercury-tours-login-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title is demoaut",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_launches_the_browser()"
});
formatter.result({
  "duration": 6976625950,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.title_is_demoaut()"
});
formatter.result({
  "duration": 42535675,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_userid_and_password()"
});
formatter.result({
  "duration": 24873426604,
  "status": "passed"
});
});