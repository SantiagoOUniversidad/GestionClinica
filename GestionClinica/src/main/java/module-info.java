module co.edu.uniquindio.gestionclinica {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens co.edu.uniquindio.gestionclinica to javafx.fxml;
    exports co.edu.uniquindio.gestionclinica;
}