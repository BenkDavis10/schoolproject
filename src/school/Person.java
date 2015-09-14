
package school;

import java.util.ArrayList;

public class Person {
  enum Gender { //makes multiple types isnstead of using final int 
      Male,Female
  }  
    
  private Gender gender;
  private String name; 
  private int weight; 
//  private static int numpeople = 10; 
  private static int currentpeopleindex = 0; 
  private static ArrayList <Person> people = new ArrayList <Person>();
  
  
//  private static Person people[] = new Person[numpeople];
  
  
  public static Person addPerson(String _name, Gender _gender, int _weight, int age)
  {
      
   Person temp = new Person(_name,_gender,_weight); 
  people.add(temp); 
   return(temp);
  }
  
 Person()
 {
     name = "---";
     gender = Gender.Male;  
        
      
  }
 Person(String _name,Gender _gender,int _weight)
 {
     name = _name;
     gender =_gender;  
        
      
  }
 
   public void setName(String _name)
 {
   
       name = _name; 
      
  }
      public void setGender(Gender _gender)
 {
   
       gender = _gender; 
      
  }
  public void setWeight(int _weight)
 {
   
       weight = _weight; 
      
  }
  public String getName()
 {
   
        return (name);
      
  }
  
   public Gender getGender()
 {
   return (gender);
      
  }
   
      public int getWeight()
 {
   return (weight);
      
  }
   public static void printNames()
   {
       for (Person temp : people)
       {
//           if (temp != null)
//           {
       
               System.out.println(temp.getName());
//           }
           }
       }
   

     public static void printGender(Gender _gender)
   {
       System.out.println("===print_Gender===" + _gender);
       for (Person temp : people)
       {

           if (temp.getGender() == _gender)
           {
               System.out.println(temp.getName());

           }
       }
   }
    public String toString()
    {
      return("Hi my name is" + name + "I am a" + gender + "I wieght" + weight + "pounds");  

     
      
      
    }

}