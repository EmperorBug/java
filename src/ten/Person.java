package ten;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return (this.name == ((Person)o).name) ? true : false;
    }

}
