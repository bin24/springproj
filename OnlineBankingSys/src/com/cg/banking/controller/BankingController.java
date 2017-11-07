package com.cg.banking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.banking.dto.Admin;
import com.cg.banking.service.IBankingService;

@Controller
public class BankingController {
	
	@Autowired
	private IBankingService bankingService;
	
	
	public IBankingService getBankingService() {
		return bankingService;
	}


	public void setBankingService(IBankingService bankingService) {
		this.bankingService = bankingService;
	}
	
	@RequestMapping("/index")
	public String start(){
		return "index";
	}
	/*public String start(Model m){
		List<Admin> list = new ArrayList<Admin>();
		
		m.addAttribute("DailyTransactionsList",list);
		m.addAttribute("MonthlyTransactionsList",list);
		m.addAttribute("QuarterlyTransactionsList",list);
		m.addAttribute("YearlyTransactionsList",list);
		
		return "index";
	}*/

	/*@RequestMapping("/daily")
	public String viewdaily(){
		return "test";
	}*/

	@RequestMapping("/daily")
	public ModelAndView viewDailyTransactions()
	{
		
		ArrayList<Admin> list=new ArrayList <Admin>();
		list = bankingService.retrieveDaily();
		for(Admin ob:list){
			System.out.println(ob);
			/*String dot = ob.getDateOfTransaction();
			ob.setDateOfTransaction(dot.toString());
		*/
		}
		
		
		return new ModelAndView("index","DailyTransactionsList",list);		
	}
	
	@RequestMapping("/monthly")
	public ModelAndView viewMonthlyTransactions()
	{
		
		ArrayList<Admin> list=new ArrayList <Admin>();
		list = bankingService.retrieveMonthly();
		return new ModelAndView("index","MonthlyTransactionsList",list);		
	}
	
	@RequestMapping("/quarterly")
	public ModelAndView viewQuarterlyTransactions()
	{
		
		ArrayList<Admin> list=new ArrayList <Admin>();
		list = bankingService.retrieveQuarterly();
		return new ModelAndView("index","QuarterlyTransactionsList",list);		
	}
	
	@RequestMapping("/yearly")
	public ModelAndView viewYearlyTransactions()
	{
		
		ArrayList<Admin> list=new ArrayList <Admin>();
		list = bankingService.retrieveYearly();
		return new ModelAndView("index","YearlyTransactionsList",list);		
	}
}
