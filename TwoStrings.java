public class TwoStrings {
    public static boolean checkArrayStrings(String[] word1, String[] word2){
        String input1 = "";
        String input2 = "";
        for (String word : word1){
            input1 += word;
        }
        for (String word : word2){
            input2 += word;
        }

        return input1.equals(input2);
    }
    public static void main(String[] args) {

    }
}
