import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList reviewedItems = new ArrayList<IReviewed>();
        for(IReviewed object : attractions) {
            reviewedItems.add(object);
        }
        for(IReviewed object : stalls) {
            reviewedItems.add(object);
        }
        return reviewedItems;
    }
}
