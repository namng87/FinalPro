package Set;

import javax.swing.JTextArea;

public class CommentQues extends Questions implements QuestionsInterface2 {
    JTextArea txt;
    public CommentQues(String q) {
        super(q);
    }

    public String comment(String s){
        String t = txt.getText();
        this.setAnswer(t);
        return t;
    }
    public void setTextArea (JTextArea t){
        txt = t;
    }
	
}
