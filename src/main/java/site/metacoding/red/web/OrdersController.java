package site.metacoding.red.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.OrderService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;

@RequiredArgsConstructor
@RestController
public class OrdersController {

    final OrderService orderService;

}
