# Assignment 65 - Logic Building

This assignment focuses on client-server application development and file handling in Java using Socket Programming, Multithreading, and the File class.

The programs are designed to perform string operations, retrieve server information, and handle file creation through client-server architecture and standalone programs.

## Objective

The main objective of this assignment is to:

* Understand and implement client-server architecture in Java
* Perform string operations remotely using socket programming
* Retrieve server information using built-in Java classes
* Handle multiple clients simultaneously using multithreading
* Parse and process commands received from the client
* Send results back to the client
* Create files on the local machine using the File class
* Handle invalid commands and edge cases gracefully
* Divide program logic into separate handler methods

## Concepts Practiced

* Socket Programming
* Client-Server Architecture
* Multithreading
* `ServerSocket` and `Socket`
* `BufferedReader` and `PrintWriter`
* Thread Class and `run()` method
* Command Parsing using `split()`
* String Operations
* `LocalDate` and `LocalTime`
* `DateTimeFormatter`
* `InetAddress`
* File Handling
* `File` Class
* `createNewFile()` method
* Exception Handling
* Conditional Statements
* User Defined Methods
* Logic Building

## Problems Covered

The assignment includes three programs:

* **Q1** — String Operations Server (LENGTH, UPPER, LOWER, REVERSE, PALINDROME, VOWELS)
* **Q2** — Server Info Application (DATE, TIME, SERVERNAME, HELP, QUIT)
* **Q3** — File Creation Program using Java File class

## Approach

### Q1 — String Operations Server
The server handles string operations by:
* Running continuously on port 9090
* Accepting incoming client connections
* Creating a new thread for each connected client
* Reading the command sent by the client
* Splitting the command into operation and string using `split(" ", 2)`
* Performing the required string operation using separate methods
* Sending the result back to the client
* Handling invalid commands properly

### Q2 — Server Info Application
The server handles info commands by:
* Running continuously on port 8080
* Accepting incoming client connections
* Creating a new thread for each connected client
* Using `LocalDate` and `LocalTime` for date and time
* Using `InetAddress` to get server name
* Displaying all supported commands on HELP
* Disconnecting only the current client on QUIT without stopping the server

### Q3 — File Creation Program
The standalone program handles file creation by:
* Accepting a filename from the user
* Creating a `File` object using the filename
* Displaying the file name and absolute path
* Checking if the file already exists using `exists()`
* Creating the file using `createNewFile()` if it does not exist
* Displaying appropriate success or failure message

## Repository Structure

```
Assignment-65/
│
├── Q1_StringServer.java
├── Q1_StringClient.java
├── Q2_InfoServer.java
├── Q2_InfoClient.java
├── Q3_CreateFile.java
└── README.md
```

## Supported Commands

### Q1 — String Server (Port: 9090)

| Command | Description |
|---|---|
| `LENGTH <string>` | Returns length of the string |
| `UPPER <string>` | Converts string to uppercase |
| `LOWER <string>` | Converts string to lowercase |
| `REVERSE <string>` | Reverses the string |
| `PALINDROME <string>` | Checks if string is palindrome |
| `VOWELS <string>` | Counts vowels in the string |
| `QUIT` | Disconnect current client |

### Q2 — Info Server (Port: 8080)

| Command | Description |
|---|---|
| `DATE` | Returns current date |
| `TIME` | Returns current time |
| `SERVERNAME` | Returns server hostname |
| `HELP` | Displays all available commands |
| `QUIT` | Disconnect current client |

## How to Run

### Q1 — String Operations Server

**Step 1 — Compile:**
```cmd
javac Q1_StringServer.java Q1_StringClient.java
```

**Step 2 — Terminal 1 (Server):**
```cmd
java Q1_StringServer
```

**Step 3 — Terminal 2 (Client):**
```cmd
java Q1_StringClient
```

---

### Q2 — Server Info Application

**Step 1 — Compile:**
```cmd
javac Q2_InfoServer.java Q2_InfoClient.java
```

**Step 2 — Terminal 1 (Server):**
```cmd
java Q2_InfoServer
```

**Step 3 — Terminal 2 (Client):**
```cmd
java Q2_InfoClient
```

---

### Q3 — File Creation Program

**Step 1 — Compile:**
```cmd
javac Q3_CreateFile.java
```

**Step 2 — Run:**
```cmd
java Q3_CreateFile
```

> For Q1 and Q2 always start the **Server first** before running the Client!

## Sample Output

### Q1
```
Enter command : REVERSE Marvellous
Server : suollevraM

Enter command : VOWELS Marvellous
Server : Number of vowels : 4

Enter command : PALINDROME madam
Server : madam is Palindrome
```

### Q2
```
Enter command : DATE
Server : 27-08-2026

Enter command : TIME
Server : 14:35:22

Enter command : HELP
Available Commands:
DATE
TIME
SERVERNAME
HELP
QUIT
```

### Q3
```
Enter file name :
Demo.txt

File Name      : Demo.txt
Absolute Path  : C:\Users\Ishwari Surve\Demo.txt
Demo.txt created successfully
```

## Learning Outcome

After completing this assignment, I improved my ability to:

* Understand and implement client-server architecture in Java
* Use `ServerSocket` and `Socket` classes for network communication
* Handle multiple clients simultaneously using multithreading
* Perform string operations remotely on the server side
* Use `LocalDate` and `LocalTime` to get current date and time
* Format date and time using `DateTimeFormatter`
* Retrieve server hostname using `InetAddress`
* Display all supported commands using HELP command
* Disconnect individual clients using QUIT without stopping the server
* Create files on the local machine using the Java `File` class
* Check file existence using `exists()` method
* Create new files using `createNewFile()` method
* Display file name and absolute path
* Handle exceptions using try-catch blocks
* Write clean and structured Java programs with separate handler methods

## Technologies Used

* Java
* Socket Programming
* Multithreading
* File Handling
* Visual Studio Code
* Git & GitHub

## Author

Ishwari Surve
