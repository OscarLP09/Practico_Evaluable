package org.example.practico_evaluable.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Clase que representa un usuario en el sistema.
 */
public class User {
    private final SimpleStringProperty email;
    private final SimpleStringProperty platform;
    private final SimpleStringProperty admin;
    private final SimpleStringProperty version;
    private final SimpleStringProperty dateTime;

    /**
     * Constructor de la clase User.
     *
     * @param email Correo electrónico del usuario.
     * @param platform Plataforma (Windows, Linux, MacOS) del usuario.
     * @param admin Indica si el usuario es administrador (Sí/No).
     * @param version Versión del software (1-5).
     * @param dateTime Fecha y hora de creación del usuario.
     */
    public User(String email, String platform, String admin, String version, String dateTime) {
        this.email = new SimpleStringProperty(email);
        this.platform = new SimpleStringProperty(platform);
        this.admin = new SimpleStringProperty(admin);
        this.version = new SimpleStringProperty(version);
        this.dateTime = new SimpleStringProperty(dateTime);
    }

    /**
     * Obtiene la propiedad del correo electrónico.
     *
     * @return Propiedad del correo electrónico.
     */
    public StringProperty emailProperty() { return email; }

    /**
     * Obtiene la propiedad de la plataforma.
     *
     * @return Propiedad de la plataforma.
     */
    public StringProperty platformProperty() { return platform; }

    /**
     * Obtiene la propiedad de si el usuario es administrador.
     *
     * @return Propiedad de si el usuario es administrador.
     */
    public StringProperty adminProperty() { return admin; }

    /**
     * Obtiene la propiedad de la versión del software.
     *
     * @return Propiedad de la versión del software.
     */
    public StringProperty versionProperty() { return version; }

    /**
     * Obtiene la propiedad de la fecha y hora de creación del usuario.
     *
     * @return Propiedad de la fecha y hora de creación del usuario.
     */
    public StringProperty dateTimeProperty() { return dateTime; }

    /**
     * Representación en cadena del usuario.
     *
     * @return Cadena que representa al usuario.
     */
    @Override
    public String toString() {
        return "User{" +
                "email='" + email.get() + '\'' +
                ", platform='" + platform.get() + '\'' +
                ", admin='" + admin.get() + '\'' +
                ", version='" + version.get() + '\'' +
                ", dateTime='" + dateTime.get() + '\'' +
                '}';
    }
}
