import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyLoginTest {
   public static void main(String[] args) {
       // Set the path to chromedriver (if not using driver manager)
       System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe"); // change the path according to the system
       WebDriver driver = new ChromeDriver();

       try {
           // Open dummy login page
           driver.get("https://the-internet.herokuapp.com/login");

           // Locate form fields
           WebElement username = driver.findElement(By.id("username"));
           WebElement password = driver.findElement(By.id("password"));
           WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

           // Fill in credentials
           username.sendKeys("tomsmith");
           password.sendKeys("SuperSecretPassword!");
           loginButton.click();

           // Wait briefly to let the result page load
           Thread.sleep(2000);

           // Output success message
           String successMsg = driver.findElement(By.id("flash")).getText();
           System.out.println("Login Result: " + successMsg.trim());
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           driver.quit();
       }
   }
}

 
// 7 program

import java.io.File;

public class DesktopItemCounter {
   public static void main(String[] args) {
       // Get the path to the current user's Desktop
       String desktopPath = System.getProperty("user.home") + "\\Desktop";

       // Create a File object for the Desktop directory
       File desktopFolder = new File(desktopPath);

       if (desktopFolder.exists() && desktopFolder.isDirectory()) {
           // List all files and folders on the Desktop
           File[] items = desktopFolder.listFiles();
           if (items != null) {
               System.out.println("Number of items on Desktop: " + items.length);
               // Optional: Print names of items
               for (File item : items) {
                   System.out.println(" - " + item.getName());
               }
           } else {
               System.out.println("Could not read contents of Desktop.");
           }
       } else {
           System.out.println("Desktop folder not found at: " + desktopPath);
       }
   }
}

// 9 Program

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountAllElements {
   public static void main(String[] args) {
       // Set path to chromedriver.exe
       System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();

       try {
           // Open the web page (change the URL as needed)
           driver.get("https://example.com");

           // Maximize the browser window
           driver.manage().window().maximize();

           // Find all elements using universal CSS selector
           List<WebElement> allElements = driver.findElements(By.cssSelector("*"));

           // Print total number of elements
           System.out.println("Total number of elements on the page: " + allElements.size());

           // Optional: print tag names of the elements
           for (WebElement element : allElements) {
               System.out.println(" - <" + element.getTagName() + ">");
           }
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           // Close the browser
           driver.quit();
       }
   }
}

// 10 Program

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ComboWebDriver {
   public static void main(String[] args) {
       // Set path to chromedriver.exe (adjust if needed)
       System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();

       try {
           // Open local HTML file (use triple forward slashes for file path)
           driver.get("file:///C:/combo.html");

           // Optional: maximize window
           driver.manage().window().maximize();

           // Locate the <select> dropdown
           WebElement dropdown = driver.findElement(By.tagName("select"));

           // Wrap the <select> element with Select class
           Select select = new Select(dropdown);

           // Get all option elements
           List<WebElement> options = select.getOptions();

           // Print total number of options
           System.out.println("The number of options in the combo box is: " + options.size());

           // Print each option's visible text
           for (WebElement option : options) {
               System.out.println(" - " + option.getText());
           }
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           // Close the browser
           driver.quit();
       }
   }
}

// Creat a .html file in desktop and copy the path and paste into above program 
<!DOCTYPE html>
<html>
<head>
   <title>Combo Box Test</title>
</head>
<body>
   <h2>Select your option:</h2>
   <select id="myDropdown">
       <option value="1">Option One</option>
       <option value="2">Option Two</option>
       <option value="3">Option Three</option>
   </select>
</body>
</html>
