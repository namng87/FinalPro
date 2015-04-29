package Set;

public class MultiQues extends Questions implements QuestionsInterface1 {
    
    public MultiQues(String q) {
        super(q);
    }

    public int selectChoice (int sel){
        
        this.setAnswer(Integer.toString(sel));
        return sel;
    }
}
