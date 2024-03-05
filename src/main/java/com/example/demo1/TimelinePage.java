package com.example.demo1;

import java.io.File;

public class TimelinePage {

    String title;
    String textBody;
    File repIMG;
    public TimelinePage(String title, String textBody, File repIMG) {
        this.title = title;
        this.textBody = textBody;
        this.repIMG = repIMG;
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

    public File getRepIMG() {
        return repIMG;
    }

    public void setRepIMG(File repIMG) {
        this.repIMG = repIMG;
    }


}
