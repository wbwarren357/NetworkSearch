package org.wbw.networksearch.abstractsearcherutils;

public interface WorkQueue_Interface<S> {

	public Boolean isNextPath();
	public StringStorageProvider_Interface<S> dequeueNextWorkItem();
	public StringStorageProvider_Interface<S> queueWorkItem();
	
}
