public class calculator {
    public static void main(String[] args) {
        int num1=18;
        int num2=5;
        int ans,rem;
        
        System.out.println("Sum:"+(num1+num2));
        System.out.println("Subtraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        
        ans=num1/num2;
        rem=num1-(num2*ans);
        
        System.out.println(ans);
        System.out.println(rem);
       	
        
        
    }
}
