public class manager extends employee{

    manager(){
        System.out.println("Manager is created");
    }

    public void setdetails(int eid, String ename){
        this.id = eid;
        this.name = ename;
    }

    public void getDetails(){
        System.out.println(this.id + this.name);
    }
}