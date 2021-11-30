public class Combination {
    public static void main(String[] args) {
        Combination combination = new Combination();
        combination.printCombinations(new String[] {"a", "b", "c"}, "", 0);
    }

    public void printCombinations(String[] chars, String combinationPart, int startFrom) {
        for (String character: chars) {
            String combination = combinationPart + character;
            if (startFrom < chars.length - 1) {
                printCombinations(chars, combination, startFrom + 1);
            } else {
                System.out.println(combination);
            }
        }
    }
}
