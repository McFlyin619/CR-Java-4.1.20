
public class Student extends User{
    public int cohortNumber;
    
    public Student(String name,int age,int cohortNumber){
        super(name, age);
        this.cohortNumber=cohortNumber;
    }

    public void printStudent(){
        System.out.println("Student Information");
        System.out.println("Cohort: "+cohortNumber);
        System.out.println("-------------------");
        printUser();
    }
}