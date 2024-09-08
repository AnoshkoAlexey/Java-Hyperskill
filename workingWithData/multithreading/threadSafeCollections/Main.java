package workingWithData.multithreading.threadSafeCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> onWriteArrayList = new CopyOnWriteArrayList<>();
        onWriteArrayList.add("List");
        System.out.println(onWriteArrayList.get(0));
    }
}
