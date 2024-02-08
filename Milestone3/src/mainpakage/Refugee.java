package mainpakage;



public class Refugee {
    String name;
    int id;
    String gender;
    int age;

    public Refugee(String text, int parseInt, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public String toString() {
        return "Refugee{" + "name=" + name + ", id=" + id + ", gender=" + gender + ", age=" + age + '}';
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
 
    }

 
}

