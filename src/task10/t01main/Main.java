package task10.t01main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(ProductList.productList.size());
        for (int i = 0; i <ProductList.productList.size() ; i++) {
            System.out.print(ProductList.productList.get(i));
        }
        //   ShopRunner shopRunner = new ShopRunner();
        //   shopRunner.menu();

    }
}
