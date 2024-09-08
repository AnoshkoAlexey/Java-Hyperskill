package workingWithData.multithreading.threadSafeCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main3 {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> onWriteArrayList = new CopyOnWriteArrayList<>();
        Thread writer = new Thread(() -> addNumbers(onWriteArrayList));
        writer.start();

        removeNumbers(onWriteArrayList); // remove numbers from the main thread

        writer.join(); // wait for the writer thread to finish

        System.out.println(onWriteArrayList.size()); // the result is always the same
    }

    private static void addNumbers(CopyOnWriteArrayList<Integer> list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
    }

    private static void removeNumbers(CopyOnWriteArrayList<Integer> list) {
        int index = 0;
        while (index < 100_000) {
            if (!list.isEmpty()) {
                list.remove(0);
                index++;
            }
        }
    }
}
