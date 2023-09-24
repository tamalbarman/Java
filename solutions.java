public class solutions{
public static String decision(int a, int b){
if(a>b){
return " greater ";
}
else if(a<b){
return "Samller";
}
else{
return " Equals";
}
}
public static void main (String args[]){
int num1 =5;
int num2 =3;
String result = decision(num1, num2);
System.out.println(result);
}
}