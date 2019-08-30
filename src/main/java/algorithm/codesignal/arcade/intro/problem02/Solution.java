package algorithm.codesignal.arcade.intro.problem02;

public class Solution {
    int centuryFromYear(int year) {
        int division = 100;
        int century = year / division;

        if (year % division != 0) century++;
        return century;
    }
}
