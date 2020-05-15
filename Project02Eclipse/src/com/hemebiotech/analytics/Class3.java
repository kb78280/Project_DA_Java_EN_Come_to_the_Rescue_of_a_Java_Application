package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author bensedira Khalid
 *
 */

public class Class3 {

	/**
	 * Sort in natural order and generate a file with results
	 * 
	 * newmap : Object type TreeMap<String, Integer>. Constructs a new, empty tree
	 * map, using the natural ordering of its keys.
	 * 
	 * 
	 * @param map : Object type Map<String, Integer>. parameters String -> key = w (
	 *            words list) parameters Integer -> values = i ( occurrences )
	 * 
	 * @throws IOException : Signals that an I/O exception of some sort has
	 *                     occurred.
	 */
	static void docOut(Map<String, Integer> map) throws IOException {

		Map<String, Integer> newmap = new TreeMap<String, Integer>(map); // Sort map in natural order in the TreeMap

		File doc2 = new File(" results.out.txt"); // String variable containing the file path to generate

		BufferedWriter writOut = null;
		try {
			writOut = new BufferedWriter(new FileWriter(doc2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : newmap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			writOut.write(key + " = " + value + System.getProperty("line.separator"));
		}
		System.out.println("New File Create: " + doc2);
		System.out.println("File location: " + doc2.getAbsolutePath());

		writOut.flush();
		writOut.close();

	}

}
