module spacefx {

    // Java
    requires java.base;
    requires java.logging;

    // Java-FX
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires jpro.webapi;

    exports eu.hansolo.spacefx;
}