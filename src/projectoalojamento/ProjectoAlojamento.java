/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import property.Property;
import property.PropertyCharacteristics;
import property.PropertyType;
import property.location.County;
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
        Client c1 = new Client("gustavo","pass","G~ustávô vieira","111222",1010,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c2 = new Client("gustavo2","pass","G~uStávô VIeira","111333",1013,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c3 = new Client("gustavo3","pass","Gustavo Vieira3","111444",1014,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c4 = new Client("gustavo4","pass","Gustavo Vieira4","111555",1015,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Owner o1 =  new Owner("Rafa1","tres","Rafael Morais1","111556",1011,962222543,"Rua Das ruas","Portugal",new Date(),false);
        
        Repository repo = new Repository();
        
        repo.addUser(c1);
        repo.addUser(c2);
        repo.addUser(o1);
        repo.addUser(c4);
        repo.addUser(c3);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Client c5 = new Client("gustavo4","pass","Gustavo 123","111555",1015,962222222,"Rua Das ruas","Portugal",new Date(),false);

        Client c6 = new Client();
        c6.setName("Gustavo Vieira");
        List<User> teste = repo.listUsers(c6);
        
        for(User u: teste){
            System.out.println(u.getUsername());
        }
        
        List<User> users=repo.editUsers(Client.class, c5);
        repo.setUsers(users);

//        User u1 = repo.login(Owner.class,"Rahfa1","tres");
//        if(u1 == null){
//            System.out.println("Não existe");
//        }
//        else{
//            System.out.println(u1.getUsername());
//        }
        System.out.println("");
        System.out.println("");
        
        List<User> list = repo.listUserTypes(Client.class);
        
        for(User u: users){
            System.out.println(u.getName());
        }
        
        System.out.println("");
        System.out.println("");
        
        Property p1 = new Property(20, "Caraças1", new PropertyType(), new Owner(), new PropertyCharacteristics(), false);
        Property p2 = new Property(200, "Caraças2", new PropertyType(), new Owner(), new PropertyCharacteristics(), false);
        Property p3 = new Property(20, "Caraças3", new PropertyType(), new Owner(), new PropertyCharacteristics(), false);
        Property p4 = new Property(20, "Caraças4", new PropertyType(), o1, new PropertyCharacteristics(), false);
        
        County co1 = new County("Esposende");
        County co2 = new County("Fão");
        
        Map<Property, County> alojamentos = new HashMap<>();
        repo.addProperty(p1, co1);
        repo.addProperty(p2, co1);
        repo.addProperty(p3, co2);
        repo.addProperty(p4, co1);
        
        Property p5 = new Property();
        p5.setPricePerNight(20);
        p5.setOwner(o1);
        
        alojamentos = repo.listProperties(p5);
        
        for(Map.Entry<Property, County> mp : alojamentos.entrySet())
        {
            System.out.println(mp.getKey().getDescription());
        }
    }
    
}
