package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.order.OrdersDao;

@RequiredArgsConstructor
@Service
public class OrderService {

    final OrdersDao ordersDao;

}
