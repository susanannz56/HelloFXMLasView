module hellofxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;
    requires com.gluonhq.charm.glisten;

    opens hellofx to javafx.fxml;

    exports hellofx;
}