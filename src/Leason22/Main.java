package Leason22;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason22/first.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xmlFile);

            Element root = doc.getDocumentElement();
            System.out.println("Кореневий елемент: " + root.getNodeName());
            System.out.println("----------------------");

            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {

                Node node = nl.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("currency:");
                    System.out.println("Номер: " + element.getElementsByTagName("r030").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Валюта: " + element.getElementsByTagName("txt").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Код: " + element.getElementsByTagName("cc").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Курс : " + element.getElementsByTagName("rate").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Дата : " + element.getElementsByTagName("exchangedate").item(0).getChildNodes().item(0).getNodeValue());

                    System.out.println("----------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}