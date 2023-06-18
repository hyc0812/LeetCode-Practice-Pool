<h1 align="center">Welcome to LeetCode-Practice-Pool 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-V1.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://github.com/hyc0812/LeetCode-Practice-Pool/blob/master/LICENSE" target="_blank">
    <img alt="License: Apache 2.0" src="https://img.shields.io/badge/License-Apache 2.0-yellow.svg" />
  </a>
  <a href="https://twitter.com/yongchanghe" target="_blank">
    <img alt="Twitter: yongchanghe" src="https://img.shields.io/twitter/follow/yongchanghe.svg?style=social" />
  </a>
</p>

> Practice history for LeeCode

## Author

👤 **Yongchang He**

* Website: https://dev.to/yongchanghe
* Twitter: [@yongchanghe](https://twitter.com/yongchanghe)
* Github: [@hyc0812](https://github.com/hyc0812)
* LinkedIn: [@yongchanghe](https://www.linkedin.com/in/yongchang-he-935405135/)

## Show your support

Give a ⭐️ if this project helped you!

## 📝 License

Copyright © 2022 [Yongchang He](https://github.com/hyc0812).<br />
This project is [Apache 2.0](https://github.com/hyc0812/LeetCode-Practice-Pool/blob/master/LICENSE) licensed.

[Problem 2](https://leetcode.com/problems/add-two-numbers/description/?envType=featured-list&envId=top-interview-questions) Solution:


```
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}
```

[Problem 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=featured-list&envId=top-interview-questions) Solution: 

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        HashSet<Character> hash_set = new HashSet();

        while (b_pointer < s.length()) {
            if (!hash_set.contains(s.charAt(b_pointer))) {
                hash_set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hash_set.size(), max);
            } else {
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}

```


