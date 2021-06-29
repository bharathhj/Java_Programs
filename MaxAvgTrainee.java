package com.company;

public class MaxAvgTrainee {
    public static void main(String args[]){
        int[] nums = {95,95,95,90,90,90,95,95,90};
        int i = 0;
        int avg = 0;
        int max = 0;
        int count = 1;
        int j = 3;
        int k = 6;
        int trainee1=0;
        int trainee2=0;
        int trainee3=0;
        while (k<nums.length){
            avg = (nums[i]+nums[j]+nums[k])/3;

            // find count of equal number of Oxygen
            if(avg==max){
                count++;
            }

            // insert each trainee avg
            if(trainee1==0){
                trainee1 = avg;
            }else if(trainee2==0){
                trainee2 = avg;
            }else {
                trainee3 = avg;
            }

            // obtain max of trainee
            max = Math.max(avg, max);
            i++;
            j++;
            k++;
        }
        if(max<70){
            System.out.println("Not Elligible");
        }
        System.out.println(max);
        System.out.println("Number of candidates having Same oxygen value is"+ " " + count);
        if(trainee1==trainee2){
            System.out.println("Trainee1"+" "+"Trainee2");
        }
        if(trainee1==trainee3){
            System.out.println("Trainee1"+" "+"Trainee3");
        }
        if(trainee2==trainee3){
            System.out.println("Trainee2"+" "+"Trainee3");
        }
    }
}
