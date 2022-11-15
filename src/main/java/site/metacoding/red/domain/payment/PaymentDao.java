package site.metacoding.red.domain.payment;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao {

	public void insert(Payment Payment);

	public void updateById(Integer id, Payment Payment);
}
