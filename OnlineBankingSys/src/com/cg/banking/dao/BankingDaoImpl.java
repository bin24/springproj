package com.cg.banking.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.banking.dto.Admin;

@Repository
@Transactional
public class BankingDaoImpl implements IBankingDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ArrayList<Admin> retrieveDaily() {
		TypedQuery<Admin> query = entityManager.createQuery("SELECT a FROM Admin a WHERE (trunc(sysdate)=trunc(DateOfTransaction))", Admin.class);
		return (ArrayList<Admin>) query.getResultList();
	}

	@Override
	public ArrayList<Admin> retrieveMonthly() {
		TypedQuery<Admin> query = entityManager.createQuery("SELECT a FROM Admin a WHERE (trunc(sysdate)-trunc(DateOfTransaction)<=30)", Admin.class);
		return (ArrayList<Admin>) query.getResultList();
	}

	@Override
	public ArrayList<Admin> retrieveQuarterly() {
		TypedQuery<Admin> query = entityManager.createQuery("SELECT a FROM Admin a WHERE (trunc(sysdate)-trunc(DateOfTransaction)<=92)", Admin.class);
		return (ArrayList<Admin>) query.getResultList();
	}

	@Override
	public ArrayList<Admin> retrieveYearly() {
		TypedQuery<Admin> query = entityManager.createQuery("SELECT a FROM Admin a WHERE (trunc(sysdate)-trunc(DateOfTransaction)<=365)", Admin.class);
		return (ArrayList<Admin>) query.getResultList();
	}

}
