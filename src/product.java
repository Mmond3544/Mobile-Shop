import java.util.Scanner;

import static java.lang.System.in;

public class product {
    public static int total = 0;
    public static int amount;
    public static String color = "";
    public static String p = "";
    public static String model = "";
    public static int price = 0;

    static void samsung()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"   Galaxy A13","   Galaxy S22","   Galaxy M53","Galaxy tab A8","   Galaxy F23"};
        int[] Price = {6500,29900,9000,10000,15000};
        String[] Model = {"4 GB +  64 GB","6 GB +  64 GB","6 GB + 128 GB","8 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Green","Gold"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {System.out.println("Invaild product, Please try again.");}
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }

        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Samsung",p,model,color,price,amount,total);
    }
    static void apple()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"ipad mini","ipad 10.2","iphone 13 pro max","iphone 13","ipad pro 11"};
        int[] Price = {17900,11400,42900,29900,27900};
        String[] Model = {"64 GB","128 GB","256 GB","512 GB"};
        String[] Color = {"White","Black","Blue","Green","Pink","Red"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }

        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4]) || c.equals(Color[5])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Apple",p,model,color,price,amount,total);
    }
    static void nokia()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"X100","C20","X10","G20","G50"};
        int[] Price = {10000,3290,8000,4990,8590};
        String[] Model = {"4 GB +  64 GB","4 GB + 128 GB","6 GB +  64 GB","6 GB + 128 GB","8 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Green","Brown"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Nokia",p,model,color,price,amount,total);
    }
    static void lenovo()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"Legion Dual 2","Legion Dual","Legion 2 Pro","Legion Y90","Tab M10 Plus"};
        int[] Price = {22990,23990,20000,22200,7999};
        String[] Model = {" 8 GB + 256 GB","12 GB + 128 GB","12 GB + 256 GB","16 GB + 512 GB"};
        String[] Color = {"White","Black","Blue","Red","Gray","Silver"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4]) || c.equals(Color[5])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Lenovo",p,model,color,price,amount,total);
    }
    static void huawai()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"Nova 9","Nova 9 Pro","P50","MatePad 11","Mate 40"};
        int[] Price = {16990,20000,33990,15990,30990};
        String[] Model = {"6 GB + 64 GB","6 GB + 128 GB","8 GB + 128 GB","8 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Yellow","Purple"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Huawai",p,model,color,price,amount,total);
    }
    static void xiaomi()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"Mi 12","Mi 12 Pro","Mi 11","Pad 5","Black shark 4"};
        int[] Price = {24990,31990,21990,10990,16990};
        String[] Model = {" 8 GB +  64 GB"," 8 GB + 128 GB"," 8 GB + 256 GB","12 GB + 256 GB"};
        String[] Color = {"Black","Blue","Gray","Purple"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Xiaomi",p,model,color,price,amount,total);
    }
    static void oppo()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"Find X5 Pro","Find X5","A76","Reno 7","Reno 7 Pro"};
        int[] Price = {39990,23000,7999,16990,22990};
        String[] Model = {" 6 GB + 128 GB"," 8 GB +  64 GB"," 8 GB + 128 GB","12 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Gray","Purple"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Oppo",p,model,color,price,amount,total);
    }
    static void realme()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"C21Y","Narzo 50","GT 2 Pro","9 5G","9 Pro"};
        int[] Price = {4999,5999,24990,12900,8999};
        String[] Model = {" 6 GB + 128 GB"," 8 GB + 128 GB","12 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Green"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Realme",p,model,color,price,amount,total);
    }
    static void sony()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"Xperia 1 II","Xperia 5 II","Xperia 10 II","Xperia 1 III","Xperia 5 III"};
        int[] Price = {35990,28990,12990,42990,34990};
        String[] Model = {" 8 GB + 128 GB"," 8 GB + 256 GB","12 GB + 256 GB","12 GB + 512 GB"};
        String[] Color = {"White","Black","Blue","Purple","Pink"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Sony",p,model,color,price,amount,total);
    }
    static void asus()
    {
        Scanner sc = new Scanner(in);
        String[] product = {"ROG Phone 2","ROG Phone 3","ROG Phone 5","Zenfone 7","Zenfone 8"};
        int[] Price = {29990,32990,22900,24300,24900};
        String[] Model = {" 8 GB + 128 GB"," 8 GB + 256 GB","12 GB + 256 GB","12 GB + 512 GB","16 GB + 256 GB"};
        String[] Color = {"White","Black","Blue","Purple","Silver"};

        for(int i = 0; i < product.length ;i++ ) {System.out.println(i+1+"\t"+product[i]+"\t\t\t"+Price[i]);}

        while (true) {
            System.out.print("Choose product do you want : ");
            String in = sc.next();
            try
            {
                int setin = Integer.parseInt(in);
                if (setin <= product.length && setin > 0) {
                    p = product[setin - 1];
                    price = Price[setin - 1];
                    break;
                } else {
                    System.out.println("Invaild product, Please try again.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }

        }
        for(int i = 1;i< Model.length+1;i++) {System.out.println(i+"\t"+Model[i-1]+"\t\t+"+(i-1)*1000);}

        while (true) {
            System.out.print("Select model : ");
            String m = sc.next();
            try {
                int input = Integer.parseInt(m);
                if (input > Model.length) {
                    System.out.println("Please try again");
                } else {
                    model = Model[input - 1];
                    price = price + ((input - 1) * 1000);
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        for(String x : Color) {System.out.println(x);}
        while (true) {
            System.out.print("Choose Color : ");
            String c = sc.next();
            if (c.equals(Color[0]) || c.equals(Color[1]) || c.equals(Color[2]) || c.equals(Color[3]) || c.equals(Color[4])) {
                color = c;
                break;
            }
            System.out.println("Invalid color, Please try again");
        }
        while (true) {
            System.out.print("How many do you want : ");
            String a = sc.next();
            try
            {
                amount = Integer.parseInt(a);
                total = amount * price;
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Please input number");
            }
        }
        main.cart("Asus",p,model,color,price,amount,total);
    }
}
