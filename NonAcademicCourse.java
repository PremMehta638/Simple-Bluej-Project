public class NonAcademicCourse extends Course {
    private String instructorName;
    private int duration;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered; 
    private boolean isRemoved;
    // creating a constructor
    public NonAcademicCourse(String courseID,String courseName,int duration,String prerequisite){
        super(courseID,courseName,duration);
        this.prerequisite=prerequisite;
        startDate="";
        completionDate="";
        examDate="";
        isRegistered=false;
        isRemoved=false;
    }
    //getter and setter method starts
    public String getinstructorName(){
        return this.instructorName;
    }
    
    public int duration(){
        return this.duration;
    }
    
    public String getstartDate(){
        return this.startDate;
    }
    
    public String getcompletionDate(){
        return this.completionDate;
    }
    
    public String getexamDate(){
        return this.examDate;
    }
    
    public String getprerequisite(){
        return this.prerequisite;
    }
    
    public boolean getisRegistered(){
        return this.isRegistered;
    }
    
    public boolean getisRemoved(){
        return this.isRemoved;
    }
    //end of getter and setter methods
    public void setnewinstructorName(String instructorName){
        if(isRegistered==false){
            this.instructorName= instructorName;
        }
        
        else{
            System.out.println("It is not possible to change instructor name");
        }
        
    }
    
    public void register(String leaderName,
        String instructorName,
        String startDate,
        String completionDate,
        String examDate){
            
            if(isRegistered==false){
                setnewinstructorName(instructorName);
                
                isRegistered=true;
            }
            
            else{
                System.out.println("The course is already registered");
            }
            
        }
    
    public void remove(){
        if(isRemoved==true){
             System.out.println("The course is already removed");
        }
        
        else{
            super.setnewCourseLeader("");
            this.instructorName="";
            this.startDate="";
            this.completionDate="";
            this.examDate="";
            
            isRegistered=false;
            isRemoved=true;
        }
    }
    
    public void display(){
        
        super.display();
        
        if(isRegistered=true){
            System.out.println("The Instructor name is: "+getinstructorName());
            System.out.println("The Starting date is: "+getstartDate());
            System.out.println("The Completion date is: "+getcompletionDate());
            System.out.println("The Exam date is: "+getexamDate());
        }
    }       
}

