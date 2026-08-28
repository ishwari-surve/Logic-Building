# Assignment 64 - Logic Building

This assignment focuses on multithreaded client-server application development in Java using Socket Programming.

The programs are designed to perform mathematical and number-related operations remotely through a client-server architecture.

## Objective

The main objective of this assignment is to:

* Understand client-server architecture in Java
* Implement socket programming using `ServerSocket` and `Socket`
* Handle multiple clients simultaneously using multithreading
* Parse and process commands received from the client
* Perform mathematical and number-related operations on the server
* Send results back to the client
* Handle invalid commands and edge cases gracefully
* Divide program logic into separate handler classes and methods

## Concepts Practiced

* Socket Programming
* Client-Server Architecture
* Multithreading
* `ServerSocket` and `Socket`
* `BufferedReader` and `PrintWriter`
* Thread Class and `run()` method
* Command Parsing using `split()`
* String Handling
* Exception Handling
* Conditional Statements
* User Defined Methods
* Logic Building

## Problems Covered

The assignment includes two client-server programs based on:

* **Q1** — Math Operations Server (ADD, SUB, MULT, DIV, MOD, MAX, MIN)
* **Q2** — Number Operations Server (EVEN, ODD, PRIME, PERFECT, FACTORIAL, REVERSE)

## Approach

Each problem is solved by building a server that:

* Runs continuously on a dedicated port
* Accepts incoming client connections
* Creates a new thread for each connected client
* Reads the command sent by the client
* Parses the command string into operation and numbers
* Performs the required operation using separate methods
* Sends the result back to the client
* Handles invalid commands and division by zero properly
* Disconnects only the current client on QUIT command

The client program:

* Connects to the server using IP address and port
* Reads commands from the user
* Sends the command to the server
* Displays the response received from the server

## Repository Structure

```
Assignment-60/
│
├── Q1_MathServer.java
├── Q1_MathClient.java
├── Q2_NumberServer.java
├── Q2_NumberClient.java
└── README.md
```

## Supported Commands

### Q1 — Math Server (Port: 1234)

| Command | Description |
|---|---|
| `ADD <No1> <No2>` | Addition of two numbers |
| `SUB <No1> <No2>` | Subtraction of two numbers |
| `MULT <No1> <No2>` | Multiplication of two numbers |
| `DIV <No1> <No2>` | Division of two numbers |
| `MOD <No1> <No2>` | Modulus of two numbers |
| `MAX <No1> <No2>` | Maximum of two numbers |
| `MIN <No1> <No2>` | Minimum of two numbers |
| `QUIT` | Disconnect current client |

### Q2 — Number Server (Port: 5678)

| Command | Description |
|---|---|
| `EVEN <number>` | Check if number is even |
| `ODD <number>` | Check if number is odd |
| `PRIME <number>` | Check if number is prime |
| `PERFECT <number>` | Check if number is perfect |
| `FACTORIAL <number>` | Find factorial of number |
| `REVERSE <number>` | Reverse the digits of number |
| `QUIT` | Disconnect current client |

## How to Run

### Step 1 — Compile

```cmd
javac Q1_MathServer.java Q1_MathClient.java
javac Q2_NumberServer.java Q2_NumberClient.java
```

### Step 2 — Run Q1

Open two terminals:

**Terminal 1 — Server:**
```cmd
java MathServer
```

**Terminal 2 — Client:**
```cmd
java MathClient
```

### Step 3 — Run Q2

Open two terminals:

**Terminal 1 — Server:**
```cmd
java NumberServer
```

**Terminal 2 — Client:**
```cmd
java NumberClient
```

>  Always start the **Server first** before running the Client!

## Learning Outcome

After completing this assignment, I improved my ability to:

* Understand and implement client-server architecture in Java
* Use `ServerSocket` and `Socket` classes for network communication
* Handle multiple clients simultaneously using multithreading
* Create and manage threads using the `Thread` class
* Read and write data through socket streams
* Parse command strings to identify operations and operands
* Perform mathematical and number-related operations on the server
* Send computed results back to the connected client
* Handle invalid commands and edge cases like division by zero
* Disconnect individual clients using the QUIT command
* Write clean and structured Java programs with separate handler classes

## Technologies Used

* Java
* Socket Programming
* Multithreading
* Visual Studio Code
* Git & GitHub

## Author

Ishwari Surve
