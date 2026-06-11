
package com.project.code;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.baseclass.WebdriverCommaLib;
import com.project.baseclass.initialiazePage;

public class ABrandCallLog extends initialiazePage {

	// private static final Function ExpectedCondtions = null;

	WebdriverCommaLib exp;
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Brand Call Log']/following-sibling::h5[@class='grey--text']/span")
	private WebElement BclOpenCasesCount;
	@FindBy(xpath="(//span[text()='Information:']/following-sibling::span)[1]")
	private WebElement BclInformationCount;
	@FindBy(xpath="(//span[text()='BCL Ticket:']/following-sibling::span)[1]")
	private WebElement BclBCLTicketCount;
	@FindBy(xpath="(//span[text()='Inspection:']/following-sibling::span)[1]")
	private WebElement BclInpsectionCount;
	@FindBy(xpath="(//span[text()='Decision:']/following-sibling::span)[1]")
	private WebElement BclDecisionCount;
	@FindBy(xpath="(//span[text()='Disposition:']/following-sibling::span)[1]")
	private WebElement BclDispositionCount;
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Brand Call Log']")
	private WebElement Brandcalllog;
	@FindBy(xpath = "//div[@class='v-card-100 v-card v-sheet theme--light'][1]/descendant::a")
	private List<WebElement> brandCallSubScreens;// Subscreens verification
	@FindBy(xpath = "//button[@class='v-expansion-panel-header']")
	private WebElement brandCalllogFilter;
	@FindBy(xpath = "(//input[@autocomplete='off'])[3]")
	private WebElement brandFilter;
	// @FindBy(xpath = "(//i[@class='v-icon notranslate mdi
	// mdi-checkbox-blank-outline theme--light'])[12]")
//	@FindBy(xpath = "//div[@id='list-item-3136-0']//descendant::i")
//	private WebElement brandFilterSelect;
	@FindBy(xpath = "//button[@class='mb-3 v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement brandApplyFilter;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement BCLcheckbox;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement BCLupdate;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement BCLselectdata1;
	@FindBy(xpath = "(//span[@class='text-red-500'])[1]")
	private WebElement ParchasInvoice;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement ParchasUpdate;
	@FindBy(xpath = "(//span[@class='v-btn__content'])[3]")
	private WebElement AddDatafield;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement Selectdata2;
	@FindBy(xpath = "(//span[@class='text-red-500'])[3]")
	private WebElement DamageCertificate;
	@FindBy(xpath = "//div[@class='v-file-input__text']")
	private WebElement DamageUpload;
	@FindBy(xpath = "//span[text()='SUBMIT']") /// >submit>>111
	private WebElement submitFirstScreen;
	@FindBy(xpath = "//span[text()='Ok']") /// >submit>>OK
	private WebElement pendingInformationOkey;

	@FindBy(xpath = "//a[text()='Pending BCL Tickets']") /// Pending BCL Tickets
	private WebElement pendingBclTickets;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement selectBclTickets;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement updateBcltickets;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement ticketNoBclTickets;
	@FindBy(xpath = "//input[@role='button']")
	private WebElement ticketDateBclTickets;
	@FindBy(xpath = "(//div[@class='v-btn__content'])[3]")
	private WebElement selectCalenderBclTickets;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement calenderOkBclTickets;
	@FindBy(xpath = "//span[text()='SUBMIT']") ///// >>submit>>222
	private WebElement submitBclTickets;
	@FindBy(xpath = "//span[text()='Ok']") /// >submit>>OK
	private WebElement submitBclTicketsOkey;

	@FindBy(xpath = "//a[text()='Pending Inspection']") // Pending Inspection
	private WebElement pendingInspection;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement selectTagInspection;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement updateInspection;
	@FindBy(xpath = "//input[@role='button']")
	private WebElement brandInspectionDate;
	@FindBy(xpath = "(//div[@class='v-btn__content'])[3]")
	private WebElement brandDateCalendorInspection;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement brandDateOkInspection;
	@FindBy(xpath = "//div[@class='v-file-input__text']")
	private WebElement brandInspectionReport;
	@FindBy(xpath = "//span[text()='SUBMIT']") //// Submit>>333
	private WebElement brandInspectionSubmit;
	@FindBy(xpath = "//span[text()='Ok']") /// >submit>>OK
	private WebElement brandInspectionOkey;

	@FindBy(xpath = "(//a[@style='text-transform: none !important;'])[4]") // PENDING DECISION
	private WebElement pendingDecision;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement selectTagpendingDecision;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement updateDecision;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement brandDecision;
	@FindBy(xpath = "//div[text()='RTV']")
	private WebElement brandDecisionRTV;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement brandApprovalReferanceNo;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement brandDecisionCreditNo;
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement brandDecisionCreditAmount;
	@FindBy(xpath = "//span[text()='SUBMIT']") // >>Submit>>>444
	private WebElement brandDecisionSubmit;
	@FindBy(xpath = "//span[text()='Ok']") /// >submit>>OK
	private WebElement brandDecisionOkey;

	@FindBy(xpath = "//span[text()='Disposition']")
	private WebElement disposition1;

	public ABrandCallLog() {
		PageFactory.initElements(driver, this);
	}
	public void BCL() throws InterruptedException {
			System.out.println(BclOpenCasesCount.getText());
		Thread.sleep(2000);
		 int bclOpenCasesCountText = Integer.parseInt(BclOpenCasesCount.getText());
		 int bclInformationCountText = Integer.parseInt(BclInformationCount.getText());
		 int bclBCLTicketCountText = Integer.parseInt(BclBCLTicketCount.getText());
		 int bclInpsectionCountText = Integer.parseInt(BclInpsectionCount.getText());
		 int bclDecisionCountText = Integer.parseInt(BclDecisionCount.getText());
		 int bclDispositionCountText = Integer.parseInt(BclDispositionCount.getText());
		int totalSum = bclInformationCountText+bclBCLTicketCountText+bclInpsectionCountText+bclDecisionCountText+bclDispositionCountText;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, bclOpenCasesCountText);
		System.out.println("Open cases count validated");
		Thread.sleep(2000);
		Brandcalllog.click();
		// Brandcalllog.wait(22,20000); Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//Thread.sleep(2000);
	}
//	public void brandCallLogFilter() throws InterruptedException {
//		brandCalllogFilter.click();
//		Thread.sleep(1000);
//	}
//
//	public void brandFieldFilter() throws InterruptedException, AWTException {
//		brandFilter.click();
//		Thread.sleep(1000);
//		brandFilter.sendKeys("Samsung");
//		Thread.sleep(1000);
//		r1 = new Robot();
//		r1.delay(1000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r1.keyPress(KeyEvent.VK_ENTER);
//
//	}
//
////	public void selectFilterBrand() throws InterruptedException {
////		brandFilterSelect.click();
////		Thread.sleep(1000);
////	}
//	public void brandApplyFilter() throws InterruptedException {
//		brandApplyFilter.click();
//		System.out.println("Filter Applied succussfully");
//		Thread.sleep(2000);
//	}

	public void SelectItem() throws InterruptedException {
		 Thread.sleep(1000);

		// wait =new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until((Function)
		//ExpectedConditions.elementToBeClickable(By.xpath("BCLcheckbox")));

		//exp.explicitElementSelected(driver, "BCLcheckbox");
		BCLcheckbox.click();

	}

	public void BCLUpdate() throws InterruptedException {
		Thread.sleep(1000);
		BCLupdate.click();
	}

	public void BCLSelectData1() {
		BCLselectdata1.click();
	}

	public void parchaseInvoice() throws InterruptedException {
		ParchasInvoice.click();
		Thread.sleep(1000);
	}

	public void parchaseUpdate() throws InterruptedException {

		ParchasUpdate.click();
		Thread.sleep(1000);
		ParchasUpdate.sendKeys("test");
	}

	public void addDataField() {
		AddDatafield.click();
	}

	public void selectData2() {
		Selectdata2.click();
	}

	public void damagecertificate() {
		DamageCertificate.click();
	}

	public void damageUpload() throws InterruptedException, AWTException {
		DamageUpload.click();
		r1 = new Robot();
		r1.delay(1000);
		/*
		 * This code is used for getting for all files 
		 * r1.keyPress(KeyEvent.VK_TAB);
		 * r1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		 * r1.keyPress(KeyEvent.VK_DOWN); Thread.sleep(2000);
		 * r1.keyPress(KeyEvent.VK_ENTER); 
		 * for (int i=0;i<9;i++) {
		 * r1.keyPress(KeyEvent.VK_TAB); 
		 * Thread.sleep(2000); 
		 * }
		 */
//put the path to file in aclickbsoar
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void submitFirst() throws InterruptedException {
		submitFirstScreen.click();
		Thread.sleep(1000);

	}

	public void pendingInformationOkbutton() throws InterruptedException {
		pendingInformationOkey.click();
		System.out.println("PENDING INFORMATION VERIFYID SUCCUSSFULLY");
		Thread.sleep(1000);
	}

	public void pendingBclTickets() {
		pendingBclTickets.click();
	}

	public void selectBclTickets() {
		selectBclTickets.click();
	}

	public void updateBclTikctes() {
		updateBcltickets.click();
	}

	public void ticketNoBclTickets() throws InterruptedException {
		ticketNoBclTickets.click();
		Thread.sleep(1000);
		ticketNoBclTickets.sendKeys("Test123");
	}

	public void ticketDateBclTickets() {
		ticketDateBclTickets.click();

	}

	public void selectCalendorDateBclTickets() throws InterruptedException {
		selectCalenderBclTickets.click();
		Thread.sleep(1000);
	}

	public void calendorOkBclTickets() throws InterruptedException {
		calenderOkBclTickets.click();
		Thread.sleep(1000);
	}

	public void submitBclTickets() {
		submitBclTickets.click();
	}

	public void submitBclTicketsOk() throws InterruptedException {
		submitBclTicketsOkey.click();
		System.out.println("PENDING BCL TICKETS VERIFYID SUCCUSSFULLY");
		Thread.sleep(1000);
	}

	public void pendingInspection() {
		pendingInspection.click();
	}

	public void selectInspection() {
		selectTagInspection.click();
	}

	public void updateInspection() throws InterruptedException {
		updateInspection.click();
		Thread.sleep(1000);

	}

	public void brandInspectionDate() throws InterruptedException {
		brandInspectionDate.click();
		Thread.sleep(1000);
	}

	public void brandDatecalendorInpsection() throws InterruptedException {
		brandDateCalendorInspection.click();
		Thread.sleep(1000);
	}

	public void clickBrandDateOkInspection() throws InterruptedException {
		brandDateOkInspection.click();
		Thread.sleep(2000);
	}

	public void brandInspectionReport() throws AWTException, InterruptedException {
		brandInspectionReport.click();
		Thread.sleep(2000);
		r1 = new Robot();
		r1.delay(2000);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public void submitBrandInspection() throws InterruptedException {
		brandInspectionSubmit.click();
		Thread.sleep(1000);
	}

	public void brandInspectionOKbutton() throws InterruptedException {
		brandInspectionOkey.click();
		System.out.println("PENDING INSPECTION VERIFYID SUCCUSSFULLY");
		Thread.sleep(1000);
	}

	public void pendingDecisionScreen() throws InterruptedException {
		pendingDecision.click();
		Thread.sleep(1000);
	}

	public void selectPendingDecision() {
		selectTagpendingDecision.click();
	}

	public void updatePendingDecision() throws InterruptedException {
		updateDecision.click();
		Thread.sleep(2000);
	}

	public void brandDecision() throws InterruptedException {
		brandDecision.click();
		Thread.sleep(1000);
	}

	public void brandDecisionRTV() {
		brandDecisionRTV.click();
	}

	public void brandApprovalReferanceNo() throws InterruptedException {
		brandApprovalReferanceNo.click();
		Thread.sleep(1000);
		brandApprovalReferanceNo.sendKeys("ApprovalRTV111");
	}

	public void brandDecisionCreditNo() throws InterruptedException {
		brandDecisionCreditNo.click();
		Thread.sleep(1000);
		brandDecisionCreditNo.sendKeys("Credit123");
		Thread.sleep(1000);
	}

	public void decisionCreditAmount() throws InterruptedException {
		brandDecisionCreditAmount.click();
		Thread.sleep(1000);
		brandDecisionCreditAmount.sendKeys("10000");
	}

	public void brandDecisionSubmit() {
		brandDecisionSubmit.click();
	}

	public void brandDecisionOkbutton() throws InterruptedException {
		brandDecisionOkey.click();
		System.out.println("PENDING DECISION VERIFYID SUCCUSSFULLY");
		Thread.sleep(1000);
		int selectOptionTextsSize = brandCallSubScreens.size();
		for (int i = 1; i < selectOptionTextsSize; i++) {
			String selectOptionText = brandCallSubScreens.get(i).getText();
			System.out.println(selectOptionText);
		}
	}

	public void clickDispoaition2() {
		disposition1.click();
	}
	
	
	
	@FindBy(id = "dropdownId")
    private WebElement dropdownElement;

    public ABrandCallLog(WebDriver driver) {
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    public void selectOption(String optionText) {
        // Create a Select object using the WebElement
        Select dropdown = new Select(dropdownElement);
        // Select an option by visible text
        dropdown.selectByVisibleText(optionText);
    }

    // Add more methods for interacting with other elements on the page if needed
}
//HYPER LINK=//div[@class='container']/descendant::div[@class='row']


