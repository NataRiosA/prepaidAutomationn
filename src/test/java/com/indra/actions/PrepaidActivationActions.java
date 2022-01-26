package com.indra.actions;

import com.indra.models.PrepaidActivationModels;
import com.indra.pages.LoginPortalCRMPage;
import com.indra.pages.PrepaidActivationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PrepaidActivationActions extends PrepaidActivationPage {

    public PrepaidActivationActions(WebDriver driver) {
        super(driver);
    }

    private void initialRute(){
        getSale().click();
        getUnfold().click();
        getPayment().click();
        getActivator().click();
        getPaymentActivator().click();
        getPrepaid().click();
    }

    public void fillClient(PrepaidActivationModels prepaid)  {
        enter(prepaid.getVendor()).into(getVendor());
        enter(prepaid.getDocumentCC()).into(getDocumentCC());
        enter(prepaid.getDocumentExpedicion()).into(getDocumentExpedicion());
    }

    public void clickOnLogin(PrepaidActivationModels prepaid){
        fillClient(prepaid);
        getContinuee().click();
    }

    public void prepaidActivationClient() {

    }
}
