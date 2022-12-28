/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agac;

public class Btree {
    Node root=null;

    
    Node newNode(int data){
        root=new Node(data);
 
        return root;
    }
    
    
    
    Node ekle(Node rot,int data){
        if(rot!=null){
            if(data<rot.data){
                rot.left=ekle(rot.left,data);
    
            }
            else{
                rot.right=ekle(rot.right,data);
            }
        }
        
        else{
          rot=newNode(data);
                
        }
        return rot;
        
    }
    
    
    public void tümünüyazdir(Node rt){
               
    if(rt!=null){
         System.out.print(" "+rt.data);
    tümünüyazdir(rt.left);
     tümünüyazdir(rt.right);
    }
    }
    
    
    Node silme(Node root,int x){
        Node t1,t2;
        
        if(root==null){
            System.out.print("silinecek eleman yoktur");
        }
            if(root.data==x){
                
                if(root.left==root.right){
                    root=null;
                    return root;
                }
                else if(root.left==null){
                    t1=root.right;
                    return t1;
                }
                
                 else if(root.right==null){
                    t2=root.left;
                    return t2;
                }
                 else{
                     t1=t2=root.right;
                     
                     while(t1.left!=null){
                         t1=t1.left;
                     }
                     t1.left=root.left;
                     return t2;
                     
                 }      
            }
        
            
            else{
                
               if(x<root.data){
                   root.left=silme(root.left,x);
                   
               }
               else{
                   root.right=silme(root.right,x);
               }
                
                return root;
                
            }
            
            
        
    }
            

    
    
        

}
    
    
    


