package com.indra.steps_definitions;

import com.indra.actions.*;
import com.indra.models.DataExcel;
import com.indra.models.LoginEposModel;
import com.indra.pages.LoginEposPage;
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
    LoginEposPage loginPage = new LoginEposPage(driver);
    ResourceEnlistment enlistment = new ResourceEnlistment();
    LoginEposPageAction loginPageAction = new LoginEposPageAction(driver);
    MerchandiseEntryAction merchandiseEntryAction = new MerchandiseEntryAction(driver);
    InventoryAllocationAction inventoryAllocationAction = new InventoryAllocationAction(driver);

//-----------<Primer escenario>----------------
    @Given("^Se ejecutan procedimientos en bd y soapUi$")
    public void seEjecutanProcedimientosEnBdYSoapUi() throws SQLException {
        enlistment.executeAllProcedures();
    }

    @When("^Se ingresa a la plataforma epos para cargue de inventario$")
    public void seIngresaALaPlataformaEposParaCargueDeInventario(List<LoginEposModel> loginPageModels) {
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

    //-----------<Segundo escenario>----------------

    @When("^Se ingresa a cargue de inventario$")
    public void seIngresaACargueDeInventario() {
    }

    @Then("^Deberia poder realizar el cargue de inventario$")
    public void deberiaPoderRealizarElCargueDeInventario() {
    }

    //-----------<Tercer escenario>----------------

    @Given("^se ingresa a la plataforma epos windex$")
    public void seIngresaALaPlataformaEposWindex() {
    }

    @When("^se confirma la asignacion de inventario$")
    public void seConfirmaLaAsignacionDeInventario() {

    }

    @Then("^se deberia poder ver mensaje de confimacion exitosa$")
    public void seDeberiaPoderVerMensajeDeConfimacionExitosa() {
    }

    //-----------<Cuarto escenario>----------------

    @Given("^Se ingresa al portal CRM para activacion prepago$")
    public void seIngresaAlPortalCRMParaActivacionPrepago() {
    }

    @When("^Se hace activacion de una linea en prepago$")
    public void seHaceActivacionDeUnaLineaEnPrepago() {
    }

    @Then("^Se deberia ver en pantalla unica la linea activa en prepago$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaEnPrepago() {
    }

}



