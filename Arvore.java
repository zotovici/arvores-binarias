public class Arvore{ 
    private No raiz; 
    public Arvore ( ){ 
        raiz=null; 
    }
    
    /* Este trecho comentado pode substituir a linha 20
    No aux1=raiz, aux2=raiz; 
    while (aux1 != null && e != aux2.elemento){ 
                aux2=aux1; 
                if (e<aux1.elemento) 
                    aux1=aux1.esquerda; 
                else if (e>aux1.elemento) 
                    aux1=aux1.direita; } */
    public void adiciona(int e){ 
        No novo = new No(e); 
        if (raiz == null) 
            raiz = novo; 
        else{  
            No aux2=busca(raiz, raiz, e);
            if (e == aux2.elemento) 
                System.out.println("Elemento já existe"); 
            else{ if (e < aux2.elemento)   
                aux2.esquerda = novo; 
            if (e > aux2.elemento)   
                aux2.direita = novo; 
            System.out.println("Elemento Incluído"); } 
        }
    }
    public No busca(No aux1, No aux2, int e){
        if (aux1 != null && e != aux2.elemento){ 
            aux2=aux1; 
            if (e<aux1.elemento) 
                return busca(aux1.esquerda, aux2, e);
            else if (e>aux1.elemento) 
                return busca(aux1.direita, aux2, e); 
        }
        return aux2;
    }
        
        public void preOrdem(No n){
            if (n != null){
                System.out.println(" "+n.elemento);
                preOrdem(n.esquerda);
                preOrdem(n.direita);
            }
        }
        
        public void emOrdem(No n){
            if (n != null){
                emOrdem(n.esquerda);
                System.out.println(" "+n.elemento);
                emOrdem(n.direita);
            }
        }
        
        public void posOrdem(No n){
            if (n != null){
                posOrdem(n.esquerda);
                posOrdem(n.direita);
                System.out.println(" "+n.elemento);
            }
        }
        
        public No getRaiz(){
            return raiz;
        }
        
}
