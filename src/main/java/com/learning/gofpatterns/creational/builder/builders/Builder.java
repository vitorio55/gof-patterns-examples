package com.learning.gofpatterns.creational.builder.builders;

public interface Builder {
    Builder reset();
    Builder color(String color);
    Builder yearBuilt(String year);
    Builder floors(String floors);
    Builder mainMaterial(String mainMaterial);
    Builder value(String value);
    Builder windows(String windows);
    Builder doors(String doors);
    Builder rooms(String rooms);
}
