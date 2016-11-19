class Girl extends Person {
    Girl(String _name, int _age, String _address){
	super(_name, _age, _address);
    }

    void say() {
	System.out.println("Watashi ha " + name + ". Toshi ha "
			 + age + " sai yo. " + address + " ni sunderuno.");
    }
}
