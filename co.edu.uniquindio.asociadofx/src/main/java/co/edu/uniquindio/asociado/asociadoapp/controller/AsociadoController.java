package co.edu.uniquindio.asociado.asociadoapp.controller;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.asociado.asociadoapp.model.Asociado;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AsociadoController {

    String rBtn = "";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnAgregarAsociado;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private RadioButton rBtnAsociadoVip;

    @FXML
    private RadioButton rBtnAsociadoPremium;

    @FXML
    private TextField txtCedula;

    @FXML
    private RadioButton rBtnAsociadoBasico;

    @FXML
    void onAgregarAsociado(ActionEvent event) {
        agregarAsociado();
    }

    @FXML
    void initialize() {
        ToggleGroup toggleGroup = new ToggleGroup();
        rBtnAsociadoBasico.setToggleGroup(toggleGroup);
        rBtnAsociadoPremium.setToggleGroup(toggleGroup);
        rBtnAsociadoVip.setToggleGroup(toggleGroup);
    }

    public void agregarAsociado(){
        obtenerTipoAsociado();
        Asociado asociado = new Asociado();
        asociado.setNombre(txtNombre.getText());
        asociado.setApellido(txtApellido.getText());
        asociado.setCedula(txtCedula.getText());
        asociado.setEdad(Integer.parseInt(txtEdad.getText()));
        asociado.setTelefonoFijo(txtTelefono.getText());
        asociado.setTelefonoCelular(txtCelular.getText());
        txtResultado.setText("tipo de asociado" + rBtn +"\n" + asociado.toString());
    }
    public void obtenerTipoAsociado(){
        ToggleGroup toggleGroup = rBtnAsociadoBasico.getToggleGroup();
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        if (selectedRadioButton != null) {
            rBtn = selectedRadioButton.getText();
        }
    }

}

