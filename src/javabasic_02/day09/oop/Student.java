package javabasic_02.day09.oop;

import java.util.Arrays;

public class Student {
    //Student 멥버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    public String gender;
    private Integer[] score = new Integer[3];
    private Integer totalscore = 0;
    private Double avg ;

    //생성자를 통하여 학생의 객체의 필드를 초기화
    Student() {     //기본 생성자

    }
    Student(String stu_neme, String stu_ssn) {
        this.stu_name = stu_neme;
        this.stu_ssn = stu_ssn;
    }
    Student(String stu_neme,Integer stu_age,String address, String stu_ssn) {
        this.stu_name = stu_neme;
        this.stu_ssn=stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }
    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

// ------------------------------------------------------------------   학생의 점수 확인

    Student(Integer kor,Integer math, Integer eng) {
        this.score[0] = kor;
        this.score[1] = math;
        this.score[2] = eng;

    }

    public Integer[] getScore() {
        return score;
    }   //점수 가지고 오는거

    public Integer getTotalScore() {
        for (int i = 0; i<3; i++) {
            totalscore += score[i];
        }
        return totalscore;
    }

    public Double getAvg() {
        avg = (double) totalscore/score.length;
        return avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_ssn='" + stu_ssn + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                '}';
    }
}