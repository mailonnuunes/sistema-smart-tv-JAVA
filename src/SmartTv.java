public class SmartTv{
    boolean ligada = false;
    int canal=1;
    int volume = 25;


    public void trocarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("trocando o canal para: " + canal);
    } 

    public void aumentarCanal(){
        System.out.println("aumentando o canal para " + canal);
        canal++;
    }
    public void diminuirCanal(){
        canal++;
        System.out.println("diminuindo o canal para " + canal);
        
    }

    public void ligar(){
        ligada=true;
    } 
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para " + volume);
        
    }
    public void abaixarvolume(){
        volume--;
        System.out.println("abaixando volume para " + volume);
        
    }
}