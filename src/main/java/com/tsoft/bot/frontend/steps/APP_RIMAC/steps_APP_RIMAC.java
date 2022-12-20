package com.tsoft.bot.frontend.steps.APP_RIMAC;

import com.tsoft.bot.frontend.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pageobject.APP_RIMAC.PageObject_AppLogin.*;


public class steps_APP_RIMAC extends BaseClass {
    private static final String EXCEL_APK = "excel/RIMAC.xlsx";
    private static final String LOGIN_APK = "TEST1";
    private static final String COLUMNA_DNI = "DNI";
    private static final String COLUMNA_PASSWORD = "PASSWORD";


    private static GenerateWord generateWord = new GenerateWord();
    private AppiumDriver<MobileElement> driver;

    public steps_APP_RIMAC() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }
    @Given("^Ingreso a la aplicacion de RIMAC$")
    public void ingresoALaAplicacionDeRIMAC() throws Throwable{
        try{
            click(driver,"id",BTN_INICIAR);
            generateWord.addImageToWord(driver);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la apk");
            generateWord.sendText("Se inició correctamente la apk");
            generateWord.addImageToWord(driver);
        }catch(Exception e){
            ExcelReader.writeCellValue(EXCEL_APK, LOGIN_APK, 1, 5, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);

        }
    }
    @When("^Ingreso el user \"([^\"]*)\"$")
    public void ingresoElUser(String casoDeprueba) throws Throwable {
        try{
            int apk = Integer.parseInt(casoDeprueba) - 1;
            String DNI = getData().get(apk).get(COLUMNA_DNI);
            sendKeyValue(driver,"id",LBL_DNI,DNI);
            generateWord.sendText("Se ingreso el número de DNI");
            }catch(Exception e){
            ExcelReader.writeCellValue(EXCEL_APK, LOGIN_APK, 1, 5, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

        @And("^la contrasena \"([^\"]*)\"$")
        public void laContrasena(String casoDeprueba) throws Throwable {
            try{
                int apk = Integer.parseInt(casoDeprueba) - 1;
                String PASS = getData().get(apk).get(COLUMNA_PASSWORD);
                sendKeyValue(driver,"id",LBL_PASS,PASS);
                generateWord.sendText("Se ingreso el password");
                generateWord.addImageToWord(driver);
            }catch(Exception e){
                ExcelReader.writeCellValue(EXCEL_APK, LOGIN_APK, 1, 5, "FAIL");
                ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
                generateWord.sendText("Tiempo de espera ha excedido");
                generateWord.addImageToWord(driver);
            }
        }

    @Then("^se da clic en el boton Iniciar$")
    public void seDaClicEnElBotonIniciar() throws Throwable{
        try{
            click(driver,"id",BTN_INICIAR_SESION);
            generateWord.sendText("Se ingreso el password");
            generateWord.addImageToWord(driver);
        }catch (Exception e) {
            ExcelReader.writeCellValue(EXCEL_APK, LOGIN_APK, 1, 5, "FAIL");
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw new RuntimeException(e);
        }
    }



}
