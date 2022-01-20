package pageobjects;


import models.Nuevoformulario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;





public class CalculadoraPageObject {

WebDriver babel;

Nuevoformulario odjnuevoformulario = new Nuevoformulario();
    By version = By.xpath("//*[@id=\"selectBuild\"]");
    By numerouno =  By.xpath("//*[@id=\"number1Field\"]");
    By numerodos = By.xpath("//*[@id=\"number2Field\"]");
    By operacion = By.xpath("//*[@id=\"selectOperationDropdown\"]");
    By botoncalcular = By.xpath("//*[@id=\"calculateButton\"]");

public void abrircalculadora(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    babel = new ChromeDriver();
    babel.manage().window().maximize();
    babel.get("https://testsheepnz.github.io/BasicCalculator.html");
}

    public void version() throws IOException {
        WebElement esperarversion = new WebDriverWait(babel, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(version));
        Select seleccionarversion = new Select(babel.findElement(version));
        if(odjnuevoformulario.getVersion().equals("0") || odjnuevoformulario.getVersion().equals("1")
                || odjnuevoformulario.getVersion().equals("2") || odjnuevoformulario.getVersion().equals("3")
                || odjnuevoformulario.getVersion().equals("4")|| odjnuevoformulario.getVersion().equals("5")
                || odjnuevoformulario.getVersion().equals("6")|| odjnuevoformulario.getVersion().equals("7")
                || odjnuevoformulario.getVersion().equals("8")|| odjnuevoformulario.getVersion().equals("9")){
            seleccionarversion.selectByValue(odjnuevoformulario.getVersion());
        }
        else if (!odjnuevoformulario.getVersion().equals("0")){
            babel.quit();
            System.out.println("No hay version válida");
        }


    }

    public void numerouno() throws IOException {
        WebElement esperarnumerouno = new WebDriverWait(babel, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(numerouno));
        babel.findElement(numerouno).sendKeys(odjnuevoformulario.getNumerouno());

    }

    public void numerodos() throws IOException {
        WebElement esperarnumerodos = new WebDriverWait(babel, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(numerodos));
        babel.findElement(numerodos).sendKeys(odjnuevoformulario.getNumerodos());
    }

    public void operacion() throws IOException {
        WebElement esperaroperacion = new WebDriverWait(babel, Duration.ofSeconds(5))
    .until(ExpectedConditions.visibilityOfElementLocated(operacion));
        Select seleccionaroperacion = new Select(babel.findElement(operacion));
        if(odjnuevoformulario.getOperacion().equals("0") || odjnuevoformulario.getOperacion().equals("1")
        || odjnuevoformulario.getOperacion().equals("2") || odjnuevoformulario.getOperacion().equals("3")
        || odjnuevoformulario.getOperacion().equals("4")){
            seleccionaroperacion.selectByValue(odjnuevoformulario.getOperacion());
        }
        else if (!odjnuevoformulario.getOperacion().equals("0")){
            babel.quit();
            System.out.println("No hay operación válida");
        }
    }

         public void botoncalcular()  {
             WebElement esperarcalcular = new WebDriverWait(babel, Duration.ofSeconds(5))
                     .until(ExpectedConditions.visibilityOfElementLocated(botoncalcular));
             babel.findElement(botoncalcular).click();
    }

    public void cerrar(){
    babel.quit();
    }

}
