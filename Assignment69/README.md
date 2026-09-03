# Assignment 69

## Description

This assignment focuses on using Java Queue, PriorityQueue, and Map data structures to solve practical real-world problems.

## Questions Covered

### 1. Browser History
- Stores the websites visited by a user.
- Maintains only the last 5 visited websites.
- Removes the oldest website when the history exceeds 5 entries.
- Uses Queue to maintain the visiting order.

### 2. Customer Support Request Queue
- Stores customer support requests.
- Requests are processed in the same order in which they arrive.
- Implements:
  - `addRequest()`
  - `processRequest()`
  - `showPendingRequests()`
- Follows FIFO (First In, First Out).

### 3. Hospital Patient Priority
- Stores patient names and severity levels.
- Patients with higher severity are treated first.
- Uses PriorityQueue to manage treatment priority.
- Creates a `Patient` class containing:
  - `String name`
  - `int severity`

### 4. Word Frequency Counter
- Counts the frequency of each word in a sentence.
- Displays each word along with its frequency.
- Finds the most frequently occurring word.

### 5. Top Frequently Purchased Products
- Stores product IDs from an e-commerce application.
- Counts the number of purchases for each product.
- Finds the top 2 most frequently purchased products.

## Concepts Used

- Java
- Queue
- LinkedList
- PriorityQueue
- HashMap
- LinkedHashMap
- ArrayList
- Comparator
- FIFO
- Frequency Counting
- Sorting

## Expected Learning

- Understand Queue and FIFO concepts.
- Work with PriorityQueue.
- Perform frequency counting using Maps.
- Sort collection elements using Comparator.
- Apply Java Collections to real-world problems.
