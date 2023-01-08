public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.abaixarvolume();
        smartTv.ligar();
        smartTv.trocarCanal(5);
        System.out.println("tv ligada: " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);


    }
}
