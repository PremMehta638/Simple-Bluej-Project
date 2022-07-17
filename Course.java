public class Course {
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
   
    
    public Course(String courseID, String courseName, int duration){
            this.courseID=courseID;
            this.courseName=courseName;
            courseLeader="";
            this.duration=duration;
    }
       //getter and setter method starts 
    public String getCourseID(){
        return this.courseID;
    }
        
    public String getCourseName(){
        return this.courseName;
    }
        
    public String getCourseLeader(){
        return this.courseLeader;
    }
        
    public int getDuration(){
        return this.duration;
    }
        
    public void setnewCourseLeader(String subject){
        this.courseLeader=subject;
    }
    //end of getter and setter methods
    public void display(){ //creating a method
        System.out.println("The courseID is "+ courseID);
        System.out.println("The couseName is " + courseName);
        System.out.println("The duration is " + duration);
        
        if(!courseLeader.equals ("")){
            System.out.println("The couseLeader is " + courseLeader);
        }
    }
}
