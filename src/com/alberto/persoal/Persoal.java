package com.alberto.persoal;

public class Persoal {

    private String telf;
    private String correo;

    public Persoal() {
    }

    public Persoal(String telf, String correo) {
        this.telf=telf;
        this.correo=correo;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf=telf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo=correo;
    }

    @Override
    public String toString() {
        return "Persoal{"+"telf="+telf+", correo="+correo+'}';
    }

}
