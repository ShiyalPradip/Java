class AsciiValue{
    public static void main(String args[]){
        
        char Ch = 'A';

        // Method 1
        int Ascii = Ch;
        System.out.println("The Ascii Value Of "+ Ch + " Is: " + Ascii);

        // Method 2
        int CastAscii = (int)Ch;
        System.out.print("The Ascii Value Of "+ Ch + " Is: " + CastAscii);
    }
}