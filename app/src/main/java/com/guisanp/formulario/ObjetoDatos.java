package com.guisanp.formulario;

import android.text.Editable;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by c_pin on 20/01/2017.
 */

public class ObjetoDatos implements Serializable {
    private String nombre;
    private String telefono;
    private String mail;
    private int Year;
    private int month;
    private int day;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return Year;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        Year = year;
    }
}
