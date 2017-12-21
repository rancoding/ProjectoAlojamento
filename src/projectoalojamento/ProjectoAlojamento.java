/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import user.Administrator;
import user.Client;
import user.Owner;
import user.User;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class ProjectoAlojamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c1 = new Client("gustavo","pass","Gustavo Vieira","111222",1010,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c2 = new Client("gustavo2","pass","Gustavo Vieira2","111333",1013,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c3 = new Client("gustavo3","pass","Gustavo Vieira3","111444",1014,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c4 = new Client("gustavo4","pass","Gustavo Vieira4","111555",1015,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Owner o1 =  new Owner("Rafa1","tres","Rafael Morais1","111556",1011,962222543,"Rua Das ruas","Portugal",new Date(),false);
        
        Repository repo = new Repository();
        
        repo.addUser(c1);
        repo.addUser(c2);
        repo.addUser(o1);
        repo.addUser(c4);
        repo.addUser(c3);
        
        Client c5 = new Client("gustavo4","pass","Gustavo 123","111555",1015,962222222,"Rua Das ruas","Portugal",new Date(),false);

        List<User> users=repo.editUsers(Client.class, c5);
        repo.setUsers(users);

//        User u1 = repo.login(Owner.class,"Rahfa1","tres");
//        if(u1 == null){
//            System.out.println("Não existe");
//        }
//        else{
//            System.out.println(u1.getUsername());
//        }

        
        List<User> list = repo.listTypeUsers(Client.class);
        
        for(User u: users){
            System.out.println(u.getName());
        }
        
        
    }
    
}
