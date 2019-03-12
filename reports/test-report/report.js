$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Home Page",
  "description": "I want to verify the home page",
  "id": "verify-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 30926947864,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Home page",
  "description": "",
  "id": "verify-home-page;verify-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I choose section",
  "keyword": "When "
});
formatter.match({
  "location": "HomepageSteps.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 18193461041,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.i_choose_section()"
});
formatter.result({
  "duration": 10886160046,
  "status": "passed"
});
formatter.after({
  "duration": 127148,
  "status": "passed"
});
formatter.before({
  "duration": 7713167608,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#And some other action"
    },
    {
      "line": 10,
      "value": "# And yet another action"
    },
    {
      "line": 11,
      "value": "#Then I validate the outcomes"
    },
    {
      "line": 12,
      "value": "# And check more outcomes"
    }
  ],
  "line": 15,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "verify-home-page;title-of-your-scenario-outline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@login2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I check for the \"Science\" in step",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I nevegete to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I am on the Science page",
  "rows": [
    {
      "comments": [
        {
          "line": 23,
          "value": "#"
        }
      ],
      "cells": [
        "catogery"
      ],
      "line": 24
    },
    {
      "cells": [
        "Science"
      ],
      "line": 25
    },
    {
      "cells": [
        "name2"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSteps.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 29190280052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Science",
      "offset": 17
    }
  ],
  "location": "HomepageSteps.i_check_for_the_in_step(String)"
});
formatter.result({
  "duration": 4819167697,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.i_nevegete_to_next_page(DataTable)"
});
formatter.result({
  "duration": 924819,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.TheGreatCourses.StepDef.HomepageSteps.i_nevegete_to_next_page(DataTable) in file:/C:/Users/Risalat/eclipse-workspace/2018-cucumber/CucumberPOMFrameworkpractice/target/test-classes/\u0027 with pattern [^I nevegete to next page$] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: Then I nevegete to next page\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomepageSteps.I_am_on_the_Science_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL ishttps://www.thegreatcourses.com/category/science.html?CFM\u003dcategory_slider");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2314827834,
  "status": "passed"
});
});