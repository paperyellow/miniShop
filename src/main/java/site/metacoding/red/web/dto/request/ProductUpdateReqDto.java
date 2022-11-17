package site.metacoding.red.web.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ProductUpdateReqDto {
    private boolean soldout;
    private Integer no;
    private String name;
    private Integer price;
    private Integer stock;

}
