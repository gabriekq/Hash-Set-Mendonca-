/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author Gabriel
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Set<Client> clients = new HashSet<Client>();
       
        
        clients.add(new Client("Gabriel",24,"rua a"));
        clients.add(new Client("Joao",24,"rua a"));
        clients.add(new Client("Marcio",24,"rua a"));
        clients.add(new Client("mario",24,"rua a"));
        clients.add(new Client("Viado",24,"rua a"));
        
        System.out.println(clients.size());
        
        for(Client Obj : clients){
        System.out.println(Obj);
        }
        
        HashSet<Client> colection = new HashSet<Client>();
        
        colection.add( new Client("objA",25,"rua a" ));
        colection.add( new Client("objB",23,"rua b" ));
        colection.add( new Client("objC",22,"rua c" ));
        colection.add( new Client("objD",23,"rua d" ));
        colection.add( new Client("objE",24,"rua e" ));
           
            Iterator<Client> iterator = colection.iterator();
            
            while(iterator.hasNext()){
              Client ObjClient = (Client)iterator.next();
               System.out.println(ObjClient);
                
             }
            
          
        
        }
        
    }
    

