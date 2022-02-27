package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    private int quantity;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public String getProductName(){
        return product.getName();
    }

    public float getAmount(){
        return product.getAmount();
    }
}
