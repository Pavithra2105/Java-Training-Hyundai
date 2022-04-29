package GenericPackage;

import java.util.*;

import GenericPackage.Square.ShapeGenerator;


abstract class Shapes{
	abstract void drawshape();
}
class Square extends Shapes{
	
	void drawshape() {
		System.out.println("Draw the shape of square");
	}
	
class Triangle extends Shapes{

		void drawshape() {
			System.out.println("Draw the shape of Triangle");	
		}
	}
	
static class ShapeGenerator{
	static	void drawshapes(List<? extends Shapes> list1) {
			for(Shapes s: list1) {
				s.drawshape();
			}
		}
	}
}
public class WildCardExample {

	public static void main(String[] args) {
		Square sq = new Square();
		Triangle tr = new Triangle();
		
		List<Shapes> l1 = new ArrayList<Shapes>();
		l1.add(tr);
		l1.add(sq);
		ShapeGenerator.drawshapes(l1);
		

	}

}
