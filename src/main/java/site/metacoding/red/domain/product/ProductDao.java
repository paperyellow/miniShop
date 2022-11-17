package site.metacoding.red.domain.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.request.ProductInsertReqDto;
import site.metacoding.red.web.dto.request.ProductUpdateReqDto;

@Repository
public interface ProductDao {
	public List<Product> findAll();

	public Product findById(Integer id);

	public void insert(ProductInsertReqDto productInsertReqDto);

	public void update(Integer id, ProductUpdateReqDto productUpdateReqDto);
}
