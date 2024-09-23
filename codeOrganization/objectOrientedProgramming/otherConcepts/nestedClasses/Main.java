package codeOrganization.objectOrientedProgramming.otherConcepts.nestedClasses;

public class Main {
    public static void main(String[] args) {

        Painting.setLength(10);
        Painting.setWidth(7);

        Painting.Sketch sketch = new Painting.Sketch(0);
        sketch.drawSketch();
    }
}
