package yallu.java_9_8.boot;

import yallu.java_9_8.app.Hospital;
import yallu.java_9_8.app.NewHospital;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running in the main metod");
		Hospital hospital=new NewHospital();
		hospital.doc();
		hospital.doc("sai");
		hospital.doc("sai","manvi");
		hospital.doc("sai","manvi","yallu");
		hospital.doc(5);
		hospital.doc("yallu",150);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		
		Hospital hospital1=new NewHospital();
		hospital1.doc();
		hospital1.doc("sai");
		hospital1.doc("sai","manvi");
		hospital1.doc("sai","manvi","kumar");
		hospital1.doc(5);
		hospital1.doc("kumar",150);
		

	}

}
