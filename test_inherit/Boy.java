class Boy extends Person {
    Boy(String _name, int _age, String _address){
	super(_name, _age, _address);
    }

    void say() {
	System.out.println("Boku ha " + name + ". Toshi ha "
			 + age + " sai desu. " + address + " ni sundemasu.");
    }
}