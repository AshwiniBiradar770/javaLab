interface Resume{
	void bioData();
}
class Teacher implements Resume{
	String name,Qualification,Achievements;
	float experience;
	public void bioData(){
		name="Arpita Biradar";
		Qualification="M.Tech";
		Achievements="Android Developer";
		experience=9.6f;
		System.out.println("Teacher Resume");
		System.out.println("Name:"+name);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Achievements:"+Achievements);
		System.out.println("Experience:"+experience);
	}
}
class Student implements Resume{
	String name,Discipline;
	float result;
	public void bioData(){
		name="Ashwini Biradar";
		Discipline="CSE";
		result=8.7f;
		System.out.println("Student Resume");
		System.out.println("Name:"+name);
		System.out.println("Discipline:"+Discipline);
		System.out.println("Result:"+result+"CGPA");
		}
}
public class InterfaceEx {
	public static void main(String[] args){
		Teacher T1=new Teacher();
		T1.bioData();
		Student S1=new Student();
		S1.bioData();
	}
}
