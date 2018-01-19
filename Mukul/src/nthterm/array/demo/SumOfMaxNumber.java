package nthterm.array.demo;

public class SumOfMaxNumber
{
	static int max(int number)
    {
		int f=number/10;
    	int l=number%10;
    	
    	int sum=f+l;
    	int num=number,newSum=0;
        for(int i=10;i<number;i++)
        {
        	int sum1=(i/10)+(i%10);
        	if(sum1>sum )
        	{
        		num=i;
        		if(sum1>newSum)
        		{
        			num=i;
        			newSum=sum1;
        		}
        		newSum=sum1;
        	}
        	
        }
        return num;
        
 
}
	
public static void main(String[] args) {
	System.out.println(max(80));
	System.out.println(max(48));
}
}