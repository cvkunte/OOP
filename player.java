import java.util.*;


public class player{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hello world");

            manager e = new manager();
            int eid;
            String ename;
            System.out.println("Enter eid : ");
            eid =  sc.nextInt();  
            System.out.println("Enter ename : ");
            ename =  sc.next();

            e.setdetails(eid,ename);
            e.getDetails();

        }catch (Exception e) {
            System.out.println("I am error "+ e);
        }
    }
}
