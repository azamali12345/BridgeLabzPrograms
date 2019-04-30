package org.bridgelabz.dataStructure;
public class StackMethod 
{
	int top=-1; 
	char items[]=new char[100]; 
	
	//METHOD FOR PUSH(INSERT) THE DATA...
	void push(char x)  
	{ 
		if(top==99)  
		{ 
			System.out.println("STACK IS FULL..."); 
		}  
		else 
		{ 
			items[++top]=x; 
		} 
	} 
	
	//METHOD FOR POP(REMOVE) THE DATA...
	char pop()  
	{ 
		if(top==-1)  
		{ 
			System.out.println("UNDERFLOW ERROR..."); 
			return '\0'; 
		}  
		else 
		{ 
			char ele=items[top]; 
			top--; 
			return ele; 
		} 
	} 
	
	//METHOD FOR CHECK STACK IS EMPTY OR NOT...
	boolean isEmpty()  
	{ 
		return(top==-1) ? true:false; 
	} 

	//METHOD RETURN TRUE IF CHAR 1 AND CHAR 2 ARE MATCHING LEFT AND RIGHT PARANTHESIS...
	public static boolean isMatchingPair(char char1, char char2) 
	{ 
		if(char1=='(' && char2==')') 
			return true; 
		else if(char1=='{' && char2=='}') 
			return true; 
		else if(char1=='[' && char2==']') 
			return true; 
		else
			return false; 
	} 

	//METHOD RETURN TRUE IF EXPRESSION HAS BALANCED PARANTHESIS...
	public static boolean isParBalanced(char exp[]) 
	{ 
		//DECLARE AN EMPTY CHARACTER STACK...
		StackMethod st=new StackMethod(); 

		//TRAVERSE THE GIVEN EXPRESSION TO CHECK MATCHING PARENTHESIS...
		for(int i=0;i<exp.length;i++) 
		{ 
			//IF THE exp[i] IS A STARTING PARENTHESES THEN PUSH IT...
			if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[') 
				st.push(exp[i]); 

			/*IF exp[i] IS AN ENDING PARENTHESES THEN POP FROM STACK
			AND CHECK IF THE POPPED PARENTHESES IS A MATCHING PAIR...*/
			if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
			{ 
				//IF WE SEE AN ENDING PARENTHESES WITHOUT A PAIR THEN RETURN FALSE...
				if(st.isEmpty()) 
				{ 
					return false; 
				}  
				/*POP THE TOP ELEMENT FROM STACK, IF IT IS NOT A PAIR PARENTHESES OF CHARACTER
				THEN THERE IS A MISMATCH.
				THIS HAPPENS FOR EXPRESSIONS LIKE {(})...*/
				else if(!isMatchingPair(st.pop(),exp[i])) 
				{ 
					return false; 
				} 
			} 
		} 

		/*IF THERE IS SOMETHING LEFT IN EXPRESSION
		THEN THERE IS A STARTING PARENTHESES WITHOUT A CLOSING PARENTHESES...*/
		if (st.isEmpty()) 
			return true;//BALANCED...
		else
		{   
			return false;//NOT BALANCED...
		}  
	}
}
