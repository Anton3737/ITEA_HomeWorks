package Leason22.TestSaveDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {

            DocumentBuilderFactory docname = DocumentBuilderFactory.newInstance();

            DocumentBuilder NewDocument = docname.newDocumentBuilder();

            Document MyFirstDoc = NewDocument.newDocument();

            Element rootElement = MyFirstDoc.createElement("RootElement");
            MyFirstDoc.appendChild(rootElement);

            Element secElement = MyFirstDoc.createElement("SecondElement");
            rootElement.appendChild(secElement);


            Element thrdElement = MyFirstDoc.createElement("LastElement");
            thrdElement.setTextContent("Hallo");
            secElement.appendChild(thrdElement);

            Element secElement1 = MyFirstDoc.createElement("SecondElement");
            rootElement.appendChild(secElement1);


            TransformerFactory nameTransform = TransformerFactory.newInstance();

            Transformer TransName = nameTransform.newTransformer();

            DOMSource source = new DOMSource(MyFirstDoc);

            StreamResult sr = new StreamResult(new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason22/SaveDom/myxml.xml"));

            TransName.transform(source, sr);


        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
