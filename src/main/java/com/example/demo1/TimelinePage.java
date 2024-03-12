package com.example.demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TimelinePage {
    static ArrayList<TimelinePage> allTimelinePages;
    String title;
    String textBody;
    String notes;
    File repIMG;


    public TimelinePage(String title, String textBody , String notes, File repIMG) {
        this.title = title;
        this.textBody = textBody;
        this.repIMG = repIMG;
        this.notes = notes;
        if (allTimelinePages == null) {
            allTimelinePages = new ArrayList<TimelinePage>();
        }
        allTimelinePages.add(this);
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

    public String toString() {
        return "Timeline Page: " + title + " says " + textBody;
    }
    static public void readData() throws Exception {
        File dataFile = new File( "src/main/java/com/example/demo1/TimelineData");
        Scanner dataScanner = new Scanner(dataFile);
        //Stamp Act - March 22, 1765
        //The Stamp Act 1765, also known as the Duties in American Colonies Act 1765, was an Act of the Parliament of Great Britain which imposed a direct tax on the British colonies in America and required that many printed materials in the colonies be produced on stamped paper from London which included an embossed revenue stamp. Printed materials included legal documents, magazines, playing cards, newspapers, and many other types of paper used throughout the colonies, and it had to be paid in British currency, not in colonial paper money.  The purpose of the tax was to pay for British military troops stationed in the American colonies after the French and Indian War, but the colonists had never feared a French invasion to begin with, and they contended that they had already paid their share of the war expenses. Colonists suggested that it was actually a matter of British patronage to surplus British officers and career soldiers who should be paid by London.  The Stamp Act was very unpopular among colonists. A majority considered it a violation of their rights as Englishmen to be taxed without their consent—consent that only the colonial legislatures could grant. Their slogan was "No taxation without representation". Colonial assemblies sent petitions and protests, and the Stamp Act Congress held in New York City was the first significant joint colonial response to any British measure when it petitioned Parliament and the King. - Wikipedia
        //StampActIMG.jpeg

        dataScanner.useDelimiter("\n") ;
        while (dataScanner.hasNext()){
            //get next chunk of data
            String title = dataScanner.next();
            String text = dataScanner.next();
            String imageFile = dataScanner.next();
            File imageFileOpened = new File(imageFile);
            String ignore = dataScanner.next();
            TimelinePage newTP = new TimelinePage(title,text,null,imageFileOpened);
            System.out.println(newTP);
        }
    }
}
