package kendaraan;
public class Vechile {
    private String brand;
    private String name;
    private String license;
    private int topSpeed = 0;
    private int gasCapacity = 0;
    private int wheel = 0;
    public String jenis(){
        return "kendraan";
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLicense(String license){
        this.license = license;
    }
    public void settopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public void setgasCapacity(int gasCapacity){
        this.gasCapacity = gasCapacity;
    }
    public void setwheel(int wheel){
        this.wheel = wheel;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getName(){
        return this.name;
    }
    public String getLicense(){
        return this.license;
    }
    public int gettopSpeed(){
        return this.topSpeed;
    }
    public int getgasCapacity(){
        return this.gasCapacity;
    }
    public int getWheel(){
        return this.wheel;
    }
    
}
