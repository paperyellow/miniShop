package site.metacoding.red.domain.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.ProductRespDto.ProductInsertRespDto;

@Repository
public interface ProductDao {
	public List<Product> findAll();

	public Product findById(Integer id);

	public Integer insert(Product product);

	public void update(Integer id, Product Product);

	public ProductInsertRespDto insertProductResult(Integer productId);
}
