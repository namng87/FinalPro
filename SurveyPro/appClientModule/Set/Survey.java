package Set;
import java.awt.Color;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.AdjustmentEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Survey {
    Course course;
    Questions [] multiques;
    Questions [] commentques;
    JLabel [] mlabels ;
    JLabel [] clabels ;
	public Survey (Course c){
		course = c;
	}
	public void setQuesions(String [] mq, String [] cq){
            multiques = new MultiQues[mq.length];
            commentques = new CommentQues[cq.length];
	    clabels = new JLabel [cq.length];
	    mlabels = new JLabel [mq.length];
            for(int i=0; i<mq.length;i++){
                mlabels[i] =  new JLabel(mq[i]);  
                multiques[i] = new MultiQues(mq[i]);
            }
            for(int i=0; i<cq.length;i++){
                clabels[i] =  new JLabel(cq[i]);
                commentques[i] = new CommentQues(cq[i]);
            }
		
	}
	public void display(JFrame f){
            int x,y,w,h;
            x = 10;
            y = 50;
            w = 800;
            h = 20;
	    
	    for(int i=0; i< mlabels.length;i++){
	        mlabels[i].setBounds(new Rectangle(x, y, w, h));
	        f.getContentPane().add(mlabels[i], null);
	        ButtonGroup bg = new javax.swing.ButtonGroup();
                for(int j=1; j<=5;j++){
                    myJRadioButton r = new myJRadioButton(Integer.toString(j));
                    r.setQuestion(multiques[i]);
                    bg.add(r);
                    r.addActionListener(new radioListener());
                    
                    r.setBounds(new Rectangle(x + (j*100) , y + 20, 50, 20));
                    f.getContentPane().add(r, null);
                }
                y += 40;
	    }
	    for(int i=0; i<clabels.length;i++){
	        JTextArea txt = new JTextArea();
	        ((CommentQues)(commentques[i])).setTextArea(txt);
	        clabels[i].setBounds(new Rectangle(x, y, w, h));
	        txt.setBounds(new Rectangle(x, y+20, 500, 80));
	        f.getContentPane().add(clabels[i], null);
	        f.getContentPane().add(txt, null);
	        y += 100;
	    }
	    
	}
        
        
        class radioListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                radioClick(e);
            }
            private void radioClick(ActionEvent e) {
                myJRadioButton r = (myJRadioButton)e.getSource();
                String txt = r.getLabel();
                r.getQuestion().setAnswer(txt);
                
            }
        }
        
    
    public void output (){
        String out = " ";
        for(int i=0; i<multiques.length;i++){
            out += multiques[i].getQuestion() + " : " + multiques[i].getAnswer();
           
        }
        for(int i=0; i<commentques.length;i++){
            out += commentques[i].getQuestion() + " : " + ((CommentQues)commentques[i]).comment("");
        }
        JOptionPane.showMessageDialog(null, out);
    }
}