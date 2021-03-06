package com.structure;

import java.io.Serializable;
import java.time.LocalDate;

public class Task extends Unit implements Serializable {
	
	private int moduleID;

	public Task(LocalDate deadline, LocalDate start, String description, StatusC.stat s, int id,String name, Module mod) throws Exception{
		super(deadline, start, mod.getManager(), description, s, id, name);
		// TODO Auto-generated constructor stub
		if(deadline.compareTo(mod.getDeadline())<0)
			throw new Exception("blad daty");
		
		moduleID = mod.getID();
	}

	//TYLKO DO TESTOW
	public Task(LocalDate deadline, LocalDate start, String description, StatusC.stat s, int id,String name) throws Exception{
		super(deadline, start, null, description, s, id, name);
		// TODO Auto-generated constructor stub
		//if(deadline.compareTo(mod.getDeadline())<0)
		//	throw new Exception("blad daty");

		//moduleID = mod.getID();

	}
	
	public int getModId()
	{
		return moduleID;
	}

	@Override
	public String getRaport() {
		// TODO Auto-generated method stub
		return "Zadanie [deadline=" + deadline + ", manager=" + manager + ", description=" + description + "]";
	}

	public String getShortcut()
	{
		return "Zadanie - "+ name +" | Status: "+ s;
	}

	@Override
	public String toString() {
		return "Zadanie "+ name +" | Status: "+ s + " | " + deadline;
	}

	public int getModuleID() {
		return moduleID;
	}
	
	
	
	


}
