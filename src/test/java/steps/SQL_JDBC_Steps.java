package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utils.DBUtility;

import java.util.List;

public class SQL_JDBC_Steps {

    @Given("^Prenez toutes les villes avec ses pays \"([^\"]*)\"$")
    public void goToDatabaseAndGetTheListOfCountryWith(String query) {
        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }

    @And("^Prenez tous les clients et ses address \"([^\"]*)\"$")
    public void goToDatabaseAndGetTheListOfCityWith(String query) {
        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }

    @And("^Trouvez combien de films id de acteur a \"([^\"]*)\"$")
    public void goToDatabaseAndGetTheListOfAddressWith(String query) {
        List<List<String>> dbList = DBUtility.getTableList(query);
        System.out.println(dbList);
    }

    /*
    --------------------- EXEMPLE POUR COMPARER LES DATAS UI ET BASE DE DONEES -----------------------------

Database List--> List<List<String>> dbList= DBUtility.getTableList(query);
                 System.out.println("dbList = " + dbList);


UI List-->       DialogContent dc=new DialogContent();
                 List<WebElement> uiList= dc.waitVisibleListAllElements(dc.nameList);
                 for (WebElement e : uiList)
                {
                    System.out.println("e.getText() = " + e.getText());
                }

Comparaison Les Listes-->
                for (int i = 0; i < dbList.size(); i++)
                {
                    Assert.assertEquals(dbList.get(i).get(1),uiList.get(i).getText());
                }

     */

}
