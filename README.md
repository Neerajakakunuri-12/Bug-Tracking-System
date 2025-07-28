# 🐞 Bug Tracking System

This is a Java-based Bug Reporting and Tracking System that allows users to report bugs, assign them to developers, and track their status through a MySQL database.

---

## 🔧 Tech Stack

- **Java**
- **JDBC**
- **MySQL** (Workbench & Command Line)
- **IntelliJ IDEA**
- (Frontend: To be added later using HTML/CSS/JS)
- (Spring Boot: Coming soon)

---

## ✅ Features Implemented

- Connects to MySQL using JDBC
- Inserts new bug reports into the database
- Stores details like:
  - Bug ID
  - Title
  - Description
  - Project Name
  - Priority
  - Status
  - Reporter Name
  - Developer Name
  - Date & Time (Auto-generated)

---

## 🚀 How to Run

1. Clone the repository:
https://github.com/Neerajakakunuri-12/Bug-Tracking-System.git

2. Open the project in IntelliJ IDEA.
3. Make sure MySQL is running and your `url`, `username`, `password` in `Main.java` are correct.
4. Run `Main.java` to test database connection and insert data.

---

## 🗂 Database Table Structure

Table name: `bug_reports`

__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ _
| Column Name      | Data Type                           |
|------------------|------------------------------------ |
| bug_id           | INT (AUTO_INCREMENT, PRIMARY KEY)   |
| title            | VARCHAR(100)                        |
| description      | TEXT                                |
| project_name     | VARCHAR(100)                        |
| priority         | VARCHAR(50)                         |
| status           | VARCHAR(50)                         |
| reporter_name    | VARCHAR(100)                        |
| developer_name   | VARCHAR(100)                        |
| date_reported    | TIMESTAMP DEFAULT CURRENT_TIMESTAMP |
__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ _

---

## 📌 TODO (Next Steps)

- Add frontend using HTML/CSS/JavaScript
- Integrate Spring Boot instead of plain JDBC
- Add features like bug editing, deleting, filtering
- Authentication system for reporters and developers

---

## 📸 Screenshots
*Coming soon*

---

## 📁 Project Status

🟢 Backend base completed (Java + JDBC)  
🔜 Frontend and Spring Boot implementation in progress

---

## 📬 Contact

If you liked this project or have suggestions, feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/kakunuri-neeraja-534602251) or fork this repo!

