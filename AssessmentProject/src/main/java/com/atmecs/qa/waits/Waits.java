package com.atmecs.qa.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.qa.configuration.FileConstant;
import com.atmecs.qa.helper.CommonUtility;

public class Waits {

	CommonUtility common = new CommonUtility();

	/**
	 * method-isElementVisible
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public boolean isElementVisible(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			wait.until(ExpectedConditions.visibilityOf(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method-javaScriptThrowsNoExceptions
	 * 
	 * @param driver
	 * @param locator
	 * @param javaScript
	 * @return
	 */
	public boolean javaScriptThrowsNoExceptions(WebDriver driver, String locator, String javaScript) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method-elementToBeClickable
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */

	public boolean elementToBeClickable(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {

			wait.until(ExpectedConditions.elementToBeClickable(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method-stalenessOf(for staleElement exception)
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */

	public boolean stalenessOf(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {

			wait.until(ExpectedConditions.stalenessOf(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method---visibilityOfAllElements
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public boolean visibilityOfAllElements(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method-elementToBeSelected
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public boolean elementToBeSelected(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {

			wait.until(ExpectedConditions.elementToBeSelected(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * 
	 * alertIsPresent method-
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */

	public boolean alertIsPresent(WebDriver driver, String locator) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {

			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	/**
	 * method-titleContains
	 * 
	 * @param driver
	 * @param locator
	 * @param title
	 * @return
	 */

	public boolean titleContains(WebDriver driver, String locator, String title) {

		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {

			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}

	public void wait(int timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
