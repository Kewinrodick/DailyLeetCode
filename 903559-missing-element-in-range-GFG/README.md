# [Missing Element in Range](https://www.geeksforgeeks.org/problems/missing-element-in-range/1)
## Medium
Given an array arr[] of distinct integers and a range [low, high], find all the numbers within the range that are not present in the array.&nbsp;return the missing numbers in&nbsp;sorted order.
Examples:
Input: arr[] = [10, 12, 11, 15], low = 10, high = 15Output: [13, 14]Explaination:&nbsp;Numbers 13 and 14 lie in the range [10, 15] but are not present in the array.
Input: arr[] = [1, 4, 11, 51, 15], low = 50, high = 55Output: [52, 53, 54, 55]Explaination: Numbers 52, 53, 54 and 55 lie in the range but [50, 55] but are not present in the array.
Constraints:1 ≤ arr.size(), low, high ≤ 1051 ≤ arr[i] ≤ 105