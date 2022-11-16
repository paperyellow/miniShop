package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.order.OrdersDao;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;
import site.metacoding.red.web.dto.OrdersRespDto.OrdersInsertRespDto;

@RequiredArgsConstructor
@Service
public class OrderService {

    final OrdersDao ordersDao;

    public OrdersInsertRespDto insert(OrdersInsertReqDto ordersInsertReqDto) {
        ordersDao.insert(ordersInsertReqDto);
        return new OrdersInsertRespDto(ordersInsertReqDto);
    }

}
