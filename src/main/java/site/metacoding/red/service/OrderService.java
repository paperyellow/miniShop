package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.order.OrdersDao;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertDBReqDto;
import site.metacoding.red.web.dto.OrdersRespDto.OrdersInsertRespDto;

@RequiredArgsConstructor
@Service
public class OrderService {

    final OrdersDao ordersDao;

    public OrdersInsertRespDto insert(OrdersInsertDBReqDto ordersInsertDBReqDto) {
        ordersDao.insert(ordersInsertDBReqDto);
        return new OrdersInsertRespDto(ordersInsertDBReqDto);
    }

}
