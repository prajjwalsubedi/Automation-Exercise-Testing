package com.automationexercise.tests;

import org.testng.annotations.Test;

import com.automationexercise.library.Base;
import com.automationexercise.pages.AccountConfirmationPage;
import com.automationexercise.pages.AccountInformationPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;

public class RegisterUser extends Base {

	// Creating user to delete login later
	@Test(enabled = true)
	public void RegisterUserOnly() {
		HomePage homePage = new HomePage();
		homePage.goToWebsite();
		LoginPage loginPage = homePage.clickSignUpLogin();

		loginPage.verifySignUpForm();
		loginPage.enterSignUpName("Prajjwal Subedi");
		loginPage.enterSignUpEmail("peter1111121@gmail.com");
		AccountInformationPage accountInformation = loginPage.clickSignUp();

		accountInformation.selectTitle("mr");
		accountInformation.enterPassword("peter11111@1234");
		accountInformation.enterDOB(30, "October", 1996);
		accountInformation.tickSignUpNewsLetter();
		accountInformation.tickSpecialOffers();
		// Fill details: First name, Last name, Company, Address, Address2,
		// Country, State, City, Zipcode, Mobile Number
		accountInformation.enterFirstName("Prajjwal");
		accountInformation.enterLastName("Subedi");
		accountInformation.enterCompany("Logic Accountants");
		accountInformation.enterAddress1("2/4 cecil St");
		accountInformation.enterCity("Sydney");
		accountInformation.enterState("NSW");
		accountInformation.selectCountry("United States");
		accountInformation.enterZipCode(20137);
		accountInformation.enterMobileNumber("5715389808");
		AccountConfirmationPage accountConfirmation = accountInformation.clickCreateAccount();

		accountConfirmation.clickContinueAfterCretion();

	}

}
