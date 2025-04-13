package com.example.somma_due_numeri;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SommaDiDueNumeriController {

    @FXML
    private Button btnCalcola;

    @FXML
    private Button btnCancella;

    @FXML
    private Label lblAddendo1;

    @FXML
    private Label lblAddendo2;

    @FXML
    private Label lblSomma;

    @FXML
    private Label lblTotale;

    @FXML
    private TextField txtAddendo1;

    @FXML
    private TextField txtAddendo2;

    @FXML
    void clickOnCalcola(ActionEvent event) {
        try {
            double numero1 = Double.parseDouble(txtAddendo1.getText());
            double numero2 = Double.parseDouble(txtAddendo2.getText());
            double somma = numero1 + numero2;
            lblSomma.setText(String.valueOf(somma));
        } catch (NumberFormatException e) {
            showAlert("Errore", "E' possibile inserire solo numeri!");
        }
    }

    @FXML
    void clickOnCancella(ActionEvent event) {
        txtAddendo1.clear();
        txtAddendo2.clear();
        lblTotale.setText("");
    }

    private void showAlert(String titolo, String messaggio) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titolo);
        alert.setHeaderText(null);
        alert.setContentText(messaggio);
        alert.showAndWait();
    }
}
