//Made a quick and short OTP Generator in java.

import java.util.ArrayList;
import java.util.Collections;


public class OTPGenerator{

    public ctatic void main(String[] args){
        System.out.println(OTP());
    }
}

public static String OTP(){

    //create a Arraylist.
    ArrayList<Integer> list = new ArrayList<>();

    //add all the integers in the Arraylist.
    for(int i=0;i<=9;i++){
        list.add(i);
    }

    //shuffled the list.
    Collections.shuffle(list);
    int otp=0;

    //took the first 4 number from the shuffled collection and stored in a variable.
    otp=(list.get(0)*1000)+(list.get(1)*100)+(list.get(2)*10)+list.get(3)*100;

    //returned the value we got above in the OTP variable.
    return "Your OTP is: "+ Integer.toString(otp);
}