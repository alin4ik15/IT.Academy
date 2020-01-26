package House;

class Washer extends Appliances implements Include {

        public Washer(String name) {
            super(name);
        }

        public void IncludeIn() {
            System.out.println(this+" plugged in");
        }

    }

