# Assignment 66 - Logic Building

This assignment focuses on file handling in Java using the FileInputStream, FileOutputStream, and File classes.

The programs are designed to perform different file operations such as writing, reading, copying, retrieving file information, and listing directory contents.

## Objective

The main objective of this assignment is to:

* Understand and implement file handling in Java
* Write data to a file using FileOutputStream
* Read data from a file using FileInputStream
* Copy contents from one file to another
* Display detailed information about a file using the File class
* List all files and directories inside a given directory
* Handle file not found and invalid path errors gracefully
* Divide program logic into separate methods
* Develop logical solutions for file-based problems

## Concepts Practiced

* File Handling
* FileInputStream
* FileOutputStream
* File Class
* Byte Stream
* Reading Bytes using `read()`
* Writing Bytes using `write()`
* `getBytes()` method
* `exists()` method
* `isDirectory()` method
* `isFile()` method
* `list()` method
* `length()` method
* `canRead()` and `canWrite()` methods
* `isHidden()` method
* `lastModified()` method
* `SimpleDateFormat`
* `File.separator`
* `finally` block
* Exception Handling
* Conditional Statements
* User Defined Methods
* Logic Building

## Problems Covered

The assignment includes five programs based on:

* **Q1** — Write textual data to a file using FileOutputStream
* **Q2** — Read and display file contents using FileInputStream
* **Q3** — Copy contents from source file to destination file
* **Q4** — Display detailed information about a file
* **Q5** — List all files and directories inside a given directory

## Approach

### Q1 — Write File
The program handles file writing by:
* Accepting filename and data from the user
* Opening the file using `FileOutputStream`
* Converting the string data to bytes using `getBytes()`
* Writing bytes to the file using `write()`
* Closing the file in the `finally` block

### Q2 — Read File
The program handles file reading by:
* Accepting filename from the user
* Checking if the file exists using `exists()`
* Opening the file using `FileInputStream`
* Reading one byte at a time using `read()`
* Converting each byte to character using `(char)` cast
* Stopping when `read()` returns `-1` indicating end of file
* Closing the file in the `finally` block

### Q3 — Copy File
The program handles file copying by:
* Accepting source and destination filenames from the user
* Checking if the source file exists
* Opening source using `FileInputStream` and destination using `FileOutputStream`
* Reading one byte at a time from source and writing to destination
* Counting total bytes copied
* Closing both files in the `finally` block

### Q4 — File Information
The program handles file information by:
* Accepting filename from the user
* Checking if the file exists
* Using File class methods to retrieve name, path, size, permissions, and last modified date
* Formatting last modified date using `SimpleDateFormat`
* Displaying all information in a structured format

### Q5 — List Directory
The program handles directory listing by:
* Accepting directory path from the user
* Checking if the path exists using `exists()`
* Checking if the path is a directory using `isDirectory()`
* Retrieving all contents using `list()`
* Checking if each item is a file or directory
* Displaying contents with `[FILE]` and `[DIR]` labels
* Displaying total count of items

## Repository Structure

```
Assignment-66/
│
├── Q1_WriteFile.java
├── Q2_ReadFile.java
├── Q3_CopyFile.java
├── Q4_FileInfo.java
├── Q5_ListDirectory.java
└── README.md
```

## File Class Methods Used

| Method | Description |
|---|---|
| `exists()` | Checks if file or directory exists |
| `isFile()` | Checks if path is a file |
| `isDirectory()` | Checks if path is a directory |
| `getName()` | Returns name of the file |
| `getAbsolutePath()` | Returns full path of the file |
| `length()` | Returns size of file in bytes |
| `canRead()` | Checks if file has read permission |
| `canWrite()` | Checks if file has write permission |
| `isHidden()` | Checks if file is hidden |
| `lastModified()` | Returns last modified time in milliseconds |
| `list()` | Returns array of contents inside directory |
| `createNewFile()` | Creates a new empty file |

## How to Run

### Q1 — Write File

```cmd
javac Q1_WriteFile.java
java Q1_WriteFile
```

### Q2 — Read File

```cmd
javac Q2_ReadFile.java
java Q2_ReadFile
```

### Q3 — Copy File

```cmd
javac Q3_CopyFile.java
java Q3_CopyFile
```

### Q4 — File Information

```cmd
javac Q4_FileInfo.java
java Q4_FileInfo
```

### Q5 — List Directory

```cmd
javac Q5_ListDirectory.java
java Q5_ListDirectory
```

## Sample Output

### Q1
```
Enter file name :
Demo.txt
Enter data :
Marvellous Infosystems Pune
Data written successfully
File Name     : Demo.txt
Absolute Path : C:\Users\Ishwari Surve\Demo.txt
```

### Q2
```
Enter file name :
Demo.txt
File contents :
Marvellous Infosystems Pune
```

### Q3
```
Enter source file :
Demo.txt
Enter destination file :
Backup.txt
File copied successfully
Total bytes copied : 28
```

### Q4
```
Enter file name :
Demo.txt
File Name      : Demo.txt
Absolute Path  : C:\Users\Ishwari Surve\Demo.txt
File Size      : 2048 bytes
Readable       : true
Writable       : true
Hidden         : false
Last Modified  : 27-08-2026 14:35:22
```

### Q5
```
Enter directory :
Marvellous
Contents :
-------------------------------------------
[FILE] Demo.txt
[FILE] Student.txt
[FILE] Java.pdf
[DIR]  Images
[DIR]  Backup
-------------------------------------------
Total items : 5
```

## Learning Outcome

After completing this assignment, I improved my ability to:

* Understand and implement file handling in Java
* Write data to a file using FileOutputStream byte streams
* Read data from a file using FileInputStream byte streams
* Copy file contents byte by byte from source to destination
* Handle both text and binary files using byte streams
* Retrieve detailed file information using the File class
* Check file permissions using canRead and canWrite methods
* Format last modified date using SimpleDateFormat
* List all contents of a directory using the list method
* Distinguish between files and directories using isFile and isDirectory
* Handle file not found errors with appropriate messages
* Close streams properly using the finally block
* Use File.separator for cross-platform path compatibility
* Write clean and structured Java programs with separate methods

## Technologies Used

* Java
* File Handling
* Byte Streams
* Visual Studio Code
* Git & GitHub

## Author

Ishwari Surve
