package shape;

public class ShapeGenerator {

	public static void main(String[] args)
	{
        System.out.println("\nShort triangle\n"); 
 
        //Draw a short triangle 
        Triangle shorty = new Triangle();         
        shorty.setHeight(3);         
        shorty.setWidth(3);         
        shorty.draw(); 
 
        System.out.println("\nTall rectangle\n"); 
 
        //Draw a tall rectangle 
        Rectangle tallRectangle = new Rectangle();         
        tallRectangle.setHeight(8);         
        tallRectangle.setWidth(4);         
        tallRectangle.draw(); 
 
    } //end main 
} //end class 
		
		

	


