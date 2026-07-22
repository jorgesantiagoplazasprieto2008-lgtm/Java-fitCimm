package main.java.Modelo;

public class Plan {
    private int Id;
    private String Nombre;
    private int DuracionDias;
    private double Valor;
    private boolean Activo;

    public Plan() {
    }

    public Plan(int id, String nombre, int duracionDias, double valor, boolean activo) {
        Id = id;
        Nombre = nombre;
        DuracionDias = duracionDias;
        Valor = valor;
        Activo = activo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDuracionDias() {
        return DuracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        DuracionDias = duracionDias;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }
}
