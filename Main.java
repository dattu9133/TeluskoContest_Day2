package Telusko;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();


        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        System.out.println("==============================================");
        System.out.println("\t\t     MENU\n==============================================\n1.Search by Name\n2.Search by Place\n3.Products out of warranty\n4.All Items ");
        System.out.println("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        do {
	        switch(ch)
	        {
	        case 1:
	        	System.out.println("Enter the text to be searched:");
	        	String txt=sc.next();
	        	System.out.println("List of all Items which has "+txt+" :");
	        	System.out.println("============================================================================================");
	        	List<Product> prods = service.getProductWithText(txt);
	        	Stream<Product> name= prods.stream();
	        	name.forEach(items -> System.out.println(items));
	        	break;
	        case 2:
	        	System.out.println("Enter the place to be searched:");
	        	String txt1=sc.next();
	        	System.out.println("List of all Items which are in "+txt1+" : ");
	        	System.out.println("============================================================================================");
	        	List<Product> prod = service.getProductWithPlace(txt1);
	        	Stream<Product> place= prod.stream();
	        	place.forEach(items -> System.out.println(items));
	        	break;
	        case 3:
	        	System.out.println("List of Items which are out of Warranty :");
	        	System.out.println("============================================================================================");
	        	List<Product> prod1 = service.getProductOutOfWarranty();
	        	Stream<Product> warranty= prod1.stream();
	        	warranty.forEach(items -> System.out.println(items));
	        	break;
	        case 4:
              	 List<Product> products = service.getAllProducts();
//		         for(Product p : products){
//		                System.out.println(p);
//		            }
              	 System.out.println("List of all Items :");
              	System.out.println("============================================================================================");
	        	Stream<Product> data= products.stream();
	        	data.forEach(items -> System.out.println(items));
	        	
	        	
		         break;
	        default:
	        	System.out.println("Enter the valid options");
	           
	        }
	        System.out.println("==============================================");
	        System.out.println("\t\t     MENU\n==============================================\n1.Search by Name\n2.Search by Place\n3.Products out of warranty\n4.All Items ");
	        System.out.println("Enter your choice:");
	        ch=sc.nextInt();
	        
        }while(ch!=5);
        

        
        
        }

    }
