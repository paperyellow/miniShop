package site.metacoding.red.domain.order;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertDBReqDto;

@Repository
public interface OrdersDao {
	public void insert(OrdersInsertDBReqDto ordersInsertDBReqDto);

	public void updateById(Integer id, Orders Orders);

}
