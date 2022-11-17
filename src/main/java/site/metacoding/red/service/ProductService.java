package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.product.Product;
import site.metacoding.red.domain.product.ProductDao;
import site.metacoding.red.web.dto.request.ProductInsertReqDto;
import site.metacoding.red.web.dto.request.ProductUpdateReqDto;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductDao productDao;

    public Product 상품번호로찾기(Integer id) {
        return productDao.findById(id);
    }

    public List<Product> 상품목록보기() {
        return productDao.findAll();
    }

    public void 상품추가하기(ProductInsertReqDto productInsertReqDto) {
        productDao.insert(productInsertReqDto);
    }

    public void 상품수정하기(Integer id, ProductUpdateReqDto productUpdateReqDto) {
        productDao.update(id, productUpdateReqDto);
    }

}
