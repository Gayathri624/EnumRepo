package com.cg.enums;

public class Region {
	
	enum Direction
	{
		NORTH,SOUTH,EAST,WEST;
	}
	
	public static void main(String[] args)
	{
	
		Direction dir = Direction.NORTH; 
		
		if(dir == Direction.EAST) 
		{
		    System.out.println("Direction: East");
		}
		else if(dir == Direction.WEST) 
		{
		    System.out.println("Direction: West");
		  } 
		else if(dir == Direction.NORTH)
		{
		      System.out.println("Direction: North");
	  	}
		else if(dir == Direction.SOUTH)
	  	{
			System.out.println("Direction: South");
		
	  	}
	switch(dir)
	{
	case EAST:
        System.out.println("In East Direction");
        break;
                  
     case WEST:
        System.out.println("In West Direction");
        break;
                       
     case NORTH: 
        System.out.println("In North Direction");
        break;
                      
     case SOUTH:
        System.out.println("In South Direction");
        break;
	}
}


	}
