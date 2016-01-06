package org.wbw.networksearch.abstractsearcherutils;

import org.wbw.networksearch.abstractsearcherutils.DataCollector_Interface;

public interface StringStorageProvider_Interface<S> {
	
	public S getStringHolder();
	public S getStringHolder(int minimumCapacity);
	public void returnStringHolder(S stringStorage);
	
	public Boolean isStringIn(String toFind, S toFindIn);

}
