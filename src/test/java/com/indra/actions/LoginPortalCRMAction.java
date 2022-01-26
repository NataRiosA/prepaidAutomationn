package com.indra.actions;

import com.indra.models.LoginPortalCRMModel;
import com.indra.pages.LoginPortalCRMPage;
import org.openqa.selenium.WebDriver;

public class LoginPortalCRMAction extends LoginPortalCRMPage {

    public String contraseniaInicial;

    public LoginPortalCRMAction(WebDriver driver) {
        super(driver);
    }

    public void fillLogin(LoginPortalCRMModel signIn)  {
        enter(signIn.getUser()).into(getUser());
        enter(signIn.getPassword()).into(getPassword());
    }

    public void clickOnLogin(LoginPortalCRMModel signIn){
        fillLogin(signIn);
        login();
    }

    public void login(){
        getBtnLogin().click();
    }

}
