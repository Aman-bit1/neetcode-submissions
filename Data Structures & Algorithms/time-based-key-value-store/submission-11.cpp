// class TimeMap {
// public:
//     TimeMap() {
        
//     }
//     struct data{
//         string key;
//         string value;
//         int timestamp;
//     };
//      vector<data>ans;
//     void set(string key, string value, int timestamp) {
        
//     ans.push_back({key,value,timestamp});
        
//     }
    
//     string get(string key, int timestamp) {
//         int maxl=INT_MIN;
//         if(ans.empty()) return "";
//         for(int i=0;i<ans.size();i++){
//             if(ans[i].key==key &&  ans[i].timestamp<=timestamp ){
//                 maxl=max(maxl,ans[i].timestamp);
               
                
//             }
          

//         }
        
//         for(int i=0;i<ans.size();i++){
//             if(ans[i].timestamp==maxl && ans[i].key==key) return ans[i].value;
//         }
        
//        return "";
//     }
// };




// chatgpt method
class TimeMap {
public:

    unordered_map<string, vector<pair<int, string>>> mp;

    TimeMap() {
        
    }
    
    void set(string key, string value, int timestamp) {
        mp[key].push_back({timestamp, value});
    }
    
    string get(string key, int timestamp) {
        
        if (mp.find(key) == mp.end())
            return "";
        
        auto &v = mp[key];

        int left = 0;
        int right = v.size() - 1;
        
        string ans = "";

        while (left <= right) {
            
            int mid = left + (right - left) / 2;
            
            if (v[mid].first <= timestamp) {
                ans = v[mid].second;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
};