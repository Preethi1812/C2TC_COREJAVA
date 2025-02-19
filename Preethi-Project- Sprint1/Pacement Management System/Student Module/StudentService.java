//Student Service Class:
package com.tns.placementservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
 @Autowired
 private StudentRepository studentRepository;
 public List<Student> getAllStudents() {
 return studentRepository.findAll();
 }
 public Student getStudentById(Long id) {
 return studentRepository.findById(id).orElse(null);
 }
 public Student addStudent(Student student) {
 return studentRepository.save(student);
 }
 public Student updateStudent(Long id, Student studentDetails) {
 Student student = studentRepository.findById(id).orElse(null);
 if (student != null) {
 student.setName(studentDetails.getName());
 student.setEmail(studentDetails.getEmail());
 student.setPhone(studentDetails.getPhone());
 student.setCollege(studentDetails.getCollege());
 student.setCourse(studentDetails.getCourse());
 return studentRepository.save(student);
 }
 return null;
 }
 public void deleteStudent(Long id) {
 studentRepository.deleteById(id);
 }
}
