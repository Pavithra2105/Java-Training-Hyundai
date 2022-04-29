package Assignmnet006;

interface ShapesEample{
	    void input();
	    void area();
	}
	class Circle implements ShapesEample{
	    int r = 0;
	    double pi = 3.14, ar = 0;
	    
	    public void input(){
	        r = 5;
	    }
	    
	     public void area(){
	        ar = pi * r * r;
	        System.out.println("Area of circle:"+ar);
	    }
	}
	class Rectangle extends Circle{
	    int l = 0, b = 0;
	    double ar;
	    public void input(){
	        l = 6;
	        b = 4;
	    }
	    public void area(){
	        ar = l * b;
	        System.out.println("Area of rectangle:"+ar);
	    }
	}
	
	class Trianglle extends Rectangle{
	    int h = 0;int a;
	    double ar;
	    public void input(){
	    	h = 8;
	        b = 4;
	    }
	    public void area(){
	        a = ( b*h) / 2 ;  
	        System.out.println("Area of Triangle:"+a);
	    }
	}
	
public class Shapes {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
        
        Circle obj1 = new Circle();
        obj1.input();
        obj1.area();
        
        Trianglle obj2 = new Trianglle();
        obj2.input();
        obj2.area();
	}
}
