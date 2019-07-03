import java.util.*;
class kr1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub="";
        if(s.length()>=1&&s.length()<=100000){
        for(int i=0;i<s.length();i++){
            String s1=s.substring(i,i+1);
            if(!sub.contains(s1))
            {
                sub+=s1;
            }
        }
        }
        System.out.print(sub.length());
    }
}
