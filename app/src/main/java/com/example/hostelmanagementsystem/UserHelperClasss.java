package com.example.hostelmanagementsystem;

public class UserHelperClasss {
    String sname, dname,  phname, ename, pname, Phname1,ename1, dname1, rname;

    public UserHelperClasss() {

    }

    public UserHelperClasss(String sname, String dname, String phname, String ename, String pname, String phname1, String ename1, String dname1, String rname) {
        this.sname = sname;
        this.dname = dname;
        this.phname = phname;
        this.ename = ename;
        this.pname = pname;
        this.Phname1 = phname1;
        this.ename1 = ename1;
        this.dname1 = dname1;
        this.rname = rname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPhname() {
        return phname;
    }

    public void setPhname(String phname) {
        this.phname = phname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPhname1() {
        return Phname1;
    }

    public void setPhname1(String phname1) {
        Phname1 = phname1;
    }

    public String getEname1() {
        return ename1;
    }

    public void setEname1(String ename1) {
        this.ename1 = ename1;
    }

    public String getDname1() {
        return dname1;
    }

    public void setDname1(String dname1) {
        this.dname1 = dname1;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

}