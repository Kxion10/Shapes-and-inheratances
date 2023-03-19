package shape;

public class Triangle extends Shape{     
public void draw() { 
      //Draws the triangle,  
	
   //using the height and width to determine the size. 
	
for(int i = 0; i <= this.height; i++)
	{  
	for(int j=0; j <= i; j++)
	{                
		System.out.print("*"); 
     }//end loop
	
         System.out.print("\n"); 
     } //end loop 

    } //end draw() method

} //end Triangle class 
