package com.cg.banking.service;

import java.util.ArrayList;

import com.cg.banking.dto.Admin;

public interface IBankingService {

	ArrayList<Admin> retrieveDaily();

	ArrayList<Admin> retrieveMonthly();

	ArrayList<Admin> retrieveQuarterly();

	ArrayList<Admin> retrieveYearly();

}
