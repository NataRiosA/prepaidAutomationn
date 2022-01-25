package com.indra.actions;

import com.indra.models.LoginPageModel;
import com.indra.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageAction extends LoginPage {

    public String contraseniaInicial;

    public LoginPageAction(WebDriver driver) {
        super(driver);
    }

    public void fillLogin(LoginPageModel signIn)  {
        enter(signIn.getUser()).into(getUser());
        enter(signIn.getPassword()).into(getPassword());
    }

    public void clickOnLogin(LoginPageModel signIn){
        fillLogin(signIn);
        login();
    }

    public void login(){
        getBtnLogin().click();
    }

}
