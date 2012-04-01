/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_strategy;

/**
 *
 * @author Bruno
 */
public class Guerreiro {
    private String nome;
    private IArma arma;
    private int energia;

    public Guerreiro(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }


    public IArma getArma() {
        return arma;
    }

    public void setArma(IArma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void atacar(IArma arma, Guerreiro adversario){
        adversario.recebeAtaque(arma);
    }

    private void recebeAtaque(IArma arma) {
        this.energia = energia - arma.causaDano();
    }
    
}
