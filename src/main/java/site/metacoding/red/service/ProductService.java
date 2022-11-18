package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.product.Product;
import site.metacoding.red.domain.product.ProductDao;
import site.metacoding.red.web.dto.ProductReqDto.ProductInsertReqDto;
import site.metacoding.red.web.dto.ProductRespDto.ProductInsertRespDto;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductDao productDao;

    public List<Product> findAll() {
        List<Product> productList = productDao.findAll();
        return productList;
    }

    public ProductInsertRespDto insert(ProductInsertReqDto productInsertReqDto) {
        Product product = productInsertReqDto.toEntity();
        System.out.println("2 : " + product);
        int productId = productDao.insert(product);
        System.out.println("3 : " + productId);

        ProductInsertRespDto productInsertRespDto = productDao
                .insertProductResult(productId);
        System.out.println("4 : " + productInsertRespDto);
        System.out.println(productId + "====================");
        return productInsertRespDto;
    }

}
