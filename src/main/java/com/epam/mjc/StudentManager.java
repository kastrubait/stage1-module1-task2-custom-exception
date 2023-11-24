package com.epam.mjc;

import javax.lang.model.type.NullType;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentCustomException {

      if (Student.getValueOf(studentID) == null) {
          throw new StudentCustomException("Could not find student with ID " + studentID);
      }
      return Student.getValueOf(studentID);
  }

  public static void main(String[] args) {
    try {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }
    }
    catch (StudentCustomException e) {
        System.out.println(e);
    }
  }
}