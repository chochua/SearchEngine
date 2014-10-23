package org.uiowa.cs2820.engine;

import java.util.HashMap; // imaginary storage??
import java.util.Set;     // for method showallname()
import java.util.List;
import java.util.ArrayList;

// University of Iowa 
// CS:2820:AAA Object-Oriented Software Development
// Fall 2014 
// Fourth Project Assignment
// Database for SearchEngine

// Team 4
// Austin Washburn - FieldSearch
// Tim Miller      - Field
// Carter Davis    - Indexer
// Chong Meng Chua - Database


public class Database<E,T> {	  
	private HashMap<String,String> storage;    
	// Constructor
	public Database() {
		storage = new HashMap<String,String>();	
	}	
	// insert value to name
	public void add(String name, String value) {
		storage.put(name, value);
	}
	// remove value
	public void remove(String name, String value) {		
		storage.put(name, null);
	}
	// format the database, use with care
	public void reset() {
		storage.clear();
	}
	// search for value, returning name
	public HashMap<String, String> get() {
		return storage;
	}
	// show all name in database
	public Set<String> showallPath() {
		// throw exception if empty
		return storage.keySet();
	}
	// check whether database is empty
	public boolean isEmpty() {
		return storage.isEmpty();
	}
	// check whether name in database
	public boolean containsPath(String name) {
		return storage.containsKey(name);
	}
	// return size of database
	public int size() {
		return storage.size();
	}
	
	public static void main(String[] args) {}
}
