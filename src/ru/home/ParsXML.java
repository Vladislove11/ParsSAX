package ru.home;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class ParsXML extends DefaultHandler {
    private String idNum, serialNumber, idTypeText, issueAuthority, issueDate, lastUpdateDt, lastElementName;
    private ArrayList<IdReplay> idReplays;
    private Boolean checkElem;

    public ParsXML(ArrayList<IdReplay> idReplays) {
        this.idReplays = idReplays;
        this.checkElem = false;
    }

    public ArrayList<IdReplay> getIdReplays() {
        return idReplays;
    }

    public void setIdReplays(ArrayList<IdReplay> idReplays) {
        this.idReplays = idReplays;
    }

    public ParsXML() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        lastElementName = qName;
         if (qName.equals("IdReply"))
            this.checkElem = true;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("IdReply")) {
            idReplays.add(new IdReplay(idNum, serialNumber, idTypeText, issueAuthority, issueDate, lastUpdateDt));
            idNum = null;
            serialNumber = null;
            idTypeText = null;
            issueAuthority = null;
            issueDate = null;
            lastUpdateDt = null;
            //this.checkElem = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String info = new String(ch, start, length);

        info = info.replace("\n","").trim();

        if (checkElem) {
            if (!info.isEmpty()) {
                if (lastElementName.equals("idNum"))
                    idNum = info;
                if (lastElementName.equals("serialNum"))
                    serialNumber = info;
                if (lastElementName.equals("idTypeText"))
                    idTypeText = info;
                if (lastElementName.equals("issueAuthority"))
                    issueAuthority = info;
                if (lastElementName.equals("issueDate"))
                    issueDate = info;
                if (lastElementName.equals("lastUpdatedDt"))
                    lastUpdateDt = info;
            }
        }
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        super.ignorableWhitespace(ch, start, length);
    }
}
