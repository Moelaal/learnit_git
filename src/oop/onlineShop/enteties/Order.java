package oop.onlineShop.enteties;

public interface Order {
   boolean isCreditCardNumberValid(String userInput);
   void setCreditCardNumber(String userInput);
   void setProduct(Product [] product);
   void setCustomerId(int customerId);
   int getCustomerId();

}
