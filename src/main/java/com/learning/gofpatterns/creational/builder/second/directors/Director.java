package com.learning.gofpatterns.creational.builder.second.directors;

import com.learning.gofpatterns.creational.builder.second.builders.HouseBuilder;

public class Director {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouseWithWoodExtraRoom() {
        // The director knows the proper construction order
        this.houseBuilder
            .buildFoundation()
            .buildStructure()
            .buildExtraRoom("wood")
            .buildRoof()
            .buildChimney()
            .paintHouse()
            .furnishHouse();
    }

    public void constructHouseWithConcreteExtraRoom() {
        // The director knows the proper construction order
        this.houseBuilder
                .buildFoundation()
                .buildStructure()
                .buildExtraRoom("concrete")
                .buildRoof()
                .buildChimney()
                .paintHouse()
                .furnishHouse();
    }
}
