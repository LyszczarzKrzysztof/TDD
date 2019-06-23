package pierwsze;


import java.util.TreeSet;

public class PrimeFinder {


    public static TreeSet setNumbers = new TreeSet();

    public static TreeSet finder(int liczba){

        if(liczba>0) {
            int i = 1;
            do {

                if(PrimeTester.isPrime(i)){
                    setNumbers.add(i);
                }

                i++;

            } while (setNumbers.size() < liczba);

            return setNumbers;

        }else{
            return null;
        }

    }
}
