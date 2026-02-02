package DAY_2;

public class continue_statement {
    public static void main(String[] args){
        // continue Statement definition: A continue statement is used to skip the current iteration of a loop and move to the next iteration when a certain condition is met.
        // continue statement syntax
        // continue;

        for(int i=0;i<=10;i++){
            if(i==3) continue;
            System.out.println(i);
        }
    }
    
}
