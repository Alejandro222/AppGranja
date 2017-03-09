package com.example.alejandro.migranja.Objetos;

/**
 * Created by alejandro on 08/03/17.
 */

public class Granja {
    String nombreGranja;
    String nombreGrupo;
    int cantPollos;
    String fechaIngreso;
    String fechaSalida;

    public Granja() {

    }

    public Granja(String nombreGrupo, int cantPollos, String fechaIngreso, String fechaSalida, String nombreGranja) {
        this.nombreGrupo = nombreGrupo;
        this.cantPollos = cantPollos;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.nombreGranja = nombreGranja;
    }

    public String getNombreGranja() {
        return nombreGranja;
    }

    public void setNombreGranja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getCantPollos() {
        return cantPollos;
    }

    public void setCantPollos(int cantPollos) {
        this.cantPollos = cantPollos;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
