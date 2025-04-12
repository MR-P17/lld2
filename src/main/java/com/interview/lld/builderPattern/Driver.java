package com.interview.lld.builderPattern;

/**
 * Author: Prashant K Singh
 * Date: 10/04/2025
 * Time: 15:23
 */

public class Driver {
    public static void main(String[] args) {
        Student student = Student.studentBuilder()
                .name("Prashant")
                .age(27)
                .currentClass(11)
                .rollNumber("ABC0017")
                .height(1.83)
                .weight(87.5)
                .address("Gurgoan")
                .fatherName("Shiv Kumar Singh")
                .motherName("Usha Devi")
                .build();

        System.out.println(student);
    }
}
