import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int classes=sc.nextInt();
        int[] credit=new int[classes];
        for(int i=0;i<classes;i++){
            credit[i]=sc.nextInt();
        }
        int[] grade=new int[classes];
        for(int i=0;i<classes;i++){
            grade[i]=sc.nextInt();
        }
        float[] j=new float[classes];
        for(int i=0;i<classes;i++){
            if(grade[i]>=85&&grade[i]<=89){
                j[i]=3.7f;
            }
            if(grade[i]>=90&&grade[i]<=100){
                j[i]=4.0f;
            }
            if(grade[i]>=82&&grade[i]<=84){
                j[i]=3.3f;
            }
            if(grade[i]>=78&&grade[i]<=81){
                j[i]=3.0f;
            }
            if(grade[i]>=75&&grade[i]<=77){
                j[i]=2.7f;
            }
            if(grade[i]>=72&&grade[i]<=74){
                j[i]=2.3f;
            }
            if(grade[i]>=68&&grade[i]<=71){
                j[i]=2.0f;
            }
            if(grade[i]>=64&&grade[i]<=67){
                j[i]=1.5f;
            }
            if(grade[i]>=60&&grade[i]<=63){
                j[i]=1.0f;
            }
            if(grade[i]<60){
                j[i]=0.0f;
            }
        }
        System.out.println(Arrays.toString(j));
        float sum=0;
        int count=0;
        for(int i=0;i<classes;i++){
            sum=sum+j[i]*credit[i];
            count+=credit[i];
        }
        float a=count;
        System.out.printf("%.2f",sum/a);
    }
}
