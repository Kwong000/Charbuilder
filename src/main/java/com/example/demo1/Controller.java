package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

import static com.example.demo1.TimelinePage.allTimelinePages;

public class Controller {


    public TextArea bodyBox;
    public TextArea titleBox;
    public Button prevButton;
    public Button nxtButton;
    public ListView commentBox;
    public Button comButton;
    public ImageView imgBox;
    public TextField commentthingy;
    int p;

    public void initialize() throws Exception {
      // scan data file to create all Time objects
        TimelinePage.readData();
        TimelinePage p1 = allTimelinePages.get(0);
        TimelinePage p2 = allTimelinePages.get(1);
        TimelinePage p3 = allTimelinePages.get(2);
        TimelinePage p4 = allTimelinePages.get(3);
        TimelinePage p5 = allTimelinePages.get(4);
        TimelinePage p6 = allTimelinePages.get(5);
        // display first TimelineData object in View

        p=1;
        update();

    }

    public void nxtButtonAction(ActionEvent actionEvent)throws Exception {
        if (p<6){
            p++;
            update();
        }
    }
    public void pButtonAction(ActionEvent actionEvent)throws Exception {
        if (p > 1) {
            p--;
            update();
        }
    }
    public void update()throws Exception{

        titleBox.setText(allTimelinePages.get(p-1).getTitle());
        bodyBox.setText(allTimelinePages.get(p-1).getTextBody());
        imgBox.setImage(allTimelinePages.get(p-1).getRepIMG());
        commentBox.getItems().clear();
        for (String eachNote : allTimelinePages.get(p-1).getNotes()) {
            commentBox.getItems().add(eachNote);
        }
    }

    public void comButtonAction(ActionEvent actionEvent) {
        String typedTask = commentthingy.getText();
        TimelinePage currentPage = TimelinePage.allTimelinePages.get(p-1);
        currentPage.getNotes().add(typedTask);
        System.out.println(typedTask);
        commentBox.getItems().add(typedTask);
    }
}

