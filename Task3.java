import java.util.ArrayList;
import java.util.List;
class Task3{
	public static void main(String args[]){
		Cake c1=new Cake();
		Cake c2=new Cake();
		c1.setname("Chocolate Brownie");
		c1.setprice(250.0f);
		c2.setname("Chocolate Maple");
		c2.setprice(300.0f);
		
		
		List<Cake> c=new ArrayList();
		
		c.add(c1);
		c.add(c2);
		
		Pastry p1=new Pastry();
		Pastry p2=new Pastry();
		
		p1.setname("Black Forest");
		p1.setprice(35.0f);
		p2.setname("Choco Truffle");
		p2.setprice(40.0f);
		
		List<Pastry> p=new ArrayList();
		
		p.add(p1);
		p.add(p2);
	    
	    System.out.println("         Todays Special Menu");
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println("Special Cakes");
		System.out.println("------------------------------------------");
		
		for(Cake a:c)
		    a.display();
		
		System.out.println();
		System.out.println("Special Pastries");
		System.out.println("------------------------------------------");
		for(Cake a:p)
		    a.display();
		
	}
}
class Cake{
	String name;
	float price;
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public float getprice(){
		return price;
	}
	public void setprice(float price){
		this.price=price;

	}
	
	int display(){
		System.out.println(name+":Rs "+price+" per pound");
		return 0;
	}
}
class Pastry extends Cake{
    
	int display(){
				System.out.println(name+":Rs "+price+" per piece");
			    return 0;
	}
}