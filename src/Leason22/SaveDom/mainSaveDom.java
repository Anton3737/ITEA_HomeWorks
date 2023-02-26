package Leason22.SaveDom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class mainSaveDom {

    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();

            Element rootElement = doc.createElement("firstRoot");
            doc.appendChild(rootElement);

            Element second = doc.createElement("second");
            rootElement.appendChild(second);

            TransformerFactory tf = TransformerFactory.newInstance();

            Transformer t = tf.newTransformer();

            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("/Users/macintosh/Desktop/JDBC/001JDBCandHib/ITEA_HomeWorks/src/Leason22/SaveDom/NewXML.xml"));
            t.transform(source, sr);


        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
