package drills;

public class ShowMeTheNumbers {

    public String count(int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            result += i + "\n";
        }

        return result;
    }
}