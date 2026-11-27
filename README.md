# Java DSA Practice

Personal workspace for practicing Data Structures & Algorithms in Java, as prep for
technical interviews. Problems are organized by topic, one folder per topic. More
topics will be added as practice progresses (e.g. strings, linked lists, trees,
stacks/queues, sliding window, binary search).

## Structure

```
Java/
├── array/             # Arrays & Strings, with the full tracker in Todos.txt
│   ├── bit-manipulation/
│   ├── brute-force/
│   ├── hash-map/
│   ├── prefix-sum/
│   ├── single-pass/
│   ├── sliding-window/
│   ├── sorting/
│   └── two-pointer/
└── ...                # more topics coming soon
```

Each topic folder contains:
- One `.java` file per problem, each with a `main` method that runs example/test cases.
- A `Todos.txt` tracker listing every problem assigned for that topic, with status
  (`[x]` done, `[~]` in progress, `[ ] `pending) and pending counts.

## Array — solved so far

When you finish a problem, add it to this table with the technique used.

| # | Problem | Technique |
|---|---------|-----------|
| 1 | Second Largest Element in an Array | Single pass, two running maxes |
| 2 | Remove Duplicates from Sorted Array | Two pointers (slow/fast) |
| 3 | Move Zeroes | Two pointers (slow/fast) |
| 4 | Check if Array Is Sorted and Rotated | Circular traversal with modulo |
| 5 | Max Consecutive Ones | Running count |
| 6 | Missing Number | Sum formula / XOR |
| 7 | Single Number | XOR |
| 8 | Find Pivot Index | Prefix/suffix sums, running-sum optimization |
| 9 | Range Sum Query - Immutable (LC 303) | Prefix sum array |
| 10 | Generate All Subarrays | Triple nested loop |
| 11 | Leaders in an Array | Right-to-left scan with running max |
| 12 | Merge Sorted Array | Two pointers, fill from the back |
| 13 | Two Sum | HashMap (value → index) |
| 14 | Majority Element | Boyer-Moore voting |
| 15 | Best Time to Buy and Sell Stock | Single pass, running min + max profit |
| 16 | Valid Palindrome | Two pointers, skip non-alphanumeric |
| 17 | Valid Anagram | HashMap character counting |
| 18 | Missing Ranges | Gap detection around a sorted array |
| 19 | Count Pairs With Duplicates | Sort and use two pointers, or count frequencies with a HashMap |
| 20 | Merge Sort | Recursively split the array, then merge the sorted halves |
| 21 | Bubble Sort | Swap adjacent out-of-order elements and stop after a pass with no swaps |
| 22 | Selection Sort | Find the largest remaining element and swap it into the last open position |

See [array/Todos.txt](array/Todos.txt) for the complete problem list (must-do, extra,
and bonus), with live progress tracking.

## Running a file

Each problem is a standalone class with its own `main`:

```bash
cd array/two-pointer
javac MoveZeroes.java
java MoveZeroes
```
