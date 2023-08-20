
package ex38;

public class Ex38 {

   public static String shift_S(String S, int Shift[], int n)
    {
        for (int i = n - 2; i >= 0; --i)
            Shift[i] += Shift[i + 1];
        String result = "";
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                result += (char)(((int)(S.charAt(i)) + Shift[i] - 'A') % 26 + 'A');
            }
            else if (Character.isLowerCase(S.charAt(i))) {            
                result += (char)(((int)(S.charAt(i)) + Shift[i] - 'a') % 26 + 'a');
            }
            else {            
                result += (char)(((int)(S.charAt(i)) + Shift[i] - '0') % 10 + '0');
            }
        }
        return result;
    }
    public static void main(String[] args) {
  String S = "abc";
        int Shift[] = { 2, 5, 9 };
        int n = Shift.length;
        System.out.println("input is   "+S);
        System.out.println("output of shift is   "+shift_S(S, Shift, n));
    }
    
}
