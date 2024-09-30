package com.controller;

import java.sql.SQLException;

import com.service.Studentservice;

public class Studentcontroller {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Studentservice ss = new Studentservice();
		ss.insertData();
		ss.updateData();
		ss.fetchAllRecords();
		ss.deleteData();
	}
}
