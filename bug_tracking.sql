CREATE DATABASE bug_tracking;

USE bug_tracking;

CREATE TABLE bug_reports (
    bug_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    project_name VARCHAR(100) NOT NULL,
    priority ENUM('High', 'Medium', 'Low') DEFAULT 'Low',
    status ENUM('Open', 'In Progress', 'Resolved', 'Closed') DEFAULT 'Open',
    reporter_name VARCHAR(100) NOT NULL,
    developer_name VARCHAR(100),
    date_reported DATETIME DEFAULT CURRENT_TIMESTAMP
);