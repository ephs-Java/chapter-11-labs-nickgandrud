package point;

public class Point {

	// instance variables: This is where you create the variable of the class
	private int x;
	private int y;
	

	// construct the object here.
	
	public Point(){  //This CONTSTRUCTOR does not take any arguments
		this.x = 0;
		this.y = 0;
		
	}
	public Point(int a, int b){  // Makes x == a and y ==b
		this.x = a;   
		this.y = b;
		
	}
	
	

	// Returns which quadrant of the x/y plane this Point
	// object falls in. Quadrant 1 contains all points
	// whose x and y values are both positive. Quadrant
	// 2 contains all points with negative x but positive y.
	// Quadrant 3 contains all points with negative x and y values.
	// Quadrant 4 contains all points with positive x but negative y.
	// If the point lies directly on the x and/or y axis, return 0.
	// bob.quadrant(); --> 2
	public int quadrant(){
		if(this.x > 0 && this.y > 0){
			return 1;
		}
		if(this.x > 0 && this.y < 0){
			return 4;
		}
		if(this.x < 0 && this.y < 0){
			return 3;
		}
		if(this.x < 0 && this.y > 0) { 
			return 2;
		}
		else{ 
			return 0;
		}
		
	}

	// Negates and swaps the x/y coordinates of the Point object.
	// For example, if an object pt initially represents the
	// point (5, -3), after a call of pt.flip(); , the object
	// should represent (3, -5). If the same object initially
	// represents the point (4, 17), after a call to pt.flip();,
	// the object should represent (-17, -4).
		public void flip(){
			int tempX = this.x;
			this.x = - this.y;
			this.y = tempX;
		}

	// Modify the toString method in the Point class.
	// Make it return a string in the following format.
	// For example, if a Point object stored in a
	// variable pt represents the point (5, -17),
	// return the string:
	// x.toString() x
	// Point(x=5,y=-17)
	// If the client code were to call System.out.println(pt); ,
	// that text would be shown on the console.
		public String toString(){
			return "Point (x="+this.x+","+"y="+this.y;
		}
		
	// finally add a midpoint method
		
		public Point midpoint(Point other){
			int thex = (this.x +other.x)/2;
			int they = (this.y + other.y)/2;
			Point midpoint = new Point(thex, they);
			return midpoint;
		}
		
			 
			
		}
	





























