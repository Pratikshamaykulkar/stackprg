  import java.util.Scanner;
   public class Stackprg{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size = sc.nextInt();
       int choose;
        int[]a = new int[size];
       
        stack_value st = new stack_value();
        do{
        System.out.println("Enter the choice: 1 for push\n 2 for pop \n 3 for display");
        int choice =sc.nextInt();
        switch (choice){
            case 1:
              st.push(size,a);
               break;

            case 2:
            st.pop();
            break;

            case 3:
            st.display(a);
            break;
            default:
            System.out.println("Enter the valid choice");
        }
        System.out.println("to continue press 1:");
            choose= sc.nextInt();
        }while (choose==1);
        System.out.println("exit");
        
    }
}

class stack_value{

   int top = -1;
   
    void push(int size, int a[]){
        if(top==size-1){
            System.out.println("stack overflow");
        }
  
    else{
        System.out.println("Enter the stack value");
        Scanner scan =new Scanner(System.in);
      
       a [top+1]= scan.nextInt();
        top++;

    }
    }
    void pop(){
     if(top == -1){
        System.out.println("stack underflow");
     }
   else{
    top= top-1;
   }

    }
    void display(int[]a){
        if (top==-1){
            System.out.println("The stack is empty");
        }
        else{
        for(int i=0; i<top+1; i++){
            System.out.println(a[i]+" ");
        }
        }
    }
}