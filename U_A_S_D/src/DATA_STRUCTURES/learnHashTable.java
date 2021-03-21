package DATA_STRUCTURES;

import java.util.Hashtable;

public class learnHashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> MyHashTable = new Hashtable<>();


        System.out.println( "MyHashTable entrySet : " + MyHashTable.entrySet() );

        System.out.println( "MyHashTable hashCode : " + MyHashTable.hashCode() );

        System.out.println( "MyHashTable getClass : " + MyHashTable.getClass() );

    }

}
