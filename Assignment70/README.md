# Assignment 70

## Description

This assignment focuses on applying Java Collections, HashSet, Graphs, BFS, and Topological Sorting to solve real-world problems.

## Questions Covered

### 1. Find Two Transactions Matching a Target
- Stores customer transaction values.
- Finds two transactions whose combined value matches a given target.
- Uses nested loops to check possible pairs.

### 2. Longest Consecutive Employee ID Sequence
- Stores employee IDs.
- Finds the longest sequence of consecutive numbers.
- Uses HashSet for efficient searching.
- Example:
  `1 2 3 4 5`
- Displays the length of the longest sequence.

### 3. Group Employees Department-Wise
- Stores employee names along with their departments.
- Groups employees according to their department.
- Displays employees under:
  - IT
  - HR
  - Finance

### 4. Software Dependency Resolver
- Represents dependencies between software modules.
- Determines a valid order in which modules should be initialized.
- Uses Topological Sorting.
- Example:
  `Database → Backend → API → Frontend`

### 5. Social Network Shortest Connection
- Represents friendships between users.
- Finds the minimum number of connections between two users.
- Uses Breadth First Search (BFS).
- Example:
  `Amit → Rahul → Neha → Riya`
- Minimum number of connections: `3`.

## Concepts Used

- Java
- HashMap
- HashSet
- ArrayList
- Queue
- Graph
- Breadth First Search (BFS)
- Topological Sorting
- Comparator
- Searching
- Frequency and Sequence Processing

## Expected Learning

- Understand HashSet and HashMap.
- Solve consecutive sequence problems.
- Group data using Maps.
- Understand graph representation.
- Implement BFS for shortest paths.
- Understand Topological Sorting for dependency resolution.
- Apply data structures to real-world scenarios.
