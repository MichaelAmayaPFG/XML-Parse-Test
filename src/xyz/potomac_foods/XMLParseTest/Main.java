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
        String xml = "<?xml version=\"1.0\"?>\n" +
                "<POSOrder xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "<OrderHeader>\n" +
                "   <OrderNumber>6442659</OrderNumber>\n" +
                "   <CreateTime>2020-02-03T11:25:26-05:00</CreateTime>\n" +
                "   <OrderType>DriveThru</OrderType>\n" +
                "   <OrderState>Open</OrderState>\n" +
                "   <BusinessDate>2020-02-03T11:25:26-05:00</BusinessDate>\n" +
                "   <Register>D01</Register>\n" +
                "   <OpenTime>2020-02-03T11:25:26-05:00</OpenTime>\n" +
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
                "</OrderDetail>\n" +
                "</POSOrder>\n" +
                "\n" +
                "<?xml version=\"1.0\"?>\n" +
                "<POSOrder xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "<OrderHeader>\n" +
                "   <OrderNumber>6442659</OrderNumber>\n" +
                "   <CreateTime>2020-02-03T11:25:26-05:00</CreateTime>\n" +
                "   <OrderType>DriveThru</OrderType>\n" +
                "   <OrderState>Open</OrderState>\n" +
                "   <BusinessDate>2020-02-03T11:25:26-05:00</BusinessDate>\n" +
                "   <Register>D01</Register>\n" +
                "   <OpenTime>2020-02-03T11:25:26-05:00</OpenTime>\n" +
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
                "</OrderDetail>\n" +
                "</POSOrder>\n" +
                "\n" +
                "<?xml version=\"1.0\"?>\n" +
                "<POSOrder xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "<OrderHeader>\n" +
                "   <OrderNumber>6442659</OrderNumber>\n" +
                "   <CreateTime>2020-02-03T11:25:26-05:00</CreateTime>\n" +
                "   <OrderType>DriveThru</OrderType>\n" +
                "   <OrderState>Open</OrderState>\n" +
                "   <BusinessDate>2020-02-03T11:25:26-05:00</BusinessDate>\n" +
                "   <Register>D01</Register>\n" +
                "   <OpenTime>2020-02-03T11:25:26-05:00</OpenTime>\n" +
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
                "</OrderDetail>\n" +
                "</POSOrder>\n" +
                "\n" +
                "<?xml version=\"1.0\"?>\n" +
                "<POSOrder xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "<OrderHeader>\n" +
                "   <OrderNumber>6442659</OrderNumber>\n" +
                "   <CreateTime>2020-02-03T11:25:26-05:00</CreateTime>\n" +
                "   <OrderType>DriveThru</OrderType>\n" +
                "   <OrderState>Open</OrderState>\n" +
                "   <BusinessDate>2020-02-03T11:25:26-05:00</BusinessDate>\n" +
                "   <Register>D01</Register>\n" +
                "   <OpenTime>2020-02-03T11:25:26-05:00</OpenTime>\n" +
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
                "      <SubItems />" +
                "      <Condiments>" +
                "           <Description>ADD LG. AM CHEESE</Description>" +
                "           <Description>ADD LETTUCE</Description>" +
                "           <Description>NO PICKLE</Description>" +
                "           <Description>NO ONION</Description>" +
                "      </Condiments>\n" +
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

        String newXML = xml.replaceAll("\n\n", ",");;
        //System.out.println(newXML);
        String[] fixXML = newXML.split(",");
        //System.out.println(fixXML[fixXML.length-1]);
        String usableXML = fixXML[fixXML.length-1];

        Document doc = convertStringToXMLDocument(usableXML);
        //System.out.println(doc.getFirstChild().getNodeName());

        NodeList orderHeaderNL = doc.getElementsByTagName("OrderHeader");
        Node orderHeaderN = orderHeaderNL.item(0);
        Element orderHeaderE = (Element) orderHeaderN;
        String orderState = orderHeaderE.getElementsByTagName("OrderState").item(0).getTextContent();

        //System.out.println("The order state is " + orderState);

        if(orderState.equals("Open")) {

            NodeList items = doc.getElementsByTagName("Item");

            for (int i = 0; i < items.getLength(); i++) {
                Node nNode = items.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("You ordered " +
                            eElement.getElementsByTagName("Quantity").item(0).getTextContent() + " " +
                            eElement.getElementsByTagName("Name").item(0).getTextContent() + " at " +
                            eElement.getElementsByTagName("Price").item(0).getTextContent()
                    );
                    try {
                        NodeList condis = eElement.getElementsByTagName("Condiments");
                        //System.out.println();
                        //System.out.println(condis.getLength());
                        //System.out.println(condis);
                        for(int x = 0; x < condis.getLength(); x++){
                            Node nCondi = condis.item(x);
                            if(nCondi.getNodeType() == Node.ELEMENT_NODE) {
                                Element nElement = (Element) nCondi;
                                for(int z = 0; z < nElement.getElementsByTagName("Description").getLength(); z++){
                                    System.out.println(" - " + nElement.getElementsByTagName("Description").item(z).getTextContent());
                                }
                            }
                        }
                    } catch (Exception ignored){

                    }
                }
            }
        } else {
            String subTotal = orderHeaderE.getElementsByTagName("Subtotal").item(0).getTextContent();
            String total = orderHeaderE.getElementsByTagName("Total").item(0).getTextContent();
            String tax = orderHeaderE.getElementsByTagName("Tax").item(0).getTextContent();
            String discount = orderHeaderE.getElementsByTagName("Discount").item(0).getTextContent();
            System.out.println("Your subtotal: " + subTotal);
            System.out.println("Your tax: " + tax);
            System.out.println("Your discount: " + discount);
            System.out.println("Your total: " + total);
        }
    }

    private static Document convertStringToXMLDocument(String xmlString){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder;

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
