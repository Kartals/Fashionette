$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login attempt with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "A user enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login attempt with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A user enters with the invalid credentials \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "get the message \"Das hat leider nicht funktioniert. Bitte überprüfe Deine E-Mail Adressse und Dein Passwort. Solltest du Dein Passwort vergessen haben, kannst Du ein neues Passwort anfordern, indem Du auf \\\"Passwort vergessen\\\" klickst.\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "wronguser@gmail.com",
        "!8Ntr*BM@!#G3VH"
      ]
    },
    {
      "cells": [
        "QA@fashionette.de",
        "Wrongpass1"
      ]
    },
    {
      "cells": [
        "wronguser@gmail.com",
        "wrongpass1"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login attempt with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A user enters with the invalid credentials \"wronguser@gmail.com\" \"!8Ntr*BM@!#G3VH\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_enters_with_the_invalid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the message \"Das hat leider nicht funktioniert. Bitte überprüfe Deine E-Mail Adressse und Dein Passwort. Solltest du Dein Passwort vergessen haben, kannst Du ein neues Passwort anfordern, indem Du auf \\\"Passwort vergessen\\\" klickst.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.get_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login attempt with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A user enters with the invalid credentials \"QA@fashionette.de\" \"Wrongpass1\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_enters_with_the_invalid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the message \"Das hat leider nicht funktioniert. Bitte überprüfe Deine E-Mail Adressse und Dein Passwort. Solltest du Dein Passwort vergessen haben, kannst Du ein neues Passwort anfordern, indem Du auf \\\"Passwort vergessen\\\" klickst.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.get_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login attempt with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A user enters with the invalid credentials \"wronguser@gmail.com\" \"wrongpass1\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.a_user_enters_with_the_invalid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the message \"Das hat leider nicht funktioniert. Bitte überprüfe Deine E-Mail Adressse und Dein Passwort. Solltest du Dein Passwort vergessen haben, kannst Du ein neues Passwort anfordern, indem Du auf \\\"Passwort vergessen\\\" klickst.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.fashionette.stepDef.LoginStepDef.get_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});