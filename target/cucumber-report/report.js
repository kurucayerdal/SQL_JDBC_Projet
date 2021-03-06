$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/SQL_JDBC.feature");
formatter.feature({
  "line": 2,
  "name": "JDBC Database Testing",
  "description": "",
  "id": "jdbc-database-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get the information in the database",
  "description": "",
  "id": "jdbc-database-testing;get-the-information-in-the-database",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Prenez toutes les villes avec ses pays \"SELECT city.city_id,city.city,country.country FROM city LEFT JOIN country ON city.country_id\u003dcountry.country_id\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Prenez tous les clients et ses address \"SELECT customer_id, first_name, last_name, address, district FROM customer LEFT JOIN address ON  customer.address_id\u003daddress.address_id ORDER BY district\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Trouvez combien de films id de acteur a \"SELECT actor_id, count(title) FROM film_actor LEFT JOIN film ON film.film_id\u003dfilm_actor.film_id GROUP BY actor_id\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "SELECT city.city_id,city.city,country.country FROM city LEFT JOIN country ON city.country_id\u003dcountry.country_id",
      "offset": 40
    }
  ],
  "location": "SQL_JDBC_Steps.goToDatabaseAndGetTheListOfCountryWith(String)"
});
formatter.result({
  "duration": 2256413300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELECT customer_id, first_name, last_name, address, district FROM customer LEFT JOIN address ON  customer.address_id\u003daddress.address_id ORDER BY district",
      "offset": 40
    }
  ],
  "location": "SQL_JDBC_Steps.goToDatabaseAndGetTheListOfCityWith(String)"
});
formatter.result({
  "duration": 402719800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELECT actor_id, count(title) FROM film_actor LEFT JOIN film ON film.film_id\u003dfilm_actor.film_id GROUP BY actor_id",
      "offset": 41
    }
  ],
  "location": "SQL_JDBC_Steps.goToDatabaseAndGetTheListOfAddressWith(String)"
});
formatter.result({
  "duration": 363947800,
  "status": "passed"
});
});