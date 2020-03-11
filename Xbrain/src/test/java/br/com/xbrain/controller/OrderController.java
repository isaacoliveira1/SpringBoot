package controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.OrderRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Autowired;

public class OrderController {
	@Autowired
	private OrderRepository orderRepository;
	
	
	@GetMapping(path="api/order-id/{}")
	public ResponseEntity<Optional<Order>> getIdOrder(@PathVariable(nome="ID", required=true)Long idPedido) {
		return ResponseEntity.ok(orderRepository.findByID(idPedido));
	}
}
	