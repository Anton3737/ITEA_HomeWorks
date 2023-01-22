package Leason14;

public enum Vehicles {

    LAMBORGHINI(120000) {
        public String getColor() {
            return "Yellow";
        }
    },
    FERRARI(98000) {
        public String getColor() {
            return "Red";
        }
    },
    MASERATI(55330) {
        public String getColor() {
            return "Purple";
        }
    },
    NISSAN(22700) {
        public String getColor() {
            return "White";
        }
    },
    MAZDA(5300) {
        public String getColor() {
            return "Red";
        }
    },
    TOYOTA(12000) {
        public String getColor() {
            return "Black";
        }
    },
    ZAZ(700) {
        public String getColor() {
            return "Rose";
        }
    },
    FORD(1200) {
        public String getColor() {
            return "Deep blue";
        }
    },
    CHEVROLET(2300) {
        public String getColor() {
            return "Yellow";
        }
    },
    DODGE(7100) {
        public String getColor() {
            return "Silver";
        }
    };

    final int Price;

    Vehicles(int Price) {
        this.Price = Price;
    }

    public abstract String getColor();

    @Override
    public String toString() {
        return "* " + "Name: " + Vehicles.super.name() + ", Price: " + Price + ", Color: " + getColor() + " * \n";
    }

    public static void main(String[] args) {

        Vehicles LAMBORGHINI = Vehicles.LAMBORGHINI;
        System.out.println(LAMBORGHINI);

        Vehicles FERRARI = Vehicles.FERRARI;
        System.out.println(FERRARI);

        Vehicles MASERATI = Vehicles.MASERATI;
        System.out.println(MASERATI);

        Vehicles NISSAN = Vehicles.NISSAN;
        System.out.println(NISSAN);

        Vehicles MAZDA = Vehicles.MAZDA;
        System.out.println(MAZDA);

        Vehicles TOYOTA = Vehicles.TOYOTA;
        System.out.println(TOYOTA);

        Vehicles ZAZ = Vehicles.ZAZ;
        System.out.println(ZAZ);

        Vehicles FORD = Vehicles.FORD;
        System.out.println(FORD);

        Vehicles CHEVROLET = Vehicles.CHEVROLET;
        System.out.println(CHEVROLET);

        Vehicles DODGE = Vehicles.DODGE;
        System.out.println(DODGE);
    }
}
