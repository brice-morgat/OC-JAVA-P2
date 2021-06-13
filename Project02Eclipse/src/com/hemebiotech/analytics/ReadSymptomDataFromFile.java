package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public Map<String, Integer> getSymptoms() {
		/**
		 * Read symptoms from file and Map symptom with his occurrence
		 * @return Map of Symptoms
		 */
		ArrayList<String> result = new ArrayList<String>();
		Map<String, Integer> mapSymptoms = new HashMap<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					//Check if symptom is already occurred
					if(!mapSymptoms.containsKey(line)) {
						mapSymptoms.put(line, 1);
					} else {
						mapSymptoms.replace(line, mapSymptoms.get(line) + 1);				
					}
					
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		return mapSymptoms;
	}
}
