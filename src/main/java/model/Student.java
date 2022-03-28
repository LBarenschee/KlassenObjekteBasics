package model;
import java.time.LocalDate;


public class Student {

    private String name;
    private String subject;
    private boolean isActive;


    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;


       System.out.println(getStudentDataAString());
    }
/*
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", isActive=" + isActive +
                '}';
    }*/

    public String getStudentDataAString(){
        String name = this.name + " ist ";
        String isActive;
        if(this.isActive){
            isActive = "aktiver Student ";
        } else {
            isActive = "inaktiver Student";
        }
        String subject = " im Fach " + this.subject + ".";
        return name + isActive + subject;
    }


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
