/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ori, kath, paixtis;
        
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        ArrayList<String> list3 = new ArrayList();
        Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++){
            list1.add(" ");
            list2.add(" ");
            list3.add(" ");
        }
        
        paixtis = 1;
        
        do{
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println("orizontia");
        ori = in.nextInt();
        System.out.println("katheta");
        kath = in.nextInt();
        
        if (paixtis==1){
        if (ori==1){
            if(kath==1){
                list1.set(0,"x");
                paixtis = 2;
            }else if (kath==2){
            list1.set(1,"x");
            paixtis = 2;
        }else if (kath==3){
            list1.set(2,"x");
            paixtis = 2;
        }
        }
        
         if (ori==2){
            if(kath==1){
                list2.set(0,"x");
                paixtis = 2;
            }else if (kath==2){
            list2.set(1,"x");
            paixtis = 2;
        }else if (kath==3){
            list2.set(2,"x");
            paixtis = 2;
        }
        }
         
         if (ori==3){
            if(kath==1){
                list3.set(0,"x");
                paixtis = 2;
            }else if (kath==2){
            list3.set(1,"x");
            paixtis = 2;
        }else if (kath==3){
            list3.set(2,"x");
            paixtis = 2;
        }
        }
        }else if (paixtis==2){
                   if (ori==1){
            if(kath==1){
                list1.set(0,"o");
                paixtis = 1;
            }else if (kath==2){
            list1.set(1,"o");
            paixtis = 1;
        }else if (kath==3){
            list1.set(2,"o");
            paixtis = 1;
        }
        }
        
         if (ori==2){
            if(kath==1){
                list2.set(0,"o");
                paixtis = 1;
            }else if (kath==2){
            list2.set(1,"o");
            paixtis = 1;
        }else if (kath==3){
            list2.set(2,"o");
            paixtis = 1;
        }
        }
         
         if (ori==3){
            if(kath==1){
                list3.set(0,"o");
                paixtis = 1;
            }else if (kath==2){
            list3.set(1,"o");
            paixtis = 1;
        }else if (kath==3){
            list3.set(2,"o");
            paixtis = 1;
        }
        }
        }
         
        }while (ori>0);
    }
    
}
