package org.launchcode;

public abstract class BaseDisc {

    public String name;
    public String contents;

    public int capacity;

    public String type;

    public BaseDisc(String name, String contents, int capacity, String type) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.type = type;
    }

    public abstract void play();

}
