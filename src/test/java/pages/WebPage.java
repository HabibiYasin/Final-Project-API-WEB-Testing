package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {

    By sign_up_button1 = By.xpath("//*[@id=\"signin2\"]");
    By sign_up_button2 = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By log_in_button1 = By.xpath("//*[@id=\"login2\"]");
    By log_in_button2 = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By input_username1 = By.xpath("//*[@id=\"sign-username\"]");
    By input_username2 = By.xpath("//*[@id=\"loginusername\"]");
    By input_pwd1 = By.xpath("//*[@id=\"sign-password\"]");
    By input_pwd2 = By.xpath("//*[@id=\"loginpassword\"]");
    By samsung_s6_image = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img");
    By samsung_s6_title = By.xpath("//*[@id=\"tbodyid\"]/h2");
    By phones_categories = By.xpath("/html/body/div[5]/div/div[1]/div/a[2]");
    By laptops_categories = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");
    By monitors_categories = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
    By nokia_image = By.xpath("//img[@src='imgs/Lumia_1520.jpg']");
    By sony_i5_image = By.xpath("//img[@src='imgs/sony_vaio_5.jpg']");
    By apple_monitor_image = By.xpath("//img[@src='imgs/apple_cinema.jpg']");
    By add_to_cart_btn = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
    By cart_btn = By.xpath("/html/body/nav/div/div/ul/li[4]/a");
    By samsung_S6_img2 = By.xpath("//img[@src='imgs/galaxy_s6.jpg']");
    By wellcomeMessage = By.cssSelector("#nameofuser");
    By log_out_btn = By.xpath("/html/body/nav/div[1]/ul/li[6]/a");
    By place_order_btn = By.xpath("/html/body/div[6]/div/div[2]/button");
    By input_name = By.xpath("//*[@id=\"name\"]");
    By input_country = By.xpath("//*[@id=\"country\"]");
    By input_city = By.xpath("//*[@id=\"city\"]");
    By input_credit_card = By.xpath("//*[@id=\"card\"]");
    By input_month = By.xpath("//*[@id=\"month\"]");
    By input_year = By.xpath("//*[@id=\"year\"]");
    By purchase_btn = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    By thank_purchase = By.xpath("/html/body/div[10]/h2");
    public void goToHomePage() {
        driver.get("https://www.demoblaze.com/");
    }

    public void inputUsername2(String username) {
        driver.findElement(input_username2).sendKeys(username);
    }

    public void inputPwd2(String pwd) {
        driver.findElement(input_pwd2).sendKeys(pwd);
    }

    public void clickBtnSignUp1() {
        driver.findElement(sign_up_button1).click();
    }

    public void clickBtnSignup2() {
        driver.findElement(sign_up_button2).click();
    }

    public void clickBtnLogin1() {
        driver.findElement(log_in_button1).click();
    }

    public void clickBtnLogin2() {
        driver.findElement(log_in_button2).click();
    }

    public void samsungS6Click() {
        driver.findElement(samsung_s6_image).click();
    }

    public void validateS6Page() {
        driver.findElement(samsung_s6_title);
    }

    public void clickPhoneCat() {
        driver.findElement(phones_categories).click();
    }

    public void clickLaptopCat() {
        driver.findElement(laptops_categories).click();
    }

    public void clickMonitorCat() {
        driver.findElement(monitors_categories).click();
    }

    public void validateNokiaImg() {
        driver.findElement(nokia_image);
    }

    public void validateSonyImg() {
        driver.findElement(sony_i5_image);
    }

    public void validateAppleImg() {
        driver.findElement(apple_monitor_image);
    }

    public void clickAddtoCart() {
        driver.findElement(add_to_cart_btn).click();
    }
    public void clickCartBtn() {
        driver.findElement(cart_btn).click();
    }
    public void validateS6Image2() {
        driver.findElement(samsung_S6_img2);
    }
    public void wellcomeMessageLogin() {
        driver.findElement(wellcomeMessage);
    }
    public void userClickLogOutButton(){driver.findElement(log_out_btn);}
    public void userLogOutSuccessfully(){driver.findElement(log_in_button1);}
    public void userClickPlaceOrder() {driver.findElement(place_order_btn).click();}
    public void userInputInName(String name) {driver.findElement(input_name).sendKeys(name);}
    public void userInputInCountry(String country) {driver.findElement(input_country).sendKeys(country);}
    public void userInputInCity(String city) {driver.findElement(input_city).sendKeys(city);}
    public void userInputInCreditCard(String cc) {driver.findElement(input_credit_card).sendKeys(cc);}
    public void userInputInMonth(String month) {driver.findElement(input_month).sendKeys(month);}
    public void userInputInYear(String year) {driver.findElement(input_year).sendKeys(year);}
    public void userClickPurchase() {driver.findElement(purchase_btn).click();}
    public void userCanSeeMessageThankYouForYourPurchase() {driver.findElement(thank_purchase);}
    public void inputUsername1(String username) {
        driver.findElement(input_username1).sendKeys(username);
        System.out.println("Username yang digunakan: " + username);
    }
    public void inputPwd1(String pwd) {
        driver.findElement(input_pwd1).sendKeys(pwd);
        System.out.println("Password yang digunakan: " + pwd);
    }
    public static void alertMessage(String expectedMessage) throws InterruptedException {
        // Mendapatkan WebDriver dari Utility
        WebDriver driver = helper.Utility.driver;

        // Menunggu selama 3 detik
        Thread.sleep(3000);

        try {
            // Switch ke alert
            Alert alert = driver.switchTo().alert();
            // Dapatkan teks dari alert
            String alertMessage = alert.getText();
            // Cetak pesan alert
            System.out.println("Alert Message: " + alertMessage);
            // Menunggu selama 3 detik
            Thread.sleep(3000);
            // Terima alert
            alert.accept();

            // Validasi pesan alert
            if (alertMessage.equals(expectedMessage)) {
                System.out.println("Alert Message matches the expected message: " + expectedMessage);
                // Lakukan tindakan selanjutnya setelah validasi berhasil
            } else {
                System.out.println("Alert Message does not match the expected message.");
                // Lakukan tindakan lain jika validasi gagal
            }
        } catch (Exception e) {
            System.out.println("No alert found");
            // Tangani jika tidak ada alert yang ditemukan
        }
    }



}