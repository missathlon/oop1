package hw7.presenter;

import hw7.model.Calculable;

public class LogCalculator implements Calculable {

    private Calculable calculable;
    private Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("First argument: " + calculable.getResult());
    }

    @Override
    public Calculable sum(double arg) {
        logger.writeLog("Term: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable difference(double arg) {
        logger.writeLog("Subtrahend: " + arg);
        return calculable.difference(arg);
    }

    @Override
    public Calculable multiplication(double arg) {
        logger.writeLog("Factor: " + arg);
        return calculable.multiplication(arg);
    }

    @Override
    public Calculable division(double arg) {
        logger.writeLog("Divider: " + arg);
        return calculable.division(arg);
    }

    @Override
    public double getResult() {
        double result = calculable.getResult();
        double roundedResult = Math.round(result * 1000.0) / 1000.0;
        logger.writeLog("Result: " + roundedResult);
        return result;
    }
}