package kendaraan;
public class Motorcycle extends Vechile{
    private int helm;
    private String type;
    private int price[] = new int[10000];
    public String jenis(){
        return "Motorcycle";
    }
    public void setHelm(int helm){
        this.helm = helm;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getHelm(){
        return this.helm;
    }
    public String getType(){
        return this.type;
    }
    public void setPrice(int index,int price){
        this.price[index] = price; 
    }
    public int getPrice(int index){
        return this.price[index];
    }
    
}
