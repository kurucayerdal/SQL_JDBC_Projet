package directQuery;

import org.testng.annotations.Test;
import utils.DBUtility;

import java.util.List;

public class JustQueryWithoutCucumber {


    @Test(priority = 1)
    public void query1() {

        String query = "SELECT city.city_id,city.city,country.country FROM " +
                "city LEFT JOIN country ON city.country_id=country.country_id";

        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }

    @Test(priority = 2)
    public void query2() {

        String query = "SELECT customer_id, first_name, last_name, address, district FROM customer " +
                "LEFT JOIN address ON  customer.address_id=address.address_id ORDER BY district";

        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }

    @Test(priority = 3)
    public void query3() {

        String query = "SELECT actor_id, count(title) FROM film_actor LEFT JOIN " +
                "film ON film.film_id=film_actor.film_id GROUP BY actor_id";

        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }
}
