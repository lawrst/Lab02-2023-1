package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {
        array = new int [10];
        indice_fim = 0;
    }

    @Override
    public boolean buscaElemento(int valor) {
       for(int i = 0; i < indice_fim; i++){
        if(valor == array[i]){
            return true;
        }
       }
       return false; 
    }

    @Override
    public int buscaIndice(int valor) {
       return;
    }

    @Override
    public int minimo() {
        if(indice_fim == 0){
            return -1;
        }
        int minimo = array[0];
        for(int i = 0; i < indice_fim; i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }

    @Override
    public int maximo() {
        if(indice_fim == 0){
            return -1;
        }
        int maximo = array[0];
        for(int i = 0; i > indice_fim; i++){
            if(array[i] < maximo){
                maximo = array[i];
            }
        }
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
       insereInicio(valor);
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(indice_fim == 0){
            array[0] = valor;
            indice_fim = 1;
        }else{
            if(buscaIndice == 0){
                insereInicio(valor);;
                return;
            }
            for(int i = indice_fim - 1; i >= buscaIndice; i--){
                array[i] = array[i + 1];

                }
                indice_fim ++;
            }
        }
    

    @Override
    public void insereInicio(int valor) {
        for (int i = indice_fim - 1; i >= 0; i--){
            array[i + 1] = array[i];
        }
            array[0] = valor;
            indice_fim ++;
    }

    @Override
    public void insereFim(int valor) {
        array[indice_fim] = valor;
        indice_fim++;
    }

    @Override
    public void remove(int valor) {
        if(indice_fim == 0){
            return;
        }
        int buscaIndice = -1;
        for(int i = 0; i < indice_fim; i++){
            if(array[i] == valor){
                buscaIndice = i;
                break;
            }
        }
        if(buscaIndice != -1){
            for(int i = 0; i < indice_fim; i++){
                array[i] = array[i+1];
            }
            indice_fim--;
        }
    }

    @Override
    public void removeIndice(int indice) {
        if(indice_fim == 0){
            return;
        }
        for(int i = indice; i < indice_fim; i++){
            array[i] = array[i + 1];
        }
        indice_fim--;
 
    }

    @Override
    public void removeInicio() {

  
       
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
