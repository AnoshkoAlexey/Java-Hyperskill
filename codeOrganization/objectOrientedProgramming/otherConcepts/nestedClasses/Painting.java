package codeOrganization.objectOrientedProgramming.otherConcepts.nestedClasses;

public class Painting {
    
    private String name;

    public static class Sketch {

        private int id;

        public Sketch(int id) {
            this.id = id;
        }

        public void drawSketch() {
            drawForest();
            drawBear();
        }

        private void drawForest() {
            System.out.println("Forest was drawn in a sketch!");
        }

        private void drawBear() {
            System.out.println("Bear was drawn in a sketch!");
        }
    }
}
