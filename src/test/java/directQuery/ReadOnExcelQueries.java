package directQuery;

import org.testng.annotations.Test;
import utils.DBUtility;
import utils.ExcelUtility;

import java.util.List;

public class ReadOnExcelQueries {

    @Test(priority = 1)
    public void query1() {

        List<List<String>> excelData = ExcelUtility.getListData("src/test/java/resources/data.xlsx", "DataPage", 1);

        List<List<String>> dbList = DBUtility.getTableList(excelData.get(0).get(0));
        System.out.println(dbList);
    }

    @Test(priority = 2)
    public void query2() {

        List<List<String>> excelData = ExcelUtility.getListData("src/test/java/resources/data.xlsx", "DataPage", 1);

        List<List<String>> dbList = DBUtility.getTableList(excelData.get(1).get(0));
        System.out.println(dbList);
    }

    @Test(priority = 3)
    public void query3() {

        List<List<String>> excelData = ExcelUtility.getListData("src/test/java/resources/data.xlsx", "DataPage", 1);

        List<List<String>> dbList = DBUtility.getTableList(excelData.get(2).get(0));
        System.out.println(dbList);
    }
}
