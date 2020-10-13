import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }
        public static void part1(){
            Scanner answer = new Scanner(System.in);
            System.out.println("Welcome to Vacation Planner!");
            System.out.print("What is your name? ");
            String name = answer.nextLine();
            System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
            String place = answer.nextLine();
            System.out.println("Great! " + place + " sounds like a great trip");
        }
        public static void part2(){
            Scanner answer = new Scanner(System.in);
            System.out.print("How many days are you going to spend travelling? ");
            Integer days = answer.nextInt();
            System.out.print("How much money, in USD, are you planning to spend on your trip? ");
            Integer money = answer.nextInt();
            System.out.print("What is the three letter currency symbol for your travel destination? ");
            String curr = answer.next();
            System.out.print("How many " + curr + " are then in 1 USD? ");
            Double rate = answer.nextDouble();
            System.out.println();
            Integer hours = days * 24;
            Integer minutes = hours * 60;
            Double daily = (double) money / days;
            Double Exchange = money * rate;
            Double total = Exchange / (double)days;
            System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or "
             + minutes + " minutes");
            System.out.println("If you are going to spend $" + money + " USD that means " +
                    "per day you can spend up to $" + round(daily) + " USD");
            System.out.println("Your total budget in " + curr + " is " + round(Exchange) + " " + curr +
                    ", which per day is " + round(total) + " " + curr);
    }
        public static void part3(){
            Scanner reply = new Scanner(System.in);
            System.out.print("What is the difference, in hours, between your home and your destination? ");
            Integer time = reply.nextInt();
            System.out.println("That means when it is midnight at home it will be " + (time + 24) + ":00 in your " +
                    "travel destination and when it is noon at home it will be " +  (12+time) % 24 + ":00");
        }
        public static void part4(){
            Scanner answer = new Scanner(System.in);
            System.out.print("What is the square area of your destination country in km2? ");
            Integer area = answer.nextInt();
            Double conv = (double)(Math.pow(1.0/1.6, 2) * area);
            System.out.println("In square miles, that is " + conv);
        }
        public static double round(double x){
            x = x * 100;
            int y = (int) x;
            x = (double) y /100;
            return (x);
        }
}
