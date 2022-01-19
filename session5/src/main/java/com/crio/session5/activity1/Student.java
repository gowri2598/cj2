package com.crio.session5.activity1;

public class Student {
    private int rollNo;
    private String fname;
    private String lname;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Student(int rollNo, String fname, String lname) {
        this.rollNo = rollNo;
        this.fname = fname;
        this.lname = lname;
    }
    @Override
    public String toString() {
        return "Student [fname=" + fname + ", lname=" + lname + ", rollNo=" + rollNo + "]";
    }
    
}
