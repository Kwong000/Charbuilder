package com.example.demo1;

import java.io.File;

public class TimelinePage {

    String title;
    String textBody;
    String notes;
    File repIMG;


    public TimelinePage(String title, String textBody , String notes, File repIMG) {
        this.title = title;
        this.textBody = textBody;
        this.repIMG = repIMG;
        this.notes = notes;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextBody() {
        return textBody;
    }


    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    public File getRepIMG() {
        return repIMG;
    }

    public void setRepIMG(File repIMG) {
        this.repIMG = repIMG;
    }


}
