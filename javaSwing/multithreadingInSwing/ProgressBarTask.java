package javaSwing.multithreadingInSwing;

import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class ProgressBarTask extends SwingWorker<Integer, Integer> {
    private int counter;
    private final JTextArea textArea;
    private final JProgressBar progressBar;

    ProgressBarTask(JTextArea textArea, JProgressBar progressBar) {
        this.textArea = textArea;
        this.progressBar = progressBar;
    }

    @Override
    public Integer doInBackground() throws Exception {
        while (counter < 100 && !isCancelled()) {
            Thread.sleep(100L);
            publish(counter++);

            setProgress(counter);
        }

        return counter;
    }

    @Override
    protected void process(List<Integer> chunks) {
        int value = chunks.get(0);

        textArea.setText("loading " + value + "%");
        progressBar.setValue(value);
    }

}
