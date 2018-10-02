/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevitaround1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author vishalsingh
 */
public class AddUp 
{
    
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       String num = EnglishNumberToWords.convert(1000);
       System.out.println(num);
       String str[] = sc.nextLine().split(" ");
       
       int N = Integer.valueOf(str[0]);
       int M = Integer.valueOf(str[1]);
       //System.out.println(N + " " + M);
       int temp = 0; 
       
        
        int flag = 0;
        int N1 = 0, M1 = 0;
        while (N != M)
       { //160 192
           if (N > M)
           {
               temp = N;
               N = M;
               M = temp;
           }
           N1 = N;
           M1 = M;
           
           String Nstr = EnglishNumberToWords.convert(N).replace(" ", "");
           String Mstr = EnglishNumberToWords.convert(M).replace(" ", "");
           
           //System.out.println(Nstr.compareTo(Mstr));
           
           if(Nstr.compareTo(Mstr) > 0)
           {
               temp = N1;
               N1 = M1;
               M1 = temp;
           }
           
           N = N + N1;
           M = M + M1;
           
           if (N == 99999 || M == 99999)
           {
               flag = 1;
              // break;
           }
           
        }
       if (flag == 1)
           System.out.println("Out of bounds");
       if (flag == 0)
       {
           System.out.println(N);
       }    
    }
    
    
    
    
    
    
    
}

class EnglishNumberToWords {

  private static final String[] tensNames = {
    "",
    " ten",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };

  private static final String[] numNames = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine",
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };

  EnglishNumberToWords() {}

  private static String convertLessThanOneThousand(int number) {
    String soFar;

    if (number % 100 < 20){
      soFar = numNames[number % 100];
      number /= 100;
    }
    else {
      soFar = numNames[number % 10];
      number /= 10;

      soFar = tensNames[number % 10] + soFar;
      number /= 10;
    }
    if (number == 0) return soFar;
    return numNames[number] + " hundred" + soFar;
  }


  public static String convert(long number) {
    // 0 to 999 999 999 999
    if (number == 0) { return "zero"; }

    String snumber = Long.toString(number);

    // pad with "0"
    String mask = "000000000000";
    DecimalFormat df = new DecimalFormat(mask);
    snumber = df.format(number);

    // XXXnnnnnnnnn
    int billions = Integer.parseInt(snumber.substring(0,3));
    // nnnXXXnnnnnn
    int millions  = Integer.parseInt(snumber.substring(3,6));
    // nnnnnnXXXnnn
    int hundredThousands = Integer.parseInt(snumber.substring(6,9));
    // nnnnnnnnnXXX
    int thousands = Integer.parseInt(snumber.substring(9,12));

    String tradBillions;
    switch (billions) {
    case 0:
      tradBillions = "";
      break;
    case 1 :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
      break;
    default :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
    }
    String result =  tradBillions;

    String tradMillions;
    switch (millions) {
    case 0:
      tradMillions = "";
      break;
    case 1 :
      tradMillions = convertLessThanOneThousand(millions)
         + " million ";
      break;
    default :
      tradMillions = convertLessThanOneThousand(millions)
         + " million ";
    }
    result =  result + tradMillions;

    String tradHundredThousands;
    switch (hundredThousands) {
    case 0:
      tradHundredThousands = "";
      break;
    case 1 :
      tradHundredThousands = "one thousand ";
      break;
    default :
      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
         + " thousand ";
    }
    result =  result + tradHundredThousands;

    String tradThousand;
    tradThousand = convertLessThanOneThousand(thousands);
    result =  result + tradThousand;

    // remove extra spaces!
    return result;
  }
}
