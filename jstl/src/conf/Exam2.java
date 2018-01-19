package conf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.iot.test.common.MybatisSessionFactory;
import com.iot.test.vo.Customer;

public class Exam2 {

	public static void main(String[] args) {
		SqlSessionFactory ssf = MybatisSessionFactory.getSqlSessionFactory();
		SqlSession ss = ssf.openSession();
		Customer c= new Customer();
		c.setCustomerName("김명재");
		c.setCustomerID(1);
		
		System.out.println(ss.update("customer.updateCustomer",c));
		ss.commit();
//		System.out.println(ss.getConnection());
//		System.out.println("연결성공!");
		Map<String,String> map=new HashMap<String,String>();
		map.put("str","customerid desc");
		List<Customer> ctList=ss.selectList("customer.selectCustomer", map);
		for(Customer ct:ctList) {
			System.out.println(ct);
		}
	}

}
