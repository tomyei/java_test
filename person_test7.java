
class Person {
    private String name;
    private int age;
    private String address;

    Person(String _name, int _age, String _address) {
        name = _name;
        age = _age;
        address = _address;
    }
    
    void say(){
        System.out.println("My name is " + name + ". Age is " 
        + age + ". Address is " + address);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Taro", 21, "Minato-ku, Tokyo");
        people[1] = new Person("Hanako", 18, "Sapporo-shi, Hokkaido");
        people[2] = new Person("Ponta", 55, "Okutama-shi, Tokyo");

        for(int i=0; i<people.length; i++){
            people[i].say();
        }
        
        System.out.println("Change data");
        
	people[0].name = "Jiro";
	people[0].age = 15;
        people[0].address = "fukuoka-shi, fukuoka";

	for(int i=0; i<people.length; i++){
	    people[i].say();
	}

    }
}

