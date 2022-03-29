import model.*;

public class DBMain {

    public static void main(String[] args) {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Klaus Klausen", 111, "Java");
        ComputerScienceStudent student2 = new ComputerScienceStudent("Jan Jansen", 222, "Java");
        ComputerScienceStudent student3 = new ComputerScienceStudent("Hinrich Hinrichsen", 333, "Java");
        ChemistryStudent student4 = new ChemistryStudent("Jonas Jonasson", 444, "Tests");
        ComputerScienceStudent student5 = new ComputerScienceStudent("Paul Paulsen", 555, "Java");
        Students[] students = {student1, student2, student3, student4, student5};

        StudentDB newDB = new StudentDB(students);
        System.out.println(newDB);

        ComputerScienceStudent student6 = new ComputerScienceStudent("Marius", 666, "Java");
        System.out.println(student6);
    }

}
