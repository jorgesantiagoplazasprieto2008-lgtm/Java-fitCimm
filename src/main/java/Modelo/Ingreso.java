package main.java.Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ingreso {
    private int Id;
    private LocalDate FechaIngreso;
    private LocalTime HoraIngreso;

    public Ingreso() {
    }

    public Ingreso(LocalTime horaIngreso, LocalDate fechaIngreso, int id) {
        HoraIngreso = horaIngreso;
        FechaIngreso = fechaIngreso;
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public LocalTime getHoraIngreso() {
        return HoraIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        HoraIngreso = horaIngreso;
    }
}
