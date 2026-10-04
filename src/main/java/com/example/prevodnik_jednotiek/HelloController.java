package com.example.prevodnik_jednotiek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField vstup;
    @FXML
    private Label mgram;
    @FXML
    private Label gram;
    @FXML
    private Label kilo;
    @FXML
    private Label tona;
    @FXML
    private Label haha;



    private void vysledok(float hodnota, String jednotka){
        switch (jednotka){
            case "mg":
                mgram.setText(String.valueOf(hodnota));
                gram.setText(String.valueOf(hodnota/1000));
                kilo.setText(String.valueOf(hodnota/1000000));
                tona.setText(String.valueOf(hodnota/1000000000));
                break;
            case "g":
                mgram.setText(String.valueOf(hodnota*1000));
                gram.setText(String.valueOf(hodnota));
                kilo.setText(String.valueOf(hodnota/1000));
                tona.setText(String.valueOf(hodnota/1000000));
                break;
            case "kg":
                mgram.setText(String.valueOf(hodnota*1000000));
                gram.setText(String.valueOf(hodnota*1000));
                kilo.setText(String.valueOf(hodnota));
                tona.setText(String.valueOf(hodnota/1000));
                break;
            case "t":
                mgram.setText(String.valueOf(hodnota*1000000000));
                gram.setText(String.valueOf(hodnota*1000000));
                kilo.setText(String.valueOf(hodnota*1000));
                tona.setText(String.valueOf(hodnota));
                break;
            default:
                haha.setText("bazmek :)");

        }
    }
    private void vycisti(){
        mgram.setText("");
        gram.setText("");
        kilo.setText("");
        tona.setText("");
        haha.setText("");
    }

    public void spracuj(ActionEvent event){

        vycisti();

        String text = vstup.getText();
        String[] casti = text.split(" ");

        try {
            double cislo = Double.parseDouble(casti[0]);
            try {
                String jednotky = casti[1];
                vysledok((float) cislo, jednotky);
            } catch (Exception e) {
                haha.setText("chybný zápis");
            }
        }
        catch (NumberFormatException e) {
            haha.setText("chyba v zápise, zapisuj s medzerou!");
        }





    }


}
