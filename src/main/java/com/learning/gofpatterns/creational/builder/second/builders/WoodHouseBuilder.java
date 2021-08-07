package com.learning.gofpatterns.creational.builder.second.builders;

import com.learning.gofpatterns.creational.builder.second.products.House;

public class WoodHouseBuilder extends HouseBuilder {

    public WoodHouseBuilder() {
        this.reset();
    }

    @Override
    void validate() throws IllegalStateException {
        // Let's assume that:
        //   * Our extra room must have wood among its materials

        if (!this.extraRoom.toLowerCase().contains("wood")) {
            throw new IllegalStateException("Our extra room must be made of wood!");
        }
    }

    @Override
    public HouseBuilder buildFoundation() {
        this.foundation = "Wood, laminate, and PVC flooring";
        return this;
    }

    @Override
    public HouseBuilder buildStructure() {
        this.structure = "Structural steels and wooden wall panels";
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        this.roof = "Roofing sheets";
        return this;
    }

    @Override
    public HouseBuilder buildChimney() {
        this.chimney = true;
        return this;
    }

    @Override
    public HouseBuilder paintHouse() {
        this.painted = true;
        return this;
    }

    @Override
    public HouseBuilder furnishHouse() {
        this.furnished = true;
        return this;
    }

    public House getHouse() {
        this.validate();
        return new House(foundation, structure, extraRoom, roof, furnished, painted, chimney);
    }
}
