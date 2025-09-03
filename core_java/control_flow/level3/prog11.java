/*Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division): 
 * yo = Y- (14 - 12
x = yo + yo/4 - yo/100 + yo/400
mo = m + 12 x ((14 — m)/ 12) —2
do = (d + x + 31mo / 12) mod 7
*/
package control_flow.level3;

public class prog11 {
    
    public static void main(String[] args) {
        int m = 3; // Example month (March)
        int d = 14; // Example day
        int y = 2023; // Example year

        // Adjust month and year for January and February
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int doo = (d + x + (31 * mo) / 12) % 7;

        System.out.println("The day of the week is: " + doo);
    }
}
