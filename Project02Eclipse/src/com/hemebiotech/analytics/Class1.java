
package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * @author bensedira khalid
 *
 */
public class Class1 {

	/**
	 * File.txt Analyzes and put in a Arraylist type container
	 * 
	 * @param doc  -> String variable containing the file path to analyze
	 * @param list -> Arraylist type container. Contains each line read
	 */

	public static void readDoc(File doc, List<String> list) {
		if (doc != null) {

			try {
				BufferedReader br = new BufferedReader(new FileReader(doc));

				String line = null;
				while ((line = br.readLine()) != null) {
					list.add(line);
				}
				br.close();

			} catch (IOException e) {
				System.err.println("Unable to read the file."); // Error message
			}
		}
		System.out.println(doc + " : reading ->  Ok");
	}
}
