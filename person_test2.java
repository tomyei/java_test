
class Person {
    String name;
    int age;
    String address;

    Person(String _name, int _age, String _address) {
        name = _name;
        age = _age;
        address = _address;
    }
    
    String say(){
        String str = "My name is " + name + ". Age is " 
        + age + ". Address is " + address;
        return str;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person taro = new Person("Taro", 21, "Minato-ku, Tokyo");
        System.out.println(taro.say());
        Person hanako = new Person("Hanako", 18, "Sapporo-shi, Hokkaido");
        System.out.println(hanako.say());
    }
}

