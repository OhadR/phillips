package com.ohadr.phillips;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public abstract class Task implements Runnable 
{
	public  BlockingQueue<Matrix> 	queue = new LinkedBlockingQueue<Matrix>();
	private Task					next;
	private Logger					log = Logger.getLogger( getClass().getName() );
	
	abstract Matrix doProcess(Matrix m);
	
//	public Task( Task nextTask )
//	{
//		next = nextTask;
//	}
	
	public void setNext(Task nextTask)
	{
		next = nextTask;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			Matrix m = null;
			try
			{
				m = queue.take();
			} 
			catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if( m == null)
			{
				//something...
			}
			
			//process the matrix in this task:
			m = doProcess( m );		
	
			//log result of this task
			log.info( m.toString() );
			
			//put the output to the queue of the next task in pipe:
			if(next != null)
			{
				try 
				{
					next.queue.put( m );
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
