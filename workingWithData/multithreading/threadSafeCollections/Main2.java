package workingWithData.multithreading.threadSafeCollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> onWriteArrayList = new CopyOnWriteArrayList<>();
        Thread writer = new Thread(() -> addNumbers(onWriteArrayList));
        writer.start();

        addNumbers(onWriteArrayList); // add numbers from the main thread

        writer.join(); // wait for the writer thread to finish

        System.out.println(onWriteArrayList.size()); // the result is always the same
    }

    private static void addNumbers(CopyOnWriteArrayList<Integer> list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
    }
}
