import java.util.ArrayList;

class NaturalNumber {

    public int testNumber;

    public NaturalNumber (int number){
        testNumber = number;
    }

    private int aliquotSum(int testNumber){
        int sum = 0;
        int upperLimit = testNumber - 1;
        for(int i = 1; i <= upperLimit; i++){
            if (testNumber % i == 0){
                sum += i;
                if (i != testNumber/i ){
                    sum += testNumber/i;

                }
            }
            return sum;
        }

        return sum;
    }
    Classification getClassification() {
        if (aliquotSum(testNumber) == testNumber){
            return Classification.PERFECT;
        }
        else {
            return Classification.DEFICIENT;
        }

    }


}
