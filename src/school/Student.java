package school;

import static school.Person.ANSI_BLUE;
import static school.Person.ANSI_RED;

public class Student extends Person{
      
      
        
    private int gradeLevel;
//    private Course theCourse;
    private Course courses[] = new Course[Course.numPeriods];
     private double gradeScore[] = new double[Course.numPeriods];
    
    public static Student addStudent(String _name,
    Gender _gender, int _weight,int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        addPerson(temp);
        return(temp);
    }    
    Student (String _name,Gender _gender,int _weight,
    int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    }
    
    public boolean addCourse(Course _course, double _grade)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course, _grade);
        return(true);
    }  
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        return(true);
    }
    public void setCourseDoIt(Course _course, double _grade)
    {
        courses[_course.getPeriod()-1]=_course;
        gradeScore[_course.getPeriod()-1]=_grade;
    }
    
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    }        
    
    public double getGPA()
    {
   double total = 0;
   int numCourses = 0; 
     for(int index = 0; index < Course.numPeriods; index++)
     {
         if (courses[index] !=null)
         {
             total += gradeScore[index] ;
             numCourses ++ ;
         }
     }
     if (numCourses == 0)
         return(0.0);
     return(total/numCourses); 
    }
    
    
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    }
    public void printTeachersNames()
    {
        System.out.println(getName() + " is taught by");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if (temp.getTeacher() != null)
                {
                    System.out.println(temp.getTeacher().getName());
                }
            }
        }
    }
     public static void printNamesofGPAGreaterThan(double _GPA)
    {
        
        
        System.out.println(ANSI_PURPLE + "===printGPAhigherthan"+_GPA+"===" + ANSI_PURPLE);
        for (Person temp : people)
        {
           if (temp instanceof Student)
           {
               Student student = (Student)temp; 
               
            if (_GPA < student.getGPA())
            {
                System.out.println(ANSI_BLUE + student.getName() + ANSI_BLUE);
                System.out.println(student.getGPA());
            }

           }
        }
             
    }
}
