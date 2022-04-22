package src.base;

import java.math.BigDecimal;

/**
 * @author Eric Oliveira
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {
  
  // Representa o código do pedido
  private final String code;
  private final BigDecimal totalValue;

  /**
   * Construtor da classe
   * 
   * @param code ........Código do pedido
   * @param totalValue ..Valor total do pedido
   */
  public Order(String code, BigDecimal totalValue) {
    this.code = code;
    this.totalValue = totalValue;
  }

  /**
   * Calcula as taas de acordo com o valor total dos pedidos. Se o valor for maior que 100 uma taxa será cobrada
   * 
   * @return Valor total do pedido com as taas calculadas
   * @throws RuntimeException Se o valor do pedido for negativo
   */
  public BigDecimal calculateFee() throws RuntimeException {
    if (this.totalValue.signum() < 0) {
      throw new RuntimeException("O pedido não pode ter valor negativo");
    }

    if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
      return this.totalValue.multiply(new BigDecimal("0.99"));
    }

    return this.totalValue;
  }

  
  /** 
   * @return String
   */
  @Override
  public String toString() {
    return "Order={" +
            "code= '" + code + "'," +
            "totalValue= " + totalValue +
            "}";
  }
}
