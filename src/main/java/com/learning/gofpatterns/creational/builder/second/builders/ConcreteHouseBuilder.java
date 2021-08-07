package com.learning.gofpatterns.creational.builder.second.builders;

import com.learning.gofpatterns.creational.builder.second.products.House;

public class ConcreteHouseBuilder extends HouseBuilder {

    public ConcreteHouseBuilder() {
        this.reset();
    }

    @Override
    void validate() throws IllegalStateException {
        // Let's assume that:
        //   * We MUST have a chimney for our concrete house
        //   * Our extra room must have concrete among its materials

        if (!this.chimney) {
            throw new IllegalStateException("Our house must have a chimney!");
        }
        if (!this.extraRoom.toLowerCase().contains("concrete")) {
            throw new IllegalStateException("Our extra room must be made of concrete!");
        }
    }

    @Override
    public HouseBuilder buildFoundation() {
        this.foundation = "Concrete, brick, and stone";
        return this;
    }

    @Override
    public HouseBuilder buildStructure(){
        this.structure = "Concrete, mortar, brick, and reinforced steel";
        return this;
    }

    @Override
    public HouseBuilder buildRoof(){
        this.roof = "Concrete and reinforced steel";
        return this;
    }

    @Override
    public HouseBuilder buildChimney() {
        this.chimney = true;
        return this;
    }

    @Override
    public HouseBuilder paintHouse(){
        this.painted = true;
        return this;
    }

    @Override
    public HouseBuilder furnishHouse(){
        this.furnished = true;
        return this;
    }

    public House getHouse() {
        this.validate();
        return new House(foundation, structure, extraRoom, roof, furnished, painted, chimney);
    }
}