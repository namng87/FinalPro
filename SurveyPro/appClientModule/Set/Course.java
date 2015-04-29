package Set;

import java.util.List;

public class Course {
	int cid;
	Instructor teacher;
	List <Student> students;
	
	public Course (int sid, Instructor ins){
		cid = sid;
		teacher = ins;
	}
	public void addStudent(Student s){
		students.add(s);
	}
	public void removeStudent(Student s){
		students.remove(s);
	}
    public String toString(){
        return cid + " Instructor:" + teacher.getName();
    }
}
