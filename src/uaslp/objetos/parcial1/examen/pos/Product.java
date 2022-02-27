package uaslp.objetos.parcial1.examen.pos;

public class Product {
    private String name;
    private float amount;

    public Product(String name, float amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public float getAmount(){
        return amount;
    }
}
