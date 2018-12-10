package test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import admin.service.AdminService;
import product.vo.Product;
import user.vo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
public class ProjectTest {
	
	
	@Autowired
	AdminService service;

	@Autowired
	ApplicationContext context;
	
	@Test @Ignore
	public void testDBConn() {
		DataSource ds = context.getBean("dataSource", DataSource.class);
		try {
			System.out.println(ds.getConnection());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test @Ignore
	public void ProductInsert() {
		service.insertProduct(new Product("c", "b", 33, "스페인", "2015-01-15","치즈",0, "wine122.jpg"));
		
	}
	@Test
	public void ListUser() {
		List<User> userList = service.getUserList();
		System.out.println(userList);
		for(User u : userList) {		
			System.out.println(u);
		}
		
		
	}
	@Test @Ignore
	public void DeleteUser() {
		service.deleteUser(1);
	}
}
