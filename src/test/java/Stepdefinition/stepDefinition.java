package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	static WebDriver driver;
	
	@Given("^user enter into the login page$")
	public void user_enter_into_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url="https://opensource-demo.orangehrmlive.com/";
		 driver.get(url);
		 
	    	//driver.findElement(By.xpath("//*[starts-with(@id,'searchSystemUser')]")).sendKeys(name);
	    
	}

	@When("^user enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		
	    
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	    
	}

	@Then("^user check for the correct login page$")
	public void user_check_for_the_correct_login_page() throws Throwable {
		 String actual=driver.getCurrentUrl();
		 String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		 if(expected.equals(actual))
		 {
			 System.out.println("correct login page");
		 }
		
	    
	}


    @Given("^enter username (.+)$")
    public void enter_username(String name) throws Throwable {
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Teja\\chromedriver.exe");
		//driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//this.driver=driver;
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    	driver.findElement(By.xpath("//*[starts-with(@id,'searchSystemUser')]")).sendKeys(name);
    	
    	
    }
    @And("^enter userrole$")
    public void enter_userrole() throws Throwable {
    	WebElement selectoption=driver.findElement(By.xpath("//label[@for='searchSystemUser_userType']//following::select[1]"));
		Select sc=new Select(selectoption);
		sc.selectByIndex(1);
        
    }

    @And("^enter employeename (.+)$")
    public void enter_employeename(String empname) throws Throwable {
    	driver.findElement(By.xpath("//input[@class='ac_input']")).sendKeys("empname");
        throw new PendingException();
    }

    @And("^enter status$")
    public void enter_status() throws Throwable {
    	WebElement status=driver.findElement(By.id("searchSystemUser_status"));
		Select option=new Select(status);
	option.selectByIndex(1);
        throw new PendingException();
    }


    @When("^click on the search button$")
    public void click_on_the_search_button() throws Throwable {
    	driver.findElement(By.id("searchBtn")).click();
        throw new PendingException();
    }

    @Then("^user information should be validated$")
    public void user_information_should_be_validated() throws Throwable {
        throw new PendingException();
    }

 

}
