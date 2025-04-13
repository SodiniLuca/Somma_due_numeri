module com.example.somma_due_numeri {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.somma_due_numeri to javafx.fxml;
    exports com.example.somma_due_numeri;
}