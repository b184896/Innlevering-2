package no.hvl.dat100.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		
		int[][] i = {{1,2,3}, {3,2,1}, {2,3,1}};
		
		System.out.println(i[0][0]);
		skrivUt(i);
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] s: matrise)
			for (int i: s)
				System.out.print(i);
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		if (matrise == null || matrise.length== 0) {
			return "[]";
		}
		String resultat = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length;j++) {
				
			resultat += matrise[i][j];
			
			if (j < matrise[i].length - 1) {
			resultat += " ";
			}
		}
			if (i < matrise.length -1) {
				
			resultat += "\n";
			}
		}
		return resultat;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int i = matrise.length;
		int j = matrise[0].length;
		
		int[][] nyMatrise = new int[i][j];
		
		for (int a = 0; a < i; a++) {
			for (int b = 0; b < j; b++) {
				nyMatrise[a][b] = matrise[a][b] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a == b) {
			return true;
		}
		return false;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
