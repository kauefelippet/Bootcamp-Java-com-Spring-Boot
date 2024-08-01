package smart_tv;

/**
 * SmartTv é uma classe que representa uma TV, envolvendo seu estado e suas funções.
 * @author kauefelippet
 * @version 1.0
 * 
 */

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada=true;
        System.out.println("TV ligada");
    }

    public void desligar() {
        ligada=false;
        System.out.println("TV desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado: " + volume);
    }
    
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuído: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal alterado para " + canal);
    }
    
    public void diminuirCanal() {
        canal--;
        System.out.println("Canal alterado para " + canal);
    }
    
    public void escolherCanal(int numeroCanal) {
        canal = numeroCanal;
        System.out.println("Canal alterado para " + canal);
    }

}
