package school;
public class School {
    public static void main(String[] args) {
        Person joe = 
        Person.addPerson("Joe",Person.Gender.Male,120);
        Student jill = 
        Student.addStudent("Jill",Person.Gender.Female,105,9);
        jill.setName("Julie");
        Student billyJoe = 
        Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        
        billyJoe.getWeight();
        int val = billyJoe.getWeight();
        
        Person.printNames();
        Person.printNames(Person.Gender.Female);
        
     
        
        Course geom = 
        Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo = 
        Course.addCourse("Photography", Course.Type.Elective, 3);
        Course.printNames();
    
        
    //    geom.addPerson(joe);
 
 
        
        System.out.println(joe);        
        
        Student bobby = 
        Student.addStudent("Bobby",Person.Gender.Male,168,11);
        geom.addStudent(bobby);
        
        System.out.println(bobby.getName());
        Person.printNames();
        Student.printNames();
      
    }
}
