package org.example.practico_evaluable.models;

import lombok.Data;

import static java.time.LocalTime.now;

@Data
public class User {
    public String email;
    public String plataformaChoice;
    public boolean is_admin;
    public Integer version_spinner;


    @Override
    public String toString() {
        return "Usuario{" +
                "correo='" + email + '\'' +
                ", plataforma='" + plataformaChoice + '\'' +
                ", esAdmin=" + is_admin +
                ", versionSoftware=" + version_spinner +
                ", fechaCreacion=" + now() +
                '}';
    }

}
