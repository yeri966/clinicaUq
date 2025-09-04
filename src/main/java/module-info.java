module co.edu.uniquindio.clinicauq {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clinicauq to javafx.fxml;
    exports co.edu.uniquindio.clinicauq;
}