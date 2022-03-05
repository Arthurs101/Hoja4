public class Controlador {
    static boolean isOperand(char ca)
    {
      // we check for uppercase and lowercase alphabets.
      if(ca >= 'a' && ca <= 'z') 
       return true;
     
      else if(ca >= 'A' && ca <= 'Z')
       return true;
     
      return false;                 // if not an Operand return false;
    }

    static String convertToInfix(String postfix)
{
  StackArrayList<String> inFix = new StackArrayList<>();
 
  for (int i = 0; i < postfix.length(); i++)
  {
    char ca = postfix.charAt(i);
 
    if (isOperand(ca))
    {
    // Push operands to stack.    
    inFix.push(ca + "");
    }
 
    // Step 2: Evaluate part of the expression and push it again to stack.
    else
    {
    String op1 = inFix.pull();
    String op2 = inFix.pull();
 
    inFix.push("(" + op2 + ch + op1 + ")");
    }
  }
 
  return inFix.pull();


}
public static void main(String args[])
{
  String postfix = "ABC-*D/";
  System.out.println("The Postfix Expression is: "+ postfix);
  String result = convertToInfix(postfix);
  System.out.println("The Infix Expression is : "+result);
}
 

}

//referencia:https://java2blog.com/postfix-to-infix-java/ 