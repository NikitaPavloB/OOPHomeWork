package HomeWork5.model.data;

import java.util.Calendar;

public class Student extends User {

    private static int studentIdCounter = 1;
    private int studentId;
    private String group;
    private String speciality;
    private double meanBall;

    public Student(String name, String lastName, Calendar birthDay, String group, String speciality,
            double meanBall) {
        super(name, lastName, birthDay);
        this.studentId = studentIdCounter++;
        this.group = group;
        this.speciality = speciality;
        this.meanBall = meanBall;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(double meanBall) {
        this.meanBall = meanBall;
    }

    @Override
    public String toString() {
        return "Студент: Фамилия - " + getLastName() + ", Имя - " + getName() + ", Специальность - " + getSpeciality()
                + ", Средний балл - " + getMeanBall();
    }
}
