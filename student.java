public class Student //creating number of students 
{
    

    private static int numberOfStudents = 0;
    private String studentID; 

    public Student()
    {
        numberOfStudents++;
        this.studentID = String.valueOf(numberOfStudents);
    }

    public String getID() 
    { 
        return studentID;
    }


    
}


