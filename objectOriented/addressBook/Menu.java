package org.bridgeLabz.objectOriented.addressBook;
import java.util.Scanner;
/**
 * 
 * @author Azam Ali
 *
 */
public class Menu 
{
	static AddressBook addressBook = new AddressBook();//TO IMPLEMENT ALL THE METHODS... 
	
	public static void addressMenu(boolean value)
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			while(value)
			{
				System.out.println("ENTER THE CHOICE...");
				System.out.println("1. CREATE NEW ADDRESS BOOK...");
				System.out.println("2. OPEN EXISTING ADDRESS BOOK...");
				System.out.println("3. ADD PERSON...");
				System.out.println("4. EDIT PERSON...");
				System.out.println("5. REMOVE PERSON...");
				System.out.println("6. SORT ENTRIES BY NAME...");
				System.out.println("7. SORT ENTRIES BY ZIP...");
				System.out.println("8. PRINT ENTRIES...");
				System.out.println("9. SAVE ADDRESS BOOK...");
				System.out.println("10.SAVE AS ADDRESS BOOK...");
				System.out.println("11.QUIT PROGRAM...");
				System.out.println("ENTER THE OPTION...");
				int n=sc.nextInt();
				switch(n)
				{
					case 1:	AddressBookManager.addnewCustomerBook();
						break;
					case 2: AddressBookManager.openExistingAddressBook();						
						break;
					case 3: AddressBookManager.addPersonInAddressBook();
						break;
					case 4:	AddressBookManager.updatePersonInAddressBook();
						break;						
					case 5: AddressBookManager.removePersonInAddressBook();
						break;
					case 6:	AddressBookManager.sortAddressBookByName();
						break;
						
					case 7: AddressBookManager.sortAddressBookByzipCode();;
						break;
					case 8: AddressBookManager.printAddressBook();
						break;
					case 9: AddressBookManager.saveAddressBook();
						break;
					case 10: AddressBookManager.saveAsAnotherAddressBook();		
						break;
					case 11: System.out.println("\nAPPLICATION STOPPED...\n"); 
						value = false;
						break;
					default: 
						System.out.println("INVALID CHOICE... TRY AGAIN...");
				}	
			}	
		}
		catch(NullPointerException e)
		{
			System.out.println("\nNO ADDRESS BOOK OPPENED CURRENTLY...!");
		}
		finally
		{
			sc.close();
		}
	}
}
