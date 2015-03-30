package com.ohadr.phillips;

public class Runner {

	public static void main(String[] args) throws InterruptedException 
	{
		PipeManager pipe = new PipeManager();
		pipe.init();
		
		pipe.process( new Matrix( "phillips" ) );
        Thread.sleep(1000);

		pipe.process( new Matrix( "ohadr" ) );
        Thread.sleep(1000);
	}

}
