package com.learning.gofpatterns.creational.builder.bloch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoshuaBlochBuilderTests {

    @Test
    @DisplayName("Validation - Valid object created using Bloch's Builder Pattern")
    public void valid_object_creation() {
        String engine = "1.6";
        String maker = "Ford";

        Car car = new Car.Builder(engine, maker)
                .color(Color.RED)
                .year(1995)
                .seats(4)
                .doors(4)
                .build();

        assertEquals( "1.6", car.getEngine());
        assertEquals("Ford", car.getMaker());
        assertEquals(     Color.RED, car.getColor());
        assertEquals(  1995, car.getYear());
        assertEquals(     4, car.getSeats());
        assertEquals(     4, car.getDoors());
    }

    @Test
    @DisplayName("Validation - validate() throws exception when creating an object in an invalid state")
    public void invalid_state_throws_exception() {
        // Here invalid state means a Car without its required attributes

        String engine = null;
        String maker = null;

        assertThrows(IllegalStateException.class, () -> new Car.Builder(engine, maker)
                .color(Color.RED)
                .year(1995)
                .seats(4)
                .doors(4)
                .build());
    }
}
