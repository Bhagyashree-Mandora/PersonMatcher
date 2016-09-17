package main.usu.Reader;

import main.usu.Adult;
import main.usu.Child;
import main.usu.Person;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlReaderStrategy implements ReaderStrategy {

    @Override
    public List<Person> readRecords(String fileName) {
        List<Person> persons = new ArrayList<>();
        try {

            File file = new File(fileName);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Person");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;
                    String personType = element.getAttribute("xsi:type");

                    if (personType.equals("Adult")) {
                        Adult person = new Adult();
                        if (element.getElementsByTagName("Phone1").getLength() > 0) {
                            person.setPhone1(element.getElementsByTagName("Phone1").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("Phone2").getLength() > 0) {
                            person.setPhone2(element.getElementsByTagName("Phone2").item(0).getTextContent());
                        }

                        setCommonAttributes(element, person);
                        persons.add(person);

                    } else if (personType.equals("Child")) {
                        Child person = new Child();
                        if (element.getElementsByTagName("NewbornScreeningNumber").getLength() > 0) {
                            person.setNewbornScreeningNumber(element.getElementsByTagName("NewbornScreeningNumber").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("IsPartOfMultipleBirth").getLength() > 0) {
                            person.setIsPartOfMultipleBirth(element.getElementsByTagName("IsPartOfMultipleBirth").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("BirthCounty").getLength() > 0) {
                            person.setBirthCounty(element.getElementsByTagName("BirthCounty").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("MotherFirstName").getLength() > 0) {
                            person.setMotherFirstName(element.getElementsByTagName("MotherFirstName").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("MotherMiddleName").getLength() > 0) {
                            person.setMotherMiddleName(element.getElementsByTagName("MotherMiddleName").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("MotherLastName").getLength() > 0) {
                            person.setMotherLastName(element.getElementsByTagName("MotherLastName").item(0).getTextContent());
                        }
                        if (element.getElementsByTagName("BirthOrder").getLength() > 0) {
                            person.setBirthOrder(Integer.valueOf(element.getElementsByTagName("BirthOrder").item(0).getTextContent()));
                        }

                        setCommonAttributes(element, person);
                        persons.add(person);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persons;
    }

    private void setCommonAttributes(Element eElement, Person person) {

        if (eElement.getElementsByTagName("ObjectId").getLength() > 0) {
            person.setObjectId(Integer.valueOf(eElement.getElementsByTagName("ObjectId").item(0).getTextContent()));
        }
        if (eElement.getElementsByTagName("BirthYear").getLength() > 0) {
            person.setBirthYear(Integer.valueOf(eElement.getElementsByTagName("BirthYear").item(0).getTextContent()));
        }
        if (eElement.getElementsByTagName("BirthMonth").getLength() > 0) {
            person.setBirthMonth(Integer.valueOf(eElement.getElementsByTagName("BirthMonth").item(0).getTextContent()));
        }
        if (eElement.getElementsByTagName("BirthDay").getLength() > 0) {
            person.setBirthDay(Integer.valueOf(eElement.getElementsByTagName("BirthDay").item(0).getTextContent()));
        }
        if (eElement.getElementsByTagName("StateFileNumber").getLength() > 0) {
            person.setStateFileNumber(eElement.getElementsByTagName("StateFileNumber").item(0).getTextContent());
        }
        if (eElement.getElementsByTagName("SocialSecurityNumber").getLength() > 0) {
            person.setSocialSecurityNumber(eElement.getElementsByTagName("SocialSecurityNumber").item(0).getTextContent());
        }
        if (eElement.getElementsByTagName("FirstName").getLength() > 0) {
            person.setFirstName(eElement.getElementsByTagName("FirstName").item(0).getTextContent());
        }
        if (eElement.getElementsByTagName("MiddleName").getLength() > 0) {
            person.setMiddleName(eElement.getElementsByTagName("MiddleName").item(0).getTextContent());
        }
        if (eElement.getElementsByTagName("LastName").getLength() > 0) {
            person.setLastName(eElement.getElementsByTagName("LastName").item(0).getTextContent());
        }
    }
}
