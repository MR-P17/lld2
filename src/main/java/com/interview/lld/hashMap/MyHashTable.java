package com.interview.lld.hashMap;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 17:35
 */

@Data
public class MyHashTable <K,V>{
    private static final Integer INITIAL_SIZE = 1<<4;
    private static final Integer MAX_CAPACITY = 1<<30;

    private Entry [] hashTable;

    public MyHashTable(){
        this.hashTable = new Entry[INITIAL_SIZE];
    }

    public  MyHashTable (Integer capacity){
        Integer nextSize = getNextTableSize(capacity);
        this.hashTable = new Entry[nextSize];
    }

    public Integer getNextTableSize(Integer capacity){
        int n = capacity -1;
        n = n | n >>>1;
        n = n | n >>>2;
        n = n | n >>>4;
        n = n | n >>>8;
        n = n | n >>>16;

        return (n<1) ? 1 : n >= MAX_CAPACITY ? MAX_CAPACITY : n+1;
    }

    public void put(K key, V value){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null){
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        }else{
            Entry previousNode = node;
            while(node != null){
                if(node.getKey() == key){
                    node.setValue(value);
                    return;
                }
                previousNode = node;
                node = node.getNext();
            }
            Entry newNode = new Entry(key, value);
            previousNode.setNext(newNode);
        }
    }

    public V get(K key){
        Integer hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];

        while(node != null){
            if(node.getKey() == key){
                return (V)node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }
}
