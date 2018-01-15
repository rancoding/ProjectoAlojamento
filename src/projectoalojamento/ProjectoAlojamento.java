/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import property.BedType;
import property.Discount;
import property.Photo;
import property.Property;
import property.PropertyCharacteristics;
import property.PropertyType;
import property.Rating;
import property.Room;
import property.booking.Booking;
import property.booking.PaymentType;
import property.location.County;
import property.location.District;
import property.location.Location;
import user.Administrator;
import user.Client;
import user.Owner;
import user.User;
import user.contact.Category;
import user.contact.Division;
import user.contact.Message;
import user.contact.Status;
import user.contact.Ticket;
import user.contact.TicketType;

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
        
        // Adicionar 20 propriedades xxxxxxxxxxx
        // Adicionar 20 fotos xxxxxxxxxxxxxxx
        // Adicionar 25 quartos xxxxxxxxxxxxx
        // Adicionar 10 clientes xxxxxxxxxxxxx
        // Adicionar 6 donos xxxxxxxxxxxxxxxxx
        // Adicionar 3 admins xxxxxxxxxxxxxxx
        // Adicionar 50 reservas xxxxxxxxxxxx
        // Adicionar 2 tipos de pagamento xxxxxx
        // Adicionar 20 avaliações xxxxxxxxxxx
        // Adicionar 3 tipos de cama xxxxxxxxxxxx
        // Adicionar 10 descontos xxxxxxxxxxxxx
        // Adicionar 2 tipos de alojamento xxxxxx
        // Adicionar 3 divisões xxxxxxxxxxxxxx
        // Adicionar 3 tipos de ticket xxxxxxxx
        // Adicionar 3 status xxxxxxxxxxxxxxx
        // Adicionar 5 tickets xxxxxxxxxx
        // Adicionar 10 mensagens xxxxxxxxxxx
        // Adicionar 5 categorias xxxxxxxxxxxxxx
        // Adicionar 20 características
        // Adicionar as localidades
        
/*        Client c1 = new Client("gustavo","gustavo123","Gustavo Vieira", "111111111",123456789,962111111,"Rua Dr. Ramiro Barros Lima", "Esposende", new Date(), false);
        Client c2 = new Client("rafael","rafael123","Rafa Morais", "222222222",987654321,963222222,"Rua de Outeiro", "Outeiro", new Date(), false);
        Client c3 = new Client("andre","andre123","André Nogueira", "333333333",321654987,964333333,"Rua da Matemática", "Arcos de Valdevez", new Date(), false);
        Client c4 = new Client("joao","joao123","João Cortez", "444444444",123654789,965444444,"Rua perto do IPVC", "Viana de Castelo", new Date(), false);
        Client c5 = new Client("rui","rui123","Rui Rocha", "555555555",321456987,966555555,"Rua de Viana, 1º Andar", "Viana de Castelo", new Date(), false);
        Client c6 = new Client("pedro","pedro123","Pedro Ribeiro", "666666666",321456789,967666666,"Rua da Belga", "Brafa", new Date(), true);
        Client c7 = new Client("m1k4","m1k4123","Miguel Sousa", "777777777",123456987,968777777,"Rua dos Vampiros", "Fão", new Date(), true);
        Client c8 = new Client("denis","denis123","Dinis Silva", "888888888",123123123,969888888,"Rua dos Indecisos", "Esposende", new Date(), false);
        Client c9 = new Client("helder","helder123","Helder Freitas", "999999999",456456456,960000000,"Rua dos Faz-Portas", "Palmeira", new Date(), true);
        Client c10 = new Client("figo","figo123","Miguel Lima", "000000000",789789789,961000000,"Rua dos Trabalhadores", "Marinhas", new Date(), true);
        
        Owner o1 = new Owner("nuno", "nuno23", "Nuno Fernandes", "987987987", 999888777, 999234534, "Rua dos Vendedores", "Porto", new Date(), false);
        Owner o2 = new Owner("gustavo","gustavo123","Gustavo Vieira", "111111111",123456789,962111111,"Rua Dr. Ramiro Barros Lima", "Esposende", new Date(), false);
        Owner o3 = new Owner("m1k4","m1k4123","Miguel Sousa", "777777777",123456987,968777777,"Rua dos Vampiros", "Fão", new Date(), false);
        Owner o4 = new Owner("antonio", "antonio123", "António Barros", "158158158", 102102102, 952158158, "Rua das Antonionetas", "Lisboa", new Date(), true);
        Owner o5 = new Owner("miguel", "miguel123", "Miguel Ângelo", "645645645", 434434434, 912912912, "Rua dos Vendedores", "Lisboa", new Date(), false);
        Owner o6 = new Owner("ana", "ana123", "Ana Antonieta", "283283283", 929929929, 910910910, "Rua dos Vendedores", "Porto", new Date(), true);
        
        Administrator a1 = new Administrator("admin1", "admin123", "Administrador Principal", "999999999", 989898989, 962045932, "Rua dos Administradores", "Porto", new Date(), true);
        Administrator a2 = new Administrator("admin2", "admin123", "Administrador 2", "888888888", 767676767, 963243954, "Rua dos Administradores secundários", "Viana de Castelo", new Date(), false);
        Administrator a3 = new Administrator("admin2", "admin123", "Administrador 3", "777777777", 545454545, 965023493, "Rua dos Administradores secundários", "Viana de Castelo", new Date(), false);
        */
        PropertyType pt1 = new PropertyType("Quarto", "Um quarto com camas e mobília necessária");
        PropertyType pt2 = new PropertyType("Apartamento", "Uma casa com possíveis quartos e mobília necessária");
        
        PaymentType pay1 = new PaymentType("Cartão", "Pagamento a cartão");
        PaymentType pay2 = new PaymentType("Dinheiro", "Pagamento a dinheiro");
        
        BedType bt1 = new BedType("Indivídual", "Uma cama para uma pessoa");
        BedType bt2 = new BedType("Casal", "Uma cama para um casal e até um filho com idade menor a 5 anos");
        
        Division d1 = new Division("Departamento de Reservas", "Departamento de administração que trata de problemas de reservas");
        Division d2 = new Division("Departamento de Alojamentos", "Departamento de administração que trata de problemas de alojamentos");
        Division d3 = new Division("Departamento Geral", "Departamento de administração que trata de qualquer problema");
        
        Category ca1 = new Category("Reservas", "Tickets sobre as reservas");
        Category ca2 = new Category("Alojamentos", "Tickets sobre os alojamentos");
        Category ca3 = new Category("Login", "Tickets sobre os logins");
        Category ca4 = new Category("Registo", "Tickets sobre os registos");
        
        TicketType tt1 = new TicketType("Problema a adicionar reservas", "Problemas em adicionar reservas", ca1);
        TicketType tt2 = new TicketType("Problema a pagar reservas", "Problemas em adicionar reservas", ca1);
        
        Status s1 = new Status("Pendente", "Ticket enviado pelo utilizador mas ainda sem resposta do administrador");
        Status s2 = new Status("Respondido", "Ticket respondido por um administrador");
        Status s3 = new Status("Completo", "Ticket completo");
        
        //Ticket t1 = new Ticket(tt1, "Não consigo adicionar a minha reserva", "Tenho a reserva e meto os meus dados e não consigo adicioná-la!", false, s1, c1);
        //Ticket t2 = new Ticket(tt1, "Não adiciona a reserva!", "Não importa o quanto tento eu não consigo adicionar!", false, s2, c1);
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();
        Ticket t5 = new Ticket();
        
        Message m1 = new Message();
        Message m2 = new Message();
        Message m3 = new Message();
        Message m4 = new Message();
        Message m5 = new Message();
        Message m6 = new Message();
        Message m7 = new Message();
        Message m8 = new Message();
        Message m9 = new Message();
        Message m10 = new Message();
        
        Property p1 = new Property();
        Property p2 = new Property();
        Property p3 = new Property();
        Property p4 = new Property();
        Property p5 = new Property();
        Property p6 = new Property();
        Property p7 = new Property();
        Property p8 = new Property();
        Property p9 = new Property();
        Property p10 = new Property();
        Property p11 = new Property();
        Property p12 = new Property();
        Property p13 = new Property();
        Property p14 = new Property();
        Property p15 = new Property();
        Property p16 = new Property();
        Property p17 = new Property();
        Property p18 = new Property();
        Property p19 = new Property();
        Property p20 = new Property();
        
        PropertyCharacteristics pc1 = new PropertyCharacteristics();
        PropertyCharacteristics pc2 = new PropertyCharacteristics();
        PropertyCharacteristics pc3 = new PropertyCharacteristics();
        PropertyCharacteristics pc4 = new PropertyCharacteristics();
        PropertyCharacteristics pc5 = new PropertyCharacteristics();
        PropertyCharacteristics pc6 = new PropertyCharacteristics();
        PropertyCharacteristics pc7 = new PropertyCharacteristics();
        PropertyCharacteristics pc8 = new PropertyCharacteristics();
        PropertyCharacteristics pc9 = new PropertyCharacteristics();
        PropertyCharacteristics pc10 = new PropertyCharacteristics();
        PropertyCharacteristics pc11 = new PropertyCharacteristics();
        PropertyCharacteristics pc12 = new PropertyCharacteristics();
        PropertyCharacteristics pc13 = new PropertyCharacteristics();
        PropertyCharacteristics pc14 = new PropertyCharacteristics();
        PropertyCharacteristics pc15 = new PropertyCharacteristics();
        PropertyCharacteristics pc16 = new PropertyCharacteristics();
        PropertyCharacteristics pc17 = new PropertyCharacteristics();
        PropertyCharacteristics pc18 = new PropertyCharacteristics();
        PropertyCharacteristics pc19 = new PropertyCharacteristics();
        PropertyCharacteristics pc20 = new PropertyCharacteristics();
        
        Photo pho1 = new Photo("foto1","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho2 = new Photo("foto2","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho3 = new Photo("foto3","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho4 = new Photo("foto4","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho5 = new Photo("foto5","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho6 = new Photo("foto6","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho7 = new Photo("foto7","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho8 = new Photo("foto8","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho9 = new Photo("foto9","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho10 = new Photo("foto11","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho11 = new Photo("foto12","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho12 = new Photo("foto13","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho13 = new Photo("foto14","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho14 = new Photo("foto15","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho15 = new Photo("foto16","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho16 = new Photo("foto17","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho17 = new Photo("foto18","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho18 = new Photo("foto19","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho19 = new Photo("foto20","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        Photo pho20 = new Photo("foto21","C:\\Users\\Gustavo Vieira\\Documents\\NetBeansProjects\\ProjectoAlojamento",".png");
        
        Room r1 = new Room();
        Room r2 = new Room();
        Room r3 = new Room();
        Room r4 = new Room();
        Room r5 = new Room();
        Room r6 = new Room();
        Room r7 = new Room();
        Room r8 = new Room();
        Room r9 = new Room();
        Room r10 = new Room();
        Room r11 = new Room();
        Room r12 = new Room();
        Room r13 = new Room();
        Room r14 = new Room();
        Room r15 = new Room();
        Room r16 = new Room();
        Room r17 = new Room();
        Room r18 = new Room();
        Room r19 = new Room();
        Room r20 = new Room();
        Room r21 = new Room();
        Room r22 = new Room();
        Room r23 = new Room();
        Room r24 = new Room();
        Room r25 = new Room();
        
        Booking b1 = new Booking();
        Booking b2 = new Booking();
        Booking b3 = new Booking();
        Booking b4 = new Booking();
        Booking b5 = new Booking();
        Booking b6 = new Booking();
        Booking b7 = new Booking();
        Booking b8 = new Booking();
        Booking b9 = new Booking();
        Booking b10 = new Booking();
        Booking b11 = new Booking();
        Booking b12 = new Booking();
        Booking b13 = new Booking();
        Booking b14 = new Booking();
        Booking b15 = new Booking();
        Booking b16 = new Booking();
        Booking b17 = new Booking();
        Booking b18 = new Booking();
        Booking b19 = new Booking();
        Booking b20 = new Booking();
        Booking b21 = new Booking();
        Booking b22 = new Booking();
        Booking b23 = new Booking();
        Booking b24 = new Booking();
        Booking b25 = new Booking();
        Booking b26 = new Booking();
        Booking b27 = new Booking();
        Booking b28 = new Booking();
        Booking b29 = new Booking();
        Booking b30 = new Booking();
        Booking b31 = new Booking();
        Booking b32 = new Booking();
        Booking b33 = new Booking();
        Booking b34 = new Booking();
        Booking b35 = new Booking();
        Booking b36 = new Booking();
        Booking b37 = new Booking();
        Booking b38 = new Booking();
        Booking b39 = new Booking();
        Booking b40 = new Booking();
        Booking b41 = new Booking();
        Booking b42 = new Booking();
        Booking b43 = new Booking();
        Booking b44 = new Booking();
        Booking b45 = new Booking();
        Booking b46 = new Booking();
        Booking b47 = new Booking();
        Booking b48 = new Booking();
        Booking b49 = new Booking();
        Booking b50 = new Booking();
        
        Rating ra1 = new Rating();
        Rating ra2 = new Rating();
        Rating ra3 = new Rating();
        Rating ra4 = new Rating();
        Rating ra5 = new Rating();
        Rating ra6 = new Rating();
        Rating ra7 = new Rating();
        Rating ra8 = new Rating();
        Rating ra9 = new Rating();
        Rating ra10 = new Rating();
        Rating ra11 = new Rating();
        Rating ra12 = new Rating();
        Rating ra13 = new Rating();
        Rating ra14 = new Rating();
        Rating ra15 = new Rating();
        Rating ra16 = new Rating();
        Rating ra17 = new Rating();
        Rating ra18 = new Rating();
        Rating ra19 = new Rating();
        Rating ra20 = new Rating();
        
        
        /*Discount dis1 = new Discount();
        Discount dis2 = new Discount();
        Discount dis3 = new Discount();
        Discount dis4 = new Discount();
        Discount dis5 = new Discount();
        Discount dis6 = new Discount();
        Discount dis7 = new Discount();
        Discount dis8 = new Discount();
        Discount dis9 = new Discount();
        Discount dis10 = new Discount();
        */
        
        List<Message> messages = new ArrayList<>();
        List<Photo> photos = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        List<Booking> bookings = new ArrayList<>();
        List<Rating> ratings = new ArrayList<>();
        //List<Discount> discounts = new ArrayList<>();
        /*
        messages.add(m1);
        messages.add(m2);
        messages.add(m3);
        messages.add(m4);
        messages.add(m5);
        messages.add(m6);
        messages.add(m7);
        messages.add(m8);
        messages.add(m9);
        
        photos.add(pho1);
        photos.add(pho2);
        photos.add(pho3);
        photos.add(pho4);
        photos.add(pho5);
        photos.add(pho6);
        photos.add(pho7);
        photos.add(pho8);
        photos.add(pho9);
        
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);
        rooms.add(r6);
        rooms.add(r7);
        rooms.add(r8);
        rooms.add(r9);
        
        bookings.add(b1);
        bookings.add(b2);
        bookings.add(b3);
        bookings.add(b4);
        bookings.add(b5);
        bookings.add(b6);
        bookings.add(b7);
        bookings.add(b8);
        bookings.add(b9);
        
        ratings.add(ra1);
        ratings.add(ra2);
        ratings.add(ra3);
        ratings.add(ra4);
        ratings.add(ra5);
        ratings.add(ra6);
        ratings.add(ra7);
        ratings.add(ra8);
        ratings.add(ra9);
        
       /* discounts.add(dis1);
        discounts.add(dis2);
        discounts.add(dis3);
        discounts.add(dis4);
        discounts.add(dis5);
        discounts.add(dis6);
        discounts.add(dis7);
        discounts.add(dis8);
        discounts.add(dis9)
        ;
        */
        /*
        Repository repo = new Repository();
        /*
        repo.addUser(c1);
        repo.addUser(c2);
        repo.addUser(c3);
        repo.addUser(c4);
        
        repo.addUser(c7);
        repo.addUser(c8);
        repo.addUser(c9);
        repo.addUser(c10);
        
        repo.addUser(o1);
        repo.addUser(o2);
        
        repo.addUser(o5);
        repo.addUser(o6);
        
        repo.addUser(a1);
        repo.addUser(a2);
        repo.addUser(a3);
        
        repo.addPropertyType(pt1);
        repo.addPropertyType(pt2);
        
        repo.addPaymentType(pay1);
        repo.addPaymentType(pay2);
        
        repo.addBedType(bt1);
        repo.addBedType(bt2);
        
        repo.addDivision(d1);
        repo.addDivision(d2);
        repo.addDivision(d3);
        
        repo.addTicketType(tt1);
        repo.addTicketType(tt2);
        //repo.addTicketType(tt3);
        
        repo.addStatus(s1);
        repo.addStatus(s2);
        repo.addStatus(s3);
        
        repo.addCategory(ca1);
        repo.addCategory(ca2);
        repo.addCategory(ca3);
        repo.addCategory(ca4);
       // repo.addCategory(ca5);
        
        // Não deveria ser aqui mas sim no user talvez, mas pronto
        //repo.addTicket(t1);
        //repo.addTicket(t2);
        repo.addTicket(t3);
        repo.addTicket(t4);
        repo.addTicket(t5);
        
        //c1.setMessages(messages);
        
        repo.addProperty(p1, null);
        repo.addProperty(p2, null);
        repo.addProperty(p3, null);
        repo.addProperty(p4, null);
        repo.addProperty(p5, null);
        repo.addProperty(p6, null);
        repo.addProperty(p7, null);
        repo.addProperty(p8, null);
        repo.addProperty(p9, null);
        repo.addProperty(p10, null);
        repo.addProperty(p11, null);
        repo.addProperty(p12, null);
        repo.addProperty(p13, null);
        repo.addProperty(p14, null);
        repo.addProperty(p15, null);
        repo.addProperty(p16, null);
        repo.addProperty(p17, null);
        repo.addProperty(p18, null);
        repo.addProperty(p19, null);
        repo.addProperty(p20, null);
        
        p1.setCharacteristics(pc1);
        
        p1.setPhotos(photos);
        
        pc1.setRooms(rooms);
        
        p1.setBookings(bookings);
        
        p1.setRatings(ratings);
        
        
        */
        //p1.setDiscounts(discounts);
        
        /*
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
                */
    }
    
}
