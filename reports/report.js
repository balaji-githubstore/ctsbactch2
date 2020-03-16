$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/GoogleMap.feature");
formatter.feature({
  "name": "GoogleMap",
  "description": "\tIn order to connect all cities\n\tAs a google users\n\tI want connect with google maps ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ConnectCities",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have browser with googlemap page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter multiple cities",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should get the result with all cities connected with km as \u0027895\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/main/resources/feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "\tIn order to create a webpage\n\tAs a e-commerce vendor\n\tI want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ValidCredential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    },
    {
      "name": "@high"
    }
  ]
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0017@gmail.com\u0027 and I enter password as \u0027welcome@123\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027My Account123\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@high"
    }
  ]
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji@gmail.com\u0027 and I enter password as \u0027welcome\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should not get access to the portal",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "ValidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter username as \u0027\u003cusername\u003e\u0027 and I enter password as \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should access to the portal with title as \u0027My Account\u0027",
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
        "balaji0017@gmail.com",
        "welcome@1"
      ]
    },
    {
      "cells": [
        "balaji0018@gmail.com",
        "welcome@2"
      ]
    },
    {
      "cells": [
        "balaji0019@gmail.com",
        "welcome@3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "ValidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0017@gmail.com\u0027 and I enter password as \u0027welcome@1\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027My Account\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "ValidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0018@gmail.com\u0027 and I enter password as \u0027welcome@2\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027My Account\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "ValidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0019@gmail.com\u0027 and I enter password as \u0027welcome@3\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027My Account\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "ValidCredentialsID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter username as \u0027\u003cusername\u003e\u0027 and I enter password as \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should access to the portal with id as \u0027\u003cid\u003e\u0027",
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
        "password",
        "id"
      ]
    },
    {
      "cells": [
        "balaji0017@gmail.com",
        "welcome@1",
        "465"
      ]
    },
    {
      "cells": [
        "balaji0018@gmail.com",
        "welcome@2",
        "898"
      ]
    },
    {
      "cells": [
        "balaji0019@gmail.com",
        "welcome@3",
        "7988"
      ]
    }
  ]
});
formatter.scenario({
  "name": "ValidCredentialsID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0017@gmail.com\u0027 and I enter password as \u0027welcome@1\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with id as \u0027465\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "ValidCredentialsID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0018@gmail.com\u0027 and I enter password as \u0027welcome@2\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with id as \u0027898\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "ValidCredentialsID",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with magentopage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter username as \u0027balaji0019@gmail.com\u0027 and I enter password as \u0027welcome@3\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should access to the portal with id as \u00277988\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:src/main/resources/feature/Test.feature");
formatter.feature({
  "name": "test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ValidCredentialsID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have browser with magentopage123",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});