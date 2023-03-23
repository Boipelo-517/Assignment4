import org.jetbrains.annotations.Contract;

import java.util.Objects;
import java.util.Scanner;
class Cars{
    private String model;
    private String brand;
    private int year;
    private String color;
    private int quantity;
    private int price;
    public  Cars(String model,String brand,int year,String color,int price,int quantity){
        this.model=model;
        this.brand=brand;
        this.year=year;
        this.color=color;
        this.quantity=quantity;
        this.price=price;

    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    void sell(int sold){quantity-=sold;}
    void delivery(int delivery){quantity+=delivery;}

    @Override
    public String toString(){
       return "Car{"+"model="+model+'\''+",brand="+brand+'\''+",year="+year+'\''+",price="+price+'\''+",color="+color+'\''+",quantity="+quantity+"}";
    }
}
public class car
{
    public static void main(String[] args)
    {
            Cars r=new Cars("911","porsche",2021,"white",9000,22);
            System.out.println(r.toString());
            r.sell(20);
            System.out.println(r.toString());
            r.setModel("911");
            r.delivery(2);
            r.setBrand("porsche");
            r.setYear(2021);
            r.setColor("black");
            r.setPrice(2000);
            r.setQuantity(12);
            System.out.println(r.toString());
    }
}
