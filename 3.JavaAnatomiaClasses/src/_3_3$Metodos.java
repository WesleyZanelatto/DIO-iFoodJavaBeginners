public class _3_3$Metodos {
    public static void main(String[] args) {
        
        String primeiroNome = "Wesley";
        String segundoNome = "Zanelatto";
        String nomeCompleto;
        
         nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    /*public static **String** significa que o resultado do método que eu quero retornar é do tipo 
    String, mas poderia ser int, float, double long, boolean... Dentro dos parametros vai ser o tipo 
    da entrada que precisamos coletar e que também pode ser de outros tipos ...*/

    public static String nomeCompleto (String primeiroNome, String segundoNome){
    //    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
      return "Resultado do método: " + primeiroNome + " " + segundoNome;
    }


}
