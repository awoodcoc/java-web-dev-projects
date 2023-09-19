package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    private String category;

    private Double rottenTomatoesScore;

    boolean isMovie;

    boolean hasEndCreditsScene;

    // in MBs
    public static final int maxCapacity = 4700;

    // DEAR FUTURE ANDREW, OPTIMIZE BETTER!
    private int minRPMs = 570;

    private int maxRPMs = 1600;

    public DVD(String name, String contents, int capacity, String type, String category, Double rottenTomatoesScore, boolean isMovie, boolean hasEndCreditsScene) {
        super(name, contents, capacity, type);
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
        System.out.println("This DVD spins between " + minRPMs + " and " + maxRPMs + " rpms.");
    }
}
