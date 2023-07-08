package protectedDesignPattern;

import java.util.Hashtable;

public class ShapeCache {
	
	  static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	 
	 //create static getshape method return to shape class
	 public static  Shape getShape(String id)
	 {
		 Shape cachedShape = shapeMap.get(id);
		 return (Shape) cachedShape.clone();
	 }
		 
		// shapeMap.put(shapeKey, shape);
		// for example, we are adding three shapes
	 
		public static void loadCache()
		{
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(),circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(),square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		 }
		 
		 
	 }


