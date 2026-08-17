class Solution {
public:
    string minWindow(string s, string t) {
        int n = s.size();
        int m = t.size();

        if (m > n) return "";

        unordered_map<char, int> hash;

        // Store frequency of characters required from t
        for (int i = 0; i < m; i++) {
            hash[t[i]]++;
        }

        int l = 0;
        int r = 0;
        int cnt = 0;

        int minlen = INT_MAX;
        int sidx = 0;

        while (r < n) {

            // Include s[r] in the window
            if (hash[s[r]] > 0) {
                cnt++;
            }

            hash[s[r]]--;

            // Window contains all characters of t
            while (cnt == m) {

                // Update minimum window
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    sidx = l;
                }

                // Remove s[l] from the window
                hash[s[l]]++;

                // If removing it makes the window invalid
                if (hash[s[l]] > 0) {
                    cnt--;
                }

                l++;
            }

            r++;
        }

        // No valid window found
        if (minlen == INT_MAX) {
            return "";
        }

        return s.substr(sidx, minlen);
    }
};