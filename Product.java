public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public double total_price(double price,int quantity){
        return price*quantity;
    }
    public double cal_total_price(int quantity){
        return price*quantity;
    }
    public double cal_total_price(double discount){
        return cal_total_price(quantity)*(1-discount);
    }
    public double cal_total_price(double taxRate,double discount){
        double total_price_before_tax=cal_total_price(discount);
        return total_price_before_tax+(total_price_before_tax*taxRate);
    }
    public void update_product(Product product){
        if(product!=null){
            this.name= product.getName();
            this.price=product.getPrice();
            this.quantity= product.getQuantity();
        }
    }
}
