class StockSpanner {
public:
    StockSpanner() {
        
    }
     stack<int>st;
     vector<int>ans;
    int next(int price) {
      ans.push_back(price);
      int todayprice=price;
      int n =ans.size();
  
      
        int cnt =1;
       int i=n-1;
        while(i!=0 && todayprice>=ans[i-1]){
          cnt++; 
          i--; 
        }
        
       
      return cnt;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */