package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.iot.test.dao.CustomerDAO;
import com.iot.test.dao.impl.CustomerDAOImpl;
import com.iot.test.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO cdao = new CustomerDAOImpl();

	@Override
	public void setCustomerList(HttpServletRequest req) {
		String orderStr = "customerid asc, customername asc, city asc, country asc";
		String target = req.getParameter("target");
		if (req.getParameter("orderStr") != null) {
			orderStr = req.getParameter("orderStr");
			int fIdx = orderStr.indexOf(target);
			String orderTarget = orderStr.substring(fIdx);
			int lIdx = orderTarget.indexOf(",");
			if (lIdx != -1) {
				orderTarget = orderTarget.substring(0, lIdx + 1);
				orderStr = orderStr.replace(orderTarget, "");

			} else {
				orderStr = orderStr.replace("," + orderTarget, "");
				orderTarget = orderTarget + ",";
			}

			if (orderTarget.indexOf("asc") != -1) {
				orderTarget = orderTarget.replace("asc", "desc");
			} else {
				orderTarget = orderTarget.replace("desc", "asc");
			}
			orderStr = orderTarget + orderStr;
		}

		req.setAttribute("customerList", cdao.selectCustomerList(req.getParameter("target")));

	}

}
