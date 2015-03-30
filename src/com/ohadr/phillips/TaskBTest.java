package com.ohadr.phillips;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskBTest {

	@Test
	public void test() {
		TaskB task = new TaskB();
		Matrix m = new Matrix( "phillips" );
		m = task.doProcess(m);
		fail("Not yet implemented");
	}

}
