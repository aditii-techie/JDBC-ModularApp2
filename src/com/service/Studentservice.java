package com.service;

import java.sql.SQLException;

import com.dao.Studentdao;

public class Studentservice {
	public void insertData() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.insertData();
	}
	
	public void updateData() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.updateData();
	}
	
	public void fetchAllRecords() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.fetchAllRecords();
	}
	
	public void deleteData() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.deleteData();
	}
}
