/**
 * Created by Admin on 29.01.2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "4";
        String result = dot.checkYourSelf(userGuess);
    }
}
