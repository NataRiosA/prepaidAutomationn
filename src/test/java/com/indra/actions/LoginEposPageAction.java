package com.indra.actions;

import com.indra.models.LoginEposModel;
import com.indra.pages.LoginEposPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    public void leave(){
        Actions actions = new Actions(getDriver());
        WebElement leave = getDriver().findElement(By.id("formMenu:j_id11_span"));
        actions.moveToElement(leave).build().perform();
        getBtnLeave().click();
    }
}
