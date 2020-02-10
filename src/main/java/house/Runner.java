package house;

import house.appliances.IceBox;
import house.appliances.Washer;
import house.interfaces.Include;

public class Runner {

    public static void main(String[] args) {
        Include hh = new IceBox("Atlant");
        hh.IncludeIn();
        Include h = new Washer("Bosh");
        h.IncludeIn();
    }
}

