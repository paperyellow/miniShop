package site.metacoding.red.domain.order;

import org.springframework.stereotype.Repository;

import site.metacoding.red.web.dto.OrdersReqDto.OrdersInsertReqDto;

@Repository
public interface OrdersDao {
	public void insert(OrdersInsertReqDto ordersInsertReqDto);

	public void updateById(Integer id, Orders Orders);

}
