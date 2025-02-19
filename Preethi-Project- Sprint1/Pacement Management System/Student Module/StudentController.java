//Student Controller Class:
package com.tns.placementservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
 @Autowired
 private StudentService studentService;
 @GetMapping("/student")
 public List<Student> getAllStudents() {
 return studentService.getAllStudents();
 }
 @GetMapping("/student/{id}")
 public Student getStudentById(@PathVariable Long id) {
 return studentService.getStudentById(id);
 }
 @PostMapping("/student")
 public Student addStudent(@RequestBody Student student) {
 return studentService.addStudent(student);
 }
 @PutMapping("/student/{id}")
 public Student updateStudent(@PathVariable Long id,
 @RequestBody Student student) {
 return studentService.updateStudent(id, student);
 }
 @DeleteMapping("/student/{id}")
 public void deleteStudent(@PathVariable Long id) {
 studentService.deleteStudent(id);
 }
}
