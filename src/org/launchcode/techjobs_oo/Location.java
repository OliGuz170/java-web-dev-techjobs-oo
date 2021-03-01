package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{
    /*The following code was commented out after extending JobField class into Employer
    private int id;
    private static int nextId = 1;
    private String value;

    public Location() {
        id = nextId;
        nextId++;
    }*/

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public Location(String value) {
        super(value);
        /*The following code was commented out after extending JobField class into Employer
        this();
        this.value = value; */
    }

    // Custom toString, equals, and hashCode methods:
/*The following code was commented out after extending JobField class into Employer
    @Override
    public String toString() {
        return value;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    /*The following code was commented out after extending JobField class into Employer
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    } */
}
