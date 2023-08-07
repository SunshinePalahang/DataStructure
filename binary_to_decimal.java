public class binary_to_decimal{    
public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int x = binary%10;  
          decimal += x*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  
public static void main(String args[]){    
System.out.println(getDecimal(2));  
System.out.println(getDecimal(1111));  
System.out.println(getDecimal(100));  
}}    
