package net.pgtop.test.sub;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String _name, int _age, String _address) {
        name = _name;
        age = _age;
        address = _address;
    }
    
    public void say(){
        System.out.println("My name is " + name + ". Age is " 
        + age + ". Address is " + address);
    }

    public void setName(String _name){
	name = _name;
    }

    public void setAge(int _age){
        if(_age > 0) {
	    age = _age;
	}
	else{
	    age = 0;
	}
    }

    public void setAddress(String _address){
	address = _address;
    }

    public String getName(){
	return name;
    }

    public int getAge(){
	return age;
    }

    public String getAddress(){
	return address;
    }
}