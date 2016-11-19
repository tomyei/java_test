
class Person {
    String name;
    int age;
    String address;

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

class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("Taro", 21, "Minato-ku, Tokyo");
        people[1] = new Person("Hanako", 18, "Sapporo-shi, Hokkaido");
        people[0].say();
        people[1].say();

    }
}

