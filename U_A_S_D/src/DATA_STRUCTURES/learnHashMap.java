package DATA_STRUCTURES;

import java.util.HashMap;

public class learnHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> MyHashMap = new HashMap();


        System.out.println( "MyHashMap entrySet : " + MyHashMap.entrySet() );

        System.out.println( "MyHashMap hashCode : " + MyHashMap.hashCode() );

        System.out.println( "MyHashMap getClass : " + MyHashMap.getClass() );
    }
}
