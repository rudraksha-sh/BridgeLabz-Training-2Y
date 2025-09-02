/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
 */
public class prog2 {
    public static void main(String[] arg){
    int total_no_of_subjects = 3;
    int maths = 94 ;
    int physics = 95 ;
    int chemistry = 96 ;
    int sum_of_all_marks = maths + physics + chemistry ;
    int average_marks = sum_of_all_marks / total_no_of_subjects ;
    System.out.println("Sam's average mark in PCM is "+ average_marks );
}
}
