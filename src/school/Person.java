package school;
import java.util.ArrayList;
import java.util.Calendar;
public class Person {

    
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m"; 
    
    
    enum Gender {
        Male,Female
    }
    protected static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    

    public static Person addPerson(String _name,
    Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }
    public static void addPerson(Person _person)
    {
        people.add(_person);
    }
    Person()
    {
        name = "NoneForSure";
        gender = Gender.Female;
        weight = 100;
    }
    Person(String _name,Gender _gender,int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }   
    
    public void setBirthdate
    (int _day,int _month,int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
          
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        return(0);
    }
 
    
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public int getWeight()
    {
        return(weight);
    }       
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }  
    public static void printNames()
    {
        System.out.println("===printNames===");
        for (int index=0;index<people.size();index++)
        {
                System.out.println(people.get(index).getName());
        }        
    }
    public static void printNames(Gender _gender)
    {
        System.out.println(
        "===printNamesOfGender=== " + _gender);
        for (Person temp : people)
        {
            if (temp.gender == _gender)
                System.out.println(temp.getName());
        }
             
    }    
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
}
