package com.jpa.dto;

import java.util.List;

import com.jpa.model.Student;

public class StudentPageResponse {
   private List<Student> students;
   private int currentPage;
   private int totalPage;
   private long totalElemets;
   private boolean lastpage;
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public long getTotalElemets() {
	return totalElemets;
}
public void setTotalElemets(long totalElemets) {
	this.totalElemets = totalElemets;
}
public boolean isLastpage() {
	return lastpage;
}
public void setLastpage(boolean lastpage) {
	this.lastpage = lastpage;
}
   
   
}
