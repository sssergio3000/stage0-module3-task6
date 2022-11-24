package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {

        int intNumber = (int) numberToBeRounded;
//        System.out.println(numberToBeRounded);
//        System.out.println(intNumber);
//        System.out.println(numberToBeRounded-intNumber);
        if (numberToBeRounded - intNumber < 0.5) {
            System.out.println(intNumber);
        } else System.out.println(intNumber + 1);

    }

    public static void main(String[] args) {
        FloatTypeCasting ftc = new FloatTypeCasting();
        ftc.roundNumber(0.7f);
    }
}
