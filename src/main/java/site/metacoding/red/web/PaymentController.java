package site.metacoding.red.web;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.PaymentService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@RestController
public class PaymentController {

    final PaymentService paymentService;

    @PostMapping("/payment")
    public CMRespDto<?> insert(@RequestBody List<OrdersInsertReqDto> ordersInsertReqDtos) {
        return new CMRespDto<>(1, "성공", paymentService.insert(ordersInsertReqDtos));
    }

    @PutMapping("/cancel/{paymentId}")
    public CMRespDto<?> updateCancel(@PathVariable Integer paymentId) {
        return new CMRespDto<>(1, "성공", paymentService.updateCancel(paymentId));
    }

    @GetMapping("/payment")
    public CMRespDto<?> findAll() {
        return new CMRespDto<>(1, "성공", paymentService.findAll());
    }
}
