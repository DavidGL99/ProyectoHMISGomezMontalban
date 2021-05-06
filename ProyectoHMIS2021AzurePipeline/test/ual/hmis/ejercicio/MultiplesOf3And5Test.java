package ual.hmis.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MultiplesOf3And5Test {
	
	@Test
	void test1() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 9, 10, 12, 15, 18));
		assertEquals(list, MultiplesOf3And5.multiplesOf3And5(20));
	}
	@Test
	void test2() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 9, 10, 12, 15));
		assertEquals(list, MultiplesOf3And5.multiplesOf3And5(17));
	}
	@Test
	void test3() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25, 27, 30));
		assertEquals(list, MultiplesOf3And5.multiplesOf3And5(32));
	}
	@Test
	void test4() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3));
		assertEquals(list, MultiplesOf3And5.multiplesOf3And5(5));
	}
	@Test
	void test5() {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25, 27, 30, 33, 35, 36, 39));
		assertEquals(list, MultiplesOf3And5.multiplesOf3And5(40));
	}

}
