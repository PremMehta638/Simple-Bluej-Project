import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class INGCollege
{
    private ArrayList <Course> course = new ArrayList<Course>();
    private JFrame frame;
    private JPanel stylePanel1, stylePanel2, INGClzPanel1, 
    AcademicPanel1, NonAcademicPanel2;

    JLabel title, subTitle, AcademicTitle, NonAcademicTitle,
    AcademicCourseIDlabel1, AcademicCourseIDlabel2, AcademicCourseNamelabel, AcademicCourseLeaderlabel,
    AcademicDurationlabel, lecturerNamelabel, levellabel, creditlabel, 
    AcademicStartDatelabel, numberOfAssesmentlabel, AcademicCompleDatelabel,
    NonAcademicCourseIDlabel1, NonAcademicCourseIDlabel2, NonAcademicCourseNamelabel, 
    NonAcademicCourseLeader, NonAcademicDurationlabel, instructorNamelabel, 
    prerequisitelabel, NonAcademicStartDatelabel, NonAcademicCompleDatelabel, examDatelabel,
    removeCourselabel;

    JTextField AcademicCourseIDtxt1, AcademicCourseIDtxt2, AcademicCourseNametxt, AcademicCourseLeadertxt,
    AcademicDurationtxt, lecturerNametxt, leveltxt, credittxt, 
    AcademicStartDatetxt, numberOfAssesmenttxt, AcademicCompleDatetxt,
    NonAcademicCourseIDtxt1, NonAcademicCourseIDtxt2, NonAcademicCourseNametxt, 
    NonAcademicCourseLeadertxt, NonAcademicDurationtxt, instructorNametxt, 
    prerequisitetxt, NonAcademicStartDatetxt, NonAcademicCompleDatetxt, examDatetxt,
    removeCoursetxt;

    JButton AcademicBtn, NonAcademicBtn, AcademicAddBtn, NonAcademicAddBtn,
    AcademicRegBtn, NonAcademicRegBtn, AcademicDisplayBtn, NonAcademicDisplayBtn,
    AcademicClearBtn, NonAcademicClearBtn, AcademicBackBtn, NonAcademicBackBtn,
    removeBtn;

    public INGCollege() {
        INGClz();
        INGClzBody();
    }

    public String getAcademicCourseID1() {
        return AcademicCourseIDtxt1.getText();
    }

    public String getAcademicCourseName() {
        return AcademicCourseNametxt.getText();
    }

    public int getAcademicDuration() {
        String AcademicDuration = AcademicDurationtxt.getText();
        int AcademicDurationInt = -1;
        try{
            AcademicDurationInt = Integer.parseInt(AcademicDuration);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame,"Wrong value for Duration.\nPlease add numeric value","Invalid Input",0);
        }

        return AcademicDurationInt;
    }

    public String getLevel() {
        return leveltxt.getText();
    }

    public String getCredit() {
        return credittxt.getText();
    }

    public int getnumberOfAssesment() {
        String numberOfAssesment = numberOfAssesmenttxt.getText();
        int numberOfAssesmentInt = -1;
        try{
            numberOfAssesmentInt = Integer.parseInt(numberOfAssesment);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame,"Wrong value for Number Of Assessments.\nPlease add numeric value","Invalid Input",0);
        }

        return numberOfAssesmentInt;
    }

    public String getAcademicCourseID2() {
        return AcademicCourseIDtxt2.getText();
    }

    public String getAcademicCourseLeader() {
        return AcademicCourseLeadertxt.getText();
    }

    public String getLecturerName() {
        return lecturerNametxt.getText();
    }

    public String getAcademicStartDate() {
        return AcademicStartDatetxt.getText();
    }

    public String getAcademicCompletionDate() {
        return AcademicCompleDatetxt.getText();
    }

    public String getNonAcademicCourseID1() {
        return NonAcademicCourseIDtxt1.getText();
    }

    public String getNonAcademicCourseName() {
        return NonAcademicCourseNametxt.getText();
    }

    public int getNonAcademicDuration() {
        String NonAcademicDuration = NonAcademicDurationtxt.getText();
        int NonAcademicDurationInt = -1;
        try{
            NonAcademicDurationInt = Integer.parseInt(NonAcademicDuration);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame,"Wrong value for Duration.\nPlease add numeric value","Invalid Input",0);
        }

        return NonAcademicDurationInt;
    }

    public String getNonAcademicPrerequisite() {
        return prerequisitetxt.getText();
    }

    public String getNonAcademicCourseID2() {
        return NonAcademicCourseIDtxt2.getText();
    }

    public String getNonAcademicCourseLeader() {
        return NonAcademicCourseLeadertxt.getText();
    }

    public String getNonAcademicInstructorName() {
        return instructorNametxt.getText();
    }

    public String getNonAcademicStartDate() {
        return NonAcademicStartDatetxt.getText();
    }

    public String getNonAcademicCompletionDate() {
        return NonAcademicCompleDatetxt.getText();
    }

    public String getNonAcademicExamDate() {
        return examDatetxt.getText();
    }

    public String getRemoveCourse() {
        return removeCoursetxt.getText();
    }

    public void INGClz() {
        frame = new JFrame("ING College");
        frame.setLayout(null);
        frame.setSize(500,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AcademicPanel1 = new JPanel();
        frame.add(AcademicPanel1);
        AcademicPanel1.setBounds(50,100,950,570);
        AcademicPanel1.setBackground(new Color(204, 255, 204));
        AcademicPanel1.setLayout(null);
        AcademicPanel1.setVisible(false);

        NonAcademicPanel2 = new JPanel();
        frame.add(NonAcademicPanel2);
        NonAcademicPanel2.setBounds(50,100,950,570);
        NonAcademicPanel2.setBackground(new Color(204, 255, 204));
        NonAcademicPanel2.setLayout(null);
        NonAcademicPanel2.setVisible(false);

        INGClzPanel1 = new JPanel();
        INGClzPanel1.setBounds(55,105,335,455);
        INGClzPanel1.setLayout(null);
        INGClzPanel1.setBackground(new Color(90, 190, 196));
        frame.add(INGClzPanel1);

        stylePanel1 = new JPanel();
        stylePanel1.setBounds(0,0,1071,151);
        stylePanel1.setLayout(null);
        stylePanel1.setBackground(new Color(90, 190, 196));
        frame.add(stylePanel1);

        stylePanel2 = new JPanel();
        stylePanel2.setBounds(0,150,1070,600);
        stylePanel2.setLayout(null);
        stylePanel2.setBackground(new Color(90, 190, 196));
        frame.add(stylePanel2);

    }

    public void INGClzBody() {
        Font titleFont = new Font("ALGERIAN",Font.BOLD,22);
        Font subtitleFont = new Font("ALGERIAN",Font.BOLD,18);
        Font labelFont = new Font("Verdana",Font.PLAIN,17);
        Font btnFont = new Font("Verdana",Font.BOLD,16);       

        title = new JLabel("Given Course");
        title.setBounds(100,10,330,50);
        title.setFont(titleFont);
        title.setForeground(new Color(100,61,180));
        INGClzPanel1.add(title);

        subTitle = new JLabel("Choose The Given Course");
        subTitle.setBounds(50,80,330,50);
        subTitle.setFont(subtitleFont);
        subTitle.setForeground(new Color(100,61,180));
        INGClzPanel1.add(subTitle);
 
        AcademicBtn = new JButton("Academic");
        AcademicBtn.setBounds(80,150,190,40);
        AcademicBtn.setFont(btnFont);
        AcademicBtn.setBackground(new Color(204,204,0));
        AcademicBtn.setForeground(Color.BLACK);
        INGClzPanel1.add(AcademicBtn);
        AcademicBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    INGClzPanel1.setVisible(false);
                    frame.setSize(1070,770);
                    AcademicPanel1.setVisible(true);
                }
            });

        NonAcademicBtn = new JButton("Non Academic");
        NonAcademicBtn.setBounds(80,230,190,40);
        NonAcademicBtn.setFont(btnFont);
        NonAcademicBtn.setBackground(new Color(204,204,0));
        NonAcademicBtn.setForeground(Color.BLACK);
        INGClzPanel1.add(NonAcademicBtn);
        NonAcademicBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    INGClzPanel1.setVisible(false);
                    frame.setSize(1070,770);
                    NonAcademicPanel2.setVisible(true);
                }
            });
       
        AcademicTitle = new JLabel("Academic Course");
        AcademicPanel1.add(AcademicTitle);
        AcademicTitle.setBounds(380,10,300,50);
        AcademicTitle.setFont(titleFont);
        AcademicTitle.setForeground(new Color(100,61,180));

        AcademicCourseIDlabel1 = new JLabel("Course ID");
        AcademicPanel1.add(AcademicCourseIDlabel1);
        AcademicCourseIDlabel1.setBounds(50,100,100,30);
        AcademicCourseIDlabel1.setFont(labelFont);
        AcademicCourseIDlabel1.setForeground(new Color(100,61,180));

        AcademicCourseIDtxt1 = new JTextField();
        AcademicPanel1.add(AcademicCourseIDtxt1);
        AcademicCourseIDtxt1.setBounds(250,100,180,28);
        AcademicCourseIDtxt1.setFont(labelFont);
        AcademicCourseIDtxt1.setBackground(new Color(237,231,246));
        AcademicCourseIDtxt1.setForeground(new Color(100,61,180));

        AcademicCourseNamelabel = new JLabel("Course Name");
        AcademicPanel1.add(AcademicCourseNamelabel);
        AcademicCourseNamelabel.setBounds(50,150,150,30);
        AcademicCourseNamelabel.setFont(labelFont);
        AcademicCourseNamelabel.setForeground(new Color(100,61,180));

        AcademicCourseNametxt = new JTextField();
        AcademicPanel1.add(AcademicCourseNametxt);
        AcademicCourseNametxt.setBounds(250,150,180,28);
        AcademicCourseNametxt.setFont(labelFont);
        AcademicCourseNametxt.setBackground(new Color(237,231,246));
        AcademicCourseNametxt.setForeground(new Color(100,61,180));

        AcademicDurationlabel = new JLabel("Duration");
        AcademicPanel1.add(AcademicDurationlabel);
        AcademicDurationlabel.setBounds(50,200,100,30);
        AcademicDurationlabel.setFont(labelFont);
        AcademicDurationlabel.setForeground(new Color(100,61,180));

        AcademicDurationtxt = new JTextField();
        AcademicPanel1.add(AcademicDurationtxt);
        AcademicDurationtxt.setBounds(250,200,180,28);
        AcademicDurationtxt.setFont(labelFont);
        AcademicDurationtxt.setBackground(new Color(237,231,246));
        AcademicDurationtxt.setForeground(new Color(100,61,180));

        levellabel = new JLabel("Level");
        AcademicPanel1.add(levellabel);
        levellabel.setBounds(50,250,100,30);
        levellabel.setFont(labelFont);
        levellabel.setForeground(new Color(100,61,180));

        leveltxt = new JTextField();
        AcademicPanel1.add(leveltxt);
        leveltxt.setBounds(250,250,180,28);
        leveltxt.setFont(labelFont);
        leveltxt.setBackground(new Color(237,231,246));
        leveltxt.setForeground(new Color(100,61,180));

        creditlabel = new JLabel("Credit");
        AcademicPanel1.add(creditlabel);
        creditlabel.setBounds(50,300,100,30);
        creditlabel.setFont(labelFont);
        creditlabel.setForeground(new Color(100,61,180));

        credittxt = new JTextField();
        AcademicPanel1.add(credittxt);
        credittxt.setBounds(250,300,180,28);
        credittxt.setFont(labelFont);
        credittxt.setBackground(new Color(237,231,246));
        credittxt.setForeground(new Color(100,61,180));

        numberOfAssesmentlabel = new JLabel("Number of Assesments");
        AcademicPanel1.add(numberOfAssesmentlabel);
        numberOfAssesmentlabel.setBounds(50,350,300,30);
        numberOfAssesmentlabel.setFont(labelFont);
        numberOfAssesmentlabel.setForeground(new Color(100,61,180));

        numberOfAssesmenttxt = new JTextField();
        AcademicPanel1.add(numberOfAssesmenttxt);
        numberOfAssesmenttxt.setBounds(250,350,180,28);
        numberOfAssesmenttxt.setFont(labelFont);
        numberOfAssesmenttxt.setBackground(new Color(237,231,246));
        numberOfAssesmenttxt.setForeground(new Color(100,61,180));

        AcademicAddBtn = new JButton("Add Course");
        AcademicPanel1.add(AcademicAddBtn);
        AcademicAddBtn.setBounds(170,420,150,40);
        AcademicAddBtn.setFont(btnFont);
        AcademicAddBtn.setBackground(new Color(204,204,0));
        AcademicAddBtn.setForeground(Color.WHITE);
        AcademicAddBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    addAcademicCourse();
                }
            });

        AcademicCourseIDlabel2 = new JLabel("Course ID");
        AcademicPanel1.add(AcademicCourseIDlabel2);
        AcademicCourseIDlabel2.setBounds(510,100,150,30);
        AcademicCourseIDlabel2.setFont(labelFont);
        AcademicCourseIDlabel2.setForeground(new Color(100,61,180));

        AcademicCourseIDtxt2 = new JTextField();
        AcademicPanel1.add(AcademicCourseIDtxt2);
        AcademicCourseIDtxt2.setBounds(710,100,180,28);
        AcademicCourseIDtxt2.setFont(labelFont);
        AcademicCourseIDtxt2.setBackground(new Color(237,231,246));
        AcademicCourseIDtxt2.setForeground(new Color(100,61,180));

        AcademicCourseLeaderlabel = new JLabel("Course Leader");
        AcademicPanel1.add(AcademicCourseLeaderlabel);
        AcademicCourseLeaderlabel.setBounds(510,150,150,30);
        AcademicCourseLeaderlabel.setFont(labelFont);
        AcademicCourseLeaderlabel.setForeground(new Color(100,61,180));

        AcademicCourseLeadertxt = new JTextField();
        AcademicPanel1.add(AcademicCourseLeadertxt);
        AcademicCourseLeadertxt.setBounds(710,150,180,28);
        AcademicCourseLeadertxt.setFont(labelFont);
        AcademicCourseLeadertxt.setBackground(new Color(237,231,246));
        AcademicCourseLeadertxt.setForeground(new Color(100,61,180));

        lecturerNamelabel = new JLabel("Lecturer Name");
        AcademicPanel1.add(lecturerNamelabel);
        lecturerNamelabel.setBounds(510,200,150,30);
        lecturerNamelabel.setFont(labelFont);
        lecturerNamelabel.setForeground(new Color(100,61,180));

        lecturerNametxt = new JTextField();
        AcademicPanel1.add(lecturerNametxt);
        lecturerNametxt.setBounds(710,200,180,28);
        lecturerNametxt.setFont(labelFont);
        lecturerNametxt.setBackground(new Color(237,231,246));
        lecturerNametxt.setForeground(new Color(100,61,180));

        AcademicStartDatelabel = new JLabel("Starting Date");
        AcademicPanel1.add(AcademicStartDatelabel);
        AcademicStartDatelabel.setBounds(510,250,150,30);
        AcademicStartDatelabel.setFont(labelFont);
        AcademicStartDatelabel.setForeground(new Color(100,61,180));

        AcademicStartDatetxt = new JTextField();
        AcademicPanel1.add(AcademicStartDatetxt);
        AcademicStartDatetxt.setBounds(710,250,180,28);
        AcademicStartDatetxt.setFont(labelFont);
        AcademicStartDatetxt.setBackground(new Color(237,231,246));
        AcademicStartDatetxt.setForeground(new Color(100,61,180));

        AcademicCompleDatelabel = new JLabel("Completion Date");
        AcademicPanel1.add(AcademicCompleDatelabel);
        AcademicCompleDatelabel.setBounds(510,300,150,30);
        AcademicCompleDatelabel.setFont(labelFont);
        AcademicCompleDatelabel.setForeground(new Color(100,61,180));

        AcademicCompleDatetxt = new JTextField();
        AcademicPanel1.add(AcademicCompleDatetxt);
        AcademicCompleDatetxt.setBounds(710,300,180,28);
        AcademicCompleDatetxt.setFont(labelFont);
        AcademicCompleDatetxt.setBackground(new Color(237,231,246));
        AcademicCompleDatetxt.setForeground(new Color(100,61,180));

        AcademicRegBtn = new JButton("Register");
        AcademicPanel1.add(AcademicRegBtn);
        AcademicRegBtn.setBounds(600,370,150,40);
        AcademicRegBtn.setFont(btnFont);
        AcademicRegBtn.setBackground(new Color(204,204,0));
        AcademicRegBtn.setForeground(Color.WHITE);
        AcademicRegBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    regAcademicCourse();
                }
            });
   
        AcademicDisplayBtn = new JButton("Display");
        AcademicPanel1.add(AcademicDisplayBtn);
        AcademicDisplayBtn.setBounds(680,420,150,40);
        AcademicDisplayBtn.setFont(btnFont);
        AcademicDisplayBtn.setBackground(new Color(204,204,0));
        AcademicDisplayBtn.setForeground(Color.WHITE);
        AcademicDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    AcademicDisplay();
                }
            });

        AcademicClearBtn = new JButton("Clear");
        AcademicPanel1.add(AcademicClearBtn);
        AcademicClearBtn.setBounds(500,420,150,40);
        AcademicClearBtn.setFont(btnFont);
        AcademicClearBtn.setBackground(new Color(204,204,0));
        AcademicClearBtn.setForeground(Color.WHITE);
        AcademicClearBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    AcademicClear();
                }
            });

        AcademicBackBtn = new JButton("Back");
        AcademicPanel1.add(AcademicBackBtn);
        AcademicBackBtn.setBounds(25,520,100,30);
        AcademicBackBtn.setFont(btnFont);
        AcademicBackBtn.setBackground(new Color(204,204,0));
        AcademicBackBtn.setForeground(Color.WHITE);
        AcademicBackBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    AcademicPanel1.setVisible(false);
                    frame.setSize(450,700);
                    INGClzPanel1.setVisible(true);
                }
            });

       
        NonAcademicTitle = new JLabel("Non Academic Course");
        NonAcademicPanel2.add(NonAcademicTitle);
        NonAcademicTitle.setBounds(380,10,300,50);
        NonAcademicTitle.setFont(titleFont);
        NonAcademicTitle.setForeground(new Color(100,61,180));

        NonAcademicCourseIDlabel1 = new JLabel("Course ID");
        NonAcademicPanel2.add(NonAcademicCourseIDlabel1);
        NonAcademicCourseIDlabel1.setBounds(50,100,100,30);
        NonAcademicCourseIDlabel1.setFont(labelFont);
        NonAcademicCourseIDlabel1.setForeground(new Color(100,61,180));

        NonAcademicCourseIDtxt1 = new JTextField();
        NonAcademicPanel2.add(NonAcademicCourseIDtxt1);
        NonAcademicCourseIDtxt1.setBounds(250,100,180,28);
        NonAcademicCourseIDtxt1.setFont(labelFont);
        NonAcademicCourseIDtxt1.setBackground(new Color(237,231,246));
        NonAcademicCourseIDtxt1.setForeground(new Color(100,61,180));

        NonAcademicCourseNamelabel = new JLabel("Course Name");
        NonAcademicPanel2.add(NonAcademicCourseNamelabel);
        NonAcademicCourseNamelabel.setBounds(50,150,160,30);
        NonAcademicCourseNamelabel.setFont(labelFont);
        NonAcademicCourseNamelabel.setForeground(new Color(100,61,180));

        NonAcademicCourseNametxt = new JTextField();
        NonAcademicPanel2.add(NonAcademicCourseNametxt);
        NonAcademicCourseNametxt.setBounds(250,150,180,28);
        NonAcademicCourseNametxt.setFont(labelFont);
        NonAcademicCourseNametxt.setBackground(new Color(237,231,246));
        NonAcademicCourseNametxt.setForeground(new Color(100,61,180));

        NonAcademicDurationlabel = new JLabel("Duration");
        NonAcademicPanel2.add(NonAcademicDurationlabel);
        NonAcademicDurationlabel.setBounds(50,200,100,30);
        NonAcademicDurationlabel.setFont(labelFont);
        NonAcademicDurationlabel.setForeground(new Color(100,61,180));

        NonAcademicDurationtxt = new JTextField();
        NonAcademicPanel2.add(NonAcademicDurationtxt);
        NonAcademicDurationtxt.setBounds(250,200,180,28);
        NonAcademicDurationtxt.setFont(labelFont);
        NonAcademicDurationtxt.setBackground(new Color(237,231,246));
        NonAcademicDurationtxt.setForeground(new Color(100,61,180));

        prerequisitelabel = new JLabel("Prerequisite");
        NonAcademicPanel2.add(prerequisitelabel);
        prerequisitelabel.setBounds(50,250,180,30);
        prerequisitelabel.setFont(labelFont);
        prerequisitelabel.setForeground(new Color(100,61,180));

        prerequisitetxt = new JTextField();
        NonAcademicPanel2.add(prerequisitetxt);
        prerequisitetxt.setBounds(250,250,180,28);
        prerequisitetxt.setFont(labelFont);
        prerequisitetxt.setBackground(new Color(237,231,246));
        prerequisitetxt.setForeground(new Color(100,61,180));

        NonAcademicAddBtn = new JButton("Add Course");
        NonAcademicPanel2.add(NonAcademicAddBtn);
        NonAcademicAddBtn.setBounds(250,300,150,40);
        NonAcademicAddBtn.setFont(btnFont);
        NonAcademicAddBtn.setBackground(new Color(204,204,0));
        NonAcademicAddBtn.setForeground(Color.WHITE);
        NonAcademicAddBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    addNonAcademicCourse();
                }
            });
        
        NonAcademicCourseIDlabel2 = new JLabel("Course ID");
        NonAcademicPanel2.add(NonAcademicCourseIDlabel2);
        NonAcademicCourseIDlabel2.setBounds(510,100,150,30);
        NonAcademicCourseIDlabel2.setFont(labelFont);
        NonAcademicCourseIDlabel2.setForeground(new Color(100,61,180));

        NonAcademicCourseIDtxt2 = new JTextField();
        NonAcademicPanel2.add(NonAcademicCourseIDtxt2);
        NonAcademicCourseIDtxt2.setBounds(710,100,180,28);
        NonAcademicCourseIDtxt2.setFont(labelFont);
        NonAcademicCourseIDtxt2.setBackground(new Color(237,231,246));
        NonAcademicCourseIDtxt2.setForeground(new Color(100,61,180));

        NonAcademicCourseLeader = new JLabel("Course Leader");
        NonAcademicPanel2.add(NonAcademicCourseLeader);
        NonAcademicCourseLeader.setBounds(510,150,150,30);
        NonAcademicCourseLeader.setFont(labelFont);
        NonAcademicCourseLeader.setForeground(new Color(100,61,180));

        NonAcademicCourseLeadertxt = new JTextField();
        NonAcademicPanel2.add(NonAcademicCourseLeadertxt);
        NonAcademicCourseLeadertxt.setBounds(710,150,180,28);
        NonAcademicCourseLeadertxt.setFont(labelFont);
        NonAcademicCourseLeadertxt.setBackground(new Color(237,231,246));
        NonAcademicCourseLeadertxt.setForeground(new Color(100,61,180));

        instructorNamelabel = new JLabel("Instructor Name");
        NonAcademicPanel2.add(instructorNamelabel);
        instructorNamelabel.setBounds(510,200,150,30);
        instructorNamelabel.setFont(labelFont);
        instructorNamelabel.setForeground(new Color(100,61,180));

        instructorNametxt = new JTextField();
        NonAcademicPanel2.add(instructorNametxt);
        instructorNametxt.setBounds(710,200,180,28);
        instructorNametxt.setFont(labelFont);
        instructorNametxt.setBackground(new Color(237,231,246));
        instructorNametxt.setForeground(new Color(100,61,180));

        NonAcademicStartDatelabel = new JLabel("Starting Date");
        NonAcademicPanel2.add(NonAcademicStartDatelabel);
        NonAcademicStartDatelabel.setBounds(510,250,150,30);
        NonAcademicStartDatelabel.setFont(labelFont);
        NonAcademicStartDatelabel.setForeground(new Color(100,61,180));

        NonAcademicStartDatetxt = new JTextField();
        NonAcademicPanel2.add(NonAcademicStartDatetxt);
        NonAcademicStartDatetxt.setBounds(710,250,180,28);
        NonAcademicStartDatetxt.setFont(labelFont);
        NonAcademicStartDatetxt.setBackground(new Color(237,231,246));
        NonAcademicStartDatetxt.setForeground(new Color(100,61,180));

        NonAcademicCompleDatelabel = new JLabel("Completion Date");
        NonAcademicPanel2.add(NonAcademicCompleDatelabel);
        NonAcademicCompleDatelabel.setBounds(510,300,150,30);
        NonAcademicCompleDatelabel.setFont(labelFont);
        NonAcademicCompleDatelabel.setForeground(new Color(100,61,180));

        NonAcademicCompleDatetxt = new JTextField();
        NonAcademicPanel2.add(NonAcademicCompleDatetxt);
        NonAcademicCompleDatetxt.setBounds(710,300,180,28);
        NonAcademicCompleDatetxt.setFont(labelFont);
        NonAcademicCompleDatetxt.setBackground(new Color(237,231,246));
        NonAcademicCompleDatetxt.setForeground(new Color(100,61,180));

        examDatelabel = new JLabel("Exam Date");
        NonAcademicPanel2.add(examDatelabel);
        examDatelabel.setBounds(510,350,150,30);
        examDatelabel.setFont(labelFont);
        examDatelabel.setForeground(new Color(100,61,180));

        examDatetxt = new JTextField();
        NonAcademicPanel2.add(examDatetxt);
        examDatetxt.setBounds(710,350,180,28);
        examDatetxt.setFont(labelFont);
        examDatetxt.setBackground(new Color(237,231,246));
        examDatetxt.setForeground(new Color(100,61,180));

        NonAcademicRegBtn = new JButton("Register");
        NonAcademicPanel2.add(NonAcademicRegBtn);
        NonAcademicRegBtn.setBounds(710,410,150,40);
        NonAcademicRegBtn.setFont(btnFont);
        NonAcademicRegBtn.setBackground(new Color(204,204,0));
        NonAcademicRegBtn.setForeground(Color.WHITE);
        NonAcademicRegBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    regNonAcademicCourse();
                }
            });


        NonAcademicDisplayBtn = new JButton("Display");
        NonAcademicPanel2.add(NonAcademicDisplayBtn);
        NonAcademicDisplayBtn.setBounds(700,480,150,40);
        NonAcademicDisplayBtn.setFont(btnFont);
        NonAcademicDisplayBtn.setBackground(new Color(204,204,0));
        NonAcademicDisplayBtn.setForeground(Color.WHITE);
        NonAcademicDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    NonAcademicDisplay();
                }
            });

        NonAcademicClearBtn = new JButton("Clear");
        NonAcademicPanel2.add(NonAcademicClearBtn);
        NonAcademicClearBtn.setBounds(500,480,150,40);
        NonAcademicClearBtn.setFont(btnFont);
        NonAcademicClearBtn.setBackground(new Color(204,204,0));
        NonAcademicClearBtn.setForeground(Color.WHITE);
        NonAcademicClearBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    NonAcademicClear();
                }
            });

        removeCourselabel = new JLabel("Course ID");
        NonAcademicPanel2.add(removeCourselabel);
        removeCourselabel.setBounds(50,350,150,30);
        removeCourselabel.setFont(labelFont);
        removeCourselabel.setForeground(new Color(100,61,180));

        removeCoursetxt = new JTextField();
        NonAcademicPanel2.add(removeCoursetxt);
        removeCoursetxt.setBounds(250,350,180,28);
        removeCoursetxt.setFont(labelFont);
        removeCoursetxt.setBackground(new Color(237,231,246));
        removeCoursetxt.setForeground(new Color(100,61,180));

        removeBtn = new JButton("Remove");
        NonAcademicPanel2.add(removeBtn);
        removeBtn.setBounds(190,480,150,40);
        removeBtn.setFont(btnFont);
        removeBtn.setBackground(new Color(204,204,0));
        removeBtn.setForeground(Color.WHITE);
        removeBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    removeCourse();
                }
            });

        NonAcademicBackBtn = new JButton("Back");
        NonAcademicPanel2.add(NonAcademicBackBtn);
        NonAcademicBackBtn.setBounds(25,520,100,30);
        NonAcademicBackBtn.setFont(btnFont);
        NonAcademicBackBtn.setForeground(Color.WHITE);
        NonAcademicBackBtn.setBackground(new Color(204,204,0));
        NonAcademicBackBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    NonAcademicPanel2.setVisible(false);
                    frame.setSize(450,700);
                    INGClzPanel1.setVisible(true);
                }
            });

          
    }

    public void addAcademicCourse() {
        String AcademicCourseID1 = this.getAcademicCourseID1();
        String AcademicCourseName = this.getAcademicCourseName();
        int AcademicDuration = this.getAcademicDuration();
        String Academiclevel = this.getLevel();
        String AcademicCredit = this.getCredit();
        int AcademicNumOfAssessments = this.getnumberOfAssesment();
        boolean flag = false;

        if(AcademicCourseID1.equals("") || AcademicCourseName.equals("") || AcademicDuration == -1 || 
        Academiclevel.equals("") || AcademicCredit.equals("") || AcademicNumOfAssessments == -1) {
            JOptionPane.showMessageDialog(frame,"Please fill the form","Empty Field",2);
            return;
        }

        else {
            if (course.isEmpty()) {
                flag = true;

            }
            else {
                for(Course c:course) {
                    if(c.getCourseID().equals(AcademicCourseID1))  {
                        JOptionPane.showMessageDialog(frame,"Data already exists");
                        return;
                    } 
                    else {
                        flag = true;
                    }
                }
            }

            if(flag == true) {
                course.add(new AcademicCourse(AcademicCourseID1, AcademicCourseName, AcademicDuration, Academiclevel, AcademicCredit, AcademicNumOfAssessments));
                JOptionPane.showMessageDialog(frame,"Data added successfully");
            }
        }

    }

    public void regAcademicCourse() {
        String AcademicCourseID2 = this.getAcademicCourseID2();
        String AcademicCourseLeader = this.getAcademicCourseLeader();
        String AcademicLecturerName = this.getLecturerName();
        String AcademicStartDate = this.getAcademicStartDate();
        String AcademicCompletionDate = this.getAcademicCompletionDate();
        boolean flag = false;
        if(AcademicCourseID2.equals("") || AcademicCourseLeader.equals("") || AcademicLecturerName.equals("") || 
        AcademicStartDate.equals("") || AcademicCompletionDate.equals("")) {
            JOptionPane.showMessageDialog(frame,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }

        else{
            if(course.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please add Course to register","Register",1);
                return;
            }
            else{
                for(Course c:course) {
                    if(c instanceof AcademicCourse) {
                        if(c.getCourseID().equals(AcademicCourseID2)){
                            AcademicCourse Ac = (AcademicCourse)c;
                            if(Ac.getisRegistered() == true) {
                                JOptionPane.showMessageDialog(frame,"The Course is already registered.","Register",1);
                                return;
                            }
                            else {
                                Ac.register(AcademicCourseLeader, AcademicLecturerName,AcademicStartDate, AcademicCompletionDate);
                                JOptionPane.showMessageDialog(frame,"The Course registered successfully.","Course Added",1);
                                return;
                            }
                        }
                        else {
                            flag = true;
                        }
                    }
                }
            }

            if(flag == true) {
                JOptionPane.showMessageDialog(frame,"The Course doesnot exist.\nPlease fill the valid data","Incorrect Input",2);
                return;
            }
        }
    }

    public void AcademicDisplay() {
        if(course.isEmpty()) {
            JOptionPane.showMessageDialog(frame,"Please Add Course","Display",1);
            return;
        }
        else{
            for(Course c : course){
                AcademicCourse Ac = (AcademicCourse)c;
                if(c instanceof AcademicCourse) {
                    Ac.display();
                }
            }
        }
    }

    public void AcademicClear() {
        AcademicCourseIDtxt1.setText("");
        AcademicCourseNametxt.setText("");
        AcademicDurationtxt.setText("");
        leveltxt.setText("");
        credittxt.setText("");
        numberOfAssesmenttxt.setText("");
        AcademicCourseIDtxt2.setText("");
        AcademicCourseLeadertxt.setText("");
        lecturerNametxt.setText("");
        AcademicStartDatetxt.setText("");
        AcademicCompleDatetxt.setText("");
    }

    public void addNonAcademicCourse() {
        String NonAcademicCourseID1 = this.getNonAcademicCourseID1();
        String NonAcademicCourseName = this.getNonAcademicCourseName();
        int NonAcademicDuration = this.getNonAcademicDuration();
        String NonAcademicPrerequisite = this.getNonAcademicPrerequisite();
        boolean flag = true;

        if(NonAcademicCourseID1.equals("") || NonAcademicCourseName.equals("") || NonAcademicDuration == -1 || 
        NonAcademicPrerequisite.equals("")) {
            JOptionPane.showMessageDialog(frame,"Please fill the form","Empty Field",2);
            return;
        }

        else {
            if (course.isEmpty()) {
                flag = true;

            }
            else {
                for(Course c:course) {
                    if(c.getCourseID().equals(NonAcademicCourseID1))  {
                        JOptionPane.showMessageDialog(frame,"Data already exists");
                        return;
                    } 
                    else {
                        flag = true;
                    }
                }
            }
        }

        if(flag == true) {
            course.add(new NonAcademicCourse(NonAcademicCourseID1, NonAcademicCourseName, NonAcademicDuration, NonAcademicPrerequisite));
            JOptionPane.showMessageDialog(frame,"Data added successfully");
        }

    }

    public void regNonAcademicCourse() {
        String NonAcademicCourseID2 = this.getNonAcademicCourseID2();
        String NonAcademicCourseLeader = this.getNonAcademicCourseLeader();
        String NonAcademicInstructorName = this.getNonAcademicInstructorName();
        String NonAcademicStartDate = this.getNonAcademicStartDate();
        String NonAcademicCompletionDate = this.getNonAcademicCompletionDate();
        String NonAcademicExamDate = this.getNonAcademicExamDate();
        boolean flag = false;

        if(NonAcademicCourseID2.equals("") || NonAcademicCourseLeader.equals("") || NonAcademicInstructorName.equals("") || 
        NonAcademicStartDate.equals("") || NonAcademicCompletionDate.equals("") || NonAcademicExamDate.equals("")) {
            JOptionPane.showMessageDialog(frame,"The fields are empty.\nPlease fill the required data","Empty Field",2);
            return;
        }

        else{
            if(course.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please add Course to register","Register",1);
                return;
            }
            else{
                for(Course c:course) {
                    if(c instanceof NonAcademicCourse) {
                        if(c.getCourseID().equals(NonAcademicCourseID2)){
                            NonAcademicCourse NonAc = (NonAcademicCourse)c;
                            if(NonAc.getisRegistered() == true) {
                                JOptionPane.showMessageDialog(frame,"The Course is already registered.","Register",1);
                                return;
                            }
                            else {
                                NonAc.register(NonAcademicCourseLeader, NonAcademicInstructorName, NonAcademicStartDate, NonAcademicCompletionDate, NonAcademicExamDate);
                                JOptionPane.showMessageDialog(frame,"The Course registered successfully.","Course Added",1);
                                return;
                            }
                        }
                        else {
                            flag = true;
                        }
                    }
                }
            }

            if(flag == true) {
                JOptionPane.showMessageDialog(frame,"The Course doesnot exist.\nPlease fill the valid data","Incorrect Input",2);
                return;
            }
        }
    }

    public void NonAcademicDisplay() {
        if(course.isEmpty()) {
            JOptionPane.showMessageDialog(frame,"Please Add Course","Display",1);
            return;
        }
        else{
            for(Course c : course){
                NonAcademicCourse NonAc = (NonAcademicCourse)c;
                if(c instanceof NonAcademicCourse) {
                    NonAc.display();
                }
            }
        }
    }

    public void NonAcademicClear() {
        NonAcademicCourseIDtxt1.setText("");
        NonAcademicCourseNametxt.setText("");
        NonAcademicDurationtxt.setText("");
        prerequisitetxt.setText("");
        NonAcademicCourseIDtxt2.setText("");
        NonAcademicCourseLeadertxt.setText("");
        instructorNametxt.setText("");
        NonAcademicStartDatetxt.setText("");
        NonAcademicCompleDatetxt.setText("");
        examDatetxt.setText("");
        removeCoursetxt.setText("");
    }

    public void removeCourse() {
        String removeCourse = this.getRemoveCourse();
        //boolean flag = false;

        if(removeCourse.equals("")){
            JOptionPane.showMessageDialog(frame,"The fields is empty.\nPlease fill the Course ID","Empty Field",2);
            return;
        }

        else{
            if(course.isEmpty()) {
                JOptionPane.showMessageDialog(frame,"The Course doesnot exists.\nPlease Add and Register Course","Incorrect Input",2);
                return;
            }

            else{
                for(Course c: course){
                    if (c.getCourseID().equals(removeCourse)){
                        if(c instanceof NonAcademicCourse) {
                            NonAcademicCourse NonAc = (NonAcademicCourse) c;
                            if(NonAc.getisRemoved() == false) {
                                NonAc.remove();
                                JOptionPane.showMessageDialog(frame,"The Course is removed","Remove",1);
                                return;
                            }
                            else {
                                  JOptionPane.showMessageDialog(frame,"The course is already removed","Remove",1);
                                  return;
                            }
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(frame,"The Course does not exist.","Remove",1);
                        return;
                    }
                }
            }
        }
    }
    public static void main(String [] args) {
        new INGCollege().frame.setVisible(true);
    }   
}

