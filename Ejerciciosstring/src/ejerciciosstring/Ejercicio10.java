package ejerciciosstring;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1="locomotora";
		String minusculas="";
		String mayusculas="";
		String frasefinal="";
		int a = 0;
		
		a = frase1.length();
		
		if(a % 2 == 0)	{
			
			a = frase1.length() / 2;
//			Para las mayusculas
			mayusculas = frase1.substring(0 , a);
			mayusculas = mayusculas.toUpperCase();
			frasefinal = mayusculas;
			
//			Parte minusculas
			minusculas = frase1.substring(a , frase1.length());
			minusculas = minusculas.toLowerCase();
			frasefinal = frasefinal + minusculas;
					
			System.out.println(frasefinal);
			
		}

	}

}
