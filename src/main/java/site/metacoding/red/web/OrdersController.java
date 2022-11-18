package site.metacoding.red.web;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.OrderService;

@RequiredArgsConstructor
@RestController
public class OrdersController {

    final OrderService orderService;

}
