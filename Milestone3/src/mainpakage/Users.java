package mainpakage;


import java.util.ArrayList;

public abstract class Users {

   // private static Object UsersList;
    protected String name,user_type,password;
    protected int id;
    
    public Users(){
        
    }
    public Users(String name, String user_type, String password, int id) {
        this.name = name;
        this.user_type = user_type;
       
        this.password = password;
        this.id = id;
    }
    
    public abstract void addUser();
    
    public static Users login(int id, String pass, String type){ 
        
        ArrayList<Users>uList;
        uList = UsersList.listOfUsers();
        for(Users i:uList){
            if(i.getId()==id && i.getUser_type().equals(type) && i.getPassword().equals(pass)){
                return i;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Users{" + "name=" + name + ", user_type=" + user_type +  ", password=" + password + ", id=" + id + '}';
    }
}
