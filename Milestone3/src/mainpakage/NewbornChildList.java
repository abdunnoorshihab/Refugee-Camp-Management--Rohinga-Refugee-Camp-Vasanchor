/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpakage;

/**
 *
 * @author USER
 */
public class NewbornChildList {
    private String Name;
    private String gender;
    private float age;

    @Override
    public String toString() {
        return "NewbornChildList{" + "Name=" + Name + ", gender=" + gender + ", age=" + age + '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
    
}
