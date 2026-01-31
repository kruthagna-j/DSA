public class LinearSearchExample{
    public static int linearsearch(int[] num,int key){
        for(int i=0;i<num.length;i++){
            if(num[i] ==  key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] num={5,10,15,20,25,30,35,40};
        int key=20;
        int result=linearsearch(num,key);
        if(result!=-1){
            System.out.println(key +" found at " +result);
        }else{
            System.out.println(key + " not found in given array");
        }
    }
}