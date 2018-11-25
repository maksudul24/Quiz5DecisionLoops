package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MainClass6;

class testClass {
	MainClass6 test= new MainClass6(); 
	@Test
	void test() {
		assertEquals(40.0,test.answer6(120),"");
		assertEquals(5.0,test.answer6(15),"");
		assertEquals(97,test.answer7(3),"");
		assertEquals(95,test.answer7(2),"");
		assertEquals(-1,test.answer7(96),"");
		
	}

}
