import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class ProductTest {

 //Write the code for test methods
	ProductDAO dao = new ProductDAO();
	Product product = new Product("1", "Pen", 50.0);
	//Product product1 = null;
	
	@Test
	public void testAddProduct() {
		assertEquals(0, dao.productlist.size());
		assertFalse(dao.addProduct(null));
		assertEquals("1", product.getProductId());
		assertEquals("Pen", product.getProductName());
		assertEquals(50.00, product.getPrice(), 0.1);
		assertTrue(dao.addProduct(product));
	}
	
	@Test
	public void testDeleteProduct() {
	    Product product2 = new Product();
	    assertFalse(dao.deleteProduct(null));
		product2.setProductId("2");
		product2.setProductName("Book");
		product2.setPrice(100.00);
		dao.addProduct(product2);
		assertTrue(dao.deleteProduct(product2));
	}
	
	

}
