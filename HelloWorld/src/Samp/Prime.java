package Samp;

public class Prime {
	//int count = 0;
	//int[] numbers;
	public void primeCalc (int a) {
		
		
		
		
		for (int i = 2; i<a; i++) {
			
			for (int j = 2; j<=i;j++) {
				
				/*if (j == i && i % j == 0) {
					
					System.out.println(i);
			
				}
				
				else {
					
					//numbers[count] = i;
					//count++;
					continue;
					//System.out.println(i);
					
					
				}*/
				
				if (i % j == 0) {
					
					if (i == j) {
						
						System.out.println(i);
					}
					
					else {
						
						break;
					}
				}
				
			}
			
		}
		
		/*for (int x : numbers) {
			
			System.out.println(numbers[x]);
			
		}*/
		
		/*public void primeCheck(int f)
		{
			for(int i = 2; i <= f; i++)
			{
				if(i != f && i % f == 0)
				{
					System.out.println("not a prime");
				}
				else
				{
					System.out.println(f + " is prime");
				}
			}
		}*/
	}

}
