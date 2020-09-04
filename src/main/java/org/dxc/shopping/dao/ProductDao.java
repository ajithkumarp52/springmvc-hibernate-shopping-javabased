package org.dxc.shopping.dao;

import java.util.List;

import org.dxc.shopping.entity.Product;

public interface ProductDao {

	public void saveProduct(Product product);

	public List<Product> getProduct();

	public void deleteProduct(int pid);

	public Product updateProduct(int pid);

}
