package Set;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButton;

public class myJRadioButton extends JRadioButton {
    Questions ques;

    public myJRadioButton(String string) {
        super(string);
    }
    public void setQuestion(Questions q){
        ques = q;
    }
    public Questions getQuestion(){
        return ques;
    }
}
