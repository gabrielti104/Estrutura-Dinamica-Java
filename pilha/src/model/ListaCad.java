package model;

import javax.swing.JOptionPane;

public class ListaCad {

    public Cad PrimeiroNo;
    public Cad UltimoNo;
    public int cont;

    public ListaCad() {
        this.PrimeiroNo = null;
        this.UltimoNo = null;
        this.cont = 0;
    }

    public void addNewCad(Object dado) {
        Cad newCad = new Cad(); //Instanciando novo objeto

        newCad.dado = dado; //preencher dados

        if (this.PrimeiroNo == null) {
            newCad.liga = null;
            this.PrimeiroNo = newCad;
            this.UltimoNo = newCad;
        } else {
            this.UltimoNo.liga = newCad;
        }

        this.UltimoNo = newCad;
    }

    public void Plotar() {
        Cad temp = this.PrimeiroNo;

        String saida = "";
        while (temp != null) {
            saida += "\n" + temp.dado;
            temp = temp.liga;
        }

        JOptionPane.showMessageDialog(null, saida);
    }

}
