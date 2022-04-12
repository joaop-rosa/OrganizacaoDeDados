import java.util.List;

public class Varredura {
    int buscaSequencial(List<Pessoa> listaPessoa,int valorBuscado){
        int i = 0;
        while ((i<listaPessoa.size()) && (listaPessoa.get(i).chave != valorBuscado)){
            i++;
        }
        if ((listaPessoa.size()==0)||(listaPessoa.size()<=i)){
            System.out.println("Numeros de iterações busca sequencial: "+i);
            return -1;
        }
        System.out.println("Numeros de iterações busca sequencial: "+i);
        return i;
    }

    int buscaSequencial(List<Pessoa> listaPessoa,String valorBuscado){
        int i = 0;
        while ((i<listaPessoa.size()) && (!listaPessoa.get(i).nome.equals(valorBuscado))){
            i++;
        }
        if ((listaPessoa.size()==0)||(listaPessoa.size()<=i)){
            System.out.println("Numeros de iterações busca sequencial: "+i);
            return -1;
        }
        System.out.println("Numeros de iterações busca sequencial: "+i);
        return i;
    }

    int buscaBinaria(List<Pessoa> listaPessoa,int valorBuscado){
        int inicio = 0;         //Posição inicial do vetor.
        int meio = 0;          //Posição do meio do vetor.
        int fim = listaPessoa.size() - 1;  //Posição final do vetor.
        int iteracoes = 0;
        while(inicio <= fim) {
            iteracoes++;
            meio = (fim + inicio) / 2; //Encontra o meio do vetor.

            if(listaPessoa.get(meio).chave == valorBuscado) {
                System.out.println("Encontrou o número " + valorBuscado);
                System.out.println("Numeros de iterações busca binaria: "+iteracoes);
                return meio;
            }
            if(listaPessoa.get(meio).chave < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Não encontrou o número " + valorBuscado);
        System.out.println("Numeros de iterações busca binaria: "+iteracoes);
        return -1;

    }

    void buscaHashing(List<Pessoa> listaPessoa,int valorBuscado){

    }
}
