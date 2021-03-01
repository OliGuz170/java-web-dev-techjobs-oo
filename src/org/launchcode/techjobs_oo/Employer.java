package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField{
    /*The following code was commented out after extending JobField class into Employer
    private int id;
    private static int nextId = 1; //changing value not stored in Employer object
    private String value;

    constructor - every new Employer object will get a different ID#
    public Employer() {
        id = nextId;
        nextId++;
    }*/

    //constructor - calls Employer constructor to initialize ID. Also assigns String value to value field.
    public Employer(String value) {
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
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    /*The following code was commented out after extending JobField class into Employer
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

     Getters and Setters:

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
