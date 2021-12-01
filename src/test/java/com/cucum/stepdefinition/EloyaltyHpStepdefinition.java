package com.cucum.stepdefinition;

import java.util.List;

import org.testng.Assert;

import com.eloyalty.pages.ELoyaltyHomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class EloyaltyHpStepdefinition extends ELoyaltyHomePage {
	

	@Given("Launch the eloyalty application https:\\/\\/premium.aa.com\\/eloyalty_enu\\/")
	public void launch_the_eloyalty_application_https_premium_aa_com_eloyalty_enu() throws Exception {
		try {
			gotoUrl("https://premium.aa.com/eloyalty_enu/");
			proceedWebsite();
			threadSleep(10000);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Given("Validate user landed in eloyalty homepage")
	public void validate_user_landed_in_eloyalty_homepage() throws Exception {
		try {
			Assert.assertTrue(getText(findElementBy(login_txt)).equals("Log in"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Given("Validate Annual membership description")
	public void validate_Annual_membership_description(DataTable dataTable) throws Exception {
		try {
			List<String> asList = dataTable.asList();
			if (getText(findElementBy(Ann_Mem_txt)).equals(asList.get(0))
					&&getText(findElementBy(Ann_Mem_dec)).contains(asList.get(1))
					&&getText(findElementBy(Ann_Mem_dec)).contains(asList.get(2))
					&&getText(findElementBy(Ann_Fe)).equals(asList.get(3))
					&&getText(findElementBy(An_Fe_1)).equals(asList.get(4))
					&&getText(findElementBy(An_Fe_2)).equals(asList.get(5))
					&&getText(findElementBy(An_Fe_3)).equals(asList.get(6))
					&&getText(findElementBy(An_Fe_4)).equals(asList.get(7))
					&&getText(findElementBy(An_Fe_5)).equals(asList.get(8))) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("Click Join AAdvantage")
	public void click_Join_AAdvantage() {
		try {
			explicitlyWait(5, findElementBy(Join_Aadv));
			click(findElementBy(Join_Aadv));
			goToWindow(getWindowHandles(), 1);
			proceedWebsite();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("Validate user landed in enrollment page")
	public void validate_user_landed_in_enrollment_page() throws Exception {
		try {
			String expected = "Your name";
			String actual = getText(findElementBy(your_name));
			Assert.assertTrue(expected.equals(actual));
			close();
			goToWindow(getWindowHandles(), 0);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("Click AAdvantage Number")
	public void click_AAdvantage_Number() {
		try {
			explicitlyWait(5, findElementBy(Aadv_Num));
			click(findElementBy(Aadv_Num));
			goToWindow(getWindowHandles(), 1);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Given("Validate user landed in need your number page")
	public void validate_user_landed_in_need_your_number_page() throws Exception {
		try {
			String expected = "Enter your name and email, and we’ll send your AAdvantage number.";
			String actual = getText(findElementBy(N_Y_Aadv));
			Assert.assertTrue(expected.equals(actual));
			close();
			goToWindow(getWindowHandles(), 0);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Given("Click Password")
	public void click_Password() {
		try {
			explicitlyWait(5, findElementBy(Pass_word));
			click(findElementBy(Pass_word));
			goToWindow(getWindowHandles(), 1);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Given("Validate user landed in Password page")
	public void validate_user_landed_in_Password_page() throws Exception {
		try {
			String expected = "Please enter your name and AAdvantage number or username.";
			String actual = getText(findElementBy(N_Y_Password));
			Assert.assertTrue(expected.equals(actual));
			close();
			goToWindow(getWindowHandles(), 0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	

	/*@Given("Click Learn more")
	public void click_Learn_more() {
		explicitlyWait(5, findElementBy(Learn_more));
		click(findElementBy(Learn_more));
		goToWindow(getWindowHandles(), 1);
		proceedWebsite();
	}

	@Given("Validate user landed in Creditcards page")
	public void validate_user_landed_in_Creditcards_page() throws Exception {
		try {
			String expected = "Enrich your travel experience with these remarkable card benefits:";
			String actual = getText(findElementBy(le_more));
			Assert.assertTrue(expected.equals(actual));
			close();
			goToWindow(getWindowHandles(), 0);
			quit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

}
