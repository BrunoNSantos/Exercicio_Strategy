/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_strategy;

/**
 *
 * @author Bruno
 */
public class Lanca implements IArma{
    private  int dano = 20;

    public Lanca() {
    }

    @Override
    public int causaDano() {
        return dano;
    }
   
    
    
    
}
