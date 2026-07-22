package main.java.Modelo;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.AbstractQueue;

public class Socio {
    private int Id;
    private String Documento;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Correo;
    private LocalDate FechaNacimiento;

    public Socio() {
    }

    public Socio(LocalDate fechaNacimiento, String correo, String telefono, String apellidos, String nombres, String documento, int id) {
        FechaNacimiento = fechaNacimiento;
        Correo = correo;
        Telefono = telefono;
        Apellidos = apellidos;
        Nombres = nombres;
        Documento = documento;
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
