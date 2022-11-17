package site.metacoding.red.web.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductInsertRespDto {
    private boolean soldout;
    private Integer no;
    private String name;
    private Integer price;
    private Integer stock;
}
