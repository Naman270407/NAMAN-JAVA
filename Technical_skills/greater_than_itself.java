// Given an array count number of elements having at least one element greater than itself.

// Observation -
// for every max element there wont be any element itself.

// pseudo code -
// 1)- Iterate and find the max element from the array.
// 2)- Iterate and get the number of element that are not equal to max.
// 3)- Increment the count.



package Technical_skills;

public class greater_than_itself {
    public static void main(String[] args) {
        int arr[] = {2,5,6,-1,0,9,8,9};

        int count = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != max){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
