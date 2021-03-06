package org.aksw.limes.core.io.preprocessing;

public enum PreprocessingFunctionType {
	CLEAN_IRI, CLEAN_NUMBER, CONCAT, REGEX_REPLACE, REMOVE_LANGUAGE_TAG, RENAME_PROPERTY, 
	REPLACE, TO_CELSIUS, TO_FAHRENHEIT, TO_UPPERCASE, TO_LOWERCASE, REMOVE_BRACES, REMOVE_NON_ALPHANUMERIC, 
	URI_AS_STRING, SPLIT, TO_WKT_POINT
}
