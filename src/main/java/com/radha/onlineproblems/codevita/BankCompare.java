package com.radha.onlineproblems.codevita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankCompare {
    /*
    getInput()
    compareBank()
        - calculateEMI()(For Bank A)
        - calculateEMI()(For Bank B)
        - compare both return minimum interest bank character
    calculateEMI()
            - totalAmount = 0
            - for each slab
                    - EMI = apply formula =>  loanAmount * monthlyInterestRate /
                     ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))
                    - totalEMI = multiply the EMI by numberOfYears * 12
                    - add totalEMI with totalAmount
            - return totalAmount
    printOutput()
        - compareBank()
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankCompare bankCompare = new BankCompare();
        System.out.println("Enter Principal Amount");
        int principalAmount = s.nextInt();
        System.out.println("Enter No of years");
        int totalNoOfYears = s.nextInt();

        System.out.println("Enter No Of slabs for bank A");
        int noOfSlabsBankA = s.nextInt();
        System.out.println("Enter period and rate of interest");
        List<Integer> periodsOfBankA = new ArrayList<>();
        List<Double> interestRatesOfBankA = new ArrayList<>();
        bankCompare.populatePeriodsAndInterest(periodsOfBankA, interestRatesOfBankA, noOfSlabsBankA);

        System.out.println("Enter No Of slabs for bank B");
        int noOfSlabsBankB = s.nextInt();
        System.out.println("Enter period and rate of interest");
        List<Integer> periodsOfBankB = new ArrayList<>();
        List<Double> interestRatesOfBankB = new ArrayList<>();
        bankCompare.populatePeriodsAndInterest(periodsOfBankB, interestRatesOfBankB, noOfSlabsBankB);

        double totalAmountBankA = bankCompare.calculateEMI(principalAmount, periodsOfBankA, interestRatesOfBankA, noOfSlabsBankA);
        double totalAmountBankB = bankCompare.calculateEMI(principalAmount, periodsOfBankB, interestRatesOfBankB, noOfSlabsBankB);
        System.out.println("totalAmountBankA = "+ totalAmountBankA + " totalAmountBankB "+ totalAmountBankB);
        System.out.println("Bank "+bankCompare.getMinimumInterestBank(totalAmountBankA, totalAmountBankB));
    }

     char getMinimumInterestBank(double totalAmountBankA, double totalAmountBankB) {
        return totalAmountBankA < totalAmountBankB ? 'A' : 'B';
    }

     double calculateEMI(int principalAmount, List<Integer> periods,
                                List<Double> interestRates, int noOfSlabs) {
        /*
        - amountSoFar = 0
            - for each slab
                    - add getTotalEMI() with amountSoFar
            - return amountSoFar
         */
        double amountSoFar = 0;
        for(int i = 0; i < noOfSlabs; i++) {
            amountSoFar += getTotalEMI(principalAmount, interestRates.get(i) , periods.get(i));
        }
        return amountSoFar;
    }

     double getTotalEMI(int principleAmount, double interestRate, int period) {
        /*
                    - EMI = apply formula =>  loanAmount * monthlyInterestRate /
                     ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))
                    - totalEMI = multiply the EMI by numberOfYears * 12
                    - add totalEMI with amountSoFar
         */
        double numerator = principleAmount * (interestRate / 100);
        System.out.println("numerator "+numerator);
        double pow = Math.pow((1 + (interestRate/100)), period * 12);
        double denominator =  1 - (1 / (1 + pow));
        System.out.println("denominator "+denominator);
        double EMI = numerator / denominator;
        System.out.println("EMI = "+EMI);
        return EMI * period * 12;
    }

    private void populatePeriodsAndInterest(List<Integer> periods,
                                            List<Double> interestRates, int noOfSlabs) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < noOfSlabs; i++) {
            periods.add(s.nextInt());
            interestRates.add(s.nextDouble());
        }

    }
}
