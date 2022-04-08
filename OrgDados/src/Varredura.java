import java.util.List;

public class Varredura {
    int buscaSequencial(List<Pessoa> listaPessoa,int valorBuscado){
        int i = 0;
        while ((i<listaPessoa.size()) && (listaPessoa.get(i).chave != valorBuscado)){
            i++;
        }
        if ((listaPessoa.size()==0)||(listaPessoa.size()<=i)){
            return -1;
        }
        return i;
    }

    int buscaSequencial(List<Pessoa> listaPessoa,String valorBuscado){
        int i = 0;
        while ((i<listaPessoa.size()) && (!listaPessoa.get(i).nome.equals(valorBuscado))){
            i++;
        }
        if ((listaPessoa.size()==0)||(listaPessoa.size()<=i)){
            return -1;
        }
        return i;
    }

    int buscaBinaria(List<Pessoa> listaPessoa,int valorBuscado){
        int inicio = 0;         //Posição inicial do vetor.
        int meio = 0;          //Posição do meio do vetor.
        int fim = listaPessoa.size() - 1;  //Posição final do vetor.

        while(inicio <= fim) {
            meio = (fim + inicio) / 2; //Encontra o meio do vetor.

            if(listaPessoa.get(meio).chave == valorBuscado) {
                System.out.println("Encontrou o número " + valorBuscado);
                return meio;
            }
            if(listaPessoa.get(meio).chave < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Não encontrou o número " + valorBuscado);
        return -1;
    }

    void buscaHashing(List<Pessoa> listaPessoa,int valorBuscado){

    }
    void buscaHashing(List<Pessoa> listaPessoa,String valorBuscado){

    }
}
