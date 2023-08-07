import java.util.*;   
   
public class bal_parenthesis {   
@SuppressWarnings({ "rawtypes", "unchecked" })   
    public static boolean balancedParenthesis(String input) {   
        Stack x = new Stack();  
        char[] charArray = input.toCharArray();   
          
 
        for (int i = 0; i < charArray.length; i++) {   
            char user = charArray[i];   
      
            if (user == '(' || user == '{' || user == '(') {   
                x.push(user);   
                continue;   
            }     
            if (x.isEmpty()) {    
                return false;   
            }   
                
            char popChar;   
            switch (user) {   
                case ')':   
                popChar = (char) x.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) x.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) x.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (x.isEmpty());   
    }   
    public static void main(String[] args) {   
          
        String inputStr;     
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("Enter your string:");    
        inputStr = sc.nextLine();   
          
        if (balancedParenthesis(inputStr))   
            System.out.println("String "+inputStr+" is BALANCED.");   
        else   
            System.out.println("String "+inputStr+" is NOT BALANCED.");
            
        sc.close();
    }   
}  