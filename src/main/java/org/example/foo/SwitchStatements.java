package org.example.foo;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class SwitchStatements {
    public static void main(String[] args) {

        String month = "MARCH";

        if (month.equals("JANUARY")) {
            System.out.println("1= " + month);
        } else if (month.equals("FEBRUARY")) {
            System.out.println("2= " + month);
        } else if (month.equals("MARCH")) {
            System.out.println("3= " + month);
        } else if (month.equals("APRIL")) {
            System.out.println("4= " + month);
        } else if (month.equals("MAY")) {
            System.out.println("5= " + month);
        } else if (month.equals("JUNE")) {
            System.out.println("6= " + month);
        } else if (month.equals("JULY")) {
            System.out.println("7= " + month);
        } else if (month.equals("AUGUST")) {
            System.out.println("8= " + month);
        } else if (month.equals("SEPTEMBER")) {
            System.out.println("9= " + month);
        } else if (month.equals("OCTOBER")) {
            System.out.println("10=: " + month);
        } else if (month.equals("NOVEMBER")) {
            System.out.println("11= " + month);
        } else if (month.equals("DECEMBER")) {
            System.out.println("12= " + month);
        } else {
            System.out.println("It is not month =");
        }

        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("1: " + month);
                // Java 11+ no need break;
            case "FEBRUARY":
                System.out.println("2: " + month);
                break;
            case "MARCH":
                System.out.println("3: " + month);
                break;
            case "APRIL":
                System.out.println("4: " + month);
                break;
            case "MAY":
                System.out.println("5: " + month);
                break;
            case "JUNE":
                System.out.println("6: " + month);
                break;
            case "JULY":
                System.out.println("7: " + month);
                break;
            case "AUGUST":
                System.out.println("8: " + month);
                break;
            case "SEPTEMBER":
                System.out.println("9: " + month);
                break;
            case "OCTOBER":
                System.out.println("10: " + month);
                break;
            case "NOVEMBER":
                System.out.println("11: " + month);
                break;
            case "DECEMBER":
                System.out.println("12: " + month);
                break;

            default:
                System.out.println("It is not month :");
        }
    }
}
