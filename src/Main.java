import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    interface SUM{
        int add(int x,int y);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for(int i=0;i<=10;i++){
            System.out.println("Hello and welcome!");
        }
        SUM a1= (x,y)->x+y;
        System.out.println(a1.add(10,20));
        List<Integer> test=new ArrayList<>();
        test.add(12);
        test.add(15);
        test.add(2);
        test.add(127);
        test.add(5);
        test.add(19);
        test.forEach(x->System.out.println(x*2));
        List<Integer> rul= test.stream()
                .map(x->x*2)
                .toList();
        System.out.println(rul);
        List<Integer> rul1= test.stream()
                .filter(x->x>100)
                .toList();
        System.out.println(rul1);
        int rul2= test.stream()
                        .reduce(0, Integer::sum);

        System.out.println(rul2);
    }





}