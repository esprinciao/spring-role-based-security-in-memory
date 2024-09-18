# role based security in memory

This repository demonstrates an implementation of role-based security using in-memory data structures. It provides a simple way to manage user roles and permissions dynamically.

## Overview

Role-based access control (RBAC) is a method of regulating access to resources based on the roles of individual users within an organization. This project showcases how to implement RBAC in an in-memory setup, allowing for quick access and modifications without persistent storage.

## Features

- User role management
- Dynamic permission assignment
- In-memory data structures for fast access
- Simple API for integration

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven (for building the project)

### Usage

You can use the provided classes to manage users, roles, and permissions. Below is an example of how to create users and assign roles.


public class ExampleUsage {
    public static void main(String[] args) {
        RoleManager roleManager = new RoleManager();
        
        // Create roles
        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");
        
        roleManager.addRole(adminRole);
        roleManager.addRole(userRole);
        
        // Create users
        User admin = new User("admin", adminRole);
        User regularUser = new User("user", userRole);
        
        roleManager.addUser(admin);
        roleManager.addUser(regularUser);
        
        // Check permissions
        if (roleManager.hasPermission(admin, "ACCESS_ADMIN_PANEL")) {
            System.out.println("Admin has access to the admin panel.");
        }
    }
}
