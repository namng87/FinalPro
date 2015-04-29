package Set;

public class Student {
	int sid;
	String Name;
	boolean didSurvey;
	
	public Student(int id , String name){
		sid = id;
		Name = name;
	}
	public void doSurvey(){
		
		didSurvey = true;
	}
}
