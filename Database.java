package org.uiowa.cs2820.engine;

import java.util.ArrayList; // Imaginary storage

// temporary ignore the error, will brush it up
// Use object <> ??
public class Database {
	// Constructor  
	private ArrayList storage;    
	
	public Database() {
		storage = new ArrayList(); 
	}
	
	// get the item with the given index
	
	public String getFromIndex(int index){
		String result =(String) storage.get(index);
		return result;
	}
	
	
	// size
	// public size()
	
	// set index
	public setIndex(item, index) {}
	
	// add/remove, needed?
	// add to storage
	public add {}	
	// remove from storage
	public remove {}
	
	public static void main(String[] args) {}
}
