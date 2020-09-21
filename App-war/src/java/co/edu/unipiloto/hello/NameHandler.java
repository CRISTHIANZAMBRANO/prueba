/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.hello;

/**
 *
 * @author crist
 */
public class NameHandler {

    private String name, anoingreso;
    private int semestre, dia, mes, año;

    public NameHandler() {
        name = null;
        anoingreso = null;
        semestre = 0;
        dia = 0;
        mes = 0;
        año = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnoingreso() {
        return anoingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setAnoingreso(String anoingreso) {
        this.anoingreso = anoingreso;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
