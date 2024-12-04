package com.interview.lld.fileSystem;

/**
 * Author: Prashant K Singh
 * Date: 04/12/2024
 * Time: 21:22
 */

public class Driver {
    public static void main(String[] args) {
        FileSystem directory1 = new Directory("MOVIE");
        FileSystem directory2 = new Directory("INDIAN");
        FileSystem directory3 = new Directory("HOLLYWOOD");
        FileSystem movie1 = new File("TRAIN TO BUSAN");
        FileSystem directory4 = new Directory("SOUTH");
        FileSystem directory5 = new Directory("BOLLYWOOD");
        FileSystem movie2 = new File("BLACK");
        FileSystem movie3 = new File("96");
        FileSystem movie4 = new File("LUCIFER");
        FileSystem movie5 = new File("SHOLEY");
        FileSystem movie6 = new File("SWADESH");
        FileSystem movie7 = new File("VANVAAS");
        FileSystem movie8 = new File("IRON MAN 3");
        FileSystem movie9 = new File("INTERSTELLER");

        directory4.addFileSystem(movie2);
        directory4.addFileSystem(movie3);
        directory4.addFileSystem(movie4);

        directory5.addFileSystem(movie5);
        directory5.addFileSystem(movie6);

        directory2.addFileSystem(directory4);
        directory2.addFileSystem(directory5);
        directory2.addFileSystem(movie7);

        directory3.addFileSystem(movie8);
        directory3.addFileSystem(movie9);

        directory1.addFileSystem(directory2);
        directory1.addFileSystem(movie1);

        System.out.println("Before remove action !!");
        directory1.ls();
        System.out.println("--------------------------");

        movie1.addFileSystem(movie2);
        movie1.removeFileSystem(movie2);

        directory1.removeFileSystem(movie1);

        System.out.println("After remove action !!");
        directory1.ls();
    }
}
