public class CodeTantra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String y=String.valueOf(x);
       // int z=0;
        for(int i=0;i<y.length();i++){
            int z=Character.getNumericValue(y.charAt(i))*Character.getNumericValue(y.charAt(i));
            System.out.print(z);
        }
    }
}