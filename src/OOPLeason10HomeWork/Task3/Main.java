package OOPLeason10HomeWork.Task3;

public class Main {

    public static void main(String[] args) {

        Address address_0 = new Address(0, "Ukraine", "Kyiv", "Khreshatyk", 1, 666);

        Address address_1 = new Address(1, "Ukraine", "Kharkiv", "Svobody sq.", 33, 1);

        Address address_2 = new Address(2, "USA", "San-Francisco", "12-street", 98, 0);

        System.out.println(address_0.getIndex() + "\n" + address_0.getCountry() + "\n" + address_0.getCity() + "\n" + address_0.getStreet() + "\n" + address_0.getHouse() + "\n" + address_0.getApartment()+"\n\n");
        System.out.println(address_1.getIndex() + "\n" + address_1.getCountry() + "\n" + address_1.getCity() + "\n" + address_1.getStreet() + "\n" + address_1.getHouse() + "\n" + address_1.getApartment()+"\n\n");
        System.out.println(address_2.getIndex() + "\n" + address_2.getCountry() + "\n" + address_2.getCity() + "\n" + address_2.getStreet() + "\n" + address_2.getHouse() + "\n" + address_2.getApartment()+"\n\n");
    }
}
