package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below*/
        int answer= JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Vacation",  JOptionPane.YES_NO_OPTION);
        
         System.out.println(answer);
         isWeekday=answer==0;
         

int vacation=JOptionPane.showConfirmDialog(null, "Is it a vacation?");
System.out.println(vacation);
isVacation=vacation==0;
System.out.println(isWeekday);
System.out.println(isVacation);
if((isWeekday)&&(!isVacation)) {
	JOptionPane.showMessageDialog(null, "Get up lazybones!");
	
}
else if((!isWeekday)||(isVacation)); {
	JOptionPane.showMessageDialog(null, "You can sleep in");
	
}

        /*
         * (Got this one)Print “sleep in�? if it is a vacation or a weekend. (Got this one)If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
