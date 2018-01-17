//package com.iot.test.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import java.sql.Connection;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//
//import com.iot.test.dao.MenuDAO;
//import com.iot.test.dao.impl.MenuDAOImpl;
//import com.iot.test.vo.Menu;
//
//class ConTest {
//	@Test
//	void testGetCon() {
//		//assertEquals(null,DBConTest.getCon());
//		//assertNotEquals(null, DBConTest.getCon());
//	}
//	
//	@Test
//	void selectMenuList() {
//		MenuDAO mdao = new MenuDAOImpl();
//		assertNotEquals(null,mdao);
//		List<Menu> mList = mdao.selectMenuList();
//		assertNotEquals(null,mList);
//		
//		assertEquals(3,mList.size());
//	}
//	
//}
