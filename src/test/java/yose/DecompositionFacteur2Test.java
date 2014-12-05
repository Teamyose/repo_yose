package yose;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DecompositionFacteur2Test {
	@Test
	public void decompostion2Facteur2() throws Exception {
		List<Integer> listeInteger = new ArrayList<Integer>();
		listeInteger.add(2);
		assertEquals(listeInteger, DecompositionFacteur2.decomposer(2));
	}
	
	@Test
	public void decompostion4Facteur2() throws Exception {
		List<Integer> listeInteger = new ArrayList<Integer>();
		listeInteger.add(2);
		listeInteger.add(2);
		assertEquals(listeInteger, DecompositionFacteur2.decomposer(4));
	}
	
	@Test
	public void decompostion16Facteur2() throws Exception {
		List<Integer> listeInteger = new ArrayList<Integer>();
		listeInteger.add(2);
		listeInteger.add(2);
		listeInteger.add(2);
		listeInteger.add(2);
		assertEquals(listeInteger, DecompositionFacteur2.decomposer(16));
	}
}
