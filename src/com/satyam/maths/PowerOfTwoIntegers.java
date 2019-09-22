package com.satyam.maths;

public class PowerOfTwoIntegers {
        public int isPower(int A) {
//           for(int b=2;b<32;b++){
//               for(int a=1;a<A;a++){
//                   if(Math.pow((double)a,(double)b)==A) return 1;
//               }
//           }
//           return 0;
            if(A==1) return 1;
            int logA = (int)Math.log((double)A);
            for(int a=2;a<A;a++){
                int b = (int) (logA/(int)Math.log((double)a));
                if(Math.pow(a,b)==A) return 1;
            }
            return 0;
        }
}
