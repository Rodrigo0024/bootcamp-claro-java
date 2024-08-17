public class App {
    public static void main(String[] args) throws Exception {
       int idade = 26;
       double altura =1.77;
       String meuNome = "Rodrigo";

       boolean verdadeira = true;
       idade = 27;
       String primeiroNome ="Mariana";
       String segundoNome =" Correa";


       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
