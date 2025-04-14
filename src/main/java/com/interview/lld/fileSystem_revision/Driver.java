package com.interview.lld.fileSystem_revision;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 14:39
 */


public class Driver {
    public static void main(String [] args){
        Directory directory1 = new Directory("Hollywood Movies");
        Directory directory2 = new Directory("Indian Movies");

        FileSystem movie1_1 = new File("Dr Doom", new Byte[100]);
        FileSystem movie2_1 = new File("Murder Mindfully", new Byte[1000]);
        Directory directory2_1 = new Directory("Old Movies");
        FileSystem movie2_1_1 = new File("Star Wars", new Byte[200]);
        FileSystem movie2_1_2 = new File("Bathtub Time Machine", new Byte[300]);

        directory2_1.addToDirectory(movie2_1_1);
        directory2_1.addToDirectory(movie2_1_2);
        directory1.addToDirectory(movie1_1);
        directory1.addToDirectory(movie2_1);
        directory1.addToDirectory(directory2_1);

        FileSystem movie1_2 = new File("96", new Byte[96]);
        FileSystem movie2_2 = new File("Lucifer", new Byte[666]);
        Directory directory2_2 = new Directory("Bollywood Movies");
        FileSystem movie2_2_1 = new File("No Smoking", new Byte[102]);

        directory2_2.addToDirectory(movie2_2_1);
        directory2.addToDirectory(directory2_2);
        directory2.addToDirectory(movie1_2);
        directory2.addToDirectory(movie2_2);

        directory1.ls();
        directory2.ls();
    }
}
