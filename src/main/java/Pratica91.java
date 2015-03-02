/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */

public class Pratica91 {
    public static void main(String[] args) {
        //System.getProperties().list(System.out);
        System.out.println(System.getProperty("os.name"));
        System.out.println(Runtime.getRuntime().availableProcessors() + " processadores");
        System.out.println(Runtime.getRuntime().totalMemory()/1024 + "MB de memória total");
        System.out.println(Runtime.getRuntime().freeMemory()/1024 + "MB de memória livre");
        System.out.println(Runtime.getRuntime().maxMemory()/1024 + "MB de memória da máquina virtual");
    
    }
}    