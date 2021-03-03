import com.example.Repository.Login;

public class Testing {


    public static void main(String[] args) {

//
//        ClassesDAO add = new ClassesDAOImpl();
////       System.out.println(add.set(new ClassesEntity("javaScript")));
//
//
//        ClassesEntity classesEntity = add.getById(7L);
//        //System.out.println(classesEntity.getClassesname());
//
//
//        classesEntity.setClassesname("javaSript");
//
//        add.update(classesEntity);


//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        //open new session
//        Session session = sessionFactory.openSession();
//        //start the transaction
//        Transaction transaction = session.beginTransaction();
//        //remove object from db with help of hibernate
////        StudentsEntity studentsEntity = session.find(StudentsEntity.class, 8L);

////

//        session.save(new EventsEntity("hello", new java.sql.Date(System.currentTimeMillis()), new java.sql.Date(System.currentTimeMillis()), session.get(EventsTypesEntity.class, 1L), session.get(UsersEntity.class, 1L)));
//// System.out.println(studentsEntity.getUsername());
////        System.out.println(studentsEntity.getPromo());
//        StudentsEntity studentsEntity = new StudentsEntity("userae", "String password", "Stng@mil", "Student", "2020/2021", session.find(ClassesEntity.class, 1L));
//
////
//        StudentDAO add = new StudentDAOImpl();
////        System.out.println(add.set(studentsEntity));
//        System.out.println(add.delete(8L));
//

//        EventsDAO eventsDAO = new EventsDAOImlp();
//        EventsEntity eventsEntity = eventsDAO.getById(8L);
//        eventsEntity.setDisc("hello world");
//        eventsDAO.update(eventsEntity);


        System.out.println(Login.loginUser("abd@abdo", "a").getUsername());
//        System.out.println(Login.loginUser(" abd@abdo", "ad"));
//        System.out.println(eventsDAO.delete(6L));
//
//        transaction.commit();
//        session.close();
    }
}
