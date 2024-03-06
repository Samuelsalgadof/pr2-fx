module co.edu.uniquindio.asociado.asociadoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.asociado.asociadoapp to javafx.fxml;
    exports co.edu.uniquindio.asociado.asociadoapp;

    opens co.edu.uniquindio.asociado.asociadoapp.controller;
    exports co.edu.uniquindio.asociado.asociadoapp.controller;
}

