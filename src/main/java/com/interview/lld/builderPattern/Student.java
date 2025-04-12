package com.interview.lld.builderPattern;

/**
 * Author: Prashant K Singh
 * Date: 10/04/2025
 * Time: 15:08
 */

public class Student {
    private String name;
    private String rollNumber;
    private Integer age;
    private Double height;
    private Double weight;
    private Integer currentClass;
    private String address;
    private String motherName;
    private String fatherName;


    private Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.height = studentBuilder.height;
        this.weight = studentBuilder.weight;
        this.currentClass = studentBuilder.currentClass;
        this.address = studentBuilder.address;
        this.motherName = studentBuilder.motherName;
        this.fatherName = studentBuilder.fatherName;
    }

    public String toString(){
        return "StudentInfo -> [name : " + name  +", rollNumber : " + rollNumber + ", age : " + age + ", height : " + height + ", weight : " + weight + ",currentClass : " + currentClass + ", address : " + address + ", motherName : " + motherName + ", fatherName : " + fatherName +"]";
    }

    public static StudentBuilder studentBuilder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder{
        private String name;
        private String rollNumber;
        private Integer age;
        private Double height;
        private Double weight;
        private Integer currentClass;
        private String address;
        private String motherName;
        private String fatherName;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder rollNumber(String rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public StudentBuilder height(Double height){
            this.height = height;
            return this;
        }

        public StudentBuilder weight(Double weight){
            this.weight = weight;
            return this;
        }

        public StudentBuilder currentClass(Integer currentClass){
            this.currentClass = currentClass;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public StudentBuilder motherName(String motherName){
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder fatherName(String fatherName){
            this.fatherName = fatherName;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

