package Leason22.Json_GsonExcParsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JsonBankPars {

    private int r030;

    private String txt;

    private double rate;

    private String cc;

    private String exchangedate;

    public JsonBankPars(int r030, String txt, double rate, String cc, String exchangedate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangedate = exchangedate;
    }

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return
                "Код міжбанку " + r030 + '\n' +
                        "Валюта: " + txt + '\n' +
                        "Ціна за 1 од. національної валюти: " + rate + '\n' +
                        "Код валюти: " + cc + '\n' +
                        "Ціна станом на дату " + exchangedate + '\n';
    }
}

class PrintNBU {
    public static void ParsBank(String url) throws IOException {
        GsonBuilder PrintingNBU = new GsonBuilder();
        PrintingNBU.setPrettyPrinting();
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        JsonBankPars[] ExcBankParsing = gson.fromJson(jsonReader, JsonBankPars[].class);

        for (JsonBankPars ExcBankParsPrint : ExcBankParsing) {
            System.out.println(ExcBankParsPrint);
        }

        String gsonWrite = gson.toJson(ExcBankParsing);
        Files.write(Paths.get("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason22/Json_GsonExcParsing/GsonJson.txt"),gsonWrite.getBytes(), StandardOpenOption.CREATE);

    }

    public static void main(String[] args) throws IOException {
        ParsBank("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }


}
