package com.github.hydrazine.module;

import java.util.Scanner;

import com.github.hydrazine.Hydrazine;

/**
 * 
 * @author xTACTIXzZ
 * 
 * This class has the purpose of simplifying the configuration process of a module.
 *
 */
public class ModuleHelper
{

	private Scanner sc = null;
	
	public ModuleHelper()
	{
		sc = new Scanner(System.in);
		
		/*
		 * Maybe I will add more to this class later.
		 */
	}
	
	/**
	 * Asks the user a question
	 * @param question the question to ask
	 * @return the answer from the user
	 */
	public String askUser(String question)
	{		
		System.out.println(Hydrazine.inputPrefix + question);
		
		String reply = sc.nextLine();
				
		return reply;
	}
	
	/**
	 * Asks the user a yes/no question
	 * @param question the question to ask
	 * @return the answer from the user, true=yes; false=no
	 */
	public boolean askUserYesNo(String question)
	{
		System.out.print(Hydrazine.inputPrefix + question + " [Yes/No]: ");
		
		String reply = sc.nextLine();
				
		// Check if answer is yes
		if(reply.equalsIgnoreCase("y") || reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("yeah")) // ;)
		{
			return true;
		}
		else // Treat any other answer as a no
		{
			return false;
		}
	}
	
}
