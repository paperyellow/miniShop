package site.metacoding.red.domain.product;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {
	public List<Product> findAll();

	public Product findById(Integer id);

	public void insert(Product Product);

	public void update(Integer id, Product Product);
}
