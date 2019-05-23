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
public class CliniqueManagement implements CliniqueInterface
{
	public static ObjectMapper objM = new ObjectMapper();
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Doctor doctor = new Doctor();
		Patient patient = new Patient();
		try 
		{
			List<Doctor> doctorList = objM.readValue(new File(doctorFile), new TypeReference<List<Doctor>>() {});
			List<Patient> patientList = objM.readValue(new File(patientFile), new TypeReference<List<Patient>>() {});
			List<Appointment> appointmentList = objM.readValue(new File(appointmentFile), new TypeReference<List<Appointment>>() {});
			boolean value = true;
			while(value) 
			{
				System.out.println("----------------------------------------------------------------------");
				System.out.println("ENTER THE CHOICE...");
				System.out.println("1. ADD DOCTOR...");
				System.out.println("2. ADD PATIENT...");
				System.out.println("3. SEE DOCTOR'S...");
				System.out.println("4. SEE PATIENT'S...");
				System.out.println("5. SEARCH DOCTOR'S...");
				System.out.println("6. SEARCH PATIENTS...");
				System.out.println("7. TAKE APPOINMENT...");
				System.out.println("8. PRINT APPOINMENT REPORT...");
				System.out.println("9. POPULAR DOCTOR IN CLINIC...");
				System.out.println("10. OUR POPULAR SPECIALIZATION...");
				System.out.println("11. EXIT...");
				int n=sc.nextInt();
				switch(n)
				{
					case 1: CliniqueUtility.addDoctor(doctorList);
							break;
					case 2: CliniqueUtility.addPatient(patientList);
							break;
					case 3: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "DOCTOR NAME...", "DOCTOR ID...", "SPECIALIZATION...", "AVAILABILITY...");
							System.out.println("----------------------------------------------------------------------");
							for(int i = 0; i < doctorList.size(); i++)
							{
								doctor = doctorList.get(i);
								System.out.println(doctor.toString());
							}
							break;
					case 4: System.out.printf("\n%-15s %-10s  %-15s %15s\n", "PATIENT NAME...", "PATIENT ID...", "MOBILE NUMBER...", "AGE...");
							System.out.println("------------------------------------------------------------------------");
							for(int i = 0; i < patientList.size(); i++)
							{
								patient = patientList.get(i);
								System.out.println(patient.toString());
							}
							break;
					case 5: CliniqueUtility.searchDoctors(doctorList);
							break;
					case 6: CliniqueUtility.searchPatients(patientList);
							break;
					case 7: CliniqueUtility.fixAppointment(doctorList, patientList);
							break;
							
					case 8: CliniqueUtility.printAppointments(appointmentList);
							break;
					case 9 :	if(doctorList.isEmpty())
								{
									System.out.println("DOCTORS ARE NOT AVAILABLE AT THIS TIME...\n");
								}
								else
								{
									System.out.println("POPULAR DOCTOR IS..." + doctorList.get(0).getName() + "\n");
								}
								break;
					case 10 : 	if(doctorList.isEmpty())
								{
									System.out.println("DOCTORS ARE NOT AVAILABLE AT THIS TIME...\n");
								}
								else
								{
									System.out.println("POPULAR SPECIALIZATION IS..."
											+ doctorList.get(0).getSpecialization() + "\n");
								}
								break;
					case 11 : 	value = false;
								break;
					default: System.out.println("INVALID INPUT!!! TRY AGAIN...\n");
							break;		
				}
			}	
		} 
		catch (IOException e)
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}
}
