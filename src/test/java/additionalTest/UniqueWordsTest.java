package additionalTest;

import additional.UniqueWords;
import org.junit.Assert;
import org.junit.Test;


public class UniqueWordsTest {
    @Test
    public void isUniqueWordsTest()
    {

        Assert.assertEquals(6, UniqueWords.isUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, UniqueWords.isUniqueWords("shiva"));
        //Edge case
        Assert.assertEquals(0,UniqueWords.isUniqueWords(""));

    }
}
