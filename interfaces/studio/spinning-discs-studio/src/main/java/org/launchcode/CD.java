package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    private String genre;

    // Rating
    private int onlineScore;

    private int numTracks;


    // DEAR FUTURE ANDREW, OPTIMIZE BETTER!
    private int minRPMs = 200;

    private int maxRPMs = 500;

    // in MBs
    public static final int maxCapacity = 700;

    public CD(String name, String contents, int capacity, String type, String genre, int onlineScore, int numTracks) {
        super(name, contents, capacity, type);
        this.genre = genre;
        this.onlineScore = onlineScore;
        this.numTracks = numTracks;

    }

    @Override
    public void play() {
        System.out.println("This CD is playing, it's called " + this.name + ". This CD has " + this.numTracks + " tracks, and has an online score of " + this.onlineScore + ".");
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins between " + minRPMs + " and " + maxRPMs + " rpms.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
