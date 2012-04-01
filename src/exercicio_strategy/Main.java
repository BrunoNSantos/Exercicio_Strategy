/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_strategy;

/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro("Bruno",100);
        Guerreiro guerreiro2 = new Guerreiro("Anderson Silva",100);
        
        System.out.println(guerreiro1.getNome() + " tem "+guerreiro1.getEnergia()+ " de energia" );
        System.out.println(guerreiro2.getNome() + " tem "+guerreiro1.getEnergia()+ " de energia\n" );
        
        IArma lanca = new Lanca();
        IArma faca = new Faca();
        
        guerreiro1.atacar(lanca, guerreiro2);
        guerreiro2.atacar(faca, guerreiro1);
        
        System.out.println("Depois do ataque\n");
        
        System.out.println(guerreiro1.getNome() + " tem "+guerreiro1.getEnergia()+ " de energia" );
        System.out.println(guerreiro2.getNome() + " tem "+guerreiro2.getEnergia()+ " de energia" );
        
        
        
        
    }
    
}
