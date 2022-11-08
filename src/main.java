import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class main {
    public static ArrayList<String> Name = new ArrayList<>();
    public static ArrayList<String> Product = new ArrayList<>();
    public static ArrayList<String> Model = new ArrayList<>();
    public static ArrayList<String> Color = new ArrayList<>();
    public static ArrayList<Integer> Price = new ArrayList<>();
    public static ArrayList<Integer> Amount = new ArrayList<>();
    public static ArrayList<Integer> Total = new ArrayList<>();
   static void cart(String name, String product,String model,String color, int price, int amount, int total)
    {
        Name.add(name);
        Product.add(product);
        Model.add(model);
        Color.add(color);
        Price.add(price);
        Amount.add(amount);
        Total.add(total);
    }
    static void sort(String input)
    {
        if(input.equals("samsung")) {product.samsung();}
        else if(input.equals("apple")) {product.apple();}
        else if(input.equals("asus")) {product.asus();}
        else if(input.equals("huawai")) {product.huawai();}
        else if(input.equals("lenovo")) {product.lenovo();}
        else if(input.equals("nokia")) {product.nokia();}
        else if(input.equals("oppo")) {product.oppo();}
        else if(input.equals("realme")) {product.realme();}
        else if(input.equals("sony")) {product.sony();}
        else if(input.equals("xiaomi")) {product.xiaomi();}
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);  // Create a Scanner object
        System.out.print("Select phone brand : ");
        String input = sc.nextLine();  // Read user input
        sort(input);


        while (true)
        {
            if(input.equals("q"))
            {
                break;
            }
            System.out.print("Select phone brand : ");
            input = sc.nextLine();  // Read user input
            sort(input);
        }
        int sum = 0;
        System.out.println("No.\t\t\tBrand\t\t\tProduct\t\t\t\tModel\t\t\t\tColor\t\t\tPrice\t\t\tAmount\t\t\tTotal");
        for (int i = 0;i < Name.size();i++)
        {
            System.out.println(i+1+"\t\t|\t"+Name.get(i)+"\t\t|\t"+Product.get(i)+"\t|\t"+Model.get(i)+"\t\t|\t"
                    +Color.get(i)+"\t\t|\t"+Price.get(i)+"\t\t|\t"+Amount.get(i)+"\t\t|\t"+Total.get(i));
            sum = sum + Total.get(i);
        }
        System.out.println("Net amount : "+sum+" THB");

    }
}
