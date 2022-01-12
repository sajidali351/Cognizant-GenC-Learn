package com.cts.rainbowjewellers.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
	private double gram;
	private double expectedgoldprice;
	private RainbowJewellersService service = new RainbowJewellersService();

	public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
		super();
		this.gram = gram;
		this.expectedgoldprice = expectedgoldprice;
	}

	@Parameterized.Parameters
	   public static Collection goldGramPrice() {
	      return Arrays.asList(new Object[][] {
	         { 9.6, 48401.76 },
	         { 56, 282343.6 },
	         { 24.5, 123525.325 },
	         { 0, 0.0 },
	         { -1, 0.0 }
	      });
	   }
	
	@Test
	public void testCalculateGoldPrice() {
	     //fill code here
		assertEquals(expectedgoldprice, service.calculategoldprice(gram), 0.01);
		
	}

}
