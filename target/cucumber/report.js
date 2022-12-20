$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RIMAC.feature");
formatter.feature({
  "line": 1,
  "name": "LOGIN RIMAC",
  "description": "",
  "id": "login-rimac",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Exitoso",
  "description": "",
  "id": "login-rimac;login-exitoso",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RIMAC"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Ingreso a la aplicacion de RIMAC",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingreso el user \"\u003ccaso_prueba\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "la contrasena \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da clic en el boton Iniciar",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-rimac;login-exitoso;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 14,
      "id": "login-rimac;login-exitoso;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 15,
      "id": "login-rimac;login-exitoso;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 49258452000,
  "status": "passed"
});
formatter.before({
  "duration": 270630200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Exitoso",
  "description": "",
  "id": "login-rimac;login-exitoso;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RIMAC"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Ingreso a la aplicacion de RIMAC",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Ingreso el user \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "la contrasena \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da clic en el boton Iniciar",
  "keyword": "Then "
});
formatter.match({
  "location": "steps_APP_RIMAC.ingresoALaAplicacionDeRIMAC()"
});
formatter.result({
  "duration": 19832468000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "steps_APP_RIMAC.ingresoElUser(String)"
});
formatter.result({
  "duration": 19411563100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "steps_APP_RIMAC.laContrasena(String)"
});
