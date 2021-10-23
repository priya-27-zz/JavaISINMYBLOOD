package codee;

public class Friday {


    //Encode the string to smallest String

    //aaabbccccdde - a3b2c4d2e

    public static void main(String[] args) {
        String str = "abcd";
        int ctr=1;
        int n= str.length();


        StringBuilder zippedString = new StringBuilder();
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                ctr++;
            }else{

                zippedString.append(str.charAt(i));
                if(ctr>1)
                    zippedString.append(String.valueOf(ctr));
                ctr=1;
            }
        }
        zippedString.append(str.charAt(n-1));
        if(ctr>1)
        {
            zippedString.append(String.valueOf(ctr));
        }


        System.out.println(zippedString.toString());
    }



}
