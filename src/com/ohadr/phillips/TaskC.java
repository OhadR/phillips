package com.ohadr.phillips;

public class TaskC extends Task {

	@Override
	Matrix doProcess(Matrix m)
	{
		return m.decrease( 4 );
	}

}
