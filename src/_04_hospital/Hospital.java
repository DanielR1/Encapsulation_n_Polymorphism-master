package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
//private int numberOfDoctors = 0;
ArrayList<Doctor> doctors = new ArrayList<Doctor>();
ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor Doctor) {
		// TODO Auto-generated method stub
		int temp = getNumberOfDoctors();
		//setNumberOfDoctors(temp+1);
		doctors.add(Doctor);
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
		
	}

	int getNumberOfDoctors() {
		return doctors.size();
	}

	//void setNumberOfDoctors(int numberOfDoctors) {
	//	this.numberOfDoctors = numberOfDoctors;
	//}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patients.size(); i++) {
			double x = i/3;
			int y = (int)x;
			try {
				doctors.get(y).assignPatient(patients.get(i));
			} catch (DoctorFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
