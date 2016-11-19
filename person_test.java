
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
        System.out.println("My name is " + name + ". Age is " + age + ". Address is " + address);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person taro = new Person("Taro", 21, "Minato-ku, Tokyo");
        taro.say();
        Person hanako = new Person("Hanako", 18, "Sapporo-shi, Hokkaido");
        hanako.say();
    }
}

