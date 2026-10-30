package com.leidy.heramienta.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HerramientasController {

    @FXML
    public TextField txtId;

    @FXML
    public TextField txtNombre;

    @FXML
    public TableView tableherramientas;
    @FXML
    public TableColumn colNombre;
    @FXML
    public TableColumn colId;


    @FXML
    public void handleSeleccionado(MouseEvent mouseEvent) {
    }

    /*
    @FXML
public void handleCrear(MouseEvent mouseEvent) {
    Integer id = Integer.parseInt(txtId.getText());
    String nombre = txtNombre.getText();
    HerramientaDto = new herremientasDto(id, nombre);
    this.HerramientasService.crear(HerramientaDto);


     */
}