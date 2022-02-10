package com.indra.steps_definitions;

import com.indra.actions.*;
import com.indra.models.DataExcelModels;
import com.indra.models.LoginEposModels;
import com.indra.models.LoginPortalCRMModels;
import com.indra.models.WindexModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class SanitySteps{
    @Managed
    WebDriver driver;

    DataExcelModels dataExcelModels = new DataExcelModels();
    ReadFileXLSXActions readFileXLSXActions = new ReadFileXLSXActions();
    ResourceEnlistmentActions enlistment = new ResourceEnlistmentActions();
    LoginEposPageActions loginPageAction = new LoginEposPageActions(driver);
    MerchandiseEntryAction merchandiseEntryAction = new MerchandiseEntryAction(driver);
    InventoryAllocationActions inventoryAllocationActions = new InventoryAllocationActions(driver);
    LoginPortalCRMActions loginPortalCRMActions = new LoginPortalCRMActions(driver);
    InventoryConfirmActions activationAction = new InventoryConfirmActions();
    PrepaidActivationActions prepaidActivationActions = new PrepaidActivationActions(driver);
    CesionPortalCRMActions cesionActions = new CesionPortalCRMActions(driver);
    int Activation =0;
    ControlActivationActions controlActivationActions = new ControlActivationActions(driver);
    int hoja = 0;


//-----------<Primer escenario>----------------
    @Given("^Se ejecutan procedimientos en bd y soapUi$")
    public void seEjecutanProcedimientosEnBdYSoapUi() throws SQLException {
        enlistment.executeAllProcedures(hoja);
    }

    @When("^Se ingresa a la plataforma epos para cargue de inventario$")
    public void seIngresaALaPlataformaEposParaCargueDeInventario() {
        //loginPageAction.open();
        driver.get(dataExcelModels.getUrlEpos(hoja));
        loginPageAction.clickOnLogin(dataExcelModels,hoja);
    }


    @Then("^Se ingresa a entrada masiva de mercancia$")
    public void seIngresaAEntradaMasivaDeMercancia() {
        merchandiseEntryAction.loadMerchandise();
    }

    @Then("^Se completa datos para cargar mercancia$")
    public void seCompletaDatosParaCargarMercancia() throws InterruptedException {
        merchandiseEntryAction.merchandiseEntry();
        merchandiseEntryAction.merchandiseEntryInventory();
        Thread.sleep(2000);
        loginPageAction.leave();
    }

    //-----------<Segundo escenario>----------------

    @When("^Se ingresa a cargue de inventario$")
    public void seIngresaACargueDeInventario() throws InterruptedException {
        seIngresaALaPlataformaEposParaCargueDeInventario();
        inventoryAllocationActions.loadInventory();
        Thread.sleep(2000);
        inventoryAllocationActions.leaveSesion();

    }

    @Then("^Deberia poder realizar el cargue de inventario$")
    public void deberiaPoderRealizarElCargueDeInventario() {
    }

    //-----------<Tercer escenario>----------------

    @Given("^se ingresa a la plataforma epos windex$")
    public void seIngresaALaPlataformaEposWindex() throws IOException, InterruptedException, AWTException {
        Activation= activationAction.executeStepsActivation(hoja);
    }

    @Then("^se deberia poder ver mensaje de confimacion exitosa$")
    public void seDeberiaPoderVerMensajeDeConfimacionExitosa() {
        assertThat("finaliza la confirmacion de inventario",Activation, Matchers.is(1));
    }

    //-----------<Cuarto escenario>----------------

    @Given("^Se ingresa al portal CRM para activacion$")
    public void seIngresaAlPortalCRMParaActivacion() {
        driver.get(dataExcelModels.getUrlCRM(hoja));
        loginPortalCRMActions.clickOnLogin(dataExcelModels, hoja);
    }

    @When("^Se hace activacion de una linea en prepago$")
    public void seHaceActivacionDeUnaLineaEnPrepago(){
        prepaidActivationActions.initialRute();
        prepaidActivationActions.customerInformation(dataExcelModels.getVendedorPrepago(hoja)
                , dataExcelModels.getCedulaClientePrepago(hoja));
        prepaidActivationActions.activationInformation(dataExcelModels.getMsisdnPrepago(hoja),dataExcelModels.getMsiPrepago(hoja));
        prepaidActivationActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa en prepago$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaEnPrepago() {
        prepaidActivationActions.consultSingleScreen(dataExcelModels.getMsisdnPrepago(hoja));
    }
    //-----------<Quinto escenario>>----------------

    @When("^Se hace la cesion de contrato de una linea$")
    public void seHaceLaCesionDeContratoDeUnaLinea() throws InterruptedException, AWTException {
        cesionActions.initialRute();
        cesionActions.executeContractAssignment(dataExcelModels.getMsisdnPostpago(hoja),dataExcelModels.getCedulaClientePostpago(hoja));

    }

    @Then("^Se deberia ver en pantalla unica la linea cedida$")
    public void seDeberiaVerEnPantallaUnicaLaLineaCedida() {
        prepaidActivationActions.consultSingleScreen2(dataExcelModels.getMsisdnPostpago(hoja));
    }

    //-----------<Sexto escenario>----------------

    @When("^Se hace activacion de una linea en control$")
    public void seHaceActivacionDeUnaLineaEnControl() throws InterruptedException {
        controlActivationActions.initialRute();
        controlActivationActions.customerInformation(dataExcelModels.getVendedorPostpago(hoja)
                , dataExcelModels.getCedulaClientePostpago(hoja));
        controlActivationActions.activationInformation(dataExcelModels.getMsisdnPostpago(hoja),dataExcelModels.getMsiPostpago(hoja));
        controlActivationActions.demographicInformation();
    }

    @Then("^Se deberia ver en pantalla unica la linea activa en control$")
    public void seDeberiaVerEnPantallaUnicaLaLineaActivaEnControl() {
        controlActivationActions.consultSingleScreen(dataExcelModels.getMsisdnPostpago(hoja));
    }

    // *************************************************************++***** //
    // **************************Sanity Semilla 4************************** //

    @Given("^Se requiere realizar el sanity de semilla (\\d+)$")
    public void seRequiereRealizarElSanityDeSemilla(int numSemilla)  {
        hoja= enlistment.selectionSheet(numSemilla);
        System.out.println("Se ejecutaran los datos de la hoja "+hoja);

    }

    @When("^Se ejecutan los procedimientos en bd - soapUi$")
    public void seEjecutanLosProcedimientosEnBdSoapUi() throws SQLException {
        seEjecutanProcedimientosEnBdYSoapUi();
    }

    @When("^Se ingresa a la plataforma epos para el cargue de inventario$")
    public void seIngresaALaPlataformaEposParaElCargueDeInventario() throws InterruptedException {
        seIngresaALaPlataformaEposParaCargueDeInventario();
        seIngresaAEntradaMasivaDeMercancia();
        seCompletaDatosParaCargarMercancia();
    }

    @When("^Se ingresa a la plataforma epos para el cargue de mercancia$")
    public void seIngresaALaPlataformaEposParaElCargueDeMercancia() throws InterruptedException {
        seIngresaACargueDeInventario();

    }

    @When("^Se ingresa a windex a la confirmacion de inventario$")
    public void seIngresaAWindexALaConfirmacionDeInventario() throws IOException, InterruptedException, AWTException {
        seIngresaALaPlataformaEposWindex();
        seDeberiaPoderVerMensajeDeConfimacionExitosa();
    }

    @Then("^se realiza la activacion prepago$")
    public void seRealizaLaActivacionPrepago() {
        seIngresaAlPortalCRMParaActivacion();
        seHaceActivacionDeUnaLineaEnPrepago();
        seDeberiaVerEnPantallaUnicaLaLineaActivaEnPrepago();
    }

    @Then("^Se realiza la activacion avengers$")
    public void seRealizaLaActivacionAvengers() {

    }

    @Then("^se realiza la activacion nintendo$")
    public void seRealizaLaActivacionNintendo() {

    }

    @Then("^la cesion de contrato pre a pos$")
    public void laCesionDeContratoPreAPos() {

    }

    @Then("^la cesion de contrato$")
    public void laCesionDeContrato() {

    }

}



