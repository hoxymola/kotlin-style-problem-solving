#include <bits/stdc++.h>
using namespace std;

/**
* @author Jaeguk Cho
 */

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int n, w, l;
    long long answer = 0;
    cin >> n >> w >> l;
    vector<pair<int, int> > points(n);
    set<pair<int, int> > set;

    for (int i = 0; i < n; i++) {
        cin >> points[i].first >> points[i].second;
        set.insert({points[i].first, points[i].second});
    }

    for (int i = 0; i < n; i++) {
        int y = points[i].first;
        int x = points[i].second;

        if (
            set.find({y + w, x}) != set.end() &&
            set.find({y, x + l}) != set.end() &&
            set.find({y + w, x + l}) != set.end()
        ) {
            answer++;
        }
    }

    cout << answer << endl;

    return 0;
}
