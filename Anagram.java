import java.io.*;

class AnagramFunc
{
    String s1;
    String s2;

    void putString1(String s1)
    {
        this.s1 = s1;
    }

    String getString1()
    {
        return(s1);
    }

    void putString2(String s2)
    {
        this.s2 = s2;
    }

    String getString2()
    {
        return(s2);
    }

    void anagram(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 == l2)
        {
            char[] c1 = new char[l1];
            char[] c2 = new char[l2];

            c1 = s1.toCharArray();
            c2 = s2.toCharArray();

            int[] a1 = new int[l1];
            int[] a2 = new int[l2];

            int count = 0;
            for(int val:c1)
            {
                if(count < l1)
                {
                    a1[count] = val;
                    count++;
                }
            }

            int count1 = 0;
            for(int val:c2)
            {
                if(count1 < l2)
                {
                    a2[count1] = val;
                    count1++;
                }
            }

            for(int i = 0; i < l1; i++)
            {
                for(int j = i+1; j < l1; j++)
                {
                    if(a1[i] > a1[j])
                    {
                        int temp = a1[i];
                        a1[i] = a1[j];
                        a1[j] = temp;
                    }
                }
            }

            for(int i = 0; i < l2; i++)
            {
                for(int j = i+1; j < l2; j++)
                {
                    if(a2[i] > a2[j])
                    {
                        int temp = a2[i];
                        a2[i] = a2[j];
                        a2[j] = temp;
                    }
                }
            }

            int c = 0;
            for(int i = 0; i < l1; i++)
            {
                if(a1[i] == a2[i])
                {
                    c+=1;
                }
            }

            if(c == l1)
            {
                System.out.println("Anagram :)");
            }

            else
            {
                System.out.println("Not an Anagram :(");
            }
        }

        else
        {
            System.out.println("Not an Anagram :(");
        }
    }
}

public class Anagram {
    public static void main(String args[]) throws IOException
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        
        AnagramFunc obj = new AnagramFunc();
        
        System.out.print("Enter String1 : ");
        obj.putString1(s.readLine());
        String s1 = obj.getString1();
        
        System.out.print("Enter String2 : ");
        obj.putString2(s.readLine());
        String s2 = obj.getString2();

        obj.anagram(s1, s2);
    }
}
