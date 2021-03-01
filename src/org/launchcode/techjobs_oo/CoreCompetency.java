package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    /*The following code was commented out after extending JobField class into Employer
    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }*/

    public CoreCompetency(String value) {
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
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return this.getId() == that.getId();
    }

    /*The following code was commented out after extending JobField class into Employer
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    } */
}


