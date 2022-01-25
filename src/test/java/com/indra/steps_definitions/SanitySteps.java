package com.indra.steps_definitions;

import com.indra.actions.*;
import com.indra.models.DataExcel;
import com.indra.models.LoginPageModel;
import com.indra.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.sql.SQLException;
import java.util.List;

public class SanitySteps{
    @Managed
    WebDriver driver;

    UninstallCBSServices uninstallCBSServices = new UninstallCBSServices();
    DatabaseConnection databaseConnection = new DatabaseConnection();
    DataExcel dataExcel = new DataExcel();
    LoginPage loginPage = new LoginPage(driver);
    ResourceEnlistment enlistment = new ResourceEnlistment();
    LoginPageAction loginPageAction = new LoginPageAction(driver);
    MerchandiseEntryAction merchandiseEntryAction = new MerchandiseEntryAction(driver);


    @Given("^Se ejecutan procedimientos en bd y soapUi$")
    public void seEjecutanProcedimientosEnBdYSoapUi() throws SQLException {
        //enlistment.executeAllProcedures();
    }

    @When("^Se ingresa a la plataforma epos para cargue de inventario$")
    public void seIngresaALaPlataformaEposParaCargueDeInventario(List<LoginPageModel> loginPageModels) {
        loginPageAction.open();
        loginPageAction.clickOnLogin(loginPageModels.get(0));
    }


    @Then("^Se ingresa a entrada masiva de mercancia$")
    public void seIngresaAEntradaMasivaDeMercancia() {
        merchandiseEntryAction.loadMerchandise();
    }

    @Then("^Se completa datos para cargar mercancia$")
    public void seCompletaDatosParaCargarMercancia() throws InterruptedException {
        merchandiseEntryAction.merchandiseEntry();
        merchandiseEntryAction.merchandiseEntryInventory();
        Thread.sleep(5000);
    }

}


