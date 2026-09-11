PROG_ICE_3
 Graph Algorithms Visualizer

Description

The Graph Algorithms Visualizer is a Java Swing application that allows users to create and edit graphs and then run different graph algorithms on them.

The program allows users to add and remove vertices and edges, create weighted edges, and run graph algorithms such as DFS, BFS, Dijkstra's Algorithm and Prim's Algorithm.

The project was developed using Java 21 and Java Swing.

---

Features

- Add vertices to the graph
- Remove vertices from the graph
- Add weighted edges
- Remove edges
- Prevent invalid graph connections
- Prevent a vertex from being connected to itself
- Prevent duplicate edges
- Validate edge weights
- Validate vertex names
- Display useful error messages
- Reset the graph using the **New** option
- Confirmation message before resetting the graph
- Confirmation message before exiting the program
- Clear algorithm instructions
- Run DFS
- Run BFS
- Run Dijkstra's Algorithm
- Run Prim's Algorithm

---
Improvements Made

For my improvement to the original project, I focused on **Validation and User Experience (UX)**.

### Validation

The program now checks for invalid input when creating parts of the graph.

Examples include:

- A vertex cannot be connected to itself.
- The same edge cannot be added more than once.
- Edge weights must be valid.
- Vertex names cannot be empty.

Error messages are displayed to the user when invalid input is entered.

User Experience

The interface was improved to make the program easier to use.

Changes include:

- A confirmation message appears before clearing the graph.
- A confirmation message appears before exiting.
- A message confirms when the graph has been reset.
- The selected algorithm is clearly displayed.
- The user is told to choose a starting vertex when an algorithm is selected.
- The selected algorithm is cleared when the graph is reset.

---

 Graph Algorithms

Depth-First Search (DFS)

DFS explores a graph by going as far as possible along one path before going back and exploring another path.

 Breadth-First Search (BFS)

BFS explores the graph level by level. It visits the closest vertices first before moving further away.

 Dijkstra's Algorithm

Dijkstra's Algorithm finds the shortest path between vertices in a weighted graph.

 Prim's Algorithm

Prim's Algorithm creates a Minimum Spanning Tree by connecting all vertices using the minimum possible total edge weight.

---
How to Run

1. Open the project in NetBeans.
2. Make sure Java 21 is installed.
3. Locate the `GraphVisualizer` class.
4. Run the `main` method.
5. The Graph Algorithms Visualizer window will open.

---
How to Use

Adding a Vertex

1. Select **Mode → Add a Vertex**.
2. Enter or provide the vertex information.
3. Add the vertex to the graph.

Adding an Edge

1. Select **Mode → Add an Edge**.
2. Select the first vertex.
3. Select the second vertex.
4. Enter the edge weight.
5. The edge will be added if the input is valid.

The program will display an error if the edge is invalid.

 Removing

Use the **Remove a Vertex** or **Remove an Edge** modes to remove graph components.

 Running an Algorithm

Select an algorithm from the **Algorithms** menu:

- Depth-First Search
- Breadth-First Search
- Dijkstra's Algorithm
- Prim's Algorithm

The program will then ask the user to choose a starting vertex where required.

---

 Resetting the Graph

The File → New option can be used to clear the current graph.

The program asks the user to confirm before resetting.

After the reset:

- All vertices are removed.
- All edges are removed.
- The selected algorithm is cleared.
- The program returns to **Add a Vertex** mode.

---

Technologies Used

- Java 21
- Java Swing
- NetBeans
- Object-Oriented Programming
- Graph Algorithms
- Event Handling
- GitHub

---

Project Structure

The main classes used in the project include:

- `GraphVisualizer` – Starts the application.
- `MainFrame` – Creates the main GUI and menus.
- `Graph` – Handles the graph and graph interactions.
- `Vertex` – Represents vertices in the graph.
- `Edge` – Represents weighted edges between vertices.
- `graphValidator` – Performs validation checks.
- `Algorithm` – Stores the available algorithms.
- `Mode` – Stores the different graph editing modes.

---

 Validation Class

The `graphValidator` class was added to help keep invalid input out of the graph.

It is used to check information such as:

- Vertex names
- Edge weights
- Other invalid input

The `Edge` class also checks whether an edge already exists and whether two selected vertices are the same.

---

 Testing

The following tests were performed:

- [x] Add a vertex
- [x] Remove a vertex
- [x] Add a valid edge
- [x] Remove an edge
- [x] Prevent self-loop edges
- [x] Prevent duplicate edges
- [x] Validate edge weights
- [x] Validate vertex names
- [x] Reset the graph
- [x] Confirm before resetting
- [x] Confirm before exiting
- [x] Run DFS
- [x] Run BFS
- [x] Run Dijkstra's Algorithm
- [x] Run Prim's Algorithm

---

 Skills Demonstrated

This project demonstrates skills in:

- Java programming
- Object-Oriented Programming
- Java Swing GUI development
- Event handling
- Graph data structures
- Graph algorithms
- Input validation
- Error handling
- User interface design
- Debugging and testing
- GitHub and version control

---


Example:

`![Main Menu](screenshots/main-menu.png)`

`![Graph](screenshots/graph.png)`

`![Validation Message](screenshots/validation.png)`

---
GitHub Repository

GitHub Link: 


---

 Reflection

For this ICE, I improved the Graph Algorithms Visualizer by focusing on validation and user experience.

I added validation to help prevent invalid graph inputs and added clearer messages to help the user understand what is happening.

I also improved the reset and exit options by adding confirmation messages. The algorithm display was also improved so that the user knows which algorithm was selected and what they need to do next.

This project helped me improve my understanding of Java Swing, event handling, graph algorithms, validation and Object-Oriented Programming.

---

Zachary Apollis

**Name:** [Your Name]

**Course:** Computer Science

**Language:** Java 21
