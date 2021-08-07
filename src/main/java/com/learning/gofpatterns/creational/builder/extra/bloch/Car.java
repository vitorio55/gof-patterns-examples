package com.learning.gofpatterns.creational.builder.extra.bloch;

public class Car {
    /*******************************
     * This is an immutable class
     * Only getters are present
     *******************************/

    // Let's assume these are the only required attributes
    private final String engine;
    private final String maker;

    // These are optional attributes
    private final Color color;
    private final int year;
    private final int seats;
    private final int doors;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.maker = builder.maker;
        this.color = builder.color;
        this.year = builder.year;
        this.seats = builder.seats;
        this.doors = builder.doors;
    }

    public String getEngine() {
        return engine;
    }

    public String getMaker() {
        return maker;
    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return String.format("""
                This car's info...
                  Engine: %s
                   Maker: %s
                   Color: %s
                    Year: %s
                   Seats: %s
                   Doors: %s
                """, engine, maker, color, year, seats, doors);
    }

    public static class Builder {
        private String engine;
        private String maker;
        private Color color;
        private int year;
        private int seats;
        private int doors;

        public Builder(String engine, String maker) {
            this.engine = engine;
            this.maker = maker;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder seats(int seats)  {
            this.seats = seats;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            this.validate();
            return new Car(this);
        }

        private void validate() throws IllegalStateException {
            if (this.engine == null || this.engine.isBlank()) {
                throw new IllegalStateException("Car must have an engine!");
            }
            if (this.maker == null || this.maker.isBlank()) {
                throw new IllegalStateException("Car must have a maker!");
            }
        }
    }
}
