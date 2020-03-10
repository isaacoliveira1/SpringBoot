package service;

import org.springframework.beans.factory.annotation.Autowired;

import datasource.model.Order;
import repository.OrderRepository;

public class CadastroOrder {

	@Autowired
	private OrderRepository orderRepository;
	public void getID(Order order) {
		orderRepository.saveAndFlush(order);
	}
}
