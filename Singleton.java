package com.org.coding_questions;

public class Singleton {

	private static volatile Singleton instance;
	
	private Singleton() {
		if(instance!=null) {
			throw new IllegalStateException("Singleton already initialized.");
		}
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
