package ual.hmis.ejercicio;

import java.util.ArrayList;


public class MultiplesOf3And5 {
	
	public static ArrayList<Integer> multiplesOf3And5 (int numeroLimite) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 3; i < numeroLimite; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result.add(i);
			}
		}
		return result;
	}
}
