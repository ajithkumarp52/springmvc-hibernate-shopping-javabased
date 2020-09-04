package org.dxc.shopping.service;

import java.util.List;

import org.dxc.shopping.dao.ProductDao;
import org.dxc.shopping.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductDao productDao;

@Override
@Transactional
public void saveProduct(Product product) {
	productDao.saveProduct(product);
	
}

@Override
@Transactional
public List<Product> getProducts() {
	List<Product> listOfProducts=productDao.getProduct();
	return listOfProducts;
}

@Override
@Transactional
public void deleteProduct(int pid) {
	productDao.deleteProduct(pid);
	
}

@Override
@Transactional
public Product updateProduct(int pid) {
	// TODO Auto-generated method stub
	return productDao.updateProduct(pid);
}

}
