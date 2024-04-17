import java.util.Scanner;

class HelloWorld {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
        ex7();
    }

    public static void ex1() {
        //1  Crie um programa que pergunte 3 valores ao usuário e imprima a soma desses valores. Dica: usar uma variável para a soma. 
        int input1  = scanner.nextInt();
        int input2  = scanner.nextInt();
        int input3  = scanner.nextInt();
        int zero = 0;

        zero = input1 + input2 + input3;

        System.out.println("A soma dos valores e: " + zero);
    }

    private static void ex2() {
        //2 Crie um programa que receba o número do mês e imprima o nome desse mês. Exemplo: mês 4: ABRIL. 
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                
            System.out.println("Fevereiro");   
                break;
            case 3:
                System.out.println("Marco");   
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
            System.out.println("Junho");                    
                break;
            case 7:
            
            System.out.println("Julho");                    
                break;
            case 8:
            
            System.out.println("Agosto");        
                break;
            case 9:
            
            System.out.println("Setembro");        
                break;
            case 10:
            
            System.out.println("Outubro");        
                break;
            case 11:
            
            System.out.println("Novembro");    
                break;
            case 12:
            
            System.out.println("Dezembro");        
                break;
                //3 Acrecente ao programa anterior uma validação: caso o mês seja uma número diferente de 1 a 12, imprima: MÊS INVÁLIDO. 

 
            default:
            
            System.out.println("Mes invalido");
                break;
        }
    }

    private static void ex4() {
        //4 Crie um programa que receba os 3 lados de triângulo e imprima se ele é equilátero (3 lados iguais) ou não. 
        int triangulo1 = scanner.nextInt();
        int triangulo2 = scanner.nextInt();
        int triangulo3 = scanner.nextInt();

        if(triangulo1 == triangulo2 && triangulo2 == triangulo3  ){
            System.out.println("E equilatero");
        }else{
            System.err.println("Num é não");
        }
    }
    
    private static void ex5() {
        //5 Crie um programa que pergunte 2 valores ao usuário e imprima o maior. Caso sejam iguais, imprimir: IGUAIS. 

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if(valor1>valor2){
            System.err.println("O maior valor e o valor 1");
        }else if(valor1<valor2){
            System.out.println("O maior valor e o valor 2");
        }else{
            System.err.println("Os valores sao iguais");
        }
    }

    private static void ex6() {
        //6 Crie um programa que pergunte 3 valores ao usuário e imprima quantos desses valores são negativos. Dica: usar uma variável para contar quantos valores negativos há. 
        int contadorNegativo = 0;
        System.out.println("Digite valores e veja quantos negativos foram digitados");
        for(int i = 1; i<=3; i++){
        int valoresNegativo = scanner.nextInt();
          if(valoresNegativo < 0){
            contadorNegativo++;
          }  
        }
        System.out.println("Voce digitou"+contadorNegativo+"valores negativos");
    }
    
    private static void ex7() {
        int idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Voce nao precisa votar!");
        }else if(idade>=18){
            System.out.println("O voto e obrigatorio");
        }else{
            System.out.println("O voto e facultativo");
        }
    }
}
