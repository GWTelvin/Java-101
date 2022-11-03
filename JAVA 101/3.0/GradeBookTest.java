public class GradeBookTest 
{
    public static void main( String[] args )
    {
        GradeBook gradeBook1 = new GradeBook( "Introduction to Java Programming" );
        GradeBook gradeBook2 = new GradeBook( "Data Structures in Java" );

        System.out.printf( "gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
        System.out.printf( "gradeBook2 course name is: %s\n", gradeBook2.getCourseName() );
    }

}
