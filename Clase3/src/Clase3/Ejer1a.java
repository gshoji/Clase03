package Clase3;

public class Ejer1a {
	
	
	public static void main(String[] args) {
		
		String palabra="araxi";
		char letra='a';
		int cont=0;
		for(int i=0;i<palabra.length();i++)
		{
			
			if(palabra.charAt(i)==letra)
			{
				cont++;
			}
		
		}
		System.out.println("La palabra "+palabra+" contiene "+cont+" letras "+letra);

	}

	

}
