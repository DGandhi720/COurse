public class Driver {
    public static void main(String[] args) {

        Course c1 = new Course();
        System.out.println("Default Course: " + c1); //This prints the default course stats

        c1.setId(101);
        c1.setName("Data Structures"); //This sets the c1 variable to the Data Structures Course
        c1.setCode("CS229");
        System.out.println("This is the course after being set: " + c1);


        Course c2 = new Course(102, "Algorithms", "CS229"); //And this sets the C2 to the Algorithims course
        System.out.println("Using a Overload, Overloaded Constructor Course: " + c2);
    }
}