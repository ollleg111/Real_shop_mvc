package com.example.demo.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="ORDERS")
@Table(name="order")
public class Order {
}
