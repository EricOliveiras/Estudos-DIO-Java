package src.estudos;

import java.math.BigDecimal;

import src.base.Order;

public class MyFirstProgram {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Order order = new Order("code1234", new BigDecimal(100.00));
    System.out.println(order.calculateFee());
    System.out.println(order);
  }
}

