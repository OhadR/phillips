package com.ohadr.phillips;

public class TaskA extends Task {

	@Override
	Matrix doProcess(Matrix m) {
		return m.add( 1 );
	}

}
