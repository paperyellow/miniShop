package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.product.Product;
import site.metacoding.red.service.ProductService;
import site.metacoding.red.web.dto.CMRespDto;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public CMRespDto<?> list(Model model) {
        List<Product> productList = productService.상품목록보기();
        model.addAttribute("productList", productList);
        return new CMRespDto<>(1, "목록보기성공", productList);

    }
}
