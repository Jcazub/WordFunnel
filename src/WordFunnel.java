public class WordFunnel {

    public Boolean funnel(String firstWord, String secondWord) {
        String[] firstWordSplit = firstWord.split("");
        for (int i = 0; i < firstWordSplit.length; i++) {
            String testWord = "";

            for (int j = 0; j < firstWordSplit.length; j++) {
                if (i != j) {
                    testWord += firstWordSplit[j];
                }
            }

            if (testWord.equals(secondWord)) {
                return true;
            }
        }

        return false;
    }

}
