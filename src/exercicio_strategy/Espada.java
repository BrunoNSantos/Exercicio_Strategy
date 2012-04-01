/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_strategy;

/**
 *
 * @author Bruno
 */
public class Espada implements IArma{
    private int dano = 10;

    public Espada() {
    }

    @Override
    public int causaDano() {
        return this.dano;
    }
    
    
    
    
}
