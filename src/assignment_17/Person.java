package assignment_17;
import assignment_16.User;
public class Person extends User{
    private String name;
    private int age;
    public void setPerson(String name){
        this.name=name;

    }
    public void display(){
        showName();
    }

    public void setPerson(int age){
        this.age=age;
    }
    public void setPerson(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Person1{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void showName(){
        System.out.println("Name; "+name);
    }
    public void showName(String title){
        System.out.println(title+" "+name);
    }
}
