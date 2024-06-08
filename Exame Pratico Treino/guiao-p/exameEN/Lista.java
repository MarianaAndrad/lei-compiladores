import java.util.ArrayList;


public class Lista{
    private ArrayList<Double> lista;
    
    public Lista(ArrayList<Double> x){
        this.lista= x;
    }

    public ArrayList<Double> getLista(){
        return this.lista;
    }

    public Lista add(Lista outra){
        if(this.lista.size()>= outra.getLista().size()){
            ArrayList<Double> nova = this.lista;
            for (int i = 0; i< outra.getLista().size(); i++){
                double x = nova.get(i)+ outra.getLista().get(i);
                nova.remove(i);
                nova.add(i, x);
            }
            return new Lista(nova);
        }
        else{
            ArrayList<Double> nova = outra.getLista();
            for (int i = 0; i< this.lista.size(); i++){
                double x = nova.get(i)+ this.lista.get(i);
                nova.remove(i);
                nova.add(i, x);
            }
            return new Lista(nova);
        }
    }

    public Lista dif(Lista outra){
         System.out.println("dif");
        if(this.lista.size()>= outra.getLista().size()){
            ArrayList<Double> nova = this.lista;
            for (int i = 0; i< outra.getLista().size(); i++){
                double x = nova.get(i)-outra.getLista().get(i);
                nova.remove(i);
                nova.add(i, x);
            }
            return new Lista(nova);
        }
        else{
            ArrayList<Double> nova = outra.getLista();
            for (int i = 0; i< this.lista.size(); i++){
                double x = this.lista.get(i)-nova.get(i);
                nova.remove(i);
                nova.add(i, x);
            }
            return new Lista(nova);
        }
    }


    public Lista sum(){
        double x = 0.0;
        for(int i = 0; i < this.lista.size();i++ ){
            x += this.lista.get(i);
        }
         System.out.println("sum");
        ArrayList<Double> nova = new ArrayList<>();
        nova.add(x);
        return new Lista(nova);
    }

    public Lista avg(){
        double x = 0.0;
        for(int i = 0; i < this.lista.size();i++ ){
            x += this.lista.get(i);
        }

        if(this.lista.size() == 0){
            System.err.println("Não se calcula media com lista vazia.");
            return null;
        }
         System.out.println("media");
        x = x/ this.lista.size();
        ArrayList<Double> nova = new ArrayList<>();
        nova.add(x);
        return new Lista(nova);
    }

    public Lista head(){
        if(this.lista.size() == 0 ){
            System.err.println("lista vazia não tem head.");
            return null;
        }
         System.out.println("head");
        double x = this.lista.get(0);
        ArrayList<Double> nova = new ArrayList<>();
        nova.add(x);
        return new Lista(nova);

    }

    public Lista tail(){
        if(this.lista.size() == 0 ){
            System.err.println("lista vazia não tem tail.");
            return null;
        }
        System.out.println("tail");
        ArrayList<Double> nova = new ArrayList<>();
        for (int i = 1;i<this.lista.size();i++)
        {
           nova.add(this.lista.get(i)); 
        }
        
        return new Lista(nova);
    }

    @Override
    public String toString(){
        return this.lista.toString();
    }

}