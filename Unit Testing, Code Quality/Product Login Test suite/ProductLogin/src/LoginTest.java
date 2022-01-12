import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;


public class LoginTest {
 	 
	LoginDAO dao = new LoginDAO();
	Login login = new Login("kumar007", "007");
	//Login login1 = null;
      //Write the code for adding and deleting Login data
	@Test
	public void testAdd() {
		assertEquals(0, dao.loginlist.size());
		assertFalse(dao.addLogin(null));
		assertEquals("kumar007", login.getUserName());
		assertEquals("007", login.getPassword());
		assertTrue(dao.addLogin(login));
	}
	
	
			
	@Test
	public void testDelete() {
	    assertFalse(dao.deleteLogin(null));
	    login.setUserName("Ali");
		login.setPassword("A007");
		dao.addLogin(login);
		assertEquals(1, dao.loginlist.size());
		assertTrue(dao.deleteLogin(login));
	}
  
}

