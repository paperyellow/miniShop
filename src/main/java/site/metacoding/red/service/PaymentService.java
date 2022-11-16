package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.order.OrdersDao;
import site.metacoding.red.domain.payment.PaymentDao;
import site.metacoding.red.domain.product.ProductDao;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertDBReqDto;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;
import site.metacoding.red.web.dto.PaymentReqDto.PaymentInsertReqDto;
import site.metacoding.red.web.dto.PaymentRespDto.PaymentInsertRespDto;
import site.metacoding.red.web.dto.ProductReqDto.ProductUpdateReqDto;
import site.metacoding.red.web.dto.ProductRespDto.ProductUpdateRespDto;

@RequiredArgsConstructor
@Service
public class PaymentService {

    final PaymentDao paymentDao;
    final OrdersDao ordersDao;
    final ProductDao productDao;

    @Transactional
    public PaymentInsertRespDto insert(@RequestBody List<OrdersInsertReqDto> ordersInsertReqDtos) {
        PaymentInsertReqDto paymentInsertReqDto = new PaymentInsertReqDto();
        Integer totalQuantity = 0;
        Integer totalPrice = 0;
        for (OrdersInsertReqDto ordersInsertReqDto : ordersInsertReqDtos) {
            totalQuantity += ordersInsertReqDto.getQuantity();
            totalPrice += ordersInsertReqDto.getPrice() * ordersInsertReqDto.getQuantity();
            ProductUpdateRespDto productUpdateRespDto = productDao.findStockById(ordersInsertReqDto.getProductId());
            ProductUpdateReqDto productUpdateReqDto = new ProductUpdateReqDto(
                    productUpdateRespDto.getStock() - ordersInsertReqDto.getQuantity());
            productUpdateReqDto.setProductId(ordersInsertReqDto.getProductId());
            productDao.updateStock(productUpdateReqDto);
        }

        productDao.updateStock(null);
        paymentInsertReqDto.setCancel(false);
        paymentInsertReqDto.setTotalQuantity(totalQuantity);
        paymentInsertReqDto.setTotalPrice(totalPrice);

        paymentDao.insert(paymentInsertReqDto);

        for (OrdersInsertReqDto ordersInsertReqDto : ordersInsertReqDtos) {
            OrdersInsertDBReqDto ordersInsertDBReqDto = new OrdersInsertDBReqDto(ordersInsertReqDto,
                    paymentInsertReqDto.getPaymentId());
            ordersDao.insert(ordersInsertDBReqDto);
        }

        return new PaymentInsertRespDto(paymentInsertReqDto);
    }
}
