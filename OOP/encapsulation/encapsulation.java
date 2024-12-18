package oop.encapsulation;

class Person{
    private int age;

    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println(age); //* or return age;
    }

}



public class encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(21);
        p1.getAge();
    }
}
