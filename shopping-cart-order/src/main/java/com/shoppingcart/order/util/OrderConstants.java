/**
 * 
 */
package com.shoppingcart.order.util;

/**
 * @author root
 *
 */
public interface OrderConstants {

	/**
	 * This enum will contain all the date formats.
	 * 
	 * @author Chetan
	 *
	 */
	public enum DateFormat {
		DATE_FORMAT_YYYY_MM_DD("yyyy-mm-dd");
		
		private String format;
		
		private DateFormat(String format) {
			this.format = format;
		}
		
		public String getFormat() {
			return this.format;
		}
	}
	/**
	 * Date format in yyyy-mm-dd.
	 */
	static String DATE_FORMAT_YYYY_MM_DD = "yyyy-mm-dd";
}
