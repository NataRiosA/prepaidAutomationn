package com.indra.actions;

import com.indra.pages.MerchandiseEntryPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MerchandiseEntryAction extends MerchandiseEntryPage {
    public MerchandiseEntryAction(WebDriver driver) {
        super(driver);
    }


    public void loadMerchandise(){
        Actions actions = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.id("formMenu:j_id19_span"));
        actions.moveToElement(we).build().perform();
        WebElement a = getDriver().findElement(By.id("formMenu:j_id26"));
        actions.moveToElement(a).build().perform();
        getMassMerchandiseEntry().click();
    }

    public void merchandiseEntry() throws InterruptedException {
        getChannel().click();
        getStoreChannel().click();
        getReason().click();
        Thread.sleep(2000);
        getReasonMerchandiseEntry().click();
        getPointSale().click();
        getPointSaleStore().click();
        //compare();
        getSelectReason().click();
        Thread.sleep(2000);
    }

    public void merchandiseEntryInventory() throws InterruptedException {
        getBulkUploadItems().waitUntilClickable();
        Thread.sleep(2000);
        getBulkUploadItems().click();
        Actions actions = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.xpath("//input[contains(@id,'formload:uploadFile:file')]"));
        we.sendKeys("C:\\Users\\nriosa\\Desktop\\Mercanncia.csv");
        //actions.moveToElement(we).build().perform();
        getUploadFile2().click();
        //compareM();
        Thread.sleep(2000);
        getUpload().click();
    }

}
