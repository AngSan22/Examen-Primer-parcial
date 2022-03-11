package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addToCart(int quantity, Product product){
        for(CartItem cartItem : items){
            if(cartItem.getProductName().equals(product.getName())){
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                quantity = 0;
            }
        }

        if(quantity != 0){
            CartItem item = new CartItem();
            item.setQuantity(quantity);
            item.setProduct(product);
            items.add(item);
        }
    }

    public float getTotal(){
        float total = 0;

        for(CartItem cartItem: items){
            total = total + cartItem.getQuantity()*cartItem.getAmount();
        }
        return total;
    }

    public ArrayList<CartItem> getProducts(){
        return new ArrayList<>(items);
    }

    public int getCountByName(String name){
        int count = 0;

        for(CartItem cartitem: items){
            if(cartitem.getProductName().equals(name)){
                count = cartitem.getQuantity();
            }
        }
        
        return count;
    }
}
