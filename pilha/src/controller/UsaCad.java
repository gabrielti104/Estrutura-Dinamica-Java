
package controller;

import model.ListaCad;

public class UsaCad {
    public static void main(String[] args){
        ListaCad cl = new ListaCad();
        
        cl.addNewCad(10);
        cl.addNewCad(20);
        cl.Plotar();
    }
}
