package codeOrganization.objectOrientedProgramming.classHierarchies.theBaseClass;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    // constructor, getters and setters
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public boolean equals(Object other) {

        // Check this and other refer to the same object */
        if (this == other) {
            return true;
        }

        // Check other is Person and not null
        if (!(other instanceof Person)) {
            return false;
        }

        Person person = (Person) other;

        // Compare all required fields
        return age == person.age &&
                Objects.equals(firstName,person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

}
