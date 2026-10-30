module com.leidy.heramienta {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.leidy.heramienta to javafx.fxml;
    exports com.leidy.heramienta;

    opens com.leidy.heramienta.controller to javafx.fxml;
}