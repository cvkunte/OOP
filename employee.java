import java.lang.reflect.Constructor;

public class employee{
    
    public int id;
    public String name;
    public int position;
    
    employee(){
        System.out.println("Employee is created");
    }
    

    public void setdetails(int eid, String ename){
        this.id = eid;
        this.name = ename;
    }

    public void getDetails(){
        System.out.println(this.id + "---------------- "+this.name);
    }
    
    public void getHike(){
        System.out.println("Employee position = ");
    }

}
