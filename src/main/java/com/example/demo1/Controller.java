package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {


    public TextArea bodyBox;
    public TextArea titleBox;
    public Button prevButton;
    public Button nxtButton;
    public TextArea commentBox;
    public Button comButton;
   int p;

    public void initialize() throws Exception {
      // scan data file to create all Time objects
        TimelinePage.readData();

        // display first TimelineData object in View
        TimelinePage p1 = TimelinePage.allTimelinePages.get(0);
        TimelinePage p2 = TimelinePage.allTimelinePages.get(1);
        TimelinePage p3 = TimelinePage.allTimelinePages.get(2);
        TimelinePage p4 = TimelinePage.allTimelinePages.get(3);
        TimelinePage p5 = TimelinePage.allTimelinePages.get(4);
        TimelinePage p6 = TimelinePage.allTimelinePages.get(5);
        titleBox.setText(p1.getTitle());
        bodyBox.setText(p1.getTextBody());

    }

    public void nxtButtonAction(ActionEvent actionEvent) {
        if (p<5){
            p++;
        }

    }
    public void pButtonAction(ActionEvent actionEvent) {
        if (p>1){
            p--;
        }
    }


    public void comButtonAction(ActionEvent actionEvent) {
    }
}