package com.zeynel_recursion_ozyinelemeli_metodlar;

public class Asinifi {
    int faktoriyelAl(int n)
    {
        int sonuc;
        if ((n == 1)||(n==0)) {
            return 1;
        }
        sonuc=faktoriyelAl(n-1)*n;
        return sonuc;
    }

}
