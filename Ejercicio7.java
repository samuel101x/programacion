package ejerciciosstring;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Ejercicio 7
		String frase1 = "Esta es una frase con varios epacios";
		
		int a=0;
		for (int i=0; i<frase1.length();i++) {
				if (frase1.charAt(i)==' ') {
					a++;
				
				if(a==1 || a==3) {
					System.out.println("este es el espacio numero: " + a + "que esta en las poscicion: " + (i+1));
				}
				}
			}
		}
	}
