package com.learning.gofpatterns.creational.builder.second.products;

public class House {
    // This is an immutable class
    private final String foundation;
    private final String structure;
    private final String extraRoom;
    private final String roof;
    private final boolean furnished;
    private final boolean painted;
    private final boolean chimney;

    public House(String foundation, String structure, String extraRoom, String roof, boolean furnished, boolean painted, boolean chimney) {
        this.foundation = foundation;
        this.structure = structure;
        this.extraRoom = extraRoom;
        this.roof = roof;
        this.furnished = furnished;
        this.painted = painted;
        this.chimney = chimney;
    }

    @Override
    public String toString() {
        return String.format("""
                This house's info...
                  Foundation: %s
                   Structure: %s
                  Extra Room: %s
                        Roof: %s
                Is Furnished: %s
                  Is Painted: %s
                 Has Chimney: %s
                """, foundation, structure, extraRoom, roof, furnished, painted, chimney);
    }
}