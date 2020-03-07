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
formatter.match({
  "location": "com.cts.stepdefintions.GoogleStepDefn.i_have_browser_with_googlemap_page()"
});
formatter.result({
  "status": "passed"
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
formatter.match({
  "location": "com.cts.stepdefintions.GoogleStepDefn.i_enter_multiple_cities(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the result with all cities connected with km as \u0027895\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintions.GoogleStepDefn.i_should_get_the_result_with_all_cities_connected_with_km_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});