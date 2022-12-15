package OOP.Leason8;

public class Countries {
    String State;

    long Population;

    double Area;

    String Capital;

    String Domain;

    String Currency;

    double Human_Development_Index;

    double Gross_domestic_product;


    public Countries(String state, long population, double area, String capital, String domain, String currency, double human_Development_Index, double gross_domestic_product) {
        State = state;
        Population = population;
        Area = area;
        Capital = capital;
        Domain = domain;
        Currency = currency;
        Human_Development_Index = human_Development_Index;
        Gross_domestic_product = gross_domestic_product;
    }

    public static void main(String[] args) {


        Countries countries_UA = new Countries("Ukraine", 41167336, 603.628, "Kyiv", ".UA", "UAH", 0.773, 588);

        Countries countries_JP = new Countries("Japan", 124214766, 377.975, "Tokyo", ".jp", "Japanese yen", 0.925, 6.110);

        Countries countries_USA = new Countries("United States", 331893745, 9833520, "Washington, D.C.", ".US", "U.S. dollar", 0.921, 25.035);

        Countries countries_GB = new Countries("Great Britain", 60800000, 209331, "London", ".gb", "great britain pound", 0.932, 67.33);

        Countries countries_SK = new Countries("Republic of Korea", 51844834, 100363, "Seoul", ".kr", "Korean Republic won", 0.925, 2.735);


        System.out.println("State: " + countries_UA.State + "\n" + "Population: " + countries_UA.Population + "\n" + "Area: " + countries_UA.Area + " km2 " + "\n" + "Capital: " + countries_UA.Capital + "\n" + "Domain: " + countries_UA.Domain + "\n" + "Currency: " + countries_UA.Currency + "\n" + "HDI: " + countries_UA.Human_Development_Index + "\n" + "GDV: " + countries_UA.Gross_domestic_product + "\n\n");

        System.out.println("State: " + countries_JP.State + "\n" + "Population: " + countries_JP.Population + "\n" + "Area: " + countries_JP.Area + " km2 " + "\n" + "Capital: " + countries_JP.Capital + "\n" + "Domain: " + countries_JP.Domain + "\n" + "Currency: " + countries_JP.Currency + "\n" + "HDI: " + countries_JP.Human_Development_Index + "\n" + "GDV: " + countries_JP.Gross_domestic_product + "\n\n");

        System.out.println("State: " + countries_GB.State + "\n" + "Population: " + countries_GB.Population + "\n" + "Area: " + countries_GB.Area + " km2 " + "\n" + "Capital: " + countries_GB.Capital + "\n" + "Domain: " + countries_GB.Domain + "\n" + "Currency: " + countries_GB.Currency + "\n" + "HDI: " + countries_GB.Human_Development_Index + "\n" + "GDV: " + countries_GB.Gross_domestic_product + "\n\n");

        System.out.println("State: " + countries_USA.State + "\n" + "Population: " + countries_USA.Population + "\n" + "Area: " + countries_USA.Area + " km2 " + "\n" + "Capital: " + countries_USA.Capital + "\n" + "Domain: " + countries_USA.Domain + "\n" + "Currency: " + countries_USA.Currency + "\n" + "HDI: " + countries_USA.Human_Development_Index + "\n" + "GDV: " + countries_USA.Gross_domestic_product + "\n\n");

        System.out.println("State: " + countries_SK.State + "\n" + "Population: " + countries_SK.Population + "\n" + "Area: " + countries_SK.Area + " km2 " + "\n" + "Capital: " + countries_SK.Capital + "\n" + "Domain: " + countries_SK.Domain + "\n" + "Currency: " + countries_SK.Currency + "\n" + "HDI: " + countries_SK.Human_Development_Index + "\n" + "GDV: " + countries_SK.Gross_domestic_product + "\n\n");

    }

}
