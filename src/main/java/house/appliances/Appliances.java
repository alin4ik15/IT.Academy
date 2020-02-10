package house.appliances;

abstract class Appliances {
    private String name;

    public Appliances(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

