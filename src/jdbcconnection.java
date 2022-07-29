import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "root");
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name='tam';");
		
		while(rs.next()) {
			
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver-for-chrome101 and 102\\chromedriverFor104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(rs.getString("name"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString("location"));
		
	}

	}

}
