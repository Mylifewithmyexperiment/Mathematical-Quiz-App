package ca.blogspot.sjatyourservice.mathematicalquiz;

import java.util.Random;

public class Questions
{
    Random r= new Random();

    int r1=r.nextInt(9)+1;
    int r2=r.nextInt(7)+1;

    public String mQuestion[]=
           {
                    "What is the sum of two number "+ r1 +" and "+r2+" ?" ,
                    "What is the product of two number "+ r1 +" and "+r2+" ?" ,
                    "What is the difference between two number "+ r1 +" and "+r2+" ?"
           };


    int sum =r1+r2;
    String ans_sum=Integer.toString(sum);
    int sum0=sum+2;
    int sum1=sum-1;
    int sum2=sum+5;


    int pdt= r1*r2;
    String ans_pdt= Integer.toString(pdt);
    int pdt0= pdt+1;
    int pdt1=pdt-1;
    int pdt2=pdt+2;

    int sub= r1-r2;
    String ans_sub=Integer.toString(sub);
    int sub0=sub-1;
    int sub1=sub+1;
    int sub2=sub+3;


    private String mChoice[][]=
            {
            {""+sum0,    ans_sum,       ""+sum1,    ""+sum2},
            {ans_pdt,    ""+pdt0,       ""+pdt1,    ""+pdt2},
            {""+sub0,    ""+sub1,       ans_sub,    ""+sub2}
            };


    private  String mCorrectAnswer[]=
     {
            ans_sum,ans_pdt,ans_sub
     };

    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }


    public String getQuestion(int a)
    {
        String question = mQuestion[a];
        return question;
    }

    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;
    }


}



