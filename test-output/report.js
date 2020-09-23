$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/Orange.feature");
formatter.feature({
  "line": 1,
  "name": "I am on OrangeHRM site to change",
  "description": "",
  "id": "i-am-on-orangehrm-site-to-change",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10778305100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Valid users should be able to land on OranheHRM page",
  "description": "",
  "id": "i-am-on-orangehrm-site-to-change;valid-users-should-be-able-to-land-on-oranhehrm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I as user  click on Leave tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Leave Form  must display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I passed  valid input From date \"2020-09-24\" and To date \"2020-10-10\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Orange_test.i_as_user_click_on_Leave_tab()"
});
formatter.result({
  "duration": 2241438800,
  "status": "passed"
});
formatter.match({
  "location": "Orange_test.leave_Form_must_display()"
});
formatter.result({
  "duration": 1030998300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2020-09-24",
      "offset": 33
    },
    {
      "val": "2020-10-10",
      "offset": 58
    }
  ],
  "location": "Orange_test.i_passed_valid_input_From_date_and_To_date(String,String)"
});
formatter.result({
  "duration": 512447600,
  "status": "passed"
});
formatter.match({
  "location": "Orange_test.click_on_search_button()"
});
formatter.result({
  "duration": 141832500,
  "status": "passed"
});
});