package javaSwing.modelViewControllerInSwing;

public class Model {
    private int number;

    public Model(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void increment() {
        this.number++;
    }

}
