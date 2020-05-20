package com.example.hostelmanagementsystem;

public class Userhelperlass {

    String name,dob,eid,ph,pph,doe,notes,rom,pname;

    public Userhelperlass() {

    }

    public Userhelperlass(String name, String dob, String eid, String ph, String pph, String doe, String notes, String rom, String pname) {
        this.name = name;
        this.dob = dob;
        this.eid = eid;
        this.ph = ph;
        this.pph = pph;
        this.doe = doe;
        this.notes = notes;
        this.rom = rom;
        this.pname = pname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getPph() {
        return pph;
    }

    public void setPph(String pph) {
        this.pph = pph;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
