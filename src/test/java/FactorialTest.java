import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mac on 2017-03-14.
 */
public class FactorialTest {

    @Test
    public void t001PodstawowaImplementacjaPowinnaPoprawnieLiczycSilnie(){
        //given
        final Factorial factorial=new Factorial();
        final int expectedfactorial =10;
        //when
        int expected= Factorial.calculateFactorial(expectedfactorial);
        //then
        Assert.assertEquals("3628800",expected);
    }

    /*
     * test warunku brzegowego - liczby ujemne
     *
     * pierwsze zdanie - uzupełnić algorytm w klasie SzybkiKalkulatorSilni o wykrywanie czy argument
     * nie jest ujemny. Jeśli jest - należy zwrócić wyjątek
     * Jak widać - test oczekuje że pojawi się wyjątek
     *
     */

    @Test(expected = ArithmeticException.class)
    public void t002ArgumentyUjemnePowinnyWyrzucacWyjatek(){
        //given
        final Factorial factorial=new Factorial();
        final int exceptedFactorial=-1;
        //when
        int expected=Factorial.calculateFactorial(exceptedFactorial);
        //then
        Assert.fail();
    }
//
//    /*
//     * drugie zadanie - zaimplementować metodę licz w KalkulatorzeSilnikBigDecimal
//     * tak by do jej liczenia były używane BigDecimal-e
//     */
//
//    @Test
//    public void t003KalkulatorPowinienLiczycPoprawnieDlaDuzychArgumentow(){
//        //given
//        final KalkulatorSilni kalkulatorSilni=new KalkulatorSilniBigDecimal();
//        final int silnia=50;
//        //when
//        String wynik=kalkulatorSilni.licz(silnia);
//        //then
//        //w teście sprawdzam tylko pierwsze 10 cyfr
//        Assert.assertEquals(wynik.substring(0,10), "3041409320");
//    }


}
