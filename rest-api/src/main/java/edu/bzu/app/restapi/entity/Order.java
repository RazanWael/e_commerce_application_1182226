//package edu.bzu.app.restapi.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(
//        name = "order_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})}
//)
//
//public class Order {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.IDENTITY
//    )
//    private Long serialid;
//
//    @Column(name = "productname", nullable = false)
//    private String productname;
//
//    @Column(name = "description", nullable = true)
//    private String description;
//
//
//
//
//}
