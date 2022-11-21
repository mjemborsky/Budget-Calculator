module com.example.budgetcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.budgetcalculator to javafx.fxml;
    exports com.example.budgetcalculator;
}