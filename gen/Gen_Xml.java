package gen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Gen_Xml {
    Document document;
    Element section_child;
    String[] point_x = new String[]{"250","300","350","400","450","500"};
    String[] point_y = new String[]{"320","320","320","320","320","320"};
    private void create_rectangle(int count){
        for(int i=1; i < count+1; i++){
            Element node_section = document.createElement("section");
            section_child.appendChild(node_section);

            node_section.setAttribute("name", "node");
            //attribute1
            Element attribute1 = document.createElement("attribute");
            node_section.appendChild(attribute1);

            //attribute1 속성
            attribute1.setAttribute("key", "id");
            attribute1.setAttribute("type", "int");
            attribute1.appendChild(document.createTextNode(String.valueOf(i-1)));

            //attribute2
            Element attribute2 = document.createElement("attribute");
            node_section.appendChild(attribute2);

            //attribute2 속성
            attribute2.setAttribute("key", "label");
            attribute2.setAttribute("type", "String");

            //graphic_section
            Element graphic_section = document.createElement("section");
            node_section.appendChild(graphic_section);

            //graphic_section 속성
            graphic_section.setAttribute("name", "graphics");

            //attribute_child1
            Element attribute_child1 = document.createElement("attribute");
            graphic_section.appendChild(attribute_child1);

            //attribute_child1 속성
            attribute_child1.setAttribute("key", "x");
            attribute_child1.setAttribute("type", "double");
            attribute_child1.appendChild(document.createTextNode(point_x[i-1]));

            //attribute_child2
            Element attribute_child2 = document.createElement("attribute");
            graphic_section.appendChild(attribute_child2);

            //attribute_child2 속성
            attribute_child2.setAttribute("key", "y");
            attribute_child2.setAttribute("type", "double");
            attribute_child2.appendChild(document.createTextNode(point_y[i-1]));

            //attribute_child3
            Element attribute_child3 = document.createElement("attribute");
            graphic_section.appendChild(attribute_child3);

            //attribute_child3 속성
            attribute_child3.setAttribute("key", "w");
            attribute_child3.setAttribute("type", "double");
            attribute_child3.appendChild(document.createTextNode("31.0"));

            //attribute_child4
            Element attribute_child4 = document.createElement("attribute");
            graphic_section.appendChild(attribute_child4);

            //attribute_child4 속성
            attribute_child4.setAttribute("key", "h");
            attribute_child4.setAttribute("type", "double");
            attribute_child4.appendChild(document.createTextNode("30.0"));

            //attribute_child_rec
            Element attribute_child_rec = document.createElement("attribute");
            graphic_section.appendChild(attribute_child_rec);

            //attribute child rec 속성
            attribute_child_rec.setAttribute("key", "type");
            attribute_child_rec.setAttribute("type", "String");
            attribute_child_rec.appendChild(document.createTextNode("rectangle"));

            //attribute child border
            Element attribute_child_border = document.createElement("attribute");
            graphic_section.appendChild(attribute_child_border);

            //attribute child border 속성
            attribute_child_border.setAttribute("key", "raisedBorder");
            attribute_child_border.setAttribute("type", "boolean");
            attribute_child_border.appendChild(document.createTextNode("false"));

            //attribute child fill
            Element attribute_child_fill = document.createElement("attribute");
            graphic_section.appendChild(attribute_child_fill);

            //attribute child fill 속성
            attribute_child_fill.setAttribute("key", "fill");
            attribute_child_fill.setAttribute("type", "String");
            attribute_child_fill.appendChild(document.createTextNode("#FFCC00"));

            //attribute child outline
            Element attribute_child_outline = document.createElement("attribute");
            graphic_section.appendChild(attribute_child_outline);

            //attribute child outline 속성
            attribute_child_outline.setAttribute("key", "outline");
            attribute_child_outline.setAttribute("type", "String");
            attribute_child_outline.appendChild(document.createTextNode("#000000"));

            //LabelGraphics Section
            Element labelGraphics = document.createElement("section");
            node_section.appendChild(labelGraphics);

            //LabelGraphics 속성
            labelGraphics.setAttribute("name", "LabelGraphics");

            //label_graphic_attribute
            Element label_graphic_attribute1 = document.createElement("attribute");
            labelGraphics.appendChild(label_graphic_attribute1);

            //label_graphic_attribute 속성
            //label_graphic_attribute1.setAttribute("key", "text");
            //label_graphic_attribute1.setAttribute("type", "String");
            //label_graphic_attribute1.appendChild(document.createTextNode("g"));
        }
    }
    public void generate_xml() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            //section
            document = documentBuilder.newDocument();
            document.setXmlStandalone(true);

            Element section = document.createElement("section");
            document.appendChild(section);

            //section 속성값
            section.setAttribute("name", "xgml");

            //attribute
            Element attribute1 = document.createElement("attribute");
            section.appendChild(attribute1);

            //attribute1 속성
            attribute1.setAttribute("key", "Creator");
            attribute1.setAttribute("type", "String");

            attribute1.appendChild(document.createTextNode("yFiles"));
            //End

            Element attribute2 = document.createElement("attribute");
            section.appendChild(attribute2);

            //attribute2 속성
            attribute2.setAttribute("key", "Version");
            attribute2.setAttribute("type", "String");
            attribute2.appendChild(document.createTextNode("2.18"));
            //End

            //section
            section_child = document.createElement("section");
            section.appendChild(section_child);

            //section 속성
            section_child.setAttribute("name", "graph");
            //End

            //attribute_child
            Element attribute_child1 = document.createElement("attribute");
            section_child.appendChild(attribute_child1);

            //attribute_child1 속성
            attribute_child1.setAttribute("key", "hierarchic");
            attribute_child1.setAttribute("type", "int");
            attribute_child1.appendChild(document.createTextNode("1"));
            //End

            //attribute_child2
            Element attribute_child2 = document.createElement("attribute");
            section_child.appendChild(attribute_child2);

            //attribute_child2 속성
            attribute_child2.setAttribute("key", "label");
            attribute_child2.setAttribute("type", "String");
            //End

            //attribute_child3
            Element attribute_child3 = document.createElement("attribute");
            section_child.appendChild(attribute_child3);

            //attribute_child3 속성
            attribute_child3.setAttribute("key", "directed");
            attribute_child3.setAttribute("type", "int");
            attribute_child3.appendChild(document.createTextNode("1"));

            //사각형생성
            Scanner scanner = new Scanner(System.in);
            System.out.print("몇 개의 사각형을 생성 \n >>>>>> ");
            int count = Integer.parseInt(scanner.nextLine());
            if(count > 6){
                System.out.println("사각형의 최대 개수는 6개를 넘길 수 없습니다.");
                generate_xml();
            }else if(count == 0){
                System.out.println("사각형의 개수는 0이 될 수 없습니다.");
                generate_xml();
            }else{
                create_rectangle(count);
            }
            create_edge(count);

            //XML 내보내기
            export_xml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void create_one_edge(){
        Element edge = document.createElement("section");
        section_child.appendChild(edge);

        edge.setAttribute("name", "edge");
        Element source = document.createElement("attribute");
        edge.appendChild(source);

        source.setAttribute("key", "source");
        source.setAttribute("type", "int");
        source.appendChild(document.createTextNode("0"));

        Element target = document.createElement("attribute");
        edge.appendChild(target);

        target.setAttribute("key", "target");
        target.setAttribute("type", "int");
        target.appendChild(document.createTextNode("1"));

        Element graphics = document.createElement("section");
        edge.appendChild(graphics);

        graphics.setAttribute("name", "graphics");

        Element fill = document.createElement("attribute");
        graphics.appendChild(fill);

        fill.setAttribute("key", "fill");
        fill.setAttribute("type", "String");
        fill.appendChild(document.createTextNode("#000000"));
    }
    private void create_two_edge(){
        Element edge = document.createElement("section");
        section_child.appendChild(edge);

        edge.setAttribute("name", "edge");

        Element source = document.createElement("attribute");
        edge.appendChild(source);

        source.setAttribute("key", "source");
        source.setAttribute("type", "int");

        source.appendChild(document.createTextNode("1"));

        Element target = document.createElement("attribute");
        edge.appendChild(target);

        target.setAttribute("key", "target");
        target.setAttribute("type", "int");
        target.appendChild(document.createTextNode("2"));

        Element graphics = document.createElement("section");
        edge.appendChild(graphics);

        graphics.setAttribute("name", "graphics");

        Element fill = document.createElement("attribute");
        graphics.appendChild(fill);

        fill.setAttribute("key", "fill");
        fill.setAttribute("type", "String");
        fill.appendChild(document.createTextNode("#000000"));
    }
    private void create_three_edge(){

    }
    private void create_edge(int count){
        if(count == 2) {
            create_one_edge();
        }else if(count == 3) {
            create_one_edge();
            create_two_edge();
        }else if(count == 4){
            create_one_edge();
            create_two_edge();
        }
    }
    private void export_xml() throws TransformerException, FileNotFoundException {
        //XML 내보내기
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty("{http://xml.apache.org/xlst}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.ENCODING, "MS949");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");

        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new FileOutputStream(new File("test.xml")));

        transformer.transform(domSource, streamResult);

        System.out.println("_____SUCCESS_____");
    }
}
