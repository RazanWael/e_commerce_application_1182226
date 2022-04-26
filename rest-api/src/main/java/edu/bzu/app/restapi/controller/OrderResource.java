//package edu.bzu.app.restapi.controller;
//
//import edu.bzu.app.restapi.dto.OrderDto;
//import edu.bzu.app.restapi.exception.BadRequestException;
//import edu.bzu.app.restapi.service.OrderService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/order")
//public class OrderResource {
//
//        private final Logger log = LoggerFactory.getLogger(OrderResource.class);
//        @Autowired
//        private OrderService orderService;
//        public OrderResource(OrderService orderService) {
//            this.orderService = orderService;
//        }
//
//        @GetMapping
//        public ResponseEntity<List<OrderDto>> getAllOrders() {
//            return ResponseEntity.ok().body(orderService.getAllOrders());
//        }
//
//        @GetMapping("/{serialid}")
//        public ResponseEntity<OrderDto> getOrderById(@PathVariable(name = "serialid") long serialid) {
//            return ResponseEntity.ok(orderService.getOrderById(serialid));
//        }
//
//        @PostMapping
//        public ResponseEntity<OrderDto> createOrder(@Valid @RequestBody OrderDto orderDto) {
//            if (orderDto.getSerialid() != null) {
//                log.error("Cannot have an ID {}", orderDto);
//                throw new BadRequestException(OrderResource.class.getSimpleName(),
//                        "Id");
//            }
//            return new ResponseEntity<>(orderService.createOrder(orderDto), HttpStatus.CREATED);
//        }
//
//        @PutMapping("/{serialid}")
//        public ResponseEntity<OrderDto> updateOrder(@Valid @RequestBody OrderDto orderDto
//                , @PathVariable(name = "serialid") long serialid) {
//            return new ResponseEntity<>(orderService.updateOrder(orderDto, serialid), HttpStatus.OK);
//        }
//
//        @DeleteMapping("/{serialid}")
//        public ResponseEntity<String> deleteOreder(@PathVariable(name = "serialid") long serialid) {
//            orderService.deleteOrderById(serialid);
//            return new ResponseEntity<>("Deleted successfully.", HttpStatus.OK);
//        }
//
//}
