/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralheatingsystem;

/**
 *
 * @author iuqe1
 */
public class sensor extends Thread {
        int temperature;
    heating heating = new heating();
    public sensor(){
        System.out.println("Thread heat sensor is created " + System.currentTimeMillis());
    }
    
    public void run(){
        for(int i = 1; i <= 50; i++){
            temperature = (int)(Math.random()*100);
            
            if (temperature < 25){
                System.out.println("Below 25 C... Turn heating on");
            }
            
            if (temperature == 25){
                System.out.println("25C... Maintain");
            }
            if (temperature > 25){
                System.out.println("Above 25C... Turn heating off");
            }
            heating.heat(temperature);
        }
    }
}
