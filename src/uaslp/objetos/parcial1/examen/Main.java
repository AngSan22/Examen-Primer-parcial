package uaslp.objetos.parcial1.examen;

import java.util.ArrayList;

import uaslp.objetos.parcial1.examen.pos.CartItem;
import uaslp.objetos.parcial1.examen.pos.PointOfSale;
import uaslp.objetos.parcial1.examen.pos.Product;

public class Main {

/*
 ** PROHIBIDO MODIFICAR ESTE ARCHIVO **

La salida del programa debe ser:

Productos a vender:
2 - Sabritas - $ 41.0
1 - Jumex Mango - $ 15.0
6 - Chetos - $ 109.799995
3 - Coca - $ 74.7

El total de venta es: $ 240.49998

Se vendieron 2 Sabritas
Se vendieron 1 Jumex Mango
Se vendieron 6 Chetos
Se vendieron 3 Coca

*/

    public static void main(String[] args) {
        PointOfSale pointOfSale = new PointOfSale();

        pointOfSale.addToCart(2, new Product("Sabritas", 20.5f)); //Se añaden 2 productos Sabritas de $20.50 c/u
        pointOfSale.addToCart(1, new Product("Jumex Mango", 15)); //Se añade 1 producto Jumex Mango de $15 c/u
        pointOfSale.addToCart(4, new Product("Chetos", 18.3f)); //Se añaden 4 productos Chetos de $18.3 c/u
        pointOfSale.addToCart(3, new Product("Coca", 24.9f)); //Se añaden 3 productos Coca de $24.9 c/u
        pointOfSale.addToCart(2, new Product("Chetos", 18.3f)); //Se añaden 2 productos Chetos de $18.3 c/u

        ArrayList<CartItem> products = pointOfSale.getProducts();

        System.out.println("Productos a vender:");

        for (CartItem cartItem : products) {
            System.out.println(cartItem.getQuantity() + " - " + cartItem.getProductName() + " - $ " + (cartItem.getAmount() * cartItem.getQuantity()));
        }

        System.out.println();
        System.out.println("El total de venta es: $ " + pointOfSale.getTotal());
        System.out.println();

        String[] productNames = {"Sabritas", "Jumex Mango", "Chetos", "Coca"};

        for (String name : productNames) {
            System.out.println("Se vendieron " + pointOfSale.getCountByName(name) + " " + name);
        }

    }
}
