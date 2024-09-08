package workingWithData.multithreading.threadSafeCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main4 {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> onWriteArrayList = new CopyOnWriteArrayList<>();
        onWriteArrayList.add(1);
        onWriteArrayList.add(2);
        onWriteArrayList.add(3);

        Iterator<Integer> iterator = onWriteArrayList.iterator();

        onWriteArrayList.add(4);

        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " "); // we will see only "1 2 3"
        }
    }
    
}
