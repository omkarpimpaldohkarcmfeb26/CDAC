import java.util.Scanner;
class electricitybill_calculator{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);

        //Accept customer details
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("ENter your consumer number");
        int consumernumber =sc.nextInt();

        System.out.println("Enter units consumed");
        int units = sc.nextInt();

        double billAmount =0;


        //calculate bill using if else statememt

        if(units<=100)
        {billAmount =units*5;
    } else if (units <=200) {
            billAmount = (100*5)+ ((units -100)*7);
        }else {
            billAmount = (100*5)+(100*7)+((units-200)*10);
        }


        //Apply ectra charge if bill amount exeed 1500 rs

        if (billAmount>1500){
            billAmount += billAmount*0.05;
        }

        //Display the bill amount
        System.out.println("Electricity Bill");
        System.out.println("Customer Name"+ name);
        System.out.println("Consumer number"+consumernumber);
        System.out.println("Total units consumed"+units);
        System.out.println("total bill"+billAmount);

        sc.close();
        }

    }