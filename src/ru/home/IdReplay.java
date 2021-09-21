package ru.home;

public class IdReplay implements AllParameters {
    private String idNum;
    private String serialNumber;
    private String idTypeText;
    private String issueAuthority;
    private String issueDate;
    private String lastUpdateDt;

    public IdReplay() {
    }

    public IdReplay(String idNum, String serialNumber, String idTypeText, String issueAuthority, String issueDate, String lastUpdateDt) {
        this.idNum = idNum;
        this.serialNumber = serialNumber;
        this.idTypeText = idTypeText;
        this.issueAuthority = issueAuthority;
        this.issueDate = issueDate;
        this.lastUpdateDt = lastUpdateDt;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getIdTypeText() {
        return idTypeText;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getLastUpdateDt() {
        return lastUpdateDt;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setIdTypeText(String idTypeText) {
        this.idTypeText = idTypeText;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }
}
