public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual?"+ smartTv.canal);
        System.out.println("O volume da tv é?" + smartTv.volume);


        smartTv.ligar();
        System.out.println("A tv ligada? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("A tv ligada? "+smartTv.ligada);

        System.out.println("O volume  atual da tv é?" + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("O volume  atual da tv é?" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("O volume  atual da tv é?" + smartTv.volume);

        smartTv.mudarCanal(52);
        System.out.println("Canal atual?"+ smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual?"+ smartTv.canal);







    }
}