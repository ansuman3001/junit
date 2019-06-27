package com.lti.junit;

public class MyMath 
{
	public MyMath()
	{
		
	}
	int sum(int[]numbers)
	{
		int sum=0;
		for(int i:numbers)
		{
			sum=sum+i;
		}
		return sum;
	}

}
