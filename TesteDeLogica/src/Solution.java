
public class Solution 
{
	
	public int solution(int[] A)
	{
		int atual;
		boolean possuiPar;
		
		for(int i = 0; i < A.length; i++)
		{
			atual = A[i];
			possuiPar = false;
			
			int j = 0;
			while(j < A.length)
			{
				if(j != i && A[j] == A[i])
					possuiPar = true;
				
				j++;
			}
			
			if(!possuiPar)
				return atual;
		}
		
		return 0;
		
	}

}
