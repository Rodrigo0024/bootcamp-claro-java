public class SobreMim {
    public static void main(String[] args)  {

        String nome = args [0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura =Double.valueOf(args[3]);


        System.out.println("O seu nome é "+nome+" "+sobrenome);
        System.out.println("Você tem"+ idade +" anos");
        System.out.println("Sua altura é "+ altura);

       
    }
}
