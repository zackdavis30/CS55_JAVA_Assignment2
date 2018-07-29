import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
    
        final double taxRate1 = 0.10;
        final double taxRate2 = 0.15;
        final double taxRate3 = 0.25;
        final double taxRate4 = 0.28;
        final double taxRate5 = 0.33;
        final double taxRate6 = 0.35;
        
        double tax = 0;
        
        // Enter income 
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter you income: ");
        double income = in.nextDouble();
        
        // Enter status 
        System.out.print("Please enter your status:\n \'0\' Single,\n \'1\' Married filing jointly,\n \'2\' Married filing separately,\n \'3\' Head of household\n: ");
        String status = in.next();
        
       // Single 
       if(status.equals("0")){
           if(income<=8350){
               tax = income * taxRate1;
           } else if(income<=33950){
               tax = 8350 * taxRate1 + (income - 8350) * taxRate2;
           } else if(income<=82250){
              tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (income - 33950) * taxRate3; 
           }else if(income<=171550){
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (82250 - 33950) * taxRate3 + (income - 82250) * taxRate4;
           }else if(income<=372950){
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (82250 - 33950) * taxRate3 + (171550 - 82250) * taxRate4 + (income - 171550) * taxRate5;
           }else {
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (82250 - 33950) * taxRate3 + (171550 - 82250) * taxRate4 + (372950 - 171550) * taxRate5 + (income - 372950) * taxRate6;
           }
       //Married filing jointly
       } else if(status.equals("1")){
          if(income<=16700){
              tax = income * taxRate1;
          }else if(income<=67900){
              tax = 16700 * taxRate1 + (income - 16700) * taxRate2;
          }else if(income<=137050){
              tax = 16700 * taxRate1 + (67900 - 16700) * taxRate2 + (income - 67900) * taxRate3; 
          }else if(income<=208850){
              tax = 16700 * taxRate1 + (67900 - 16700) * taxRate2 + (137050 - 67900) * taxRate3 + (income - 137050) * taxRate4;
          }else if(income<=372950){
              tax = 16700 * taxRate1 + (67900 - 16700) * taxRate2 + (137050 - 67900) * taxRate3 + (208850 - 137050) * taxRate4 + (income - 208850) * taxRate5;
          }else {
              tax = 16700 * taxRate1 + (67900 - 16700) * taxRate2 + (137050 - 67900) * taxRate3 + (208850 - 137050) * taxRate4 + (208850 - 372950) * taxRate5 + (income - 372950) * taxRate6;
          }
       //Married filing separately
       } else if(status.equals("2")){
           if(income<=8350){
               tax = income * taxRate1;
           }else if(income<=33950){
               tax = 8350 * taxRate1 + (income - 8350) * taxRate2;
           }else if(income<=68525){
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (income - 33950) * taxRate3;
           }else if(income<=104425){
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (68525 - 33950) * taxRate3 + (income - 68525) * taxRate4;
           }else if(income<=186475){
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (68525 - 33950) * taxRate3 + (104425 - 68525) * taxRate4 + (income - 104425) * taxRate5;
           }else{
               tax = 8350 * taxRate1 + (33950 - 8350) * taxRate2 + (68525 - 33950) * taxRate3 + (104425 - 68525) * taxRate4 + (186475 - 104425) * taxRate5 + (income - 186475) * taxRate6;
           }
       //Head of Household   
       }else if(status.equals("3")){
           if(income<=11950){
             tax = income * taxRate1;  
           }else if(income<=45500){
             tax = 11950 * taxRate1 + (income - 11950) * taxRate2;
           }else if(income<=117450){
             tax = 11950 * taxRate1 + (45500 - 11950) * taxRate2 + (income - 45500) * taxRate3; 
           }else if(income<=190200){
             tax = 11950 * taxRate1 + (45500 - 11950) * taxRate2 + (117450 - 45500) * taxRate3 + (income - 117450) * taxRate4;  
           }else if(income<=372950){
             tax = 11950 * taxRate1 + (45500 - 11950) * taxRate2 + (117450 - 45500) * taxRate3 + (190200 - 117450) * taxRate4 + (income - 190200) * taxRate5;  
           }else{
             tax = 11950 * taxRate1 + (45500 - 11950) * taxRate2 + (117450 - 45500) * taxRate3 + (190200 - 117450) * taxRate4 + (372950 - 190200) * taxRate5 + (income - 372950) * taxRate6;    
           }
       } else{
           System.out.println("Error: invalid status");
           System.exit(1);
       } 
          
        
        //Display 
        System.out.println("You income: " + income);
        System.out.println("You filed: " + status);
        System.out.println("Your Tax is: " + (int)(tax * 100) / 100.0 );
    
    
    
    }
    
}
