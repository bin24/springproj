package com.cg.banking.dao;

import java.util.ArrayList;

import com.cg.banking.dto.Admin;

public interface IBankingDao {

	ArrayList<Admin> retrieveDaily();

	ArrayList<Admin> retrieveMonthly();

	ArrayList<Admin> retrieveQuarterly();

	ArrayList<Admin> retrieveYearly();

}
