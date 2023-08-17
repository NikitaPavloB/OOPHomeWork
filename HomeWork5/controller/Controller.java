package HomeWork5.controller;



import java.util.Calendar;

import HomeWork5.model.data.Student;
import HomeWork5.model.data.Teacher;
import HomeWork5.model.service.DataService;
import HomeWork5.model.service.UserService;

public class Controller {

  private DataService<Student> serviceStudent = new UserService<>();

  public Student createNewStudent(String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall) {
    return serviceStudent.createStudent(name, lastName, birthDay, group, speciality, meanBall);
  }

  private DataService<Teacher> serviceTeacher = new UserService<>();

  public Teacher createNewTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    return serviceTeacher.createTeacher(name, lastName, birthDay, disciplines, department, rating);
  }

}