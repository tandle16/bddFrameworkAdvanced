$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_account.feature");
formatter.feature({
  "line": 1,
  "name": "New Account Page",
  "description": "  As a user I want a New Account Page so that accounts can be created .",
  "id": "new-account-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11688627696,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "C234 -  Add Account page should display with out error",
  "description": "",
  "id": "new-account-page;c234----add-account-page-should-display-with-out-error",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a user with username \"techfiosdemo@gmail.com\" and password \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "New Account page should display",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 22
    },
    {
      "val": "abc123",
      "offset": 60
    }
  ],
  "location": "NewAccountSteps.a_user_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 8402285554,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.user_navigates_to_New_Account_Page()"
});
formatter.result({
  "duration": 4567928774,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.new_Account_page_should_display()"
});
formatter.result({
  "duration": 289682975,
  "status": "passed"
});
formatter.after({
  "duration": 7473438197,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "C235 - Create a new account",
  "description": "",
  "id": "new-account-page;c235---create-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "a user with username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user creates a new account using title \"\u003ctitle\u003e\" Description \"\u003cdescription\u003e\" Amount \"\u003camount\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "new-account-page;c235---create-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "title",
        "description",
        "amount"
      ],
      "line": 15,
      "id": "new-account-page;c235---create-a-new-account;;1"
    },
    {
      "cells": [
        "\"techfiosdemo@gmail.com\"",
        "Calzone",
        "Two Topping",
        "10"
      ],
      "line": 16,
      "id": "new-account-page;c235---create-a-new-account;;2"
    },
    {
      "cells": [
        "\"techfiosdemo@gmail.com\"",
        "Sandwich",
        "veggi",
        "10"
      ],
      "line": 17,
      "id": "new-account-page;c235---create-a-new-account;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7149518953,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "C235 - Create a new account",
  "description": "",
  "id": "new-account-page;c235---create-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "a user with username \"\"techfiosdemo@gmail.com\"\" and password \"\u003cpassword\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user creates a new account using title \"Calzone\" Description \"Two Topping\" Amount \"10\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NewAccountSteps.user_navigates_to_New_Account_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 6933592606,
  "status": "passed"
});
formatter.before({
  "duration": 7089648250,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "C235 - Create a new account",
  "description": "",
  "id": "new-account-page;c235---create-a-new-account;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "a user with username \"\"techfiosdemo@gmail.com\"\" and password \"\u003cpassword\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user navigates to New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user creates a new account using title \"Sandwich\" Description \"veggi\" Amount \"10\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "NewAccountSteps.user_navigates_to_New_Account_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 6964062097,
  "status": "passed"
});
});