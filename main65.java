import java.util.ArrayList;
import java.util.List;

public class main65 {
    public static void main(String[] args) {
        List<Integer>Numbers=new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(6);

        Numbers.forEach(n->{
           if(n % 2 !=0) System.out.println(n);


        }
        );
        
    }
    
}
