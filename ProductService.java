package Telusko;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str))
                prods.add(p);
        }
        return prods;

    }
    public List<Product> getProductWithPlace(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(place.contains(str))
                prods.add(p);
        }
        return prods;

    }
//    public void show(List<Product> pro)
//    {
//    	for(Product product : pro){
//            System.out.println(product);
//    }
//    }

	public List<Product> getProductOutOfWarranty() {
		List<Product> prods = new ArrayList<>();
		
		LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
		for(Product p : products){
			int war=p.getWarranty();
			if(war<=year)
				prods.add(p);
		}
		return prods;
	}
}

