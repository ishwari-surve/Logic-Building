# Assignment 67 - Logic Building

This assignment focuses on advanced file handling and client-server file operations in Java.

## Problems Covered

| Q | Program | Description |
|---|---|---|
| Q1 | DirectoryListing | List files and directories with sizes |
| Q2 | SearchFile | Search for a specific file in a directory |
| Q3 | FileAnalysis | Analyze file content for chars, words, lines |
| Q4 | FileExists Server/Client | Check if file exists on server |
| Q5 | FileInfo Server/Client | Get file information from server |

## Repository Structure

```
Assignment-63/
├── Q1_DirectoryListing.java
├── Q2_SearchFile.java
├── Q3_FileAnalysis.java
├── Q4_FileExistsServer.java
├── Q4_FileExistsClient.java
├── Q5_FileInfoServer.java
├── Q5_FileInfoClient.java
└── README.md
```

## How to Run

### Q1, Q2, Q3 — Standalone
```cmd
javac Q1_DirectoryListing.java  →  java Q1_DirectoryListing
javac Q2_SearchFile.java        →  java Q2_SearchFile
javac Q3_FileAnalysis.java      →  java Q3_FileAnalysis
```

### Q4 — File Exists (Port: 7070)
```cmd
Terminal 1: java Q4_FileExistsServer
Terminal 2: java Q4_FileExistsClient
```

### Q5 — File Info (Port: 6060)
```cmd
Terminal 1: java Q5_FileInfoServer
Terminal 2: java Q5_FileInfoClient
```

> Start Server before Client. Create `ServerData` folder with test files before running Q4 and Q5.

## Technologies Used
* Java · File Handling · Socket Programming · Multithreading · Git & GitHub

## Author
Ishwari Surve — Logic Building, Marvellous Infosystems
