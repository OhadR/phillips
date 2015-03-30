package com.ohadr.phillips;

public class Matrix
{
	private String val;

	public Matrix(String s)
	{
		val = s;
	}
	
	public Matrix add(int i)
	{
		return new Matrix( val + "+" + String.valueOf(i) );
	}

	public Matrix decrease(int i) 
	{
		return new Matrix( val + "-" + String.valueOf(i) );
	}

	public Matrix multiply(int i) 
	{
		return new Matrix( val + "x" + String.valueOf(i) );
	}
	
	public String toString()
	{
		return val;
	}

}
