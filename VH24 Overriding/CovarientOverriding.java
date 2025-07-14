package com.Day7.Polymorphism2.overriding;



class Colour
{
	protected Colour getColour() {
		Colour s=new Colour();
		return s;
	}
	void display() {
        System.out.println("This is a Colour");
    }
	
}
class Red extends Colour{

	@Override
	//here in the overriden method return type is changed
	protected Red getColour() {
		Red s=new Red();
		return s;
	}
	@Override
    void display() {
        System.out.println("This is Red Colour");
    }
	
}
class Blue extends Colour{

	@Override
	//here in the overriden method return type is changed
	protected Blue getColour() {
		Blue s=new Blue();
		return s;
	}

    @Override
    void display() {
        System.out.println("This is Blue Colour");
    }
	
}
public class CovarientOverriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour c1=new Colour();
		c1.getColour().display();
		
		Colour c2=new Red();
		c2.getColour().display();
		
		Colour c3=new Blue();
		c3.getColour().display();
		

	}

}
