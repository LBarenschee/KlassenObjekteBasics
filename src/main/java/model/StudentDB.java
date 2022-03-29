package model;

import java.util.Arrays;

public class StudentDB {
    Students[] students;

    public StudentDB(Students[] students) {
        this.students = students;
    }

    public Students[] getAllStudents(){
        return students;
    }

    public Students randomStudent(){
        int index = (int) ((double) students.length * Math.random());
        return students[index];
    }

    public void addStudent(Students newStudent){
        students = Arrays.copyOf(students, students.length +1);
        students[students.length -1] = newStudent;
    }

    public Students[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "model.StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
