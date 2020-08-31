package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        int visitorAge = visitor.getAge();
        double visitorHeight = visitor.getHeight();
        if(visitorHeight > 1.45 && visitorAge > 12) {
            return true;
        } else {
            return false;
        }
    }
}
