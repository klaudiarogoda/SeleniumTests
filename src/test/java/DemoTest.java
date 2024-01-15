import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

    }
    @Test
    public void demoTest(){
        System.out.println("Hello");
    }

}
