package com.hashcode.demo;

public class Human
{
  public int aadharcardno;
  public String name;
  
  public Human(int aadharcardno,String name) {
	  this.aadharcardno=aadharcardno;
	  this.name=name;
	  
	  
	  
  }
  public boolean equals(Human anotherhuman) {
	  
	  if(this.aadharcardno!=anotherhuman.aadharcardno) {
		  return false;
	  }
	  
	  if(!this.name.equals(anotherhuman.name)) {
		  return false;
	  }

	  return true;
	
}
  
 
  
  
  
  
  
  
  

	
	
	
	
	
	
	
	
	
	
	
}
