package setsTest;
import sets.removeDuplicateChar;
import org.junit.Test;
public class removeDuplicateCharTest {

    @Test
    public void testRemoveDuplicateString(){
        String string1="hello world";
        String result1=removeDuplicateChar.removeDuplicates(string1);
        String expected1="helowrd";
        expected1.equals(result1);
    }

    @Test
    public void testRemoveDuplicateemptystring(){
        String string2="";
        String result2=removeDuplicateChar.removeDuplicates(string2);
        String expected2="";
        expected2.equals(result2);
    }

    @Test
    public void testRemoveDuplicateCasestring(){
        String string3="helLo wOrld";
        String result3=removeDuplicateChar.removeDuplicates(string3);
        String expected3="helLowOrd";
        expected3.equals(result3);
    }
}