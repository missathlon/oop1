package hw7.view;

import hw7.model.Calculable;
import hw7.presenter.ICalculableFactory;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;
    private InputReader inputReader;
    private OutputWriter outputWriter;

    public ViewCalculator(ICalculableFactory calculableFactory, InputReader inputReader, OutputWriter outputWriter) {
        this.calculableFactory = calculableFactory;
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public void run() {
        while (true) {
            double primaryArg = inputReader.readDouble("Enter the first argument: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = inputReader.readInput("Enter the command (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    double arg = inputReader.readDouble("Enter the second argument: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double arg = inputReader.readDouble("Enter the second argument: ");
                    calculator.difference(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    double arg = inputReader.readDouble("Enter the second argument: ");
                    calculator.multiplication(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = inputReader.readDouble("Enter the second argument: ");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    double roundedResult = Math.round(result * 1000.0) / 1000.0;
                    outputWriter.writeOutput("Result: " + roundedResult);
                    break;
                }
            }
            String cmd = inputReader.readInput("New calculation (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }
}