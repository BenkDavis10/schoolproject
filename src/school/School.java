
package school;


public class School {

    public static void main(String[] args) {
   
        
     Person joe = Person.addPerson("Joe",Person.Gender.Male,4,190);   
     Person ashley = Person.addPerson("Ashley",Person.Gender.Female,8,70000);      
     Person al = Person.addPerson("al",Person.Gender.Male,14,500);    
     Person.printGender(Person.Gender.Male);
     System.out.println("Bush did 9/11");
     
     al.getWeight();
    System.out.println (ashley.toString()); 
    }
}
