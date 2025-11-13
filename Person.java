package Task;

public class Person {
    private String name;
    private int age;

    Person(String name,int age){
       this.name=name;
        this.age=age;
    }
    void showDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
 