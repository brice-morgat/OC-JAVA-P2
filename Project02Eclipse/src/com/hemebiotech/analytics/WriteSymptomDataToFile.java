package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Write symptom data in result file.
 */

public class WriteSymptomDataToFile {
	private String filepath;
	private Map<String, Integer> mapSymptoms;
	
	/*
	 * Constructor
	 * Define filepath and mapSymptoms
	 */
	public WriteSymptomDataToFile(Map<String, Integer> mapSymptoms, String filepath) {
		this.filepath = filepath;
		this.mapSymptoms = mapSymptoms;
	}
	
	/*
	 * Write data in Map to filepath 
	 */
	public void writeData() {
		FileWriter writer;
		try {
			writer = new FileWriter(filepath);
			for (Map.Entry<String, Integer> entry : mapSymptoms.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.err.println(e);
		}	
	}
}
