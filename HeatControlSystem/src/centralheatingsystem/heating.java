/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralheatingsystem;

/**
 *
 * @author iuqe1
 */
public class heating extends Thread {
    public heating(){
        System.out.println(" Heading Object is created");
    }
    
        public void heat (int temperature){
        if (temperature <= 25){
                open();
            }
        if (temperature == 25){
                maintain();
            }
        if (temperature > 25){
                close();
            }
    }
    
    public void open(){
        System.out.println(" Open Heating");
    }
    public void maintain(){
        System.out.println(" Maintain Heating ");
    }
    public void close(){
        System.out.println(" Close Heating");
    }
}
