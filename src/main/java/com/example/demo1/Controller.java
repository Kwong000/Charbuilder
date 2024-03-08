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

    public void initialize() {
      // scan data file to create all Time objects

        // display first TimelineData object in View
        TimelinePage p1 = TimelinePage.allTimelinePages.get(0);
    }

    public void pButtonAction(ActionEvent actionEvent) {
    }

    public void nxtButtonAction(ActionEvent actionEvent) {
    }

    public void comButtonAction(ActionEvent actionEvent) {
    }
}