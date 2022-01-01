package hw13Selenium;

public class Dynamic_Xpath_Last5 {
/*10) Tag with parents (you must know)
 * Source:https://www.bestbuy.com/ 
 * Example:
 * 1.//a[@title='BestBuy.com']//parent::div[@class='top-nav'] (deal of the day)
 * 2.//li[@class='bottom-nav-menu-item']//parent::ul[@class='bottom-nav-right'] (Account field)
 * 3.//button[@class='c-button-unstyled hamburger-menu-button']//parent::nav[@class='hamburger-menu'] (Credit Cards)
 */
	
	/*11) Tag with child (not common)
	 * Source:https://www.amazon.com/
	 * Example:
	 * 1.//div[@id='nav-belt']//child::div[@class='nav-left'] (Todays deal)
	 * 2.//div[@id='nav-global-location-slot']//child::span[@id='nav-global-location-data-modal-action'] (logo)
	 * 3.//div[@id='rhf']//child::div[@class='rhf-frame']
	
	/*12)Tag with preceding sibling {elder brother}
	 * Source:https://www.amazon.com/
	 * Example: https://portaldev.cms.gov/portal/
	 * 1.//div[@class='collapse navbar-collapse']//preceding-sibling::div[@class='navbar-header'] (Application)
	 * 2.//li[@class='dropdown cms-header-dropdown cms-header-links-item']//preceding-sibling::li[@class='cms-header-links-item cms-find-app d-xs-block d-md-none d-lg-block '] (login)
	 * 3.//div[@class='collapse navbar-collapse']//preceding-sibling::div[@class='navbar-header'] (login)
	 */
	
	/*13) Tag with preceding sibling
	 * Source:
	 * Example:https://portaldev.cms.gov/portal/
	 * 1.//div[@class='collapse navbar-collapse']//preceding-sibling::div[@class='navbar-header'] (Application)
	 * 2.//li[@class='dropdown cms-header-dropdown cms-header-links-item']//preceding-sibling::li[@class='cms-header-links-item cms-find-app d-xs-block d-md-none d-lg-block '] (login)
	 * 3.//div[@class='collapse navbar-collapse']//preceding-sibling::div[@class='navbar-header'] (login)
	 */
	
	/*14) Tag with inner text/attribute (if multiple is present) [Last choice] 
	 * Source:https://www.bestbuy.com/
	 * Example:
	 * 1.//a[text()='Credit Cards']//parent::li (credit card)
	 * 2.//a[text()='Best Buy Totaltech']//parent::li (Best Buy totaltech)
	 * 3.//a[text()='Credit Cards']//parent::li (Best Buy totaltech)
	 */
}
