import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        int sum = getStream(input).sum();
        return sum * sum;
    }
    
    int computeSumOfSquaresTo(int input) {
        return getStream(input)
                .map(i -> (int)Math.pow(i, 2))
                .sum();
    }

    IntStream getStream(int n){
        return IntStream.rangeClosed(1, n);

    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
