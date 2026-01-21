import java.util.*;


class product{
    int pcode;
    String name;
    int price;

}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        product[] ps=new product[3];

        for (int i=0;i<3;i++){
            ps[i]=new product();
            System.out.println("enter code:");
            ps[i].pcode=sc.nextInt();
            System.out.println("enter name:");
            ps[i].name=sc.next();
            System.out.println("enter price:");
            ps[i].price=sc.nextInt(); 
            System.out.println("price ="+ps[i].price);
        }

        int min=1000000;

        for (int i=0;i<3;i++){
            if(ps[i].price<min){
                min=i;
            }
        }

        System.out.println("lowest:");
        System.out.println("name:"+ps[min].name);
        System.out.println("code:"+ps[min].pcode);
        System.out.println("price:"+ps[min].price);



       

    }

}
  