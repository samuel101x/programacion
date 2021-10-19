package ejerciciosstring;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1 = "Hola, me voy a tomar una olanzapina, por cierto, mira esa ola .";
		String frasefinal = "";
		
		for(int i=0; i<frase1.length();i++) {
			
			if((frase1.charAt(i) == 'o' || frase1.charAt(i) == 'O') && frase1.charAt(i-1) == ' ') {
				
				if(frase1.charAt(i+1) == 'l' && frase1.charAt(i+2) == 'a' && frase1.charAt(i+3) == ' ') {
					
					frasefinal = frase1.substring(0, i);
					frasefinal = frasefinal + "nube" + frase1.charAt(i+3) + frase1.substring(i+4, frase1.length());
					frase1 = frasefinal;
				}
			}
		}
	
		System.out.println(frasefinal);
	}

}
