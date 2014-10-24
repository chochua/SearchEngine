/*
 
 Carter Davis / Indexer Class
 
 Group 4
 ----------------------
 Carter Davis: Indexer
 Chung Meng Chua: Database
 Austin Washburn: FieldSearch
 Tim Miller: Field
 
 */

package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;

public class Indexer {
	public Database db;
	public String path;
	
	public Indexer(String id) {
		db = new Database();
		path = id;
	    }

	public void add(Field newf) {
		if (path != null) {
			String fieldValue = newf.getFieldValue();
			this.db.add(path, fieldValue);
			}
		}

	void close() {
		path = null;
		}
	
// unnecessary for current version of Engine
//	void remove(Field newf) {
//		if (path != null) {
//			String fieldValue = newf.getFieldValue();
//			this.db.remove(path, fieldValue);
//			}
//		}
	}