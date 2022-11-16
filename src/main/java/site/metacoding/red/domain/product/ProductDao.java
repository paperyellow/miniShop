package site.metacoding.red.domain.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.ProductReqDto.ProductUpdateReqDto;
import site.metacoding.red.web.dto.ProductRespDto.ProductUpdateRespDto;

@Repository
public interface ProductDao {
	public List<Product> findAll();

	public Product findById(Integer id);

	public void insert(Product Product);

	public void update(Integer id, Product Product);

	public void updateStock(ProductUpdateReqDto productUpdateReqDto);

	public ProductUpdateRespDto findStockById(Integer id);
}
