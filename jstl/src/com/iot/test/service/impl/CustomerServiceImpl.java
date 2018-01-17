package com.iot.test.service.impl;



import javax.servlet.http.HttpServletRequest;

import com.iot.test.dao.CustomerDAO;
import com.iot.test.dao.impl.CustomerDAOImpl;
import com.iot.test.service.CustomerService;


public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO cdao=new CustomerDAOImpl();
	
	
	@Override
	public void setCustomerList(HttpServletRequest req) {
		
		
	
		req.setAttribute("customerList",cdao.selectCustomerList(req.getParameter("order")));
		
		
	}
	
}
