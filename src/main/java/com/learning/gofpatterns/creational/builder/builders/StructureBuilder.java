package com.learning.gofpatterns.creational.builder.builders;

import com.learning.gofpatterns.creational.builder.entities.Structure;

public class StructureBuilder implements Builder {
    String className;
    Structure structure;

    public StructureBuilder() {
        this.structure = new Structure();
        className = this.getClass().getSimpleName();
    }

    @Override
    public StructureBuilder reset() {
        this.structure = new Structure();
        return this;
    }

    @Override
    public StructureBuilder color(String color) {
        this.structure.setColor(color);
        return this;
    }

    @Override
    public StructureBuilder yearBuilt(String yearBuilt) {
        this.structure.setYearBuilt(yearBuilt);
        return this;
    }

    @Override
    public StructureBuilder mainMaterial(String mainMaterial) {
        this.structure.setMainMaterial(mainMaterial);
        return this;
    }

    @Override
    public StructureBuilder value(String value) {
        this.structure.setValue(value);
        return this;
    }

    @Override
    public StructureBuilder windows(String windows) {
        this.structure.setWindows(windows);
        return this;
    }

    @Override
    public StructureBuilder doors(String doors) {
        this.structure.setDoors(doors);
        return this;
    }

    @Override
    public StructureBuilder rooms(String rooms) {
        this.structure.setRooms(rooms);
        return this;
    }

    @Override
    public StructureBuilder floors(String floors) {
        this.structure.setFloors(floors);
        return this;
    }

    public Structure getResult() {
        Structure result = this.structure;
        this.structure = new Structure(); // As good practice, leave the Builder ready for another usage
        return result;
    }

    public String getClassName() {
        return this.className;
    }
}
