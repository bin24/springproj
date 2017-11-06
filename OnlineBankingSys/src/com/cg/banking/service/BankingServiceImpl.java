package com.cg.banking.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.banking.dao.IBankingDao;
import com.cg.banking.dto.Admin;

@Service
public class BankingServiceImpl implements IBankingService{

	@Autowired
	private IBankingDao bankingDao;
	
	
	public IBankingDao getBankingDao() {
		return bankingDao;
	}


	public void setBankingDao(IBankingDao bankingDao) {
		this.bankingDao = bankingDao;
	}


	@Override
	public ArrayList<Admin> retrieveDaily() {
		
		return bankingDao.retrieveDaily();
	}


	@Override
	public ArrayList<Admin> retrieveMonthly() {
		return bankingDao.retrieveMonthly();
	}


	@Override
	public ArrayList<Admin> retrieveQuarterly() {
		return bankingDao.retrieveQuarterly();

	}


	@Override
	public ArrayList<Admin> retrieveYearly() {
		return bankingDao.retrieveYearly();

	}

}
