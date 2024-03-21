package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

import static com.example.demo1.TimelinePage.allTimelinePages;

public class Controller {


    public TextArea bodyBox;
    public TextArea titleBox;
    public Button prevButton;
    public Button nxtButton;
    public TextArea commentBox;
    public Button comButton;
    public ImageView imgBox;
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
        if (p==1){
            titleBox.setText(allTimelinePages.get(0).getTitle());
            bodyBox.setText(allTimelinePages.get(0).getTextBody());
            imgBox.setImage(allTimelinePages.get(0).getRepIMG());

        }
        else if (p==2){
            titleBox.setText(allTimelinePages.get(1).getTitle());
            bodyBox.setText(allTimelinePages.get(1).getTextBody());
            imgBox.setImage(allTimelinePages.get(1).getRepIMG());

        }
        else if (p==3){
            titleBox.setText(allTimelinePages.get(2).getTitle());
            bodyBox.setText(allTimelinePages.get(2).getTextBody());
            imgBox.setImage(allTimelinePages.get(2).getRepIMG());

        }
        else if (p==4){
            titleBox.setText(allTimelinePages.get(3).getTitle());
            bodyBox.setText(allTimelinePages.get(3).getTextBody());
            imgBox.setImage(allTimelinePages.get(3).getRepIMG());

        }
        else if (p==5){
            titleBox.setText(allTimelinePages.get(4).getTitle());
            bodyBox.setText(allTimelinePages.get(4).getTextBody());
            imgBox.setImage(allTimelinePages.get(4).getRepIMG());

        }
        else if (p==6){
            titleBox.setText(allTimelinePages.get(5).getTitle());
            bodyBox.setText(allTimelinePages.get(5).getTextBody());
            imgBox.setImage(allTimelinePages.get(5).getRepIMG());

        }
    }

    public void comButtonAction(ActionEvent actionEvent) {
    }
}

