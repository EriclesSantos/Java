public class main {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);

        //Calcular a média de um aluno
        System.out.println("Digite a primeira Nota: ")
        float nota1= leitor.nextFloat();
        System.out.println("Digite a segunda Nota: ")
        float nota2= leitor.nextFloat();

        float media = (nota1 + nota2)/2;

        System.out.println("A média é: + media");
        
        leitor.close();







    }

}