import java.util.List;

public class Sort {

    List<Pessoa> bubbleSort(List<Pessoa> arr){
        int n = arr.size();
        Pessoa temp = new Pessoa();
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr.get(j-1).getChave() > arr.get(j).getChave()){
                    //swap elements
                    temp = arr.get(j-1);
                    arr.set(j-1,arr.get(j));
                    arr.set(j,temp);
                }

            }
        }
        return arr;
    }

}
