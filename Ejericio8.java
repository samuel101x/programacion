package ejerciciosstring;

public class Ejericio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1 ="Este ejercicio es el primero de cuenta de letras";
		int a=0;
		for (int i= 0;i<frase1.length();i++) {
			
			if(frase1.charAt(i) == 'e' || frase1.charAt(i) == 'E' ) {
				a=a+1;
				
			}
		}
		System.out.println("Hay: " + a + " letras e en esta frase" );

	}

}
