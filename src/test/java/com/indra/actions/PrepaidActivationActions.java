package com.indra.actions;

import com.indra.models.PrepaidActivationModels;
import com.indra.pages.PrepaidActivationPage;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        enter("732111198172291").into(getImsi());
        enter("3016875982").into(getMsisdn());
        getTypeOfSaleArrow().click();
        getJustSim().click();
        WebElement continuar = getDriver().findElement(By.id("ActivacionesForm:btnContinuarActivacionVenta"));
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

}
