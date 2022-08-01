package drivermanager;

import org.openqa.selenium.edge.EdgeDriver;
import utils.PropertyManager;

public class EdgeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.edge.driver", propertyManager.get("PATH_TO_EDGE"));
        driver = new EdgeDriver();
    }
}
