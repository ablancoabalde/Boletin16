package boletin16;

import com.alberto.persoal.Persoal;

public class Academica {

    private static int numreferencia=2018;
    private String nome;
    private int nota;
    private Persoal datosPer;

    public Academica() {
    }

    public Academica(String nome, int nota, Persoal alum) {
        this.nome=nome;
        this.nota=nota;
        this.datosPer=alum;
        numreferencia+=1;
    }

    public static int getNumreferencia() {
        return numreferencia;
    }

    public static void setNumreferencia(int numreferencia) {
        Academica.numreferencia=numreferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
    }

    public Persoal getDatosPer() {
        return datosPer;
    }

    public void setDatosPer(Persoal datosPer) {
        this.datosPer=datosPer;
    }

    @Override
    public String toString() {
        return "Academica{"+"nome="+nome+", nota="+nota+", alum="+datosPer+'}';
    }

}
