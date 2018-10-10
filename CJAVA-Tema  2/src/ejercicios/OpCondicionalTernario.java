package ejercicios;

public class OpCondicionalTernario {
	public static void main(String[] args) {
		int i, j, k;
		i = 1;
		j = 2;
		k = i > j ? 2 * i : 3 * j + 1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		i = 2;
		j = 1;
		k = i > j ? 2 * i : 3 * j + 1;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	} 
}
