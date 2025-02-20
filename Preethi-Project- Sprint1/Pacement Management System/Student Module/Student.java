//Student Entity Class:
package com.tns.placementservice;
import jakarta.persistence.*;
@Entity
public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 private String email;
 private String phone;
 private String college;
 private String course;
 public Long getId() {
  return id;
 }
 public void setId(Long id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public String getPhone() {
  return phone;
 }
 public void setPhone(String phone) {
  this.phone = phone;
 }
 public String getCollege() {
  return college;
 }
 public void setCollege(String college) {
  this.college = college;
 }
 public String getCourse() {
  return course;
 }
 public void setCourse(String course) {
  this.course = course;
 }
 public Student() {
  super();
 }
 public Student(Long id, String name, String email, String phone, String college, String course) {
  super();
  this.id = id;
  this.name = name;
  this.email = email;
  this.phone = phone;
  this.college = college;
  this.course = course;
 }
}