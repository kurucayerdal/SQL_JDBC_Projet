
Feature: JDBC Database Testing
  Scenario: Get the information in the database
   Given Prenez toutes les villes avec ses pays "SELECT city.city_id,city.city,country.country FROM city LEFT JOIN country ON city.country_id=country.country_id"
   And Prenez tous les clients et ses address "SELECT customer_id, first_name, last_name, address, district FROM customer LEFT JOIN address ON  customer.address_id=address.address_id ORDER BY district"
   And Trouvez combien de films id de acteur a "SELECT actor_id, count(title) FROM film_actor LEFT JOIN film ON film.film_id=film_actor.film_id GROUP BY actor_id"



