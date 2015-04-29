package Set;

import java.awt.Dimension;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class surveyFrame extends JFrame {
    Survey survey ;
    Course course ;
    Instructor teacher ;
    String [] ques1 = {"How many days are you absent?",
                       "How does the book help you?",
                         "How does the Exam take home work for you?",
                       "How is your class-mates?",
                       "Overal how you rate this class"};
    String [] ques2 = {"Tell me what did you improve from this class?",
                       "Tell me what you think about the Instructor", 
                       "Feeling good?"};
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JLabel jLabel1 = new JLabel();
    //private JScrollPane mainPanel = new JScrollPane();


    public surveyFrame() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        
        this.getContentPane().setLayout(null);
        this.setSize( new Dimension(900, 600) );
        teacher = new Instructor(" Kanchanawanchai");
        course = new Course(201,teacher);
        survey = new Survey(course);
        survey.setQuesions(ques1, ques2);
        survey.display(this);
        this.setTitle("Survey for "  + course);


        jButton1.setText("Exit");
        jButton1.setBounds(new Rectangle(600, 320, 95, 20));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jButton2.setText("Submit");
        jButton2.setBounds(new Rectangle(600, 295, 95, 20));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jLabel1.setText("Survey for "+ course.toString());
        jLabel1.setBounds(new Rectangle(40, 5, 630, 15));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setFont(new Font("Tahoma", 1, 13));
        
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.repaint();
    }
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new surveyFrame().setVisible(true);
            }
        });
    }


    private void jButton1_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        survey.output();
    }
}