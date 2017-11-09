# [TEST-DOME](https://www.testdome.com/)
> Onlie Coding TEST for Developer

---
### [Level 0. Example]()
##### Question
Example. Copy to Paste

---
### [Level 1. Palindrome](https://www.testdome.com/for-developers/solve-question/7283)
##### Question
A palindrome is a word that reads the same backward or forward.
Write a function that checks if a given word is a palindrome. Character case should be ignored.
For example, isPalindrome("Deleveled") should return true as character case should be ignored,
resulting in "deleveled", which is a palindrome since it reads the same backward and forward.

---
### [Level 2. User Input](https://www.testdome.com/for-developers/solve-question/11995)
##### Question
User interface contains two types of user input controls: TextInput,
which accepts all characters and NumericInput, which accepts only digits.

Implement the class TextInput that contains:
- Public method void add(char c) - adds the given character to the current value
- Public method String getValue() - returns the current value

Implement the class NumericInput that:
- Inherits from TextInput
- Overrides the add method so that each non-numeric character is ignored

For example, the following code should output "10":
```JAVA
TextInput input = new NumericInput();
input.add('1');
input.add('a');
input.add('0');
System.out.println(input.getValue());
```
---
### [Level 3. Binary Search Tree](https://www.testdome.com/for-developers/solve-question/11921)
##### Question
Binary search tree (BST) is a binary tree where the value of each node is larger or equal
to the values in all the nodes in that node's left subtree and is smaller than the values in all
the nodes in that node's right subtree.
Write a function that checks if a given binary search tree contains a given value.

For example, for the following tree:
- n1 (Value: 1, Left: null, Right: null)
- n2 (Value: 2, Left: n1, Right: n3)
- n3 (Value: 3, Left: null, Right: null)

Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.
---
### [Level 4. Two Sum](https://www.testdome.com/for-developers/solve-question/10284?visibility=1&skillId=4&orderBy=ForDevelopers)
##### Question
Write a function that, given a list and a target sum, returns zero-based indices of
any two distinct elements whose sum is equal to the target sum. If there are no such elements,
the function should return null.

For example, findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12)
should return a single dimensional array with two elements
and contain any of the following pairs of indices:

- 1 and 4 (3 + 9 = 12)
- 2 and 3 (5 + 7 = 12)
- 3 and 2 (7 + 5 = 12)
- 4 and 1 (9 + 3 = 12)
---
### [Level 5. SortedSearch](https://www.testdome.com/for-developers/solve-question/11890)
##### Question
Implement function countNumbers that accepts a sorted array of integers and counts
the number of array elements that are less than the parameter lessThan.

For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4)
should return 2 because there are two array elements less than 4.