package com.tdsson.domain;

public class Item {
    private String subject;
    private String selectA;
    private String selectB;
    private String selectC;
    private String selectD;
    private char answer;

    public Item() {
    }

    public Item(String subject, String selectA, String selectB, String selectC, String selectD, char answer) {
        this.subject = subject;
        this.selectA = selectA;
        this.selectB = selectB;
        this.selectC = selectC;
        this.selectD = selectD;
        this.answer = answer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSelectA() {
        return selectA;
    }

    public void setSelectA(String selectA) {
        this.selectA = selectA;
    }

    public String getSelectB() {
        return selectB;
    }

    public void setSelectB(String selectB) {
        this.selectB = selectB;
    }

    public String getSelectC() {
        return selectC;
    }

    public void setSelectC(String selectC) {
        this.selectC = selectC;
    }

    public String getSelectD() {
        return selectD;
    }

    public void setSelectD(String selectD) {
        this.selectD = selectD;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return subject  + "\n"+ selectA  + "\n"+ selectB + "\n"+ selectC + "\n" + selectD  + "\n" ;
    }
}
