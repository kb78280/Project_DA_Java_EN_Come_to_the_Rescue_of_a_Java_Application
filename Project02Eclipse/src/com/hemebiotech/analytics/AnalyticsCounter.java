
package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author bensedira khalid
 *
 */

public class AnalyticsCounter {

	static File doc = new File("symptoms.txt");
	static List<String> list = new ArrayList<String>();
	static Map<String, Integer> map = new HashMap<String, Integer>();

	/**
	 * File.txt Analyzes counts occurrences Sort in natural order generate a file
	 * (results.out.txt)
	 * 
	 * @throws IOException relative to class3 - Signals that an I/O exception of
	 *                     some sort has occurred. This class is the general class
	 *                     of exceptions produced by failed or interrupted I/O
	 *                     operations.
	 */
	public static void main(String[] args) throws IOException {

		Class1.readDoc(doc, list); // File.txt Analyzes

		Class2.calculOcc(list, map); // counts occurrences

		Class3.docOut(map);// Sort in natural order and generate a file

	}

}
