package xyz.potomac_foods.XMLParseTest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) {
        String xml = "<POSOrder xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "<OrderHeader>\n" +
                "   <OrderNumber>6442656</OrderNumber>\n" +
                "   <CreateTime>2020-02-01T15:26:48-05:00</CreateTime>\n" +
                "   <OrderType>DriveThru</OrderType>\n" +
                "   <OrderState>Open</OrderState>\n" +
                "   <BusinessDate>2020-02-01T15:26:48-05:00</BusinessDate>\n" +
                "   <Register>D01</Register>\n" +
                "   <OpenTime>2020-02-01T15:26:48-05:00</OpenTime>\n" +
                "   <TotaledTime xsi:nil=\"true\" />\n" +
                "   <PaidTime xsi:nil=\"true\" />\n" +
                "   <CanceledTime xsi:nil=\"true\" />\n" +
                "   <ClosedTime xsi:nil=\"true\" />\n" +
                "   <Discount>0.00</Discount>\n" +
                "   <Tax>0.93</Tax>\n" +
                "   <Total>10.22</Total>\n" +
                "   <Subtotal>9.29</Subtotal>\n" +
                "</OrderHeader>\n" +
                "<OrderDetail>\n" +
                "   <Item>\n" +
                "      <Id>CO0200</Id>\n" +
                "      <Name>Whopper CMB SML</Name>\n" +
                "      <ItemType>Entree</ItemType>\n" +
                "      <Quantity>1</Quantity>\n" +
                "      <Price>9.29</Price>\n" +
                "      <SubItems />\n" +
                "   </Item>\n" +
                "   <Item>\n" +
                "      <Id>FI0103</Id>\n" +
                "      <Name>Small Fries</Name>\n" +
                "      <ItemType>Entree</ItemType>\n" +
                "      <Quantity>1</Quantity>\n" +
                "      <Price>0.00</Price>\n" +
                "      <SubItems />\n" +
                "   </Item>\n" +
                "   <Item>\n" +
                "      <Id>SD0I03</Id>\n" +
                "      <Name>Small COKE</Name>\n" +
                "      <ItemType>Entree</ItemType>\n" +
                "      <Quantity>1</Quantity>\n" +
                "      <Price>0.00</Price>\n" +
                "      <SubItems />\n" +
                "   </Item>\n" +
                "</OrderDetail>\n" +
                "</POSOrder>";

        Document doc = convertStringToXMLDocument(xml);
        //System.out.println(doc.getFirstChild().getNodeName());

        NodeList items = doc.getElementsByTagName("Item");

        for (int i=0; i < items.getLength(); i++){
            Node nNode = items.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) nNode;
                System.out.println("You ordered " +
                                eElement.getElementsByTagName("Quantity").item(0).getTextContent() + " " +
                                eElement.getElementsByTagName("Name").item(0).getTextContent() + " at " +
                                eElement.getElementsByTagName("Price").item(0).getTextContent()
                        );
            }
        }
    }

    private static Document convertStringToXMLDocument(String xmlString){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = null;

        try{
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
