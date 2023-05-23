package nguyennguyenhoangbuoi5lt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import nguyennguyenhoangbuoi5lt.models.Product;

@Service
public class ProductService {
	private List<Product> listProduct = new ArrayList<>();
	public ProductService() {
		
	}
	public void add(Product newProduct) {
		listProduct.add(newProduct);
	}
	public List<Product> GetAll(){
		return listProduct;
	}
	public Product get(int id) {
		return listProduct.stream().filter(p->p.getId()==id).findFirst().orElse(null);
	}
	public void edit(Product editProduct) {
		Product find = listProduct.get(editProduct.getId());
		if(find != null) {
			find.setName(editProduct.getName());
			find.setImage(editProduct.getImage());
			find.setPrice(editProduct.getPrice());
		}
	}
}
