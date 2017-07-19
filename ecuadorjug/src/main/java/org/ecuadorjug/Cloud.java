package org.ecuadorjug;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by alberto on 7/17/17.
 */
public class Cloud {

    // own bean validation annotation
    @CloudNotValid
    private String name;

    @Min(1)
    @Max(10)
    private int hype;

    public Cloud() {
    }

    public Cloud(String name, int hype) {
        this.name = name;
        this.hype = hype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHype() {
        return hype;
    }

    public void setHype(int hype) {
        this.hype = hype;
    }

    @Override
    public String toString() {
        return "Cloud{" +
                "name='" + name + '\'' +
                ", hype=" + hype +
                '}';
    }
}
