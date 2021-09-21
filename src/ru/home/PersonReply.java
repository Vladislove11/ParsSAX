package ru.home;

public class PersonReply implements AllParameters {
    private String Name1;
    private String first;
    private String paternal;
    private String nationalityText;
    private String birthDt;
    private String placeOfBirth;
    private String lastUpdatedDt;

    public String getName1() {
        return Name1;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getPaternal() {
        return paternal;
    }

    public void setPaternal(String paternal) {
        this.paternal = paternal;
    }

    public String getNationalityText() {
        return nationalityText;
    }

    public void setNationalityText(String nationalityText) {
        this.nationalityText = nationalityText;
    }

    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String birthDt) {
        this.birthDt = birthDt;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getLastUpdatedDt() {
        return lastUpdatedDt;
    }

    public void setLastUpdatedDt(String lastUpdatedDt) {
        this.lastUpdatedDt = lastUpdatedDt;
    }
}
