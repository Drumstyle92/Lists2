import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Drumstyle92
 * Class that contains the heart of the program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * Class that contains creations of arrays and prints on them.
     */
    public static void main(String[] args){
        // creating a list and filled.
        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);
        // creating a list and filled.
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        // Union of arrays.
        randomNumbers.addAll(divisorsOf52);
        System.out.println("-------------------------ArraysList1-----------------------------------");
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.size());
        randomNumbers.remove(0);
        randomNumbers.remove(2);
        System.out.println("-------------------------ArraysList2-----------------------------------");
        System.out.println(randomNumbers.size());
        System.out.println(randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println("-------------------------ArraysList3------------------------------------");
        System.out.println(randomNumbers);




    }
}
