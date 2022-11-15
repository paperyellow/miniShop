package site.metacoding.red.domain.payment;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao {
	public List<Payment> findAll();

	public Payment findById(Integer id);

	public void insert(Payment Payment);

	public void update(Integer id, Payment Payment);
}
