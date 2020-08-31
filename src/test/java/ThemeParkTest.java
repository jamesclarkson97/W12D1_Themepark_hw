import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;
    IceCreamStall iceCreamStall;
    CandyflossStall candyflossStall;
    Visitor visitor;
    Playground playground;
    Park park;
    Dodgems dodgems;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    @Before
    public void before() {
        visitor = new Visitor(14, 1.2, 40.0);

        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 7);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 8);
        stalls = new ArrayList<Stall>();
        stalls.add(tobaccoStall);
        stalls.add(iceCreamStall);
        stalls.add(candyflossStall);

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        park = new Park("Leafy Meadows", 9);
        dodgems = new Dodgems("Bumper Cars", 5);
        attractions = new ArrayList<Attraction>();
        attractions.add(rollerCoaster);
        attractions.add(playground);
        attractions.add(park);
        attractions.add(dodgems);

        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void hasStalls() {
        assertEquals(stalls, themePark.getStalls());
    }

    @Test
    public void hasAttractions() {
        assertEquals(attractions, themePark.getAttractions());
    }

    @Test
    public void hasReviewedItems() {
        assertEquals(7, themePark.getAllReviewed().size());
    }
}
