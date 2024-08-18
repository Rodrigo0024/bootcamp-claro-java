public class Operadores {
   
    public static void main(String[] args)  {
       String nomeCompleto ="LINGUAGEM" + " "+ "JAVA";
       System.out.println(nomeCompleto);
        //operadores unários
        int numero = 5;  

        numero =  - numero;
        System.out.println(numero);

        numero =  numero * -1;
        System.out.println(numero);


        //incremento de numeros 
        
        numero = 5;
        numero  = numero  + 2;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(++numero);
        numero--;
        --numero;
        boolean variavel = false;
        System.out.println(!variavel);
        variavel = !variavel;

        //operador ternário 

        int a, b;
        a= 5;
        b = 6;
        String resultado = a==b ? "Verdadeiro": "Falso";

       
        System.out.println(resultado);


        //Operadores relacionais 
        int numero1 =1;
        int numero2 =2;
        boolean simNao= numero1 ==numero2;

        System.out.println("Numero 1 é igual a numero 2?"+simNao);
        simNao= numero1 !=numero2;

        System.out.println("Numero 1 é diferente a numero 2?"+simNao);

        simNao= numero1 >numero2;

        System.out.println("Numero 1 é maior a numero 2?"+simNao);


        if(numero1 < numero2){
            System.out.println("Verdadeira");
        }


        String nomeUm= "Rodrigo";
        String nomeDois= new String("Rodrigo");

        System.out.println(nomeUm.equals(nomeDois));

    //Operadores logicos
    boolean condicao1 = true;
    boolean condicao2 =false;

    if(condicao1 && condicao2){
        System.out.println("Condição verdadeira");

    }

    if(condicao1 || condicao2){
        System.out.println("Uma das Condições é verdadeira");
        
    }










}
}
