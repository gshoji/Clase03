package Clase3;

public class Ejer1b {
public static void main(String[] args) {
		
		int n1=5;
		int n2=6;
		int n3=1;
		String orden="descendente";
		int vector[]=new int[3];
		
	
			if((n1>=n2)&&(n1>=n3))
			{
				vector[0]=n1;
				if(n2>=n3)
				{
					vector[1]=n2;
					vector[2]=n3;
				}
				else 
				{
					vector[1]=n3;
					vector[2]=n2;
				}
				
			}
			else if((n2>=n1)&&(n2>=n3))
			{
				vector[0]=n2;
				if(n1>=n3)
				{
					vector[1]=n1;
					vector[2]=n3;
				}
				else 
				{
					vector[1]=n3;
					vector[2]=n1;
				}
				
			}
			else if((n3>=n1)&&(n3>=n2))
			{
				vector[0]=n3;
				if(n2>=n1)
				{
					vector[1]=n2;
					vector[2]=n1;
				}
				else 
				{
					vector[1]=n1;
					vector[2]=n2;
				}
				
			}
		if(orden.equals("descendente"))
		{
			for(int i=0;i<vector.length;i++)
			{
				System.out.println(vector[i]);
			}

		}
		else
		{
			for(int i=2;i>=0;i--)
			{
				System.out.println(vector[i]);
			}

		}


	}


}
