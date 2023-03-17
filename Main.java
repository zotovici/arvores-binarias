import java.util.*;
class Main {
  public static void main(String[] args) {
    Arvore a = new Arvore();
           int op, valor;
    Scanner sc = new Scanner(System.in);
    String menu="MENU\n1 - Adiciona\n2 - Remove"+
      "\n3 - Percorre com Pré-Ordem\n4 - Percorre Em-Ordem\n5 - Percorre com Pós-Ordem\n99 - Sair";
    do{
      System.out.println(menu);
      op = sc.nextInt();
      switch(op){
        case 1:
          System.out.println("Valor? ");
          valor = sc.nextInt();
          a.adiciona(valor);
          break;
        case 2: break;
        case 3: 
          if (a.getRaiz() != null){
            System.out.println("Elementos:"); 
            a.preOrdem(a.getRaiz());
          }
          else
            System.out.println("Árvore Binária Vazia");
          break;
        case 4:
          if (a.getRaiz() != null){
             System.out.println("Elementos ");
             a.emOrdem(a.getRaiz());
          }
          else
             System.out.println("Árvore Binária Vazia");
          break;
        case 5:
          if (a.getRaiz() != null){
             System.out.println("Elementos ");
             a.posOrdem(a.getRaiz());
      }else
             System.out.println("Árvore Binária Vazia");
          break;
        case 99:
          System.out.println("Saindo");
          break;
        default:
          System.out.println("ERRO! Digite uma opção válida");
      }      
    }while (op != 99);
            
  }
}