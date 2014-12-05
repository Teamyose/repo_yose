package yose;

import java.util.ArrayList;
import java.util.List;

public class DecompositionFacteur2 {
	public static List<Integer> decomposer(int number){
		int compteur = 1;
		List<Integer> listeInteger = new ArrayList<Integer>();
		while(compteur < number){
			listeInteger.add(2);
			compteur = compteur * 2;
		}
		return listeInteger;
	}
}
