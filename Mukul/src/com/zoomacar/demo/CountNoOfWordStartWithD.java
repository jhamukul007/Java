package com.zoomacar.demo;

public class CountNoOfWordStartWithD 
{
 
	public static int count(String[][] matrix)
	{
		int count=0;
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j].charAt(0)=='h')
				{
					count++;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		String[][] matrix= {{"hgg","bhjb","jhh","hbj"},{"hjh","jjbhjb","bbjhbb","hhj"}};
		int count=count(matrix);
		System.out.println(count);
		
		
	}
	
}
