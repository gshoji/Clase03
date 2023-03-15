package Clase3;

public class Ejer1c {
	
	public static void main(String[] args) {
		
		int vector[]=new int[] {4,5,3,5,1,7,8,9,5,3};
		int num=5;
		int sum=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]==num)
			{
				sum+=num;
			}
		}
		System.out.println(sum);

	}

}
