package codeOrganization.objectOrientedProgramming.otherConcepts.nestedClasses;

public class Outer {
    private int number = 10;

    void someMethod() {

        final int x = 5;
        class LocalInner {
            private void print() {
                System.out.println("x = " + x);
                System.out.println("Number = " + Outer.this.number);
            }
        }

        LocalInner inner = new LocalInner();
        inner.print();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.someMethod();
    }
}
