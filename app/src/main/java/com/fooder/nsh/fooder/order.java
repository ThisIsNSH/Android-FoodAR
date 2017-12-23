package com.fooder.nsh.fooder;

/**
 * Created by this-is-nsh on 23/12/17.
 */

public class order {

    private String n1,n2,n3;
    private String q1,q2,q3;


    public order() {
    }
    public void setn1(String n1) {
        this.n1 = n1;
    }
    public void setq1 (String q1) {
        this.q1 = q1;
    }

    public void setn2(String n2) {
        this.n2 = n2;
    }
    public void setq2 (String q2) {
        this.q2 = q2;
    }

    public void setn3(String n3) {
        this.n3 = n3;
    }
    public void setq3 (String q3) {
        this.q3 = q3;
    }

    public String getn1() {
        return n1;
    }
    public String getq1() {
        return q1;
    }

    public String getn2() {
        return n2;
    }
    public String getq2() {
        return q2;
    }

    public String getn3() {
        return n3;
    }
    public String getq3() {
        return q3;
    }

}
