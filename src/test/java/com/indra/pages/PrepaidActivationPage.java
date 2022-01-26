package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;


@DefaultUrl("http://10.69.60.85:8280/portal/login?initialURI=%2Fportal%")
public class PrepaidActivationPage extends PageObject{

    public PrepaidActivationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/ul/li[2]/span/a")
    WebElementFacade sale;

    @FindBy(id = "pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0::j_id12:handle:img:expanded")
    WebElementFacade unfold;

    @FindBy(id = "pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29::j_id14:handle:img:expanded")
    WebElementFacade payment;

    @FindBy(id = "pbG1dfca009_2d52ed_2d45cd_2da543_2d6660573bef81:_viewRoot:j_id4:j_id10:j_id11:0:29:31::j_id17")
    WebElementFacade activator;

    @FindBy(id = "formIndex:j_idt13Button")
    WebElementFacade paymentActivator;

    @FindBy(xpath = "//div[contains(@id,'idt13Item0')][@class='rf-sel-opt rf-sel-sel'][contains(.,'Prepago')]")
    WebElementFacade prepaid;

    @FindBy(id = "ActivacionesForm:idVendedor")
    WebElementFacade vendor;

    @FindBy(id = "ActivacionesForm:idTipoDocButton")
    WebElementFacade buttonId;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idTipoDocItem0')]")
    WebElementFacade documentType;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idTipoDocItem0')]")
    WebElementFacade documentCC;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idExpedicion')]")
    WebElementFacade documentExpedicion;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuar')]")
    WebElementFacade continuee;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idImsi')]")
    WebElementFacade imsi;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idMsisdn')]")
    WebElementFacade msisdn;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[2]")
    WebElementFacade paymentType;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[2]")
    WebElementFacade justSim;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarActivacionVenta')]")
    WebElementFacade continueActivation;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarTarifas')]")
    WebElementFacade continueTarife;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[3]")
    WebElementFacade paymentDepar;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idDepartamentoItem26')]")
    WebElementFacade deparment;

    @FindBy(xpath = "(//span[contains(@class,'rf-sel-btn-arrow')])[4]")
    WebElementFacade paymentCity;

    @FindBy(xpath = "//div[contains(@id,'ActivacionesForm:idCiudadItem10')]")
    WebElementFacade city;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnValidarDireccion')]")
    WebElementFacade validate;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:idTelefono')]")
    WebElementFacade phone;

    @FindBy(xpath = "//input[contains(@id,'ActivacionesForm:btnContinuarActivacionDemografica')]")
    WebElementFacade continueActivationDemo;

    @FindBy(xpath = "//input[contains(@id,'popupConfirmacionDatos:confirmarDatos')]")
    WebElementFacade confirm;

    @FindBy(xpath = "//a[@class='TabIcon DefaultPageIcon'][contains(.,'Consultas')]")
    WebElementFacade consult;

    @FindBy(xpath = "//img[contains(@id,'pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:13::j_id12:handle:img:expanded')]")
    WebElementFacade consultPos;

    @FindBy(xpath = "//img[contains(@id,'pbGc323725e_2d6efe_2d4037_2d9f93_2d1bc06edfa941:_viewRoot:j_id4:j_id10:j_id11:13:14::j_id14:handle:img:collapsed')]")
    WebElementFacade consultIntegral;

    @FindBy(xpath = "//a[@href='#'][contains(@id,'id17')][contains(.,'Nueva Pantalla Unica Clientes')]")
    WebElementFacade consultClient;

    @FindBy(id = "j_id15:j_id26")
    WebElementFacade msisdn2;

    @FindBy(id = "j_id15:j_id27")
    WebElementFacade searchButton;

    public WebElementFacade getSale() {
        return sale;
    }

    public WebElementFacade getUnfold() {
        return unfold;
    }

    public WebElementFacade getPayment() {
        return payment;
    }

    public WebElementFacade getActivator() {
        return activator;
    }

    public WebElementFacade getPaymentActivator() {
        return paymentActivator;
    }

    public WebElementFacade getPrepaid() {
        return prepaid;
    }

    public WebElementFacade getVendor() {
        return vendor;
    }

    public WebElementFacade getButtonId() {
        return buttonId;
    }

    public WebElementFacade getDocumentType() {
        return documentType;
    }

    public WebElementFacade getDocumentCC() {
        return documentCC;
    }

    public WebElementFacade getDocumentExpedicion() {
        return documentExpedicion;
    }

    public WebElementFacade getContinuee() {
        return continuee;
    }

    public WebElementFacade getImsi() {
        return imsi;
    }

    public WebElementFacade getMsisdn() {
        return msisdn;
    }

    public WebElementFacade getPaymentType() {
        return paymentType;
    }

    public WebElementFacade getJustSim() {
        return justSim;
    }

    public WebElementFacade getContinueActivation() {
        return continueActivation;
    }

    public WebElementFacade getContinueTarife() {
        return continueTarife;
    }

    public WebElementFacade getPaymentDepar() {
        return paymentDepar;
    }

    public WebElementFacade getDeparment() {
        return deparment;
    }

    public WebElementFacade getPaymentCity() {
        return paymentCity;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getValidate() {
        return validate;
    }

    public WebElementFacade getPhone() {
        return phone;
    }

    public WebElementFacade getContinueActivationDemo() {
        return continueActivationDemo;
    }

    public WebElementFacade getConfirm() {
        return confirm;
    }

    public WebElementFacade getConsult() {
        return consult;
    }

    public WebElementFacade getConsultPos() {
        return consultPos;
    }

    public WebElementFacade getConsultIntegral() {
        return consultIntegral;
    }

    public WebElementFacade getConsultClient() {
        return consultClient;
    }

    public WebElementFacade getMsisdn2() {
        return msisdn2;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }
}
