//package edu.bzu.app.restapi.service.impl;
//
//
//import edu.bzu.app.restapi.dto.OrderDto;
//import edu.bzu.app.restapi.entity.Order;
//import edu.bzu.app.restapi.exception.ResourceNotFoundException;
//import edu.bzu.app.restapi.repository.OrderRepository;
//import edu.bzu.app.restapi.service.OrderService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class OrderServiceipml implements OrderService {
//
//
//        private OrderRepository orderRepository;
//
//        public OrderServiceipml(OrderRepository orderRepository) {
//            this.orderRepository = orderRepository;
//        }
//
//        @Override
//        public OrderDto createOrder(OrderDto orderDto) {
//            Order order = mapToEntity(orderDto);
//            Order newOrder = orderRepository.save(order);
//            OrderDto orderResponse = mapToDTO(newOrder);
//            return orderResponse;
//        }
//
//        @Override
//        public List<OrderDto> getAllOrders() {
//            List<Order> orders = orderRepository.findAll();
//            return orders.stream().map(order -> mapToDTO(order)).collect(Collectors.toList());
//        }
//
//        @Override
//        public OrderDto getOrderById(long serialid) {
//            Order order = orderRepository.findById(serialid).orElseThrow(() -> new ResourceNotFoundException("Order", "serialid", serialid));
//            return mapToDTO(order);
//        }
//
//        @Override
//        public OrderDto updateOrder(OrderDto orderDto, long serialid) {
//
//            Order order = orderRepository.findById(serialid).orElseThrow(() -> new ResourceNotFoundException("Order", "serialid", serialid));
//
//            order.setProductname(orderDto.getProductname());
//            order.setDescription(orderDto.getDescription());
//
//            Order updatedOrder = orderRepository.save(order);
//            return mapToDTO(updatedOrder);
//        }
//
//        @Override
//        public void deleteOrderById(long serialid) {
//            // get category by id from the database
//            Order order = orderRepository.findById(serialid).orElseThrow(() -> new ResourceNotFoundException("Order", "serialid", serialid));
//            orderRepository.delete(order);
//        }
//
//        private OrderDto mapToDTO(Order order){
//            OrderDto orderDto = new OrderDto();
//            orderDto.setSerialid(order.getSerialid());
//            orderDto.setProductname(order.getProductname());
//            orderDto.setDescription(order.getDescription());
//            return orderDto;
//        }
//
//        private Order mapToEntity(OrderDto orderDto){
//            Order order = new Order();
//            order.setProductname(orderDto.getProductname());
//            order.setDescription(orderDto.getDescription());
//            return order;
//        }
//
//}
