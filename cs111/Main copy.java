public class TwoSmallest {

    public static void main(String[] args) {

        System.out.print("Enter your terminating value: ");
        double terminator = IO.readDouble();

        double lowestValue;
        double secondLowestValue;

        System.out.println("Enter your numbers: ");

        lowestValue = IO.readDouble();

        while (lowestValue == terminator) {
            IO.reportBadInput();
            lowestValue = IO.readDouble();
        }
        secondLowestValue = IO.readDouble();
        while (secondLowestValue == terminator) {
            IO.reportBadInput();
            secondLowestValue = IO.readDouble();
        }

        double input;
        double swapL;
        double swapH;


        do {

            if (secondLowestValue < lowestValue) {
                swapL = lowestValue;
                swapH = secondLowestValue;
                secondLowestValue = swapL;
                lowestValue = swapH;
            }

            input = IO.readDouble();

            if (input <= lowestValue) {
                swapL = lowestValue;
                secondLowestValue = swapL;
                lowestValue = input;
            }

            if ((input <= secondLowestValue) && (input > lowestValue)) {
                secondLowestValue = input;
            }


        } while (input != terminator);

        IO.outputDoubleAnswer(lowestValue);
        IO.outputDoubleAnswer(secondLowestValue);
    }
}
