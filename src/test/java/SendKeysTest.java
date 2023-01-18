import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;

public class SendKeysTest {

    private static final String YANDEX_DRIVER_PATH = "/usr/local/chromedriver/yandexdriver";
    private static final String CHROME_DRIVER_PATH = "/usr/local/chromedriver/chromedriver";
    private static final String YANDEX_BROWSER_PATH = "/Applications/Yandex.app/Contents/MacOS/Yandex";

    @Test
    public void sendKeysTest() {
        var options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", YANDEX_DRIVER_PATH);
        options.setBinary(YANDEX_BROWSER_PATH);
        WebDriver driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);

        open("https://ya.ru");
        $(By.xpath(".//a[@data-statlog='informers.weather']")).click();
//        WebDriverRunner.closeWebDriver();
    }

}
