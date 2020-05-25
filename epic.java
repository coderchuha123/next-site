import java.util.*;
class Main{
public static int gcd(int a,int b){
int c=0;
while(a!=0){
c=a;
a=b%a;
b=c;
}
return b;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x,y,z,point=0;
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
while(true){
if(point==0){
z=z-gcd(x,z);
if(z<=0){
System.out.print("0");
break;
}
point++;
}
if(point==1){
z=z-gcd(y,z);
if(z<=0){
System.out.print("1");
break;
}
point--;
}
}
}
}
📄
