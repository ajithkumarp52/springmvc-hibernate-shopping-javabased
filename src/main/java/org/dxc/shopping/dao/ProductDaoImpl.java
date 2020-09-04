package org.dxc.shopping.dao;

import java.util.List;

import org.dxc.shopping.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}

	@Override
	public List<Product> getProduct() {
		Query<Product> query=sessionFactory.getCurrentSession().createQuery("from Product");
		return query.getResultList();
	}

	@Override
	public void deleteProduct(int pid) {
		Query<Product> query=sessionFactory.getCurrentSession().createQuery("delete from Product where id=:productId");
		query.setParameter("productId", pid);
		query.executeUpdate();
		
	}

	@Override
	public Product updateProduct(int pid) {
		Session currentSession=sessionFactory.getCurrentSession();
	 Product product = currentSession.get(Product.class,pid);
	return product;
	}
}
