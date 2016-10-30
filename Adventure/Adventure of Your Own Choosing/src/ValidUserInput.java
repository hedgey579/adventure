/**
 * 
 * @author Alexander Berry
 * @version 1.0.1
 * A program developed to take a user input and check it against a list of valid user inputs, before returning the user's input
 * if it matches the inputs as specified in the arguments of takeValidInput.
 *
 */
import java.util.Scanner;
public class ValidUserInput {
	Scanner ui = new Scanner(System.in);
	public ValidUserInput()
	{
		
	}
	/**
	 * Takes a list of valid user inputs, and then returns the valid input.
	 * @param valid A list of valid inputs.
	 * @return The user's input.
	 */
	public String takeValidInput(String...valid)
	{
		//Takes a variable amount of inputs. It took way too long to figure this out
		for(int i = 0; i < valid.length; ++i)
		{
			String validInput = valid[i].toLowerCase();
			String userInput = ui.nextLine().toLowerCase();
			if(userInput.equals(validInput))
			{
				return userInput;
			}
			else
			{
				while(!((userInput.equals(validInput))))
				{
					System.out.println("Error, input is not valid. You can " + validInput + ". " + "Please try again" + "\n>");
					if(this.takeValidInput(valid).equals(validInput))
					{
						return userInput;
					}
				}
			}
			
		}
		return "Error";

	}
	
}	