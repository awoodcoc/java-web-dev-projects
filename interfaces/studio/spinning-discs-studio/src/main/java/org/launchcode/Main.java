package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd1 = new DVD("Memento", "A weird, confusing movie but its good", 1000, "DVD", 200, 500, "Film", 9.5, true, false);
        CD cd1 = new CD("Barbie Soundtrack", "This is the soundtrack to Barbie", 500, "CD", 570,1600, "Pop", 10, 19);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        dvd1.spinDisc();
        dvd1.play();
        cd1.spinDisc();
        cd1.play();
    }
}