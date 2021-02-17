package fr.hexagonal.infrastructure.test;

import java.util.Arrays;

public class Solution {

    static int indexEqualsValueSearch(int [] arr){
        int val=2;
        for (int i=0; i<arr.length; i++){
            if(val==arr[i])

            return i;

        }
        System.out.println("valeur n'existe pas");
    return -1;
    }

   static int findLargest(int [] number){

   return Arrays.stream(number).max().getAsInt();
   }

    static final int NUMBER_OF_POSSIBLE_POSITIONS = 6;
    final static int[] POSSIBLE_POSITIONS = { 0, 1, -1, -4, -5, -3 };
    /**
     * Computes the position of the Kariakoo​​​​​​​‌​‌‌​​​​​​‌​​‌‌​‌​​‌‌‌​‌
     * dancer.
     */
    static int getPositionAt(int n) {
        return POSSIBLE_POSITIONS[n % NUMBER_OF_POSSIBLE_POSITIONS];
    }

    public static void main(String[] args){
        int T[]={1, 5, 2, 22, 14, 3, 18, 52, 40, 88, 73, 27};
        int pos=indexEqualsValueSearch(T);
        System.out.println(findLargest(T));
        System.out.println(pos);
        System.out.println(Solution.getPositionAt(3)); // -4
        System.out.println(Solution.getPositionAt(100000)); // -5
        System.out.println(Solution.getPositionAt(2147483647)); //

        int i=0;
        System.out.println(i++);

    }
}
