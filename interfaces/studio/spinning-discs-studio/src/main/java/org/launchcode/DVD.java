package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    private String category;

    private Double rottenTomatoesScore;

    boolean isMovie;

    boolean hasEndCreditsScene;

    // in MBs
    public static final int maxCapacity = 4700;

    public DVD(String name, String contents, int capacity, String type, int minRPMs, int maxRPMs, String category, Double rottenTomatoesScore, boolean isMovie, boolean hasEndCreditsScene) {
        super(name, contents, capacity, type, minRPMs, maxRPMs);
        this.category = category;
        this.rottenTomatoesScore = rottenTomatoesScore;
        this.isMovie = isMovie;
        this.hasEndCreditsScene = hasEndCreditsScene;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void play() {
        System.out.println("This DVD is playing, it's called " + this.name + ". This is a " + this.category + ".");
    }

    @Override
    public void spinDisc() {
        System.out.println("This DVD spins between " + this.minRPMs + " and " + this.maxRPMs + " rpms.");
    }
}
