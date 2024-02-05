package additional;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {

    public static int isUniqueWords(String str)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");
        if(str.isEmpty())
            return 0;



        for (String word : words) {

            Integer integer = hashMap.get(word);

            if (integer == null)

                hashMap.put(word, 1);

            else {

                hashMap.put(word, integer + 1);
            }
        }
        int count = 0;
        for(int i = 0; i < hashMap.size(); i++) {
            if(hashMap.get(words[i]) == 1)
                count++;
        }
        return count;
    }
}
