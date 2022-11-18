package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.ProductService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.ProductReqDto.ProductInsertReqDto;
import site.metacoding.red.web.dto.ProductRespDto.ProductInsertRespDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public CMRespDto<?> findAll() {
        return new CMRespDto<>(1, "상품목록보기성공", productService.findAll());
    }

    @PostMapping("/product")
    public CMRespDto<?> insert(@RequestBody ProductInsertReqDto productInsertReqDto) {
        System.out.println("1 : " + productInsertReqDto);
        ProductInsertRespDto productInsertRespDto = productService.insert(productInsertReqDto);
        return new CMRespDto<>(1, "상품추가성공", productInsertRespDto);
    }

}
