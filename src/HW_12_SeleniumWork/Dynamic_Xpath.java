package HW_12_SeleniumWork;

public class Dynamic_Xpath {
		/* 1. Tag with a single attribute
		 * Source:https://www.costco.com/
		 * Example:
		 * 1.//head[@class='at-element-marker'] (search field)
		 * 2.//div[@class='table-cell navigation hidden-xl']  (search field)
		 * 3.//div[@class='table-row'] (logo field)
		 */
		

		/* 2. Tag with multiple attribute with 'or' logic
		 *  Source:https://www.costco.com/
		 *  Example:
		 *  1.//span[@id='search-field-description' or @class='sr-only'] (logo)
		 *  2.//div[@id='search-mt' or @class='table-cell search-cell']  (grocery)
		 *  3.//div[@id='criteo-tags-div' or @style='display: none'] (grocery) 
		 */

		/*3) Tag with multiple attribute with 'and' logic
		* Source:https://www.bestbuy.com/
		* Exercise:
		* 1.//div[@id='headerskip' and @class='sr-only'] (logo)
		* 2.//button[@id='header-clear-search-icon' and @class='clear-search-icon hidden'] (search)
		* 3.//span[@class='header-close-icon' and @aria-hidden='true'] (search)
		*/

		/*4) Tag with inner text [means complete text] 
		* Source:https://www.bestbuy.com/ and https://www.amazon.com/
		* Exercise:
		* 1.//a[text()='Deal of the Day']
		* 2.//a[text()='Customer Service'] (logo)
		* 3.//a[text()='Gift Cards'] (Gift cards)
		*/

		/*5) Tag with inner text [not actual text, means partial text as well as actual text] 
		* Source: https://www.amazon.com/
		* Exercise:
		* 1.//p[contains(text(), 'At the Mount Sinai')] (heading)
		* 2.//p[contains(text(), 'At the Mount Sinai')] (partial)
		* 3.//h1[contains(text(), 'Mount Sinai Tisch Cancer Center')] (complete)
		*/

		/*6) Tag with attributes and use of contains (not commonly used)
		* Source: https://www.bestbuy.com/
		* Exercise:
		* 1.//img[contains(@class,'v-m-top-s gift-box-icon')] (logo)
		* 2.//span[contains(@class,'header-close-icon')] (search)
		* 3.//button[contains(@class,'c-button-unstyled hamburger-menu-button')] (search)
		*/

		/*7) Normalize space -- eliminates leading and trailing spaces.
		* Source:https://www.mountsinai.org/
		* Exercise:
		* 1.(//a[normalize-space(text())='Find a Doctor'])[1] (Find a Doctor)
		* 2.(//a[normalize-space(text())='Patient Care'])[1] (Patient Care)
		* 3.(//a[normalize-space(text())='Request an Appointment'])[1] (Request an appointment)

		/* 8) Starts with text
		*Source:https://www.bestbuy.com/
		* Exercise:
		*1.//p[starts-with(text(), 'New deals every day at our lowest prices of the season')] (Deal of the day)
		*2.//p[starts-with(text(), 'Products offered subject to change')] (home page)
		*/

		/* 9) Starts with attribute
		*Source:https://www.bestbuy.com/
		* Exercise:
		*1.//h1[starts-with(@style, 'text-align: center')]
		*2.//p[starts-with(@id,'top')] (services)
		*/
}

