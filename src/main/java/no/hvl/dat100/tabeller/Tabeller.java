package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.print(i);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		if (tabell == null || tabell.length == 0) {
			return "[]";
		}
		
		String resultat = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];
			
			if (i < tabell.length - 1) {
				resultat += ",";
			}
		}
		resultat += "]";
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length;) {
			sum = sum + tabell[i];
			i++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0;i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return true;
			} 
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

int[] reversertTabell = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length -1 -i];
		}
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = false;
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return sortert;
			}
		}
		sortert = true;
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

			int[] sammenTabell = new int[tabell1.length + tabell2.length];
			
			for (int i = 0; i < tabell1.length; i++) {
				sammenTabell[i] = tabell1[i];
			}
			for (int i = 0; i < tabell2.length; i++) {
				sammenTabell[tabell1.length + i] = tabell2[i];
			}
			return sammenTabell;
	}
}
