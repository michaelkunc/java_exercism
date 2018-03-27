class NaturalNumber {

    public int testNumber;

    public NaturalNumber (int number){
        if (number < 1 ){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.testNumber = number;
    }

    private int aliquotSum(){
        int sum = 0;
        int upperLimit = this.testNumber - 1;
        for(int i = 1; i <= upperLimit; i++){
            if (this.testNumber % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    Classification getClassification() {
        if (aliquotSum() == testNumber){
            return Classification.PERFECT;
        }
        if (aliquotSum() > testNumber){
            return Classification.ABUNDANT;
        }
        else {
            return Classification.DEFICIENT;
        }

    }

    // public static void main(String[] args){
    //     int test = new NaturalNumber(6).aliquotSum();
    //     System.out.print(test);


    // }


}
