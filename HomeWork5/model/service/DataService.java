package HomeWork5.model.service;



import java.util.Calendar;
import java.util.List;

import HomeWork5.model.data.Student;
import HomeWork5.model.data.Teacher;
import HomeWork5.model.data.User;

public interface DataService<T extends User> {

    Student createStudent(String name, String lastName, Calendar birthDay, String group, String speciality,
            double meanBall);

    Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
            String department, double rating);

    List<T> readDate();

}