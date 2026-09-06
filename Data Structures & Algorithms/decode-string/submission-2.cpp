class Solution { 
public: 
    string decodeString(string s) { 
 
        stack<char> str; 
        stack<int> num; 
        
        int number = 0;   // added
 
        for (int i = 0; i < s.size(); i++) { 
 
            if (isdigit(s[i])) { 
                number = number * 10 + (s[i] - '0');  // changed
            } 
            
            else if (s[i] == '[') {   // added
                num.push(number);
                number = 0;
                str.push(s[i]);
            }
 
            else if (s[i] == ']') { 
 
                string ss = ""; 
 
                while (str.top() != '[') { 
                    ss += str.top(); 
                    str.pop(); 
                } 
 
                str.pop(); 
 
                reverse(ss.begin(), ss.end()); 
 
                int repeat = num.top(); 
                num.pop(); 
 
                string temp = ss; 
 
                for (int j = 1; j < repeat; j++) { 
                    ss += temp; 
                } 
 
                for (char ch : ss) { 
                    str.push(ch); 
                } 
            } 
 
            else { 
                str.push(s[i]); 
            } 
        } 
 
        string result = ""; 
 
        while (!str.empty()) { 
            result += str.top(); 
            str.pop(); 
        } 
 
        reverse(result.begin(), result.end()); 
 
        return result; 
    } 
};