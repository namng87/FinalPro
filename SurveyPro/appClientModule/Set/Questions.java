package Set;

public class Questions {
	String ques;
	String answer;
	public Questions(String q){
		ques = q;
	}
	public  String getQuestion () {
		return ques;
	}
	public  String getAnswer(){
		return answer;
	}
	public void setAnswer(String s){
		answer = s;
	}
}
