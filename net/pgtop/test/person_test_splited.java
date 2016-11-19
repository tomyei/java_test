package net.pgtop.test;
import net.pgtop.test.sub.*;

public class person_test_splited {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Taro", 21, "Minato-ku, Tokyo");
        people[1] = new Person("Hanako", 18, "Sapporo-shi, Hokkaido");
        people[2] = new Person("Ponta", 55, "Okutama-shi, Tokyo");

	System.out.println("-------Show by say() method.");

        for(int i=0; i<people.length; i++){
            people[i].say();
        }
        
	people[0].setName("Jiro");
	people[0].setAge(-15);
        people[0].setAddress("fukuoka-shi, fukuoka");

	System.out.println();
	System.out.println("---Show comment after downloading by getter method!");

	for(int i=0; i<people.length; i++){
	    System.out.println(people[i].getName() + " "
			       + people[i].getAge() + " " + people[i].getAddress());

	}

    }
}

