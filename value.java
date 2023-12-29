package toTheMethodByReference;

public class value {
    public static void main(String[] args) {
        int number = 10;
        number = changeVaiable(number);
        System.out.println(number);
    }
    private static int changeVaiable(int variable){
        return variable = variable * 3;
    }
}
