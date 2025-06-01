# Search Algorithms and their Statistical Analysis

- Linear Search

- Binary Search

- Interpolation Search

- Quadratic Binary Search

## Linear Search

The most basic form of a search Algorithm. I used a while loop for this, but every loop is possible.

- Best Case Scenario: *O(1)*
- Avegrage Case Scenario: *O(n)*
- Worst Case Scenario: *O(n)*

## Binary Search

Binary Search is an efficient algorithm for searching in **sorted arrays**.  
It works by repeatedly dividing the search interval in half and checking whether the target value lies to the left or right. This halving of the search space each step leads to a logarithmic runtime.

- Best Case Scenario: *O(1)*  
- Average Case Scenario: *O(log n)* 
- Worst Case Scenario: *O(log n)* 

## Interpolation Search

Interpolation Search is an improved variant of binary search that works especially well on **uniformly distributed, sorted arrays**.  
Instead of always searching the middle, it estimates the likely position of the target value based on its value relative to the current bounds. This can lead to faster searches when the data distribution is favorable.

- Best Case Scenario: *O(1)*  
- Average Case Scenario: *O(log log n)*  
- Worst Case Scenario: *O(n)*  
  

## Quadratic Binary Search

The Quadratic Binary Search firstly Calculates the **t** Value (the same as in the Interpolation Search) and then from this
**t** Value it Searches the right field with Square(**n**) steps, **n** being the size of the list/array - 1,
so the last index basically

- Best Case Scenario: *O(1)*
- Avegrage Case Scenario: *O(log log n)*
- Worst Case Scenario: *O(sqrt(n))*
