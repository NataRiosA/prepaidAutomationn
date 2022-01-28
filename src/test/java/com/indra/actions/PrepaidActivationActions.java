package com.indra.actions;

import com.indra.pages.PrepaidActivationPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrepaidActivationActions extends PrepaidActivationPage {

    public PrepaidActivationActions(WebDriver driver) {
        super(driver);
    }

    public void initialRute(){
        getSale().click();
        getUnfold().click();
        getPayment().click();
        getActivator().click();
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        getPaymentActivator().click();
        getPrepaid().click();
    }

    public void customerInformation()  {
        enter("10960370").into(getVendor());
        getButtonId().click();
        getDocumentType().click();
        enter("667299000").into(getDocumentCC());
        enter("2000").into(getDocumentExpedicion());
        getBtnContinue().click();
    }

    public void activationInformation(){
        enter("732111198172290").into(getImsi());
        enter("3016875893").into(getMsisdn());
        getTypeOfSaleArrow().click();
        getJustSim().click();
        getDriver().switchTo().defaultContent();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,420)"); //Scroll vertically down by 1000 pixels
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        WebElement continuar = getDriver().findElement(By.name("ActivacionesForm:btnContinuarActivacionVenta"));
        continuar.click();
        getContinueTarife().click();
    }

    public  void demographicInformation(){
        getPaymentDepar().click();
        getDeparment().click();
        getPaymentCity().click();
        getCity().click();
        getValidate().click();
        enter("3222345678").into(getPhone());
        getContinueActivationDemo().click();
        getConfirm().click();

        getActivationDetails().waitUntilPresent();

        WebElement title = getDriver().findElement(By.className("tituloPagina"));
        MatcherAssert.assertThat("La activacion fue exitosa",title.getText(), Matchers.equalTo("ACTIVACION EXITOSA"));
    }

    public void consultSingleScreen(){
        getDriver().switchTo().defaultContent();
        getConsult().click();
        getConsultPos().click();
        getConsultIntegral().click();
        getCosultaPantallaUnica().click();
        WebElement iframe = getDriver().findElement(By.id("iframe"));
        getDriver().switchTo().frame(iframe);
        enter("3016875893").into(getMsisdn2());
        getSearchButton().click();
        getGeneralCustomerInformation().waitUntilPresent();
        WebElement plan = getDriver().findElement(By.id("j_id135:j_id157"));

        MatcherAssert.assertThat("el plan es prepago",
                plan.getText(),Matchers.containsString("Plan Tigo Prepago") );
    }

}
