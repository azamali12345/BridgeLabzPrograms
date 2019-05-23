package org.bridgeLabz.objectOriented.cliniqueManagement;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author Azam Ali
 *
 */
public class CliniqueUtility implements CliniqueInterface
{
	public static ObjectMapper objM = new ObjectMapper();
	static Scanner sc=new Scanner(System.in);
	static Scanner sc1=new Scanner(System.in);
	public static void addDoctor(List<Doctor> doctorList)
	{
		String doctorFile = "/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/cliniqueManagement/Doctor.json";
		System.out.println("ENTER THE DOCTOR'S NAME...");
		String name =sc.nextLine().toUpperCase(); 
		System.out.println("ENTER THE DOCTOR'S ID...");
		int id = sc1.nextInt();
		System.out.println("ENTER THE SPECIALIZATION...");
		String spl = sc.nextLine().toUpperCase();
		System.out.println("ENTER THE AVAILABILITY...");
		String avl = sc.nextLine().toUpperCase();
		Doctor newDoctor = new Doctor(name, id, spl, avl);
		doctorList.add(newDoctor);
		try 
		{
			objM.writerWithDefaultPrettyPrinter().writeValue(new File(doctorFile), doctorList);
			System.out.println("\nNEW DOCTOR ADDED...\n");
			System.out.printf("%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(newDoctor.toString());
		} 
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}
	public static void addPatient(List<Patient> patientList)
	{
		System.out.println("ENTER THE PATIENT'S NAME...");
		String name = sc.nextLine().toUpperCase();
		System.out.println("ENTER THE PATIENT'S ID...");
		int id = sc1.nextInt();
		System.out.println("ENTER THE MOBILE NO...");
		String mobNum = sc.nextLine();
		System.out.println("ENTER THE AGE...");
		int age = sc.nextInt();
		Patient newPatient = new Patient(name, id, mobNum, age);
		patientList.add(newPatient);
		try 
		{
			objM.writerWithDefaultPrettyPrinter().writeValue(new File(patientFile), patientList);
			System.out.println("\nNEW PATIENT ADDED...\n");
			System.out.printf("%-15s %-10s  %-15s %15s\n", "PATIENT NAME...", "PATIENT ID...", "MOBILE NUMBER...", "AGE...");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(newPatient.toString());
		} 
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void searchDoctors(List<Doctor> doctorList)
	{
		Search searchStart = new Search();
		
		System.out.println("ENTER THE CHOICE...");
		System.out.println("\t1. BY NAME...");
		System.out.println("\t2. BY ID...");
		System.out.println("\t3. BY SPECIALIZATION...");
		System.out.println("\t4. BY AVAILABILITY...");
		int n=sc1.nextInt();
		switch(n)
		{
			case 1: System.out.println("ENTER THE DOCTOR'S NAME...");
					String doctname=sc.nextLine().toUpperCase();
					searchStart.searchDocByName(doctname, doctorList);
					break;
			case 2: System.out.println("ENTER THE DOCTOR'S ID...");
					int doctid=sc1.nextInt();
					searchStart.searchDocById(doctid, doctorList);
					break;
			case 3: System.out.println("ENTER THE SPECIALIZATION...");
					String doctspec=sc.nextLine().toUpperCase();
					searchStart.searchDocBySPL(doctspec,doctorList);
					break;
			case 4: System.out.println("ENTER THE AVAILABILITY...");
					String doctavai=sc.nextLine().toUpperCase();
					searchStart.searchDocByAvl(doctavai,doctorList);
					break;
			default: System.out.println("\tINVALID CHOICE...");
		}
	}
	public static void searchPatients(List<Patient> patientList)
	{
		Search searchStart = new Search();
		System.out.println("ENTER THE CHOICE...");
		System.out.println("\t1. BY NAME...");
		System.out.println("\t2. BY ID...");
		System.out.println("\t3. BY MOBILE NO...");
		System.out.println("\t4. BY AGE...");
		int n=sc1.nextInt();
		switch(n)
		{
			case 1: System.out.println("ENTER THE PATIENT'S NAME...");
					String pname=sc.nextLine().toUpperCase();
					searchStart.searchPatientByName(pname, patientList);
					break;
			case 2: System.out.println("ENTER THE PATIENT'S ID...");
					int pid=sc1.nextInt();
					searchStart.searchPatientById(pid, patientList);
					break;
			case 3: System.out.println("ENTER THE PATIENT MOBILE NO...");
					String pmobnum=sc.nextLine().toUpperCase();
					searchStart.searchPatientByMobNum(pmobnum, patientList);
					break;
			case 4:	System.out.println("ENTER THE PATIENT AGE...");
					int page=sc1.nextInt();
					searchStart.searchPatientByAge(page, patientList);
					break;
			default: System.out.println("\tINVALID CHOICE...");
		}
	}
	public static void fixAppointment(List<Doctor> doctorList, List<Patient> patientList )
	{
		String appointmentFile = "/home/admin1/eclipse-workspace/BridgeLabz/src/org/bridgeLabz/objectOriented/cliniqueManagement/Appointments.json";
		try 
		{
			List<Appointment> appointmentList = objM.readValue(new File(appointmentFile),new TypeReference<List<Appointment>>() {});
			Search searchStart = new Search();
			System.out.println("ENTER THE DOCTOR'S NAME...");
			String doctorName = sc.nextLine().toUpperCase();
			if(searchStart.searchDocByName(doctorName, doctorList) == true)
			{
				System.out.println("ENTER THE PATIENT'S NAME...");
				String patientName =sc.nextLine().toUpperCase();
				if(searchStart.searchPatientByName(patientName, patientList) == true)
				{
					System.out.println("ENTER THE DATE...(DD/MM/YYYY)...");
					String date = sc.nextLine();
					int index = searchStart.getAppointedDocIndex(doctorName, appointmentList);
					int docCount;
					if(index == -1)
					{
						docCount = 1;
					}
					else
					{
						docCount = appointmentList.get(index).getDocAppointmentCount();
						docCount = docCount + 1;
					}
					if(docCount <= 5)
					{
						Appointment newAppointment = new Appointment(doctorName, patientName, date, docCount );
						appointmentList.add(newAppointment);
						objM.writerWithDefaultPrettyPrinter().writeValue(new File(appointmentFile), appointmentList);
						System.out.println("\nAPPOINTMENT ADDED...\n");
						System.out.printf("%-20s %-20s %-10s\n", "DOCTOR NAME...", "PATIENT NAME...", "DATE OF APPOINTMENT...");
						System.out.println("--------------------------------------------------------------------");
						System.out.println(newAppointment.toString());	
					}
					else
					{
						System.out.println("SORRY...DOCTOR'S NOT AVAILABLE RIGHT NOW...");
					}
				}
			}
		} 
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}	
	}
	public static void printAppointments(List<Appointment> appointmentList)
	{
		System.out.println("-------------------LIST OF APPOINTMENTS--------------------");
		System.out.printf("%-20s %-20s %-10s\n", "DOCTOR NAME...", "PATIENT NAME...", "DATE OF APPOINTMENT...");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0; i < appointmentList.size(); i++)
		{
			System.out.println(appointmentList.get(i).toString());
		}
	}
}
