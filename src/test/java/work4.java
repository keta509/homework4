import org.junit.Test;
import static com.codeborne.selenide.SelenideElement.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sessionId;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class work4 {
    @Test
    public void myWork4(){

        open("https://www.youtube.com/");

        $(byName("search_query")).click();
        $(byName("search_query")).setValue("sss");

        sleep(10000);
    }
}
