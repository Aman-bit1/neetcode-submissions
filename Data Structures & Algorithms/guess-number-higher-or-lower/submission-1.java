/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int pick=(0+n)/2;
        if(guess(pick)==0) return pick;
        else if(guess(pick)==-1) {
            while(guess(pick)!=0 && pick<=n){
                pick--;
            }
            return pick;
        }
        else{
            while(guess(pick) !=0 && pick<=n){
                pick++;
            }
            return pick;
        }
    }
}