$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As a user I want to login website instagram",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 3189944119,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal login",
  "description": "",
  "id": "login;normal-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Verify username field",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    And verify password field"
    }
  ],
  "line": 8,
  "name": "User input Name Account \"kukuhpradipto_\" and Password \"Kukuh04021998\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.verifyLoginUser()"
});
formatter.result({
  "duration": 268712169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kukuhpradipto_",
      "offset": 25
    },
    {
      "val": "Kukuh04021998",
      "offset": 55
    }
  ],
  "location": "LoginSteps.inputAccound(String,String)"
});
formatter.result({
  "duration": 456830043,
  "status": "passed"
});
formatter.after({
  "duration": 110256174,
  "status": "passed"
});
});