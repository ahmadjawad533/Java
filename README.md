🗳️ Java Voting System

This is a simple command-line voting system developed in Java. It allows users to enter candidate information, cast votes, and see real-time voting results including the winner.

---

📌 Features

- Add any number of candidates
- Assign unique signs to each candidate
- Input number of voters
- Voters select their preferred candidate by number
- Vote counting and winner declaration

---

💻 How It Works

1. Input the total number of candidates.
2. Provide the name and sign for each candidate.
3. Input the total number of voters.
4. Each voter chooses a candidate to vote for.
5. After all votes are cast, results are displayed with the vote count and winner.

---

🧪 Sample Output

Enter total number of Candidates: 3

Enter the name of candidates

Alice

Bob

Charlie

Enter sign of candidates

Star

Circle

Square

Candidates and signs list:

Alice - Star

Bob - Circle

Charlie - Square

Enter total number of voters: 5

Voter 1's turn: Candidates:

Alice - Star

Bob - Circle

Charlie - Square

... Voting Results: Alice - 2 votes Bob - 1 votes Charlie - 2 votes

Winner: Alice with 2 votes!



🛠️ Requirements
Java Development Kit (JDK) 8 or above

Command-line interface

🚀 How to Run

Compile the code:
javac vote.java

Run the program:
java vote
