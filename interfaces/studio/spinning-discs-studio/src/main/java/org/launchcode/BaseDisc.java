package org.launchcode;

public abstract class BaseDisc {

    public String name;
    public String contents;

    public int capacity;

    public String type;

    public int minRPMs;

    public int maxRPMs;

    public BaseDisc(String name, String contents, int capacity, String type, int minRPMs, int maxRPMs) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.type = type;
        this.minRPMs = minRPMs;
        this.maxRPMs = maxRPMs;
    }

    public abstract void play();

}
