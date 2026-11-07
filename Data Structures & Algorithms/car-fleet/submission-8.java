class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       ArrayList<double[]> arr=new ArrayList<>();
       int n=position.length;
       for(int i=0;i<n;i++){
        double x= (double)(target-position[i])/speed[i];
        arr.add(new double[]{position[i],x});
       } 
       arr.sort((a,b)->Double.compare(b[0],a[0]));
       double maxtime=0;
       int fleet=0;
       for(double it[]:arr){
        double time=it[1];
        if(time>maxtime){
            fleet++;
            maxtime=time;
        }
       }
       return fleet;
    }
}
