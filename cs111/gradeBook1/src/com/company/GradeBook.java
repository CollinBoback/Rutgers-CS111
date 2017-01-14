package com.company;

/**
 * Created by collinboback on 11/17/16.
 */
public class GradeBook {

    private double[][] grades;
    private String[] roster;
    private String coursename;

    public GradeBook(String coursename, int numStudents) {

        this.coursename = coursename;
        this.roster = new String[numStudents];
        this.grades = new double[numStudents][10];
    }

    public GradeBook(String coursename, int numStudents, int numassn) {
        this(coursename, numStudents); // calls first constructor identified by parameters
        this.grades = new double[numStudents][numassn];
    }


    public double classAverage() {


        double sum = 0;

        for (int j = 0; j < grades.length; j++) {
            for (int i = 0; i < grades[j].length; i++) {
                sum += grades[i][j];
            }
        }

        return sum / (grades.length * grades[0].length);

    }

    public void addStudent(String name) {


        for (int i = 0; i < roster.length; i++) {

            if (roster[i] == null) {
                roster[i] = name;
                break;
            }

        }

    }

    public void setGrade(double grade, String name, int assn){

        for(int i = 0; i<roster.length; i++){
            if(roster[i].equals(name)){
                grades[i][assn] = grade;
            }
        }

    }

    public boolean equals(GradeBook b){

        return b.coursename.equals(this.coursename) && roster.length == b.roster.length && grades[0].length == b.grades[0].length;
    }

}
