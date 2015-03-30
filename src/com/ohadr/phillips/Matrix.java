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
		return new Matrix( val + String.valueOf(i) );
	}

	public Matrix decrease(int i) 
	{
		return add( -i );
	}

	public Matrix multiply(int i) 
	{
		return this;
	}
	
	public String toString()
	{
		return val;
	}

}
