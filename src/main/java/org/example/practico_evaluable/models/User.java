package org.example.practico_evaluable.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private final SimpleStringProperty email;
    private final SimpleStringProperty platform;
    private final SimpleStringProperty admin;
    private final SimpleStringProperty version;
    private final SimpleStringProperty dateTime;

    public User(String email, String platform, String admin, String version, String dateTime) {
        this.email = new SimpleStringProperty(email);
        this.platform = new SimpleStringProperty(platform);
        this.admin = new SimpleStringProperty(admin);
        this.version = new SimpleStringProperty(version);
        this.dateTime = new SimpleStringProperty(dateTime);
    }

    public StringProperty emailProperty() { return email; }
    public StringProperty platformProperty() { return platform; }
    public StringProperty adminProperty() { return admin; }
    public StringProperty versionProperty() { return version; }
    public StringProperty dateTimeProperty() { return dateTime; }

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
