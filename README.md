# Overview

The system consists of three main components: the server-side implementation, the common interfaces, and the client-side application. These components interact seamlessly to provide users with a reliable and secure banking experience.

# Project Structure

The project is organized into the following directories:

- Bank: Contains the server-side classes responsible for implementing the remote bank account.
- Common: Contains common interfaces shared between the server and client.
- Client: Contains the client-side classes responsible for interacting with the remote bank account.

## Components

1. **Server-Side Implementation**
- The server-side implementation resides in the bank package and consists of the following key classes:

- **AccountImpl**: Implements the remote bank account functionality, including methods for managing account details and performing transactions.
- **RemoteAccount**: Registers the AccountImpl object with the RMI registry, making it accessible to remote clients.

2. **Common Interfaces**
- The common package contains interfaces that are shared between the server and client components:

- **Account**: Defines clients' methods to invoke the remote bank account object.

3. **Client-Side Application**
- The client package hosts the client-side application, which allows users to interact with their bank accounts remotely. Key classes include:

- **AccountClient**: Provides a user interface for clients to deposit, withdraw, and view their account balances.

# Usage

To run the remote bank account system, follow these steps:
- Open two terminal windows.
- In the first terminal, start the rmiregistry in the background:
**rmiregistry &**

- Next, launch the server service for the remote account:
**java bank.RemoteAccount**

- In the second terminal, execute the client program to interact with the remote bank account:
**java client.AccountClient**

This will enable users to deposit and withdraw funds, with corresponding messages displayed in the terminal.

## How to RUN
- Make sure you have installed Java before running the code

**Server**
- Run the program using "make" command.(server machine used here is "in-csci-rrpc02.cs.iupui.edu")
- The port number I have used here is 1111. (You can use any port number)
- Later use the command "make server" command.

The client connection must be established once the server connection is established.

**Client**
- Switch to another terminal for the Client
- Later, connect with the server using the "make clientPerson" command. (I have used another machine for the client "in-csci-rrpc01.cs.iupui.edu")

# Observations and Results

They are mentioned in the Assignment1.docx
