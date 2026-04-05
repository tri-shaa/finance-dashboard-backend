# Finance Dashboard Backend

## Overview

This project is a backend system for a finance dashboard that allows users to manage financial records and view summary analytics.

## Features

### User Management

* Create and manage users
* Assign roles (Admin, Analyst, Viewer)
* Store user status

### Financial Records

* Add income and expense records
* View all records
* Filter by category and type
* Delete records

### Dashboard APIs

* Total income
* Total expenses
* Net balance calculation

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* H2 Database (in-memory)
* REST APIs

## API Endpoints

### User APIs

* POST /users → Create user

### Financial Record APIs

* POST /records → Create record
* GET /records → Get all records
* GET /records/type/{type} → Filter by type
* GET /records/category/{category} → Filter by category
* DELETE /records/{id} → Delete record

### Dashboard APIs

* GET /dashboard/summary → Get total income, expense, balance

## Assumptions

* Data is stored in H2 in-memory database
* No authentication implemented (for simplicity)
* Single-user/global data view

## Trade-offs

* Did not implement authentication to keep system simple
* Used in-memory DB instead of persistent DB
* Focused more on backend structure and API design

## How to Run

1. Open project in IntelliJ
2. Run FinanceApplication.java
3. Use Postman to test APIs

## Future Improvements

* Add authentication (JWT)
* User-specific data isolation
* Deploy backend
* Add frontend dashboard


