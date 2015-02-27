public class ShapeEditor {

	public void draw(Shape s) {
		if (s.type == 1 ) { 
			drawRectangle(); 
		} else if (s.type == 2) {
			 drawRectangle();
		}
	}

	public void drawRectangle() { 
		//code goes here
	}

	public void drawCircle() {
		//code goes here}
	}
}




public class Shape { 
	int type; 
}

public class Rectangle extends Shape { 
	public Rectangel() {
		super.type = 1;
	}
}


public class Circle extends Shape { 
	public Circle() {
		super.type = 2;
	}
}




//With this code you will have to understand what ShapeEditor.class does (it's simple here but imagine if it was more complex code)
//You will have to modify the ShapeEditor.class
//You will have to unit test both the ShapeEditor and new Shape class you are making.

public class ShapeEditor {

	public void draw(Shape s) {
		s.draw();
	}

	public void draw() {
		//Code goes here
	}
}

public class Shape { 
	abstract void draw();

public class Rectangle extends Shape { 
	public void draw() {
	}
}


public class Circle extends Shape { 
	public void draw() {
	}
}

//ShapeEditor.class does not have to be touched. It can be extended without the ShapeEditor being modified.
//The only unit test you will have to test is the shapes you choose to add.
//You do not have to look at ShapeEditor!

