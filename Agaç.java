/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agac;

import java.util.Scanner;

/**
 *
 * @author MERVAN
 */
public class Agaç {

    public static void main(String[] args) {
        
        Btree bt=new Btree();
          
        Scanner input = new Scanner(System.in);
  
    int top=0;
      
    while(top!=-1){
        int a;
        System.out.println("1.ekle");
        System.out.println("2.yazdir");
        System.out.println("3.sil");
        System.out.println("4.cikis");

        System.out.println("secim yapiniz");
        a = input.nextInt();
        switch(a){
    
        case 1:
        int x;
        System.out.println("agaca eklemek istediginiz sayiyi giriniz");
        x = input.nextInt();
        bt.root=bt.ekle(bt.root,x);
        break;
        
        case 2:
        System.out.println("agacin elemanlari");
        bt.tümünüyazdir(bt.root);
        break;
    
        case  3:
        int d;
        System.out.println("agactan silmek istediginiz sayiyi giriniz");
        d = input.nextInt();
        bt.root=bt.silme(bt.root, d);
        break;
          
        case 4:
        top=-1;
        
}

System.out.println(" ");

System.out.println("cikmak istiyorsaniz -1e basin");
    top = input.nextInt();


}
        
        
    }

    
}
