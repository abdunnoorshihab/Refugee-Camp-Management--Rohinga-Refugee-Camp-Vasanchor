
package mainpakage;

import java.util.ArrayList;


public abstract class Ngo_Officer extends Users {

    static ArrayList<NewbornChildList> viewEmployeeList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object pass;
    public Ngo_Officer(String name, String user_type, String password, int id) {
        super(name, user_type, password, id);
    
}

    Ngo_Officer(int parseInt, String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Ngo_Officer{" + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void TypesOfLoan(String Name, int ID, String Type ){
        System.out.println("Name"+ name+"ID"+ ID+"Types is :"+ Type);
    }
    
     public static ArrayList<Users> viewEmmployeeList(){
        ArrayList<Users>u = UsersList.listOfUser();
        ArrayList<Users>r = new ArrayList<Users>();
        for(Users i: u){
            if(!(i instanceof Ngo_Officer)){
                r.add(i);
            }
        }
        return r;
    }

    @Override
    public Users addUser() {
      public  Users login(int id, String pass, String type){ 
        
        ArrayList<Users>uList;
        uList = UsersList.listOfUsers();
        for(Users i:uList){
            if(i.getId()==id && i.getUser_type().equals(type) && i.getPassword().equals(pass)){
                return i;
            }
        }
        return null;
    }   
     
             
             
             
        
        throw new UnsupportedOperationException("Not supported yet.");
       
    }

    void submitIncentive(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

