package site.metacoding.red.domain.order;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.OrdersReqDto.OrdersCancelReqDto;
import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertDBReqDto;
import site.metacoding.red.web.dto.OrdersRespDto.OrdersFindByPaymentIdRespDto;

@Repository
public interface OrdersDao {
	public void insert(OrdersInsertDBReqDto ordersInsertDBReqDto);

	public void updateById(Integer id, Orders Orders);

	public void updateCancel(OrdersCancelReqDto OrdersCancelReqDto);

	public List<OrdersFindByPaymentIdRespDto> findByPaymentId(Integer paymentId);
}
