package com.interview.lld.hashMap;

import lombok.Data;

/**
 * Author: Prashant K Singh
 * Date: 14/04/2025
 * Time: 17:37
 */

@Data
public class Entry<K, V>{
    private K key;
    private V value;
    private Entry next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
