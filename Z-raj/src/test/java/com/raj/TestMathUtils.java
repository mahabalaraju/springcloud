package com.raj;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import com.raj.entity.MathUtils;

public class TestMathUtils {

	@BeforeAll
	 static void teaa() {
		System.out.println("executes before everyother methods");
	}
	
	@AfterAll
	 static void tea() {
		System.out.println("executes after every methods executes");
	}
	
	@BeforeEach
	void ta() {
		System.out.println("executes before each method execution");
	}
	
	@AfterEach
	void te() {
		System.out.println("executes after each method execution");
	}
	@Test
	// @Disabled
	@DisplayName("add method")
	void testadd() {
		MathUtils math = new MathUtils();
		int expected = 2;
		int actual = math.sum(1, 1);
		assertEquals(expected, actual);
	}
	
	@DisplayName("nested class for add method")
	@org.junit.jupiter.api.Nested
	class addtest{
		@Test
		@DisplayName("add method positive")
		void testaddpositive() {
			MathUtils math = new MathUtils();
			int expected = -2;
			int actual = math.sum(-1, -1);
			assertEquals(expected, actual);
		}

		
		@Test
		@DisplayName("add method negative")
		void testaddnegative() {
			MathUtils math = new MathUtils();
			int expected = 2;
			int actual = math.sum(1, 1);
			assertEquals(expected, actual);
		}
	}
	@Test
	@DisplayName("divide Method")
	void testdivide() {
		MathUtils math = new MathUtils();
		double expected = Double.NaN;
		// String expected="Infinity";
		double actual = math.divide(0, 0);
		assertEquals(expected, actual, "should return right value");

	}

	@Test
	void testmultiply() {
     MathUtils math=new MathUtils();
     double expected = Double.NaN;
  assertAll(
   () ->assertThrows(ArithmeticException.class, ()->math.divide(1, 0),"divide by zero"),
	()->assertEquals(expected, math.divide(0, expected),"we want to check the result")

		  );
	}

	@Test
	void testsubtract() {
		MathUtils math = new MathUtils();
		int Expected = -1;
		assertEquals(Expected, math.subtract(-1, 0), "Hi everyone.");
	}
}
