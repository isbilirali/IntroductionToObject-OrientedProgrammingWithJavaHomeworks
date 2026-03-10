package ch13_enum.oven;

/*
2. double basePrice ve int preparationTimeInMinutes alanlarına sahip small, medium, large ve family pizza büyüklüklerini
temsil eden PizzaSize isminde bir enum yapısı oluşturun.
a. PizzaSize enum tipine getPricePerSlice(int slices) metodunu koyun ve biz pizzada 6 dilim olduğunu varsayarak,
geçilen dilim sayısının fiyatını belirleyin.
b. Benzer şekilde yapıya bir de isGoodForParties() metodunu ekleyin ve bu metot large ve family pizzaları için true döndürsün.
c. Pizzaların pişmesi için gereken süre ve sıcaklığı temsil etmek üzere iki alana sahip bir PizzaCooking sınıfı oluşturun.
d. Ayrıca, PizzaOven isimli bir sınıf daha oluşturun. Bu sınıfa koyacağınız bir metot PizzaSize argümanı alsın ve
pizzanın pişmesi için gereken bilgiyi PizzaCooking olarak geri döndürsün. Bunun için switch expression kullanın.
e. PizzaSizeTest isimli main metota sahip bir sınıfta bu yapıları test edin.
 */

public class Test {

    public static void main(String[] args) {

        PizzaOven oven = new PizzaOven();

        for (PizzaSize size : PizzaSize.values()) {
            System.out.println("***** " + size.name() + " Pizza *****");
            System.out.println("  Base Price : " + size.getBasePrice());
            System.out.println("  Prep Time  : " + size.getPreparationTimeInMinutes());
            System.out.println("  Price (2 slices) : "+ size.getPricePerSlice(2));
            System.out.println("  Good for Parties : " + size.isGoodForParties());

            PizzaCooking cooking = oven.getCookingInfo(size);
            cooking.printInfo();
            System.out.println();
        }

    }

}
