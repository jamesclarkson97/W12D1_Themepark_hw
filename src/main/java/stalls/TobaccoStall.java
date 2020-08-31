package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        int visitorAge = visitor.getAge();
        if(visitorAge >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
