public class Main {
    public static void main(String[] args) {
       BMICalculator bmiCalculator = new BMICalculator();

       double weightInPounds = 154.0;
       double heightInInches = 70.0;
       double bmiImperial = bmiCalculator.calculateBmiImperial
                (weightInPounds, heightInInches);

       double weightInKilos = 70.0;
       double heightInMeters = 1.82;
       double bmiMetric = bmiCalculator.calculateBmiMetric
               (weightInKilos, heightInMeters);

       System.out.println("BMI in Imperial System: "+bmiImperial);
       System.out.println("BMI in Metric System: "+bmiMetric);

    }
}
