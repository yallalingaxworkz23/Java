class TeacherKiller{
	public static void main(String[] values){
		System.out.println("invoking main in TeacherKiller");
		Teacher teacher=new Teacher();
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.age);
		System.out.println(teacher.experience);
		System.out.println(teacher.salary);
		System.out.println("##########################################");
		Teacher teacher1=new Teacher();
		teacher1.name="Nirmala";
		teacher1.subject="English";
		teacher1.age=50;
	    teacher1.experience=25;
		teacher1.salary=25000;
		
		System.out.println( teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.age);
		System.out.println(teacher1.experience);
		System.out.println(teacher1.salary);
		
	}
}