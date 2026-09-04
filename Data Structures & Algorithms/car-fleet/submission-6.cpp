class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        int n=position.size();
        vector<pair<int,double>>cars;
        for(int i=0;i<n;i++){
            double x =(double)(target-position[i])/speed[i];
            cars.push_back({position[i],x});

        }
        sort(cars.rbegin(),cars.rend());
        double prev=0;
        int cnt=0;
        for(auto it:cars){
            if(it.second>prev){
                cnt++;
                prev=it.second;
            }
        }
        return cnt;
    }
};
