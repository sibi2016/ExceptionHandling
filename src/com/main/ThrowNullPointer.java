

package com.main;

public class ThrowNullPointer {
	
	// This is to demonstrate the Null Pointer Exception and how to handle it
	
	public String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void print()
	{
		try{
		System.out.println("Name :"+name+ " has length " + name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception occurred");
		}
		finally
		{
			// will always execute
			System.out.print("Exception handled");
		}
	}
	
	public static void main(String[] args){
		
		ThrowNullPointer np = new ThrowNullPointer();
		//np.setName("Sibi");
		np.print();
	}

}
