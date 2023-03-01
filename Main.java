import java.util.Scanner;
//import java.util.Locale;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double valorProduto,aliqInterno, aliqInterestadual,icmsInterestadual,icmsNormal,icmsAntecipacao, totalNota;

    aliqInterno = 0.18;
    aliqInterestadual = 0.07;     
   

    System.out.println("Informe o valor do produto: ");
    valorProduto = sc.nextDouble();
    icmsNormal = valorProduto * aliqInterno;
    totalNota = valorProduto + icmsNormal;
    icmsInterestadual = valorProduto * aliqInterestadual;
    icmsAntecipacao = icmsNormal - icmsInterestadual;
    sc.close();
    
    System.out.println("=======================================");
    System.out.println("                                       ");
    System.out.printf("Valor do produto:...........%.2f%n",valorProduto);
    System.out.printf("ICMS Normal:.................%.2f%n",icmsNormal);
    System.out.printf("Valor total da nota:.........%.2f%n",totalNota);
    System.out.printf("ICMS Interestadual:..........%.2f%n",icmsInterestadual);
    System.out.printf("Antecipação Parcial de ICMS:.%.2f%n",icmsAntecipacao);
    System.out.println("                                       ");
    System.out.println("=======================================");
  
  }
}