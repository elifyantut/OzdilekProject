import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseStep extends BaseTest {

    @Step("<second> kadar bekle")
    public void waitForSecond(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }

    @Step("<id> bul ve <keyword> değerini kontrol et")
    public void buttonControl(String id,String keyword){
        System.out.println("Text değeri " + appiumDriver.findElement(By.id(id)).getText());
        Assert.assertTrue("Text değeri bulunmamadı " ,appiumDriver.findElement(By.id(id)).getText().equals(keyword));
    }

    @Step("<key> xpathli elementi bul ve tıkla.")
    public void clickByXPath(String key){
        System.out.println("Elementin lokasyon bilgisi" + appiumDriver.findElement(By.xpath(key))
                .getSize());
        appiumDriver.findElement(By.xpath(key)).click();
    }
    @Step("<Key> id'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByid(String Key,String keywordc) {
        appiumDriver.findElement(By.id(Key)).sendKeys(keywordc);
        System.out.println(Key + "Elementine tıklandı");
    }


    @Step("<key> idli elementi bul ve tıkla.")
    public void clickById(String key){
        System.out.println("Elementin lokasyon bilgisi" + appiumDriver.findElement(By.id(key))
                .getSize());
        appiumDriver.findElement(By.id(key)).click();
    }
    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key,String keywordc) {
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keywordc);
        System.out.println(Key + "Elementine tıklandı");
    }


    @Step("Sayfayı yukarı kaydır")
    public void swipeUpI(){
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefon Boyutu "+dims);
        PointOption pointOptionStart, pointOptionEnd;
        int edgeBorder = 10;
        final int PRESS_TIME = 200; // ms
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("pointOptionStart " + pointOptionStart);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        System.out.println("pointOptionEnd " + pointOptionEnd);
        new TouchAction(appiumDriver)
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }

    @Step("Random seçim")
    public void randomSelect(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();
    }


}
