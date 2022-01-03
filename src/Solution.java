import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String num = String.valueOf(n);
        String ansnum ="";

        char[] arr = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
            }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            ansnum += arr[i];

        }
        return answer = Long.parseLong(ansnum);
        }
    }