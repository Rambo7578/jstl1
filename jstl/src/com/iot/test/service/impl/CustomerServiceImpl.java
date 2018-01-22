package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.iot.test.dao.CustomerDAO;
import com.iot.test.dao.impl.CustomerDAOImpl;
import com.iot.test.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO cdao = new CustomerDAOImpl();
	@Override
	public void setCustomerList(HttpServletRequest req) {
		String target = req.getParameter("target");
		String orderStr = "customerid asc, customername asc,city asc,country asc";
		
		if(req.getParameter("orderStr")!=null) {
			orderStr = req.getParameter("orderStr");
			int fIdx = orderStr.indexOf(target);
			String targetStr = orderStr.substring(fIdx);
			int lIdx = targetStr.indexOf(",");
			String orderType = targetStr.substring(0);
			if(lIdx!=-1) {
				orderType = targetStr.substring(0,lIdx);
			}
			orderStr = orderStr.replace(orderType + ",", "");
			if(orderType.trim().equals(target + " asc")) {
				orderType = " desc,";
			}else {
				orderType = " asc,";
			}
			orderStr = target + orderType + orderStr;
		}
		req.setAttribute("orderStr", orderStr);
		req.setAttribute("customerList",cdao.selectCustomerList(orderStr));
	}

}
