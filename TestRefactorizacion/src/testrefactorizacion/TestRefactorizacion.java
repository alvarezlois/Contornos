/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrefactorizacion;
/**
 *
 * @author xavi
 */
public class TestRefactorizacion {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // TODO code application logic here
 cliente c=new cliente("IES de Rodeira");
 }

    private static class cliente {

        public cliente() {
        }

        private cliente(String ies_de_Rodeira) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

// ESTAMOS NA TAREFA 02