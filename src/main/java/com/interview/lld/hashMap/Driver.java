package com.interview.lld.hashMap;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 18:00
 */

public class Driver {
    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable(67);
        hashTable.put(1, "Hello");
        hashTable.put("Hi", "World");
        hashTable.put(3,7);
        hashTable.put(3,9);

        System.out.println(hashTable.get("Hi"));
    }
}
