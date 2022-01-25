package com.indra.actions;

import com.indra.models.LoginEposModel;
import com.indra.pages.LoginEposPage;
import org.openqa.selenium.WebDriver;

public class LoginEposPageAction extends LoginEposPage {

    public String contraseniaInicial;

    public LoginEposPageAction(WebDriver driver) {
        super(driver);
    }

    public void fillLogin(LoginEposModel signIn)  {
        enter(signIn.getUser()).into(getUser());
        enter(signIn.getPassword()).into(getPassword());
    }

    public void clickOnLogin(LoginEposModel signIn){
        fillLogin(signIn);
        login();
    }

    public void login(){
        getBtnLogin().click();
    }

}
