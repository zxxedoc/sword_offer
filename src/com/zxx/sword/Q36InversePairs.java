package com.zxx.sword;

public class Q36InversePairs {
    public  int InversePairs(int [] array) {
        if(array.length==0)
            return 0;
        int len=array.length;
        int a[]=new int[len];
        for(int i=0;i<len;i++)
            a[i]=array[i];
        int count=InversePairsCore(array,a,0,len-1);
        return count;

    }

    public int InversePairsCore(int [] array,int []a,int start,int end) {
        if(start==end)
        {
            a[start]=array[start];
            return 0;
        }
        int len=(end-start)/2;
        int left=InversePairsCore(a,array,start,start+len)%1000000007;
        int right=InversePairsCore(a,array,start+len+1,end)%1000000007;
        int i=start+len;
        int j=end;
        int index=end;
        int count=0;
        while(i>=start&&j>=(start+len+1))
        {
            if(array[i]>array[j])
            {
                a[index--]=array[i--];
                if(count>=1000000007)
                    count=count%1000000007;
                count=count+j-start-len;
            }
            else
                a[index--]=array[j--];
        }
        for(;i>=start;i--)
            a[index--]=array[i];
        for(;j>=start+len+1;--j)
            a[index--]=array[j];
        count=(count+left+right)%1000000007;
        return count;
    }

}
