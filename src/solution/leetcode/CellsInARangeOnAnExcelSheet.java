package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        CellsInARangeOnAnExcelSheet cells = new CellsInARangeOnAnExcelSheet();
        System.out.println(cells.cellsInRange("A1:C3"));
        System.out.println(cells.cellsInRange("A1:F1"));
    }
    public List<String> cellsInRange(String s) {
        List<String> output = new ArrayList<>();
        char fromChar = s.charAt(0);
        char toChar = s.charAt(3);
        int totalNumberOfChars = toChar - fromChar + 1;
        List<Character> characterList = new ArrayList<>();
        for(int i = 0; i<totalNumberOfChars; i++){
            characterList.add((char)(fromChar+i));
        }
        int fromNum = s.charAt(1)-48;
        int toNum = s.charAt(4)-48;
        int totalNumberOfNums = toNum - fromNum + 1;
        List<Integer> numberList = new ArrayList<>();
        for(int i = 0; i<totalNumberOfNums; i++){
            numberList.add(fromNum+i);
        }
        for(char i : characterList){
            for(int j : numberList){
                output.add(i+""+j);
            }
        }
        return output;
    }
}
