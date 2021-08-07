package com.learning.gofpatterns.creational.builder.second;

import com.learning.gofpatterns.creational.builder.second.builders.ConcreteHouseBuilder;
import com.learning.gofpatterns.creational.builder.second.builders.WoodHouseBuilder;
import com.learning.gofpatterns.creational.builder.second.directors.Director;
import com.learning.gofpatterns.creational.builder.second.products.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class BuilderPatternTests {

    @Test
    @DisplayName("WoodHouseBuilder - validate() prevents invalid state")
    public void woodHouseBuilder_validate_operation() {
        WoodHouseBuilder builder = new WoodHouseBuilder();
        Director director = new Director(builder);

        // Building a wood house...
        director.constructHouseWithWoodExtraRoom();

        // A wood house with an extra room made of anything but wood is against our design!
        builder.changeExtraRoom("concrete");
        assertThrows(IllegalStateException.class, builder::getHouse);

        // A wood house with a wood extra room is OK
        builder.changeExtraRoom("wood");
        House house = builder.getHouse();
        assertTrue(house.toString().contains("Extra Room: wood"));
    }

    @Test
    @DisplayName("ConcreteHouseBuilder - validate() prevents invalid state")
    public void concreteHouseBuilder_validate_operation() {
        ConcreteHouseBuilder builder = new ConcreteHouseBuilder();
        Director director = new Director(builder);

        // Building a concrete house...
        director.constructHouseWithConcreteExtraRoom();

        // A concrete house with an extra room made of anything but concrete is against our design!
        builder.changeExtraRoom("wood");
        assertThrows(IllegalStateException.class, builder::getHouse);

        // A concrete house with a concrete extra room but without a chimney is against our design!
        builder.changeExtraRoom("concrete");
        builder.destroyChimney();
        assertThrows(IllegalStateException.class, builder::getHouse);

        // A concrete house with a concrete extra room and a chimney is OK
        builder.buildChimney();
        House house = builder.getHouse();
        Assertions.assertAll(
                () -> assertTrue(house.toString().contains("Extra Room: concrete")),
                () -> assertTrue(house.toString().contains("Chimney: true"))
        );
    }

    @Test
    @DisplayName("Director - Must build house in correct order")
    public void director_correct_order() {
        ConcreteHouseBuilder builderMock = mock(ConcreteHouseBuilder.class);
        Director director = new Director(builderMock);

        given(builderMock.buildFoundation()).willReturn(builderMock);
        given(builderMock.buildStructure()).willReturn(builderMock);
        given(builderMock.buildExtraRoom(anyString())).willReturn(builderMock);
        given(builderMock.buildRoof()).willReturn(builderMock);
        given(builderMock.buildChimney()).willReturn(builderMock);
        given(builderMock.paintHouse()).willReturn(builderMock);
        given(builderMock.furnishHouse()).willReturn(builderMock);

        director.constructHouseWithConcreteExtraRoom();

        InOrder inOrder = Mockito.inOrder(builderMock);

        // Verify that the Director is not violating the house building steps order
        inOrder.verify(builderMock).buildFoundation();
        inOrder.verify(builderMock).buildStructure();
        inOrder.verify(builderMock).buildExtraRoom(anyString());
        inOrder.verify(builderMock).buildRoof();
        inOrder.verify(builderMock).buildChimney();
        inOrder.verify(builderMock).paintHouse();
        inOrder.verify(builderMock).furnishHouse();
    }
}
