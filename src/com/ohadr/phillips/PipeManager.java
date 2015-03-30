package com.ohadr.phillips;

import java.util.ArrayList;
import java.util.List;


public class PipeManager 
{
	private Task 				first;

	//maintain list of tasks, just in case...
	private List<Task>			tasks = new ArrayList<Task>(); 
	
	public void init()
	{
		//build pipe:
		buildPipe();
	
		
		//start all threads:
		for(Task t : tasks)
		{
	        new Thread( t ).start();
		}
	}
	
	private void buildPipe() 
	{
		//get a list of ...
		tasks.add(new TaskA());
		tasks.add(new TaskB());
		tasks.add(new TaskC());
		
		first = tasks.get(0);
		Task previous = tasks.get(0);
		for(Task t : tasks)
		{
			if( t==previous)
				continue;
			previous.setNext( t );
			previous = t;			
		}
	}

	public void process(Matrix m)
	{
		try 
		{
			first.queue.put( m );
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
