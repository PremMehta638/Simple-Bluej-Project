public class AcademicCourse extends Course {
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private float numberOfAssessments;
    private boolean isRegistered;
    public AcademicCourse(String courseID,String courseName,int duration,String level,String credit,float numberOfAssessments){
        //creating a constructor
        super(courseID,courseName,duration);
        //implementing parent class constructor
        this.level=level;
        this.credit=credit;
        this.numberOfAssessments=numberOfAssessments;
        lecturerName= "";
        startingDate= "";
        completionDate = "";
        isRegistered= false;
    }
    //getter and setter method starts
    public String getlecturerName(){
        return lecturerName;
    }
    public String getlevel(){
        return level;
    }
    public String getcredit(){
        return credit;
    }
    public String getstartingDate(){
        return startingDate;
    }
    public String getcompletionDate(){
        return completionDate;
    }
    public float getnumberOfAssessments(){
        return numberOfAssessments;
    }
     public boolean getisRegistered(){
        return isRegistered;
    }
    public void setnewlecturerName(String lecturerName){
        this.lecturerName= lecturerName;
    }
    public void setnewnumberOfAssessments(float numberOfAssessments){
        this.numberOfAssessments= numberOfAssessments;
    }
    //end of getter and setter methods
    public void register( String courseLeaderName,String lecturerName,String startingDate, String completionDate){
        if(isRegistered==true){
        System.out.println("The lecturer name is "+lecturerName+","+
            "Starting Date and completion date is "+
            startingDate+"and"+completionDate+"respectively");
        }
        else {
            super.setnewCourseLeader(courseLeaderName);           
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            isRegistered=true;
        }
    }
    public void display(){
        super.display();
        if(isRegistered==true)  {
            System.out.println("The Lecturer name is "+getlecturerName());
            System.out.println("The Level is "+getlevel());
            System.out.println("The Credit is "+ getcredit());
            System.out.println("The Starting date is "+getstartingDate());
            System.out.println("The Completion date is "+getcompletionDate());
            System.out.println("The Number of assessment is  "+getnumberOfAssessments());

        }
        

    }  

}