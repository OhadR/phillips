package com.ohadr.phillips;

public class TaskB extends Task {

	@Override
	Matrix doProcess(Matrix m) 
	{
		return m.multiply( 8 );
	}

}
