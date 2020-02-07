package deepikamaven;
import java.util.*;
class Candies{
    int count(int n[],int u,int v){
    int count=0;
    for (int i=u+1;i<v;i++){
        if(n[i]==3){
            count=count+1;
        }
    }
    
    System.out.println("Candies in the given range:\t"+count);
    return count;
}
}
class Kitkat{
    int count(int n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==1){
            count=count+1;
        }
    }
    System.out.println("Kitkat:\t"+count);
    return count;
}
}
class Dairymilk{
int count(int n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==2){
            count=count+1;
        }
    }
    System.out.println("Dairymilk:\t"+count);
    return count;
}
 
}  

class Munch{
    int count(int n[],int t){
    int count=0;
    for (int i=0;i<t;i++){
        if(n[i]==4){
            count=count+1;
        }
    }
    System.out.println("Munch:\t"+count);
    return count;
}
}  

class Sweets{
    int count=0;
}

class Main{
public static void main(String []args){
    Kitkat k=new Kitkat();
    Dairymilk d=new Dairymilk();
    Munch m=new Munch();
    Candies c=new Candies();
    Sweets s=new Sweets();
    System.out.println("Enter number of gifts(Chocolates/Sweets/Candies):");
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    int a[]=new int[num];
    System.out.println("Enter choice:\n1.Kitkat\n2.Dairymilk\n3.Candy\n4.Munch\n5.Cova");
    for(int i=0;i<num;i++){
        
         a[i]=obj.nextInt();
         if(a[i]>5 || a[i]<1)
         {
             System.out.printf("wrong option\n");
             break;
         }
    }
    System.out.println("Total weight:"+num);
    int k1=k.count(a,num);
    int d1=d.count(a,num);
    int m1=m.count(a,num);
    System.out.println("Sorting Chocolates in Ascending Order based on number of Chocolates of same type");
    
    
    if (k1<=d1 && k1<=m1)  {
        
        k.count(a,num);
        if(m1<=d1){
            m.count(a,num);
            
            d.count(a,num);
        }
        else if(d1<=m1){
            d.count(a,num);
            
            m.count(a,num);
        }
        
    }
        
    else if(d1<=k1 && d1<=m1){
        d.count(a,num);
        if(k1<=m1)
        {
            k.count(a,num);
            
            m.count(a,num);
        }
        else if(m1<=k1)
        {
            m.count(a,num);
            k.count(a,num);
        }
    }
    else{
        m.count(a,num);
        if(k1<=d1){
            k.count(a,num);
            d.count(a,num);
        }
        else if(d1<=k1){
            d.count(a,num);
            k.count(a,num);
        }
        
        
    }
    System.out.println("Enter the lower limit of range:");
    Scanner obj1=new Scanner(System.in);
    int num1=obj1.nextInt();

    System.out.println("Enter the upper limit of range:");
    Scanner obj2=new Scanner(System.in);
    int num2=obj2.nextInt();
    
    int c1=c.count(a,num1,num2);
    
}
    
}


