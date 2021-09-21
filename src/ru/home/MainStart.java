package ru.home;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainStart {
    private static ArrayList<IdReplay> idReplays = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();



        ParsXML pars = new ParsXML(idReplays);
        parser.parse(new File("resource\\nbki_report.xml"), pars);

        for(IdReplay idReplay : idReplays)
            if (idReplay.getIdTypeText() != null)
                System.out.println(idReplay.getIdNum() + " " + idReplay.getIdTypeText());

    }
}
