public class Main {
    public static void main(String[] args) {
        Product p1=new Product("pen",10.0,12);
        Product p2=new Product("Marker",50.0,10);

//        System.out.println("Product name : "+p1.name);
//        System.out.println("Product price : "+p1.price);
//        System.out.println("Product quantity : "+p1.quantity);

        System.out.println("Before update");
        System.out.println("Product name : "+p1.getName());
        System.out.println("Product price : "+p1.getPrice());
        System.out.println("Product quantity : "+p1.getQuantity());
        System.out.println("Total cost : "+p1.total_price(p1.getPrice(), p1.getQuantity()));

//        //after setter
//        p1.setName("Pencil");
//        p1.setPrice(5.0);
//        p1.setQuantity(20);
//        System.out.println("After setter:");
//        System.out.println("Product name : "+p1.getName());
//        System.out.println("Product price : "+p1.getPrice());
//        System.out.println("Product quantity : "+p1.getQuantity());
//        System.out.println("Total cost : "+p1.total_price(p1.getPrice(), p1.getQuantity()));

        p1.update_product(p2);
        System.out.println("After update");
        System.out.println("Product name : "+p1.getName());
        System.out.println("Product price : "+p1.getPrice());
        System.out.println("Product quantity : "+p1.getQuantity());
        System.out.println("Total cost : "+p1.total_price(p1.getPrice(), p1.getQuantity()));

    }
}