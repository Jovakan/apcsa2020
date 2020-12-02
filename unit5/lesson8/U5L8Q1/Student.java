public class Student 
{
  
  private String firstName;
  private String lastName;
  private int    gradeLevel;  
  private double gpa;
  private static int num = 0;
  private int studentID;
  public Student() 
  {
    firstName = "None";
    lastName = "None";
    gpa = 0.0;
    gradeLevel = 0;
  }
  
  public Student(String fN, String lN, int gL, double GPA)
  {
    firstName = fN;
    lastName = lN;
    
    if(gL >=0 && gL <= 12)
    gradeLevel = gL;
    if(GPA >= 0.0 && GPA <=4.5)
    gpa = GPA;
  }
  
  public String toString() {
    num++;
    studentID = num;
    return lastName + ", " + firstName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + studentID;
    
  }
}
