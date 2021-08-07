package com.learning.gofpatterns.creational.builder.second.builders;

public abstract class HouseBuilder {
    protected String foundation;
    protected String structure;
    protected String extraRoom;
    protected String roof;
    protected boolean painted;
    protected boolean furnished;
    protected boolean chimney;

    public void reset() {
        this.foundation = "";
        this.structure = "";
        this.extraRoom = "";
        this.roof = "";
        this.painted = false;
        this.furnished = false;
        this.chimney = false;
    }

    abstract void validate() throws IllegalStateException;

    public abstract HouseBuilder buildFoundation();
    public abstract HouseBuilder buildStructure();
    public abstract HouseBuilder buildRoof();
    public abstract HouseBuilder buildChimney();
    public abstract HouseBuilder paintHouse();
    public abstract HouseBuilder furnishHouse();

    public HouseBuilder buildExtraRoom(String extraRoom) {
        this.extraRoom = extraRoom;
        return this;
    }

    public HouseBuilder changeExtraRoom(String extraRoom) {
        this.extraRoom = extraRoom;
        return this;
    }

    public HouseBuilder destroyChimney() {
        this.chimney = false;
        return this;
    }
}
