package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty Map
	 * 
	 * @return a map of all Symptoms obtained from a data source, with the symptom's name and his occurrence
	 */
	Map<String, Integer> getSymptoms ();
	
}
