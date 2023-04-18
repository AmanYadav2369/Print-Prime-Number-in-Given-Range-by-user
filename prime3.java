/* wajp to print all prime numbers between 1 to 100.  */

import java.io.*;
class prime3
{
public static void main(String args[])
{
Console c=System.console();
int num1=Integer.parseInt(c.readLine("enter the number1 :"));
int num2=Integer.parseInt(c.readLine("enter the number2 :"));
int temp=0;
for(int i=num1; i<=num2; i++){
for(int j=2; j<=i-1; j++){
if(i%j==0){
temp=temp+1;
}
}
if(temp==0){
System.out.print(i + " ");
}else{
temp=0;
}
}

}
}