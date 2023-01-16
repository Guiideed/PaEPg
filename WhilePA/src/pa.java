//Pa e Pg usando Java
public class pa {
	public static void main(String []args) {
		int inicial = 1,
			razao = 3,
			an = inicial,
			valorMax = 20,
			quociente= 2,
			gn = inicial,
			valorMax2 = 32;
					
		System.out.printf("Elementos da PA, de valor inicial %d e razao %d, menores que %d",inicial,razao,valorMax);
		while (an<= valorMax) {
			System.out.println(an);
			an+= razao;}
			
		System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valorMax2);
		while (gn<=valorMax2) {
			System.out.println(gn);
			gn*=quociente;
			
		}
			
			
			
	
	}
		
}


