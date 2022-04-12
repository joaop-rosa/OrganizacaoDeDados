import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VarrerArquivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();
        Varredura varredura = new Varredura();
        int posicaoRetornada = -1;
        int resp2;
        List<Pessoa> listaPessoa = new ArrayList<>();
        try {
            listaPessoa = arquivo.lerArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            //criar arquivo se nao existir
            e.printStackTrace();
        }
        do{
            System.out.println("Qual busca deseja fazer? 1-Binaria | 2-Sequencial");
            int resp = ler.nextInt();
            System.out.println("Informe a Chave que deseja buscar: ");
            int chave = ler.nextInt();
            if(resp == 1){
                //long inicio = System.currentTimeMillis();
                posicaoRetornada = varredura.buscaBinaria(listaPessoa, chave);
                //long fim = System.currentTimeMillis();
                //System.out.println("Tempo de busca:"+(fim-inicio));
            }else if(resp == 2){
                //long inicio = System.currentTimeMillis();
                posicaoRetornada = varredura.buscaSequencial(listaPessoa, chave);
                //long fim = System.currentTimeMillis();
                //System.out.println("Tempo de busca:"+(fim-inicio));

            }
            System.out.println("Posição da chave buscada: "+posicaoRetornada);
            System.out.println("Deseja fazer outra busca? 1-sim | 0-nao");
            resp2 = ler.nextInt();
        }while(resp2 == 1);    
        
        
        
    }

}
