package House;

abstract class Appliances {
    String name;

    public Appliances(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

