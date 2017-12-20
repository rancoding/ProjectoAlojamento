/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import java.util.Date;
import java.util.List;
import user.Client;
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
        Client c2 = new Client("gustavo2","pass","Gustavo Vieira2","111333",1010,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c3 = new Client("gustavo3","pass","Gustavo Vieira3","111444",1010,962222222,"Rua Das ruas","Portugal",new Date(),false);
        Client c4 = new Client("gustavo4","pass","Gustavo Vieira4","111555",1010,962222222,"Rua Das ruas","Portugal",new Date(),false);
        
        Repository repo = new Repository();
    }
    
}
