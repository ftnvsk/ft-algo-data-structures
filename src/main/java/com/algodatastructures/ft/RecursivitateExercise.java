package com.algodatastructures.ft;

public class RecursivitateExercise {

    /*
     * Cea ce facem este luam un String, si analizam fiecare litera din ambele captele daca sunt la fel,
     * si daca da, atunci continuam cu urmatorele litere care acuma ele sunt capetele
     *
     * La fiecare parcurgere a metodei, problema este redusa verificand doua caractere (capetele șirului),
     * dar timpul de executie creste linear cu cat mai lung este cuvantul (adica sir la noi ca 'convertim'
     * String-ul in sir)
     *
     *
     * UPDATE:
     *         O(n) complexity: Ne arata faptul ca timpul necesar ca sa se execute metoda creste direct
     *                          proportional cu marimea la 'n'
     *
     */

    public static void main(String[] args) {
        String strToCheck = "calabalac";
        System.out.println("Oare cuvantul '" + strToCheck + "' este palindrom?");
        System.out.println(isPalindrome(strToCheck));
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

}
