package com.hemebiotech.analytics;
/**
 * 
 * This is the main file
 *
 */
public class AnalyticsCounter {
	/**
	 * Set static pathfile 
	 */
	public static final String SYMPTOMS_TXT = "symptoms.txt";
	public static final String RESULT_OUT = "result.out";

	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
		WriteSymptomDataToFile writeSymptom = new WriteSymptomDataToFile(readSymptom.getSymptoms(), RESULT_OUT);
		writeSymptom.writeData();
	}
}