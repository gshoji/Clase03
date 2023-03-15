package Clase3;

public class Ejer2 {
	
	
public static void main(String[] args) {
		
		int desplazo=1;
		String palabra="abcd";
		char codi[]=new char[100];
		char deco[]=new char[100];
		for(int i=0;i<palabra.length();i++)
		{
			if((palabra.charAt(i))=='z')
			{
				codi[i]='a';
			}
			else
			{
				codi[i]=(char) ((palabra.charAt(i))+desplazo);
			}
		}
		for(int i=0;i<palabra.length();i++)
		{
			if((palabra.charAt(i))=='a')
			{
				deco[i]='z';
			}
			else
			{
				deco[i]=(char) ((palabra.charAt(i))-desplazo);
			}

		}
		System.out.println("Codificacion: ");
		for(int i=0;i<palabra.length();i++)
		{
			System.out.print(codi[i]);
		}
		System.out.println("\nDecodificacion: ");
		for(int i=0;i<palabra.length();i++)
		{
			System.out.print(deco[i]);
		}
		
	
	

	}

}
