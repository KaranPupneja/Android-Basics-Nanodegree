package com.example.ayaan.reportcard;

/**
 * Created by AYAAN on 3/5/2017.
 */

public class ReportCard {
    private String mStudent;
    private String mTeacher;
    private String mSchool;
    private String mTextbook;
    private int mphoto;
    public ReportCard(String Student,String Teacher){
        mStudent = Student;
        mTeacher = Teacher;
    }
    public ReportCard(String Student,String Teacher,int photo,String School,String Textbook){
        mStudent = Student;
        mTeacher = Teacher;
        mStudent = School;
        mphoto = photo;
        mTextbook = Textbook;
    }
    public String getmStudent(){
        return mStudent;
    }
    public String getmTeacher(){
        return mTeacher;
    }
    public String getmSchool(){
        return mSchool;
    }
    public String getmTextbook(){
        return mTextbook;
    }
    public int getMphoto(){
        return mphoto;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudent='" + mStudent + '\'' +
                ", mTeacher='" + mTeacher + '\'' +
                ", mSchool='" + mSchool + '\'' +
                ", mTextbook='" + mTextbook + '\'' +
                ", mphoto=" + mphoto +
                '}';
    }
}