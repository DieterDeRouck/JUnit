package be.intecbrussel.param;

public class WordReverser {

    public String wordReverser(String word) {
        StringBuilder string = new StringBuilder(word);
        string.reverse();
        return string.toString();
    }

}
