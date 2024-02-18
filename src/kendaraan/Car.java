package kendaraan;

public class Car extends Vechile{
    private String type;
    private int entertaimentSystemAmount = 0;
    public String jenis(){
        return "Car";
    }
    public void settype(String type){
        this.type = type;
    }
    public void setentertaimentSystemAmount(int entertaimentSystemAmount){
        this.entertaimentSystemAmount = entertaimentSystemAmount;
    }
    public String gettype(){
        return this.type;
    }
    public int getentertaimentSystemAmount(){
        return this.entertaimentSystemAmount;
    }
    
}
