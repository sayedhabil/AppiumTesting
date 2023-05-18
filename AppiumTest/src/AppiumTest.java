import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class AppiumTest extends Appium {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();
      

        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn1_id").click(); // 7
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn6_id").click(); // 5
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btntambah_id").click(); // +
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn11_id").click(); // 3
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn14_id").click();// 0
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btnsamadengan_id").click(); // =
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btnkureng_id").click(); // -
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn9_id").click(); // 1

        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn6_id").click(); // 5

        driver.findElementById("com.example.androidcalc.kalkulator:id/Btnsamadengan_id").click(); // =
       
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn15_id").click(); // CLear
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn3_id").click(); // 9
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn13_id").click(); // .
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn6_id").click(); // 5
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btnkureng_id").click(); // -
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn14_id").click(); // 0
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn13_id").click(); // .
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn6_id").click(); // 5
        
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btnsamadengan_id").click(); // =
        
        Thread.sleep(2000);
        driver.findElementById("com.example.androidcalc.kalkulator:id/Btn15_id").click(); // Clear
        

    }
}
