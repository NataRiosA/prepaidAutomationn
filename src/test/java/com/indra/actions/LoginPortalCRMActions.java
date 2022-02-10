package com.indra.actions;

import com.indra.models.DataExcelModels;
import com.indra.models.LoginPortalCRMModels;
import com.indra.pages.LoginPortalCRMPage;
import org.openqa.selenium.WebDriver;

public class LoginPortalCRMActions extends LoginPortalCRMPage {

    public String contraseniaInicial;

    public LoginPortalCRMActions(WebDriver driver) {
        super(driver);
    }

    public void fillLogin(DataExcelModels dataExcelModels, int sheet)  {
        enter(dataExcelModels.getUser(sheet)).into(getUser());
        enter(dataExcelModels.getPassword(sheet)).into(getPassword());
    }

    public void clickOnLogin(DataExcelModels dataExcelModels, int sheet){
        fillLogin(dataExcelModels,sheet);
        login();
    }

    public void login(){
        getBtnLogin().click();
    }

}
