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
formatter.scenarioOutline({
  "line": 5,
  "name": "Normal login",
  "description": "",
  "id": "login;normal-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    Given Verify username field"
    },
    {
      "line": 7,
      "value": "#    And verify password field"
    }
  ],
  "line": 8,
  "name": "User input Name Account \"\u003cemail\u003e\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User already on Home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login;normal-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 12,
      "id": "login;normal-login;;1"
    },
    {
      "cells": [
        "kukuh_pradipto@yahoo.co.id",
        "04021998KUKUH"
      ],
      "line": 13,
      "id": "login;normal-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3143234461,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Normal login",
  "description": "",
  "id": "login;normal-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    Given Verify username field"
    },
    {
      "line": 7,
      "value": "#    And verify password field"
    }
  ],
  "line": 8,
  "name": "User input Name Account \"kukuh_pradipto@yahoo.co.id\u003e\" and Password \"04021998KUKUH\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User already on Home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "kukuh_pradipto@yahoo.co.id\u003e",
      "offset": 25
    },
    {
      "val": "04021998KUKUH",
      "offset": 68
    }
  ],
  "location": "LoginSteps.inputAccound(String,String)"
});
formatter.result({
  "duration": 419772367,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.verifyHome()"
});
formatter.result({
  "duration": 5155045331,
  "status": "passed"
});
formatter.after({
  "duration": 5111671766,
  "status": "passed"
});
});