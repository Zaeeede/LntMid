import java.util.Scanner;

import kendaraan.*;
public class App {

    public static void main(String[] args) throws Exception {
        Vechile[] arr = new Vechile[500000];
        Scanner scan = new Scanner(System.in);
        int index = 0;
        while(true){

            System.out.println("1.Input data\n2.View data");
            System.out.print("Choose your option: ");
            int a = scan.nextInt();
            scan.nextLine();
            if(a == 1){
                System.out.println("1.car\n2.motorcycle");
                System.out.print("Choose your vehicle: ");
                int b = scan.nextInt();
                scan.nextLine();
                if(b == 1){
                    Car data = new Car();
                    System.out.print("input brand(>=5): ");
                    String brand1 = scan.nextLine();
                    if(brand1.length() < 5) continue;
                    data.setBrand(brand1);
                        System.out.print("input name(>=5): ");
                        String name1 = scan.nextLine();
                        if(name1.length() < 5) continue;
                        data.setName(name1);
                            System.out.print("input license: ");
                            String license1 = scan.nextLine();
                            if(!(license1.substring(0,1).equals(license1.substring(0,1).toUpperCase()))) continue;
                            data.setLicense(license1);
                    System.out.print("input top speed(100 >= topspeed <= 250): ");
                    int topspeed1 = scan.nextInt();
                    scan.nextLine();
                    if(topspeed1 < 100 || topspeed1 > 250) continue;
                    data.settopSpeed(topspeed1);
                        System.out.print("input gas capacity(30 >= gascap <=60): ");
                        int gascap1 = scan.nextInt();
                        scan.nextLine();
                        if(gascap1 < 30 || gascap1 > 60) continue;
                        data.setgasCapacity(gascap1);
                    System.out.print("input wheel(4 >= wheel <= 6): ");
                    int wheel1 = scan.nextInt();
                    scan.nextLine();
                    if(wheel1 < 4 || wheel1 > 6)continue;
                    data.setwheel(wheel1);
                        System.out.print("input type(SUV | SUPERCAR | MINIVAN): ");
                        String type1 = scan.nextLine();
                        if(!(type1.equals("SUV") || type1.equals("SUPERCAR") || type1.equals("MINIVAN"))) continue;
                        data.settype(type1);
                    System.out.print("input entertaiment system amount(>=1): ");
                    int enter1 = scan.nextInt();
                    scan.nextLine();
                    if(enter1 < 1)continue;
                    data.setentertaimentSystemAmount(enter1);
                    arr[index] = data;
                    index++;
                }
                else if(b==2){
                    Motorcycle data1 = new Motorcycle();
                    System.out.print("input brand(>=5): ");
                    String brand2 = scan.nextLine();
                    if(brand2.length() < 5) continue;
                    data1.setBrand(brand2);
                        System.out.print("input name(>=5): ");
                        String name2 = scan.nextLine();
                        if(name2.length() < 5) continue;
                        data1.setName(name2);
                            System.out.print("input license: ");
                            String license2 = scan.nextLine();
                            if(!(license2.substring(0,1).equals(license2.substring(0,1).toUpperCase()))  ) continue;
                            data1.setLicense(license2);
                    System.out.print("input top speed(100 >= topspeed <= 250): ");
                    int topspeed2 = scan.nextInt();
                    scan.nextLine();
                    if(topspeed2 < 100 || topspeed2 > 250) continue;
                    data1.settopSpeed(topspeed2);
                        System.out.print("input gas capacity(30 >= gascap <=60): ");
                        int gascap2 = scan.nextInt();
                        scan.nextLine();
                        if(gascap2 < 30 || gascap2 > 60) continue;
                        data1.setgasCapacity(gascap2);
                    System.out.print("input wheel(2 >= wheel <= 3): ");
                    int wheel2 = scan.nextInt();
                    scan.nextLine();
                    if(wheel2 < 2 || wheel2 > 3)continue;
                    data1.setwheel(wheel2);
                        System.out.print("input type(AUTOMATIC | MANUAL): ");
                        String type2 = scan.nextLine();
                        if(!(type2.equals("AUTOMATIC") || type2.equals("MANUAL") || type2.equals("MINIVAN"))) continue;
                        data1.setType(type2);
                    System.out.print("input Helm(>=1): ");
                    int enter2 = scan.nextInt();
                    scan.nextLine();
                    if(enter2 < 1)continue;
                    data1.setHelm(enter2);
                        System.out.print("Price: ");
                        int harga = scan.nextInt();
                        scan.nextLine();
                        data1.setPrice(0,harga);
                    
                    arr[index] = data1;
                    index++;
                }
            }
            else if(a == 2){
                
                
               System.out.println("|-----|---------------|---------------|");
               System.out.println("|No   |Type           |Name           |");
               int j =0;
               for(j=0;j<arr.length;j++){
                    System.out.println("|-----|---------------|---------------|");
                    if(arr[j] == null) break;
                    System.out.printf("|%-5s|%-15s|%-15s|\n", j+1, arr[j].jenis(), arr[j].getName());
               }
               System.out.println("|-----|---------------|---------------|");

                   System.out.print("input your choice: ");
                   int no = scan.nextInt();
                   scan.nextLine();

                if(arr[no-1].jenis().equals("Car")){
                    Car selectCar = (Car) arr[no-1];
                    System.out.printf("Brand: %s",selectCar.getBrand());
                    System.out.printf("\nName: %s",selectCar.getName());
                    System.out.printf("\nLicense plat: %s",selectCar.getLicense());
                    System.out.printf("\nType: %s",selectCar.gettype());
                    System.out.printf("\nGas capacity: %d",selectCar.getgasCapacity());
                    System.out.printf("\nTop speed: %d",selectCar.gettopSpeed());
                    System.out.printf("\nWheel(s): %d",selectCar.getWheel());
                    System.out.printf("\nEntertaiment system: %d\n",selectCar.getentertaimentSystemAmount()); 
                    System.out.println("Turning on entertaiment system..."); 
                    if(selectCar.gettype().equals("SUPERCAR")) System.out.println("Boosting!");
                    break;
                } else if(arr[no-1].jenis().equals("Motorcycle")){
                    Motorcycle selectMotorcycle = (Motorcycle) arr[no-1];
                    System.out.printf("Brand: %s",selectMotorcycle.getBrand());
                    System.out.printf("\nName: %s",selectMotorcycle.getName());
                    System.out.printf("\nLicense plat: %s",selectMotorcycle.getLicense());
                    System.out.printf("\nType: %s",selectMotorcycle.getType());
                    System.out.printf("\nGas capacity: %d",selectMotorcycle.getgasCapacity());
                    System.out.printf("\nTop speed: %d",selectMotorcycle.gettopSpeed());
                    System.out.printf("\nWheel(s): %d",selectMotorcycle.getWheel());
                    System.out.printf("\nJumlah helm: %d\n",selectMotorcycle.getHelm());
                    System.out.printf("%s is standing\n",selectMotorcycle.getName());
                    
                    System.out.printf("Price: %d\n",selectMotorcycle.getPrice(0));
                    
                    break;
                    
                    
                
                }
                   
            }
            else break;
        }
        
        
    }

}
    