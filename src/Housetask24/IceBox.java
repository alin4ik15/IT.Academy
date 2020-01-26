package House;

class IceBox extends Appliances implements Include {

    public IceBox(String name) {
        super(name);
    }

    public void IncludeIn() {
        System.out.println(this + " plugged in");
    }

}