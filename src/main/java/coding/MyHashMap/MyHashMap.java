package coding.MyHashMap;

import groovy.util.MapEntry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2021/5/18 下午8:02
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
public class MyHashMap<K, V> {
    static class Node<K, V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;
        Node next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }

//    public V put(K key, V value){
//        return putVal()
//    }
//
//    public  V putVal(long hash, K key, V value){
//        long index = hash << 16 & hash;
//    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
    }
}
