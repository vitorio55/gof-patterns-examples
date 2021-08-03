package com.learning.gofpatterns.creational.builder.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Structure {
    String color;
    String yearBuilt;
    String mainMaterial;
    String value;
    String windows;
    String doors;
    String floors;
    String rooms;

    public void showInfo() {
        System.out.println("This structure's info...");
        System.out.println("  -> color: " + this.color);
        System.out.println("  -> year: " + this.yearBuilt);
        System.out.println("  -> main material: " + this.mainMaterial);
        System.out.println("  -> value: " + this.value);
        System.out.println("  -> windows: " + this.windows);
        System.out.println("  -> doors: " + this.doors);
        System.out.println("  -> floors: " + this.floors);
        System.out.println("  -> rooms: " + this.rooms);
        System.out.println("");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }
}
