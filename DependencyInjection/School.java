

class ClassRoom {
	public void setupRoom() {
		//do something
	}
}






class School {
	private ClassRoom classRoom;

	//School is dependent on class room, this is to be said that the classes
	//are tightly coupled. Changed to ClassRoom.class can protentially breal
	//School.class
	public School(IRoom classRoom) {
		classRoom = new ClassRoom();
	} 

	public doSomethingWithRoom() {
		classRoom.setupRoom();
	}
}



















































//Soution! 

//First add a layer of abstraction!
public Interface IRoom {
	public void setupRoom() {
		//do something
	}
}

class ClassRoom implemts IRoom {
	public void setupRoom() {
		//do something
	}
}

class School {
	private IRoom classRoom;

	public School() {
		classRoom = new ClassRoom();
	}

	public doSomethingWithRoom() {
		classRoom.setupRoom();
	}
}





//Second, remove the creation of ClassRoom from School! No 'new'!!
public Interface IRoom {
	public void setupRoom() {
		//do something
	}
}

class ClassRoom : IRoom {
	public void setupRoom() {
		//do something
	}
}


//Dependency injection
class School {
	private IRoom classRoom;

	public School(IRoom classRoom) { //Constructor injection
		this.classRoom = classRoom;
	}

	public doSomethingWithRoom() {
		classRoom.setupRoom();
	}
}



class School {
	public School() { 
	}

	public doSomethingWithRoom(IRoom classRoom) { //Method injection
		classRoom.setupRoom();
	}
}





