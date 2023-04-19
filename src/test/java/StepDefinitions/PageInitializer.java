package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;
    public  static AddEmployeePage addEmployeePage;
    public static void initializePageObject(){
        login = new LoginPage();
        addEmployeePage = new AddEmployeePage();
    }
}
// This class will manage the object creation of different page Object in our Framework.
// Instead of calling the age object again and again, this class will take good care of that step
