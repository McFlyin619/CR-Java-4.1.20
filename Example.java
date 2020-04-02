public class Example {
    public static void main(String[] args) {
        User u1 = new User("OBrien",32);
        User u2 = new User("Chris",30);
        u1.printUser();
        u2.printUser();

        Student s1 = new Student("Dominique",27,8);
        Student s2 = new Student("Carter", 35, 8);
        s1.printStudent();
        s2.printStudent();

        Animal a1 = new Animal("Baby", "Shark");
        Animal a2 = new Animal("Scooby", "Dog");
        a1.printAnimal();
        a2.printAnimal();

        a1.attack(s1);
        a2.attack(s2);
    }
}