package codeOrganization.objectOrientedProgramming.otherConcepts.nestedClasses;

public class Painting {
    
    private String name;

    private static double length;
    private static double width;

    public static void setLength(double length) {
        Painting.length = length;
    }

    public static void setWidth(double width) {
        Painting.width = width;
    }

    public Painting(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }


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
            if (Painting.length > 5 && Painting.width > 3) {
                System.out.println("Big forest was drawn in a sketch!");
            } else {
                System.out.println("Small forest was drawn in a sketch!");
            }
        }

        private void drawBear() {
            System.out.println("Bear was drawn in a sketch!");
        }
    }
}
