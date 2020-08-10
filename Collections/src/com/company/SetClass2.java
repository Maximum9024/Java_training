package com.company;

import java.util.*;

public class SetClass2 {
    public static void main(String[] args) {

        Set<String> mySet= new HashSet();
        mySet.add("Kiana");
        mySet.add("Max");
        mySet.add("Cole");
        mySet.add("Ella");
        mySet.add("Nicky");
        mySet.add("Gidd");
        mySet.add("Fred");
        Iterator<String> it= mySet.iterator();
        System.out.println(" unsorted items ");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\nsorted items ");

        List SyncedSet=new ArrayList( mySet);
        Collections.sort(SyncedSet);
        Collections.synchronizedList(SyncedSet);
        Iterator<Long> it2=SyncedSet.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next()+" ");
        }

    }
}

class HashSetclass{
    public static void main(String[] args) {
        HashSet<Long> LongNumbers= new HashSet<>();
        LongNumbers.add(12l);
        LongNumbers.add(9l);
        LongNumbers.add(46l);
        LongNumbers.add(23l);
        LongNumbers.add(12l);
        LongNumbers.add(35l);
        LongNumbers.add(4l);
        List Longs= new ArrayList(LongNumbers);

        Collections.sort(Longs);

    }
}
class VectorSet{
    public static void main(String[] args) {
        Vector<Long> VectLong= new Vector<>();
        VectLong.add(11l);
        VectLong.add(56l);
        VectLong.add(14l);
        VectLong.add(8l);
        VectLong.add(8l);

        Collections.sort(VectLong);
        System.out.println(VectLong);
    }

}
class LinkedListSet{
    public static void main(String[] args) {
        LinkedList<Long> MyList= new LinkedList<>();
        MyList.add(23l);
        MyList.add(45l);
        MyList.add(90l);
        MyList.add(11l);
        MyList.add(233l);
        Collections.sort(MyList);

    }
}