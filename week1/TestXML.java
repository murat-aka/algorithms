/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

    private static Document loadTestDocument(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }

    public static void main(String[] args) throws Exception {
        Document doc = loadTestDocument("http://www.xmlfiles.com/examples/plant_catalog.xml");
        System.out.println(doc);
      //  doc = loadTestDocument("http://localhost/array.xml");
      //  System.out.println(doc);
    }

}