package site.metacoding.red.domain.order;

import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao {
	public void insert(Orders Orders);

	public void update(Integer id, Orders Orders);

}
