package assignment_16;

public class User {
    String fullname;
    int age;
    protected void SetName(String n){
        fullname=n;
    }
    protected void showName(){
        System.out.println(fullname);
    }

}
class Learner extends User{

}
class Admin extends User{

}
