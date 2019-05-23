package org.bridgeLabz.objectOriented.cliniqueManagement;
import java.util.List;
/**
 * 
 * @author Azam Ali
 *
 */
public class Search
{
	public boolean searchDocByName(String searchName, List<Doctor> doctorList)
	{
		int count = 0;
		for(int i = 0; i < doctorList.size(); i++)
		{
			count = 0;//TO CHECK DOCTOR FOUND OR NOT...
			String name = doctorList.get(i).getName();//TO GET DOCTOR FROM LIST...
			if(searchName.compareTo(name) == 0)
			{
				System.out.println("\nDOCTOR FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
				System.out.println("------------------------------------------------------------------");
				System.out.println(doctorList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nDOCTOR NOT FOUND...");
			return false;
		}
		else
		{
			return true;
		}
	}
	public void searchDocById(int searchId, List<Doctor> doctorList)
	{
		int count = 0;
		for(int i = 0; i < doctorList.size(); i++)
		{
			count = 0;
			int id = doctorList.get(i).getId();
			if(searchId == id)
			{
				System.out.println("\nDOCTOR FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
				System.out.println("-------------------------------------------------------------------");
				System.out.println(doctorList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nDOCTOR FOUND...");
		}
	}
	public void searchDocBySPL(String searchSPL, List<Doctor> doctorList)
	{
		int count = 0;
		for(int i = 0; i < doctorList.size(); i++)
		{
			count = 0;
			String spl = doctorList.get(i).getSpecialization();
			if(searchSPL.compareTo(spl) == 0)
			{
				System.out.println("\nDOCTOR FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
				System.out.println("------------------------------------------------------------------");
				System.out.println(doctorList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nDOCTOR NOT FOUND...");
		}
	}
	public void searchDocByAvl(String searchAVL, List<Doctor> doctorList)
	{
		int count = 0;
		for(int i = 0; i < doctorList.size(); i++)
		{
			count = 0;
			String avl = doctorList.get(i).getAvl();
			if(searchAVL.compareTo(avl) == 0)
			{
				System.out.println("\nDoctor Found!");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
				System.out.println("----------------------------------------------------------------");
				System.out.println(doctorList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nDOCTOR FOUND...");
		}
	}
	public boolean searchPatientByName(String searchName, List<Patient> patientList)
	{
		int count = 0;
		for(int i = 0; i < patientList.size(); i++)
		{
			count = 0;
			String patientName = patientList.get(i).getName();
			if(searchName.compareTo(patientName) == 0)
			{
				System.out.println("\nPATIENT FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "PATIENT NAME...", "PATIENT ID...", "MOBILE NO...", "AGE...");
				System.out.println("--------------------------------------------------------------------");
				System.out.println(patientList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nPATIENT NOT FOUND...");
			return false;
		}
		else
		{
			return true;
		}
	}
	public void searchPatientById(int searchId, List<Patient> patientList)
	{
		int count = 0;
		for(int i = 0; i < patientList.size(); i++)
		{
			count = 0;
			int id = patientList.get(i).getId();
			if(searchId == id)
			{
				System.out.println("\nPatient Found!");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "PATIENT NAME", "PATIENT ID", "MOBILE NO...", "AGE...");
				System.out.println("-----------------------------------------------------------------");
				System.out.println(patientList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nPATIENT NOT FOUND...");
		}
	}
	public void searchPatientByMobNum(String searchMobNum, List<Patient> patientList)
	{
		int count = 0;
		for(int i = 0; i < patientList.size(); i++)
		{
			count = 0;
			String patientMobNum = patientList.get(i).getMobNumber();
			if(searchMobNum.compareTo(patientMobNum) == 0)
			{
				System.out.println("\nPATIENT FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "PATIENT NAME...", "PATIENT ID...", "MOBILE NUMBER...", "AGE...");
				System.out.println("-------------------------------------------------------------------");
				System.out.println(patientList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nPATIENT NOT FOUND...");
		}
	}
	public void searchPatientByAge(int searchAge, List<Patient> patientList)
	{
		int count = 0;
		for(int i = 0; i < patientList.size(); i++)
		{
			count = 0;
			int patientAge = patientList.get(i).getAge();
			if(searchAge == patientAge)
			{
				System.out.println("\nPATIENT FOUND...");
				System.out.printf("\n%-15s %-10s  %-15s %15s\n", "PATIENT NAME...", "PATIENT ID...", "MBILE NUMBER...", "AGE...");
				System.out.println("------------------------------------------------------------------------");
				System.out.println(patientList.get(i).toString());
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("\nPATIENT NOT FOUND...");
		}
	}
	public int getAppointedDocIndex(String searchName, List<Appointment> appointmentList)
	{
		int index = -1;
		for(int i = appointmentList.size()-1; i >= 0; i--)
		{
			String docName = appointmentList.get(i).getDoctorName();
			if(searchName.compareTo(docName) == 0)
			{
				index = i;
				break;
			}
		}
		return index;
	}
}
