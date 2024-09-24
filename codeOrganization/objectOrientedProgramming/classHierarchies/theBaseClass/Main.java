package codeOrganization.objectOrientedProgramming.classHierarchies.theBaseClass;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Smith", 31);
        Person p2 = new Person("John", "Smith", 31);
        Person p3 = new Person("Marry", "Smith", 30);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        String person1 = new String("John Smith");
        String person2 = new String("John Smith");
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(p3.hashCode());
    }
}
