package org.bridgeLabz.objectOriented.addressBook;
import java.util.Scanner;
/**
 * 
 * @author Azam Ali
 *
 */
public class AddressBookManager 
{
	static AddressBook addressBook = new AddressBook();
	static Scanner scannerString = new Scanner(System.in);

	public static void addnewCustomerBook() 
	{
		String response = null;
		if (addressBook.getFile() != null) 
		{
			System.out.println("\nAn existing AddressBook is already opened!"+ "\n Do you really wish to exit? \n (reply with 'yes' or 'no'): ");
			response = scannerString.nextLine().toLowerCase();
		}
		if (addressBook.getFile() == null || response.equals("yes")) {
			addressBook.createAddressBook();
		} else if (response.equals("no")) {
			System.out.println("\nThank you! continue with existing file... \n");

		} else {
			System.out.println("\ninvalid response!\n");
		}
	}

	public static void openExistingAddressBook() {
		String response = null;
		if (addressBook.getFile() != null) {
			System.out.println("\nAn existing AddressBook is already opened!"
					+ "\n Do you really wish to exit? \n (**reply with 'yes' or 'no'): ");
			response = scannerString.nextLine().toLowerCase();
		}
		if (addressBook.getFile() == null || response.equals("yes")) {
			addressBook.openAddressBook();
			System.out.println();
		} else if (response.equals("no")) {
			System.out.println(
					"\nThank you! continue with existing file... \n" + "(**don't forget to save the changes!)\n");
		} else {
			System.out.println("\ninvalid response!\n");
		}
	}

	public static void addPersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("Enter the first name:");
			String firstName = scannerString.nextLine().toUpperCase();
			System.out.println("Enter the last name:");
			String lastName = scannerString.nextLine().toUpperCase();
			System.out.println("enter the address:");
			String address = scannerString.nextLine().toUpperCase();
			System.out.println("enter the city:");
			String city = scannerString.nextLine().toUpperCase();
			System.out.println("Enter the state:");
			String state = scannerString.nextLine().toUpperCase();
			System.out.println("Enter the zip");
			String zip = scannerString.nextLine();
			System.out.println("Enter the Phone");
			String phone = scannerString.nextLine();

			addressBook.addPerson(firstName, lastName, address, city, state, zip, phone);
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void updatePersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("Search Person by First Name: ");
			String searchName = scannerString.nextLine().toUpperCase();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if (index >= 0) {
				System.out.println("Enter the Address:");
				String address = scannerString.nextLine().toUpperCase();
				System.out.println("Enter the City");
				String city = scannerString.nextLine().toUpperCase();
				System.out.println("Enter the State:");
				String state = scannerString.nextLine().toUpperCase();
				System.out.println("Enter the Zip:");
				String zip = scannerString.nextLine();
				System.out.println("Enter the Phone:");
				String phone = scannerString.nextLine();

				addressBook.updatePerson(index, address, city, state, zip, phone);
			} else {
				System.out.println("\nPerson not found!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void removePersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("Enter Name To Remove");
			String searchName = scannerString.nextLine().toUpperCase();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if (index >= 0) {
				addressBook.removePerson(index);

			} else {
				System.out.println("\nPerson not Found!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void sortAddressBookByName() {
		if (addressBook.getFile() != null) {
			addressBook.sortByPersonName();
		} else {
			System.out.println("\\n No Address Book linked! Create one or open existing..\\n");
		}
	}

	public static void sortAddressBookByzipCode() {
		if (addressBook.getFile() != null) {
			addressBook.sortByzip();
		} else {
			System.out.println("\\nNo Address Book linked! Create one or open existing..\\n");
		}

	}

	public static void printAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("\n " + "File Name: "+ addressBook.getFileName() + " \n");
			addressBook.printAll();
			System.out.println(" End of this AddressBook \n" );
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}
	
	public static void saveAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			IAddress.saveFile(addressBook.getFile());
			System.out.println("\nAddressBook Saved Successfully!\n");
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}
	

	public static void saveAsAnotherAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("enter the file name: ");
			String fileName = scannerString.nextLine();
			System.out.println("enter the file extension: ");
			String fileExt = scannerString.nextLine();
			if (fileExt.equals(".json") || fileExt.equals(".txt")) {
				IAddress.saveFile(FileSystem.createNewFile(fileName, fileExt));
				System.out.println("\nAddressBook Saved to another file successfully!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

}
