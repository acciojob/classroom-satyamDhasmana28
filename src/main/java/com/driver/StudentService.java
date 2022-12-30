package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.addStudentInDb(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacherInDb(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        studentRepository.addStudentTeacherPairInDb(student,teacher);
    }

    public Student getStudentByName(String name) {
        Student student = studentRepository.getStudentByNameFromDb(name);
        return student;
    }

    public Teacher getTeacherByName(String name) {
        Teacher result = studentRepository.getTeacherByNameFromDb(name);
        return result;
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        List<String> studenList = studentRepository.getStudentsByTeacherNameFromDb(teacher);
        return studenList;
    }

    public List<String> getAllStudents() {
        List<String> studentList = studentRepository.getAllStudentsFromDb();
        return studentList;
    }

    public void deleteTeacherByName(String teacher) {
        studentRepository.deleteTeacherByNameFromDb(teacher);
    }

    public void deleteAllTeachers() {
        studentRepository.deleteAllTeachersFromDb();
    }
}
