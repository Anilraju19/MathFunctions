package com.functions.math.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathControllerTest {
	
	MathController mathController=new MathController();

	@Test
	void testAddition() {
		assertEquals(9, mathController.addition(4, 5));
		assertEquals(0, mathController.addition(5, -5));
		assertTrue(mathController.addition(500,89)==589);
		assertTrue(mathController.addition(-200,-400)==-600);
		assertFalse(mathController.addition(100,200)==500);
		assertFalse(mathController.addition(-100,-100)==0);
	}

}
