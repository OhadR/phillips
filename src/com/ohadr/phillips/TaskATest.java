package com.ohadr.phillips;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ohadr.phillips.Matrix;
import com.ohadr.phillips.TaskA;

public class TaskATest {

	@Test
	public void testDoProcess() 
	{
		TaskA task = new TaskA();
		Matrix m = new Matrix( "phillips" );
		task.run();
	}

}
