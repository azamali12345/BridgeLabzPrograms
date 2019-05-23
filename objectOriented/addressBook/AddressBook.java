package org.bridgeLabz.objectOriented.addressBook;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import java.util.*;
/**
 * 
 * @author Azam Ali
 *
 */
public class AddressBook implements IAddress 
{
	Scanner scannerString = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	private List<Person> newList = new ArrayList<Person>();
	ObjectMapper objectmapper =new ObjectMapper();
	FileSystem fileSystem = new FileSystem();
	static File file;
	private static String fileName;

	public AddressBook() 
	{

	}
	public void createAddressBook() 
	{
		System.out.println("ENTER FILE NAME... ");
		String fileName = scannerString.next().toLowerCase();
		System.out.println("ENTER FILE EXTENSION...");
		String fileExtion = scanner.next().toLowerCase();
		if (fileExtion.equals(".json")||fileExtion.equals(".txt")) 
		{         
			@SuppressWarnings("static-access")
			File newFile = fileSystem.createNewFile(fileName.trim(), fileExtion.trim());
			setFile(newFile);
			setFileName(fileName + fileExtion);
			FileSystem.setList(newList);
			System.out.println("\nNEW ADDRESS BOOK CREATED...\n");
		} 
		else 
		{
		System.out.println("\nONLY .json and .txt FILES CAN BE CREATED...\n");
		}
	}
	public void openAddressBook() 
	{
		System.out.println("ENTER FILE NAME...");
		String fileName = scannerString.nextLine().toLowerCase();
		System.out.println("ENTER FILE EXTENSION...");
		String fileExtion = scanner.next().toLowerCase();
		if (fileExtion.equals(".json")||fileExtion.equals(".txt")) 
		{
			File openFile = IAddress.getPathOfFile(fileName.trim(), fileExtion.trim());
			IAddress.readFile(openFile);
			setFile(openFile);
			setFileName(fileName + fileExtion);
		}
		else 
		{
			System.out.println("\\n ONLY .json and .txt FILES CAN BE CREATED...\\n");
		}
	}
	public void addPerson(String firstName, String lastName, String address, String city, String state, String zip,
			String phone) 
	{
		Person personnewEntry = new Person(firstName, lastName, address, city, state, zip, phone);
		newList = FileSystem.getList();
		newList.add(personnewEntry);
		FileSystem.setList(newList);
	}
	public void getFullOfPerson(String searchName) 
	{
		int index = searchPersonbyFirstName(searchName);
		if (index >= 0) 
		{
			System.out.println(FileSystem.getList().get(index).getFirstName() + " "
					+ FileSystem.getList().get(index).getLastName());
		} 
		else 
		{
			System.out.println("Person Not Found");
		}
	}
	@SuppressWarnings("static-access")
	public void updatePerson(int index,String address,String city,String state,String zip,String phone)
	{
		
		fileSystem.getList().get(index).getAddress();
		fileSystem.getList().get(index).getCity();
		fileSystem.getList().get(index).getState();
		fileSystem.getList().get(index).getZip();
		fileSystem.getList().get(index).getPhone();
		try 
		{
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(getFile(),fileSystem.getList());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("PERSON INFORMATION UPDATED SUCCSESSFULLY...");
	}
	@SuppressWarnings("static-access")
	public void removePerson(int index)
	{
		fileSystem.getList().remove(index);
	}
	@SuppressWarnings("static-access")
	public void sortByPersonName()
	{
		newList=fileSystem.getList();
		 NameComparator compareByperson= new  NameComparator();
		Collections.sort(newList, compareByperson);
		AddressBookManager.printAddressBook();
	}
	@SuppressWarnings("static-access")
	public void sortByzip()
	{
		newList=fileSystem.getList();
		ZIPComparator compareByZip= new ZIPComparator();
		Collections.sort(newList, compareByZip);
		AddressBookManager.printAddressBook();
	}
	@SuppressWarnings("static-access")
	public void printAll()
	{
		newList = fileSystem.getList();
		for(Person p : newList)
		{
			System.out.println(p.toString());
		} 
	}
	
	//GETTER AND SETTER METHODS...
	public List<Person> getPersonList()
	{
		return newList;
	}

	public void setPersonList(List<Person> personList) 
	{
		this.newList = personList;
	}

	public File getFile() 
	{
		return file;
	}

	public void setFile(File file) 
	{
		AddressBook.file = file;
	}

	public int searchPersonbyFirstName(String keyFName) 
	{
		int index = -1;
		for (int i = 0; i <FileSystem.getList().size(); i++) 
		{
			String personFirstName = FileSystem.getList().get(i).getFirstName();
			if (keyFName.equals(personFirstName)) 
			{
				index = i;
				break;
			}
		}
		return index;
	}

	public String getFileName() 
	{
		return fileName;
	}

	public void setFileName(String fileName) 
	{
		AddressBook.fileName = fileName;
	}
}
//COMPARATOR CLASSES IMPLEMENTING COMPARATOR INTERFACE...
class NameComparator implements Comparator<Person>
{
	public int compare(Person personOne, Person personTwo) 
	{
		return(personOne.getFirstName().compareTo(personTwo.getFirstName()));
	}
}

class ZIPComparator implements Comparator<Person>
{
	public int compare(Person personOne, Person personTwo) 
	{
		int personOneZip = Integer.parseInt(personOne.getZip());
		int personTwoZip = Integer.parseInt(personTwo.getZip());
		if(personOneZip < personTwoZip)
		{
			return -1;
		}
		else if(personOneZip > personTwoZip)
		{
			return 1;
		}
		return 0;
	}
}
