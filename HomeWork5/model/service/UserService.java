package HomeWork5.model.service;



import java.util.Calendar;
import java.util.List;

import HomeWork5.model.data.Student;
import HomeWork5.model.data.Teacher;
import HomeWork5.model.data.User;

public class UserService<T extends User> implements DataService<T> {

    @Override
    public Student createStudent(String name, String lastName, Calendar birthDay, String group, String speciality,
            double meanBall) {
        Student student = new Student(name, lastName, birthDay, group, speciality, meanBall);
        return student;
    }

    @Override
    public Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
            String department, double rating) {
        Teacher teacher = new Teacher(name, lastName, birthDay, disciplines, department, rating);
        return teacher;
    }

    @Override
    public List<T> readDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readDate'");
    }

}